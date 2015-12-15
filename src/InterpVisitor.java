// this visitor class implements the simple3 interpreter.

import java.util.*;
import java.io.*;

public class InterpVisitor {

    // reading the console input
    private InputStreamReader converter = new InputStreamReader(System.in);
    private BufferedReader consoleInput = new BufferedReader(converter);
    
    // the dispatcher for the interpreter visitor
    public Integer dispatch(AST ast) {
	if (ast.getClass() == StmtList.class) return interp((StmtList)ast);
	else if (ast.getClass() == VarExpr.class) return interp((VarExpr)ast);
	else if (ast.getClass() == VarDeclStmt.class) return interp((VarDeclStmt)ast);
	else {
	    System.out.println("Error (InterpVisitor): unknown class type");
	    System.exit(1);
	    return null;
	}
    }

    
    //****** interpret statement level ASTs
    // statement lists
    private Integer interp(StmtList ast) {

	// interpret each of the statements
	for (int i = 0; i < ast.size(); i++) {
	    this.dispatch(ast.getAST(i));
	}

	// statements do not have return values -- null
	return null;
    }


    // variable declaration statements
    private Integer interp(VarDeclStmt ast) {

	// evaluate the init expression
	Integer value = this.dispatch(ast.getAST(0));
	// declare the variable with its init value
	Interpret.symbolTable.declareVariable(ast.Var(),value);

	// statements do not have return values -- null
	return null;
    }

    // rhs variable expressions
    private Integer interp(VarExpr ast) {
	// fetch the variable value from symbol table
        return Interpret.symbolTable.lookupVariable(ast.getVarName());
    }
}