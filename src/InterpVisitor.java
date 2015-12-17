// this visitor class implements the simple3 interpreter.

import java.util.*;
import java.io.*;

public class InterpVisitor {

    // Encapsulates song elements.
    private Song song;
    
    
    // reading the console input
    private InputStreamReader converter = new InputStreamReader(System.in);
    private BufferedReader consoleInput = new BufferedReader(converter);
    
    // initializing function parameters in the current scope
    // this function implements positional parameter correspondence.
    private void initParameters(ArgList formalParameters, ArgList actualParameters) 
                                throws ReturnValueException {

	// first check that the list sizes are the same
	if (formalParameters.size() != actualParameters.size()) {
	    System.err.println("Error (initParameters): formal and actual parameter lists do not match.");
	    System.exit(1);
	}

	// now simply step through the lists and declare the formal parameters as local variables
	for (int i = 0; i < formalParameters.size(); i++) {
	    // evaluate the actual expression
	    Value value = this.dispatch(actualParameters.getAST(i));
	    // get the formal parameter name
	    VarExpr var = (VarExpr) formalParameters.getAST(i);
	    String name = var.getVarName();
	    // declare the variable with its init value
	    Interpret.symbolTable.declareVariable(name,value);
	}
    }

    // the dispatcher for the interpreter visitor
    public Value dispatch(AST ast) throws ReturnValueException {
//	if      (ast.getClass() == AssignStmt.class) return interp((AssignStmt)ast);
	if (ast.getClass() == BlockStmt.class) return interp((BlockStmt)ast);
//	else if (ast.getClass() == GetStmt.class) return interp((GetStmt)ast);
//	else if (ast.getClass() == IfStmt.class) return interp((IfStmt)ast);
	else if (ast.getClass() == PutStmt.class) return interp((PutStmt)ast);
//	else if (ast.getClass() == WhileStmt.class) return interp((WhileStmt)ast);
        else if (ast.getClass() == StmtList.class) return interp((StmtList)ast);
//	else if (ast.getClass() == BinopExpr.class) return interp((BinopExpr)ast);
//	else if (ast.getClass() == NumExpr.class) return interp((NumExpr)ast);
//	else if (ast.getClass() == ParenExpr.class) return interp((ParenExpr)ast);
        else if (ast.getClass() == VarExpr.class) return interp((VarExpr)ast);
	else if (ast.getClass() == FuncDeclStmt.class) return interp((FuncDeclStmt)ast);
	else if (ast.getClass() == VarDeclStmt.class) return interp((VarDeclStmt)ast);
	else if (ast.getClass() == CallStmt.class) return interp((CallStmt)ast);
	else if (ast.getClass() == CallExpr.class) return interp((CallExpr)ast);
//	else if (ast.getClass() == ReturnStmt.class) return interp((ReturnStmt)ast);
        else if (ast.getClass() == ValueExpr.class) return interp((ValueExpr)ast);
        else if (ast.getClass() == CreateSongStmt.class) return interp((CreateSongStmt)ast);
        else if (ast.getClass() == GenerateStmt.class) return interp((GenerateStmt)ast);
        else if (ast.getClass() == PartStmt.class) return interp((PartStmt)ast);
        else if (ast.getClass() == PhraseStmt.class) return interp((PhraseStmt)ast);
	else {          
	    System.out.println("Error (InterpVisitor): unknown class type " + ast.getClass().getName());
	    System.exit(1);
	    return null;
	}
    }

    //****** interpret statement level ASTs
    
    private Value interp(PhraseStmt ast) {
        
        song.addPhrase("drums");
        
        return null;
    }
    
    private Value interp(PartStmt ast) {
        
        song.createPart(ast.getVarName(), ast.getInstrument());
        
        return null;
    }
    
    private Value interp(GenerateStmt ast) {
        
        // now is when the tire meets the road
        this.song.generate();
        
        return null;
    }
    
    private Value interp(CreateSongStmt ast) {

        // instantiate the Song class and pass the song name
        this.song = new Song(ast.getSongName());
        
        return null;
    }
    
    
    
    // assignment statements
//    private Value interp(AssignStmt ast) throws ReturnValueException {
//
//	// evaluate the expression
//	Integer value = this.dispatch(ast.getAST(0));
//	// assign the value to the lhs var
//	Interpret.symbolTable.updateVariable(ast.lhsVar(),value);
//
//	// statements do not have return values -- null
//	return null;
//    }

