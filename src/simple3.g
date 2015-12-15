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
	:	{$ast = new StmtList();}        (stmt {$ast.addAST($stmt.ast);})+
	;

stmt returns [Stmt ast]
	:	'declare' VAR '=' exp ';'?      { $ast = new VarDeclStmt($VAR.text,$exp.ast); }
	;

exp returns [Expr ast]
	:	e1=atom                         { $ast = $e1.ast; }
        ;

atom returns [Expr ast]
        :       VAR                             { $ast = new VarExpr($VAR.text); }
	;

//*************************************************************************
// lexical analyzer stuff
// NOTE: putting negative number recognition into the lexer does
// not work, hides the minus sing from the parser and this leads
// to syntax error, need to expose the minus sign at the rule level, see above
VAR  	:	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;
NUM 	:	'0'..'9'+;
COMMENT	:   	'//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;};
WS  	:   	( ' ' | '\t' | '\r' | '\n' ) {$channel=HIDDEN;};
STRING	:  	'"' ( ESC_SEQ | ~('\\'|'"') )* '"';
ESC_SEQ	:   	'\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\');

