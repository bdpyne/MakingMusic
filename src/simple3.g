grammar simple3;

//********************************************************
// same as simple2 but include function declarations,
// call statements, and expressions with functions.

// grammar rules

options{
k=4;
}

@members{
// override the default error reporting functions
public void reportError(RecognitionException e) {
    // call the Parser member function to report the error
    displayRecognitionError(this.getTokenNames(), e);
    // exit with error
    System.exit(1);
}
}

prog returns [AST ast]
	:	{$ast = new StmtList();} (stmt {$ast.addAST($stmt.ast);})+
	;

stmt returns [Stmt ast]
	:	'void' VAR '('')' s=stmt                        
                { 
                    $ast = new FuncDeclStmt($VAR.text,new Function(Value.NOTYPE,new ArgList(),$s.ast));
                }
        |       dt=dataType VAR '(' ')' s=stmt			
                { 
                   $ast = new FuncDeclStmt($VAR.text,new Function($dt.type,new ArgList(),$s.ast));
                }
        |       'void' VAR '(' l=formalParamList ')' s=stmt
                { 
                    $ast = new FuncDeclStmt($VAR.text,new Function(Value.NOTYPE,$l.ast,$s.ast)); 
                }
        |       dt=dataType VAR '(' l=formalParamList ')' s=stmt
                { 
                    $ast = new FuncDeclStmt($VAR.text,new Function($dt.type,$l.ast,$s.ast)); 
                } 
        |       dt=dataType VAR '=' exp ';'?
                { 
                    $ast = new VarDeclStmt($dt.type,$VAR.text,$exp.ast); 
                }
        |       dt=dataType VAR ';'?
                { 
                    $ast = new VarDeclStmt($dt.type,$VAR.text,new ConstExpr(new IntConst("0"))); 
                } 
//        |       'create song ' STRING ';'?                      { $ast = new CreateSongStmt($STRING.text); }
//        |       'generate' ';'?                                 { $ast = new GenerateStmt(); }
//        |       'Part' exp ';'?                                 { $ast = new PartStmt($exp.ast); } 
//        |       'play' num=exp ntype=VAR 'on' instr=exp ';'?    { $ast = new PhraseStmt($num.ast, $ntype.text, $instr.ast); }
//	|	VAR '=' exp ';'?				{ $ast = new AssignStmt($VAR.text,$exp.ast); }
	|	'get' VAR ';'?					{ $ast = new GetStmt($VAR.text); }
	|	'put' exp ';'?					{ $ast = new PutStmt($exp.ast); }
	|	VAR '(' ')' ';'?				{ $ast = new CallStmt($VAR.text);}
	|	VAR '(' l=actualParamList ')' ';'?		{ $ast = new CallStmt($VAR.text,$l.ast);}
	|	'return' exp ';'?				{ $ast = new ReturnStmt($exp.ast); }
	|	'return' ';'?					{ $ast = new ReturnStmt(); }
//	|	'while' '(' exp ')' s=stmt			{ $ast = new WhileStmt($exp.ast,$s.ast); }
//	|	'if' '(' exp ')' s1=stmt {$ast = new IfStmt($exp.ast,$s1.ast);}('else' s2=stmt {$ast.addAST($s2.ast);})?  
//	|	'{' {$ast = new BlockStmt();} (s=stmt {$ast.addAST($s.ast);})+ '}'
	;

dataType returns [int type]
        :       'String'                { $type = Value.STRING; }
        |       'Integer'               { $type = Value.INTEGER; }
        |       'Score'                 { $type = Value.SCORE; }
        |       'Part'                  { $type = Value.PART; }
        |       'Phrase'                { $type = Value.PHRASE; }
        |       'Function'              { $type = Value.FUNCTION; }
        ;

formalParamList returns [ArgList ast]
	:	dataType v1=VAR {$ast = new ArgList(new VarExpr($v1.text));}(',' dataType v2=VAR {$ast.addAST(new VarExpr($v2.text));} )*
	;
	
actualParamList returns [ArgList ast]
	:	e1=exp {
                    $ast      = new ArgList($e1.ast);
                } (',' e2=exp {$ast.addAST($e2.ast);} )*
        |       v1=VAR '->' e1=exp {
                    $ast       = new ArgList($e1.ast);
                    $ast.addKeyword($v1.text);
                } (',' v2=VAR '->' e2=exp {
                    $ast.addAST($e2.ast);
                    $ast.addKeyword($v2.text);
                } )*
	;

exp returns [Expr ast]
	:	relexp {$ast = $relexp.ast; }
        ;

relexp returns [Expr ast]
	:	e1=addexp { $ast = $e1.ast; } 
		(
			('==' e2=addexp { $ast = new BinopExpr(BinopExpr.EQ,$ast,$e2.ast); })|
			('<=' e3=addexp { $ast = new BinopExpr(BinopExpr.LESSEQ,$ast,$e3.ast); })
		)*
	;

addexp returns [Expr ast]
	:	e1=mulexp { $ast = $e1.ast; }
		(
			('+' e2=mulexp { $ast = new BinopExpr(BinopExpr.ADD,$ast,$e2.ast); })|
			('-' e3=mulexp { $ast = new BinopExpr(BinopExpr.MINUS,$ast,$e3.ast); })
		)* 
	;

mulexp returns [Expr ast]
	:	e1=atom { $ast = $e1.ast; }
		(
			('*' e2=atom { $ast = new BinopExpr(BinopExpr.MULT,$ast,$e2.ast); })|
			('/' e3=atom { $ast = new BinopExpr(BinopExpr.DIV,$ast,$e3.ast); })
		)* 
	;

atom returns [Expr ast]
	:	'(' exp ')'   			{ $ast = new ParenExpr($exp.ast); }
	|	VAR				{ $ast = new VarExpr($VAR.text); }
	|	NUM				{ $ast = new NumExpr($NUM.text); }
	|	'-' NUM				{ $ast = new NumExpr('-' + $NUM.text); }
	|	VAR '(' ')'			{ $ast = new CallExpr($VAR.text);}
	|	VAR '(' l=actualParamList ')' 	{ $ast = new CallExpr($VAR.text,$l.ast); }
        |       STRING
                { 
                    String s = $STRING.text;

                    if (s.equals("String")) {
                        $ast = new ConstExpr(new StringConst(s));
                    }
                    else if (s.equals("Score")) {
                        $ast = new ConstExpr(new ScoreConst());
                    }
                    else if (s.equals("Part")) {
                        $ast = new ConstExpr(new PartConst());
                    }
                    else if (s.equals("Phrase")) {
                        $ast = new ConstExpr(new PhraseConst());
                    }
                    else {
                        String t;

                        if ((s != null) && (s.length() > 0)) {
                            t = s.substring(1, s.length()-1);
                        }
                        else {
                            t = new String(s);
                        }
                        $ast = new ConstExpr(new StringConst(t)); 
                    }
                }
//        |       String                          
//                { 
//                    String s = $String.text;
//                    String t = s.substring(1, s.length()-1);
//                    $ast = new ConstExpr(new StringConst(t)); 
//                }
//        |       SCORE
//                {
//                    $ast = new ConstExpr(new ScoreConst());
//                }
//        |       PART
//                {
//                    $ast = new ConstExpr(new PartConst());
//                }
//        |       PHRASE
//                {
//                    $ast = new ConstExpr(new PhraseConst());
//                }
	;

//*************************************************************************
// lexical analyzer stuff
// NOTE: putting negative number recognition into the lexer does
// not work, hides the minus sign from the parser and this leads
// to syntax error, need to expose the minus sign at the rule level, see above
VAR  	:	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;
NUM 	:	'0'..'9'+;
COMMENT	:   	'//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;};
WS  	:   	( ' ' | '\t' | '\r' | '\n' ) {$channel=HIDDEN;};
STRING	:  	'"' ( ESC_SEQ | ~('\\'|'"') )* '"';
ESC_SEQ	:   	'\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\');
//String  :       'S' 't' 'r' 'i' 'n' 'g';
//SCORE   :       'S' 'c' 'o' 'r' 'e';
//PART    :       'P' 'a' 'r' 't';
//PHRASE  :       'P' 'h' 'r' 'a' 's' 'e';
//FUNCTION :      'F' 'u' 'n' 'c' 't' 'i' 'o' 'n';