    // block statements
    private Value interp(BlockStmt ast) throws ReturnValueException {
	// set up the scope for this block
	Interpret.symbolTable.pushScope();

	// interpret each of the statements in the block
	for (int i = 0; i < ast.size(); i++) {
	    this.dispatch(ast.getAST(i));
	}

	// leaving this scope -- set current scope to parent scope
	Interpret.symbolTable.popScope();

	// statements do not have return values -- null
	return null;
    }

    // get statements
//    private Value interp(GetStmt ast) {
//
//	try {
//	    // get the value string from the user
//	    System.out.print("Enter a value: ");
//	    String inputString = consoleInput.readLine();
//	    Integer value = new Integer(inputString);
//
//	    // assign the value to the lhs var
//	    Interpret.symbolTable.updateVariable(ast.lhsVar(),value);
//
//	    // statements do not have return values -- null
//	    return null;
//	}
//	catch(IOException e) {
//	    System.out.println("Interpreter Visitor: exception " + e);
//	    System.exit(1);
//	    return null;
//	}
//    }

    // if statements
//    private Value interp(IfStmt ast) throws ReturnValueException {
//	// interpret the expression
//	Integer value = this.dispatch(ast.getAST(0));
//
//	if (value.intValue() != 0) {
//	    // interpret the then clause
//	    this.dispatch(ast.getAST(1));
//	}
//	else if (ast.size() == 3) {
//	    // interpret the else clause if we have one
//	    this.dispatch(ast.getAST(2));
//	}
//
//	// statements do not have return values -- null
//	return null;
//    }

    // put statements
    private Value interp(PutStmt ast) throws ReturnValueException {
	// interpret the expression
       	Value value = this.dispatch(ast.getAST(0));
	System.out.println("Output Value: " + value.toString());

	// statements do not have return values -- null
	return null;
    }

    // while statements
//    private Value interp(WhileStmt ast) throws ReturnValueException {
//	Integer value;
//
//	// interpet the expression
//	value = this.dispatch(ast.getAST(0));
//
//	// interpret the loop while the expression value != 0
//	while (value.intValue() != 0) {
//	    // interpret the while body
//	    this.dispatch(ast.getAST(1));
//	    // reevaluate the loop expression
//	    value = this.dispatch(ast.getAST(0));
//	}
//
//	// statements do not have return values -- null
//	return null;
//    }

    // statement lists
    private Value interp(StmtList ast) throws ReturnValueException {

	// interpret each of the statements
	for (int i = 0; i < ast.size(); i++) {
	    this.dispatch(ast.getAST(i));
	}

	// statements do not have return values -- null
	return null;
    }


    // function declaration statements
    private Value interp(FuncDeclStmt ast) {

	// we are implementing static scoping, so we
	// have to insert the current scope as the parent
	// scope for this function declaration
	Function fValue = ast.Value();
	fValue.setParentScope(Interpret.symbolTable.getCurrentScope());

	// declare the function
	Interpret.symbolTable.declareFunction(ast.Name(),fValue);

	// statements do not have return values -- null
	return null;
    }

    // variable declaration statements
    private Value interp(VarDeclStmt ast) throws ReturnValueException {

	// evaluate the init expression
	Value value = this.dispatch(ast.getAST(0));
        
	// declare the variable with its init value
	Interpret.symbolTable.declareVariable(ast.Var(),value);

	// statements do not have return values -- null
	return null;
    }

    // call statements -- function calls as statements -- ignore the return value
    private Value interp(CallStmt ast) throws ReturnValueException {

	// lookup the function value of the function name
	Function fValue = Interpret.symbolTable.lookupFunction(ast.getFunctionName());
	
	// implement static scoping
	// save the current top of stack
	SymbolTableScope topOfStack = Interpret.symbolTable.getCurrentScope();
	// push function local scope onto the stack
	Interpret.symbolTable.pushScope();
	// Initialize formal parameters with actual parameters in the current scope
	initParameters(fValue.getFormalParameters(),ast.getActualParameters());
	// set the parent of the current scope to be the parent scope of the function
	Interpret.symbolTable.getCurrentScope().setParentScope(fValue.getParentScope());


	// execute the body of the function
	try {
	    this.dispatch(fValue.getFunctionBody());
	}
	catch (ReturnValueException e) {
	    // ignore!
	}

	// pop the function scope off the stack
	Interpret.symbolTable.popScope();
	// we are now in the parent scope of the function --
	// we have to restore the original scope on the top of the stack
	Interpret.symbolTable.setCurrentScope(topOfStack);

	// statements do not have return values -- null
	return null;
    }

    // return statements
//    private Value interp(ReturnStmt ast) throws ReturnValueException {
//
//	if (ast.size() == 0) {
//	    // no return value express, throw a null
//	    // return value object.
//	    throw new ReturnValueException(null);
//	}
//	else {
//	    // evaluate the return expression
//	    Integer returnValue = this.dispatch(ast.getExpr());
//
//	    // now throw the return value object
//	    throw new ReturnValueException(returnValue);
//	}
//    }

    //****** interpret expression level ASTs
    // binop expressions
//    private Value interp(BinopExpr ast) throws ReturnValueException {
//
//	// interpret left child
//	Integer left = this.dispatch(ast.getAST(0));
//	// interpret right child
//	Integer right = this.dispatch(ast.getAST(1));
//
//	// compute the return value based on the OP
//	switch(ast.getOp()) {
//	case BinopExpr.ADD:
//	    return new Integer(left.intValue() + right.intValue());
//	case BinopExpr.MINUS:
//	    return new Integer(left.intValue() - right.intValue());
//	case BinopExpr.MULT:
//	    return new Integer(left.intValue() * right.intValue());
//	case BinopExpr.DIV:
//	    return new Integer(left.intValue() / right.intValue());
//	case BinopExpr.EQ:
//	    return new Integer((left.intValue() == right.intValue())?1:0);
//	case BinopExpr.LESSEQ:
//	    return new Integer((left.intValue() <= right.intValue())?1:0);
//	default:
//	    System.out.println("Error (InterpVisitor): unknown binary operator expression.");
//	    System.exit(1);
//	    return null;
//	}
//    }

    // number expressions
//    private Value interp(NumExpr ast) {
//	return new Integer(ast.getValue());
//    }

    // parenthesized expressions
//    private  Integer interp(ParenExpr ast) throws ReturnValueException {
//	return this.dispatch(ast.getAST(0));
//    }

    // rhs variable expressions
    private Value interp(VarExpr ast) {
        
	// fetch the variable value from symbol table
	return Interpret.symbolTable.lookupVariable(ast.getVarName());
    }

    private Value interp(ValueExpr ast) {
        
	// fetch the variable value from symbol table
	return new Value(ast.getValue());
    }

    // call expressions - call to functions within expressions -- have
    // deal with the return value.
    private Value interp(CallExpr ast) throws ReturnValueException {

	// lookup the function value of the function name
	Function fValue = Interpret.symbolTable.lookupFunction(ast.getFunctionName());
	
	// implement static scoping
	// save the current top of stack
	SymbolTableScope topOfStack = Interpret.symbolTable.getCurrentScope();
	// push function local scope onto the stack
	Interpret.symbolTable.pushScope();
	// Initialize formal parameters with actual parameters in the current scope
	initParameters(fValue.getFormalParameters(),ast.getActualParameters());
	// the the parent of the current scope to be the parent scope of the function
	Interpret.symbolTable.getCurrentScope().setParentScope(fValue.getParentScope());

	// execute the body of the function and retrieve the return value
	Value returnValue = null;
	try {
	    this.dispatch(fValue.getFunctionBody());
	    // if we got here then we did not receive a return value exception -- error!
	    System.err.println("Error: expected return value from function '"+ast.getFunctionName()+"'.");
	    System.exit(1);
	}
	catch (ReturnValueException e) {
	    returnValue = e.getReturnValue();

	    // if this is null then we saw a return without a value
	    if (returnValue == null) {
		System.err.println("Error: expected return value from function '"+ast.getFunctionName()+"'.");
		System.exit(1);
	    }
	}

	// pop the function scope off the stack
	Interpret.symbolTable.popScope();
	// we are now in the parent scope of the function --
	// we have to restore the original scope on the top of the stack
	Interpret.symbolTable.setCurrentScope(topOfStack);

	// the return value of a function call is the value of the 
	// called function
	return returnValue;
    }

}