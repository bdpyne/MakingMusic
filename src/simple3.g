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
	:	'create song ' STRING ';'?                      { $ast = new CreateSongStmt($STRING.text); }
        |       'generate' ';'?                                 { $ast = new GenerateStmt(); }
        |       part VAR                                        { $ast = new PartStmt($part.p,$VAR.text); } 
        |       'Phrase' phr=VAR 'is' s=stmt 'for' part=VAR     { $ast = new PhraseStmt($phr.text, $s.ast, $part.text); }
        |       'fun' VAR '(' ')' s=stmt			{ $ast = new FuncDeclStmt($VAR.text,new Function(new ArgList(),$s.ast)); }
	|	'fun' VAR '(' l=formalParamList ')' s=stmt	{ $ast = new FuncDeclStmt($VAR.text,new Function($l.ast,$s.ast)); }
	|	'declare' VAR '=' exp ';'?			{ $ast = new VarDeclStmt($VAR.text,$exp.ast); }
	|	'declare' VAR ';'?				{ $ast = new VarDeclStmt($VAR.text,new NumExpr(0)); }
	|	VAR '=' exp ';'?				{ $ast = new AssignStmt($VAR.text,$exp.ast); }
	|	'get' VAR ';'?					{ $ast = new GetStmt($VAR.text); }
	|	'put' exp ';'?					{ $ast = new PutStmt($exp.ast); }
	|	VAR '(' ')' ';'?				{ $ast = new CallStmt($VAR.text);}
	|	VAR '(' l=actualParamList ')' ';'?		{ $ast = new CallStmt($VAR.text,$l.ast);}
	|	'return' exp ';'?				{ $ast = new ReturnStmt($exp.ast); }
	|	'return' ';'?					{ $ast = new ReturnStmt(); }
	|	'while' '(' exp ')' s=stmt			{ $ast = new WhileStmt($exp.ast,$s.ast); }
	|	'if' '(' exp ')' s1=stmt {$ast = new IfStmt($exp.ast,$s1.ast);}('else' s2=stmt {$ast.addAST($s2.ast);})?  
	|	'{' {$ast = new BlockStmt();} (s=stmt {$ast.addAST($s.ast);})+ '}'
	;

formalParamList returns [ArgList ast]
	:	v1=VAR {$ast = new ArgList(new VarExpr($v1.text));}(',' v2=VAR {$ast.addAST(new VarExpr($v2.text));} )*
	;
	
actualParamList returns [ArgList ast]
	:	e1= exp {$ast = new ArgList($e1.ast);} (',' e2=exp {$ast.addAST($e2.ast);} )*
	;

exp returns [Expr ast]
	:	relexp {$ast = $relexp.ast; };

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
        |       STRING                          { $ast = new ValueExpr(new Value($STRING.text)); }
	;

part returns [Integer p]
        :       'Drum'                          { $p   = new Integer(Song.DRUM); }
        |       'Piano'                         { $p   = new Integer(Song.PIANO); }
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