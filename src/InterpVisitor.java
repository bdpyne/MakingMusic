// this visitor class implements the simple3 interpreter.

// Java imports
import java.util.*;
import java.io.*;

// JMusic imports
import jm.JMC;
import static jm.constants.Durations.C;
import jm.constants.ProgramChanges;
import jm.constants.Instruments;
import static jm.constants.Pitches.REST;
import jm.music.data.*;
import jm.util.Write;
import jm.music.tools.Mod;  
import jm.util.Read;


public class InterpVisitor implements JMC {

    // reading the console input
    private InputStreamReader converter = new InputStreamReader(System.in);
    private BufferedReader consoleInput = new BufferedReader(converter);
    
    // Directory to generate the audio file to
    private final String generateDir;
    
    
    // Stack for passing values around
    private Stack<Value> values;


    // Need this constructor to get the directory from the program arguments
    public InterpVisitor(String directory) {
        this.generateDir = directory;
        values = new Stack();
    }
    
        
    
    // initializing function parameters in the current scope
    // this function implements positional parameter correspondence.
    private void initParameters(ArgList formalParameters, ArgList actualParameters) 
                                throws ReturnValueException {

	// first check that the list sizes are the same
	if (formalParameters.size() != actualParameters.size()) {
	    System.err.println("Error (initParameters): formal and actual parameter lists do not match.");
	    System.exit(1);
	}

        // Contains parameter names in the order in which the actual parameters
        // were filled.
        List<String> keywords = actualParameters.getKeywords();
        
        // > 0 indicates keyword correspondence
        if (keywords.size() > 0) {
            // now simply step through the lists and declare the formal parameters as local variables
            for (int i = 0; i < keywords.size(); i++) {
                
                // evaluate the actual expression
/**
 * @todo uncomment the following and the final line of the block
 */                
//                Value value = new Value(this.dispatch(actualParameters.getAST(i)));
                
                // get the formal parameter name from the keyword list
                String name = keywords.get(i);
            
                // declare the variable with its init value
//                Interpret.symbolTable.declareVariable(name,value);
            }           
        }
        else {
            // now simply step through the lists and declare the formal parameters as local variables
            for (int i = 0; i < formalParameters.size(); i++) {
                
                // evaluate the actual expression
//                Value value = new Value(this.dispatch(actualParameters.getAST(i)));
                this.dispatch(actualParameters.getAST(i));
                
                // get the formal parameter name
                VarExpr var = (VarExpr) formalParameters.getAST(i);
                String name = var.getVarName();
                
                // declare the variable with its init value
//                Interpret.symbolTable.declareVariable(name,value);            
            }
        }
    }

    // the dispatcher for the interpreter visitor
    public int dispatch(AST ast) throws ReturnValueException {
//	if (ast.getClass() == BlockStmt.class) return interp((BlockStmt)ast);
        if (ast.getClass() == StmtList.class) return interp((StmtList)ast);
	else if (ast.getClass() == NumExpr.class) return interp((NumExpr)ast);
        else if (ast.getClass() == VarExpr.class) return interp((VarExpr)ast);
	else if (ast.getClass() == FuncDeclStmt.class) return interp((FuncDeclStmt)ast);
	else if (ast.getClass() == VarDeclStmt.class) return interp((VarDeclStmt)ast);
	else if (ast.getClass() == CallStmt.class) return interp((CallStmt)ast);
	else if (ast.getClass() == CallExpr.class) return interp((CallExpr)ast);
//        else if (ast.getClass() == ValueExpr.class) return interp((ValueExpr)ast);
//        else if (ast.getClass() == CreateSongStmt.class) return interp((CreateSongStmt)ast);
//        else if (ast.getClass() == GenerateStmt.class) return interp((GenerateStmt)ast);
//        else if (ast.getClass() == PartStmt.class) return interp((PartStmt)ast);
//        else if (ast.getClass() == PhraseStmt.class) return interp((PhraseStmt)ast);
        else if (ast.getClass() == ConstExpr.class) return interp((ConstExpr)ast);
        else if (ast.getClass() == AssignStmt.class) return interp((AssignStmt)ast);
	else if (ast.getClass() == PutStmt.class) return interp((PutStmt)ast);
	else if (ast.getClass() == GetStmt.class) return interp((GetStmt)ast);
//	else if (ast.getClass() == IfStmt.class) return interp((IfStmt)ast);
//	else if (ast.getClass() == WhileStmt.class) return interp((WhileStmt)ast);
//	else if (ast.getClass() == BinopExpr.class) return interp((BinopExpr)ast);
//	else if (ast.getClass() == ParenExpr.class) return interp((ParenExpr)ast);
	else if (ast.getClass() == ReturnStmt.class) return interp((ReturnStmt)ast);
	else {          
	    System.out.println("Error (InterpVisitor): unknown class type " + ast.getClass().getName());
	    System.exit(1);
	    return Value.NOTYPE;
	}
    }
    
    
    private int interp(ConstExpr ast) {
        
        values.push(ast.getValue());
        
        return Value.NOTYPE;
    }

    //****** interpret statement level ASTs
    
//    private Value interp(PhraseStmt ast) {
//        
//        Double typeOfNote;
//
//        try {
//            Value v = this.dispatch(ast.getAST(0));
//            Integer numToPlay = (Integer) v.getValue();
//       
//            String  duration  = ast.getNote();
//            
//            if (duration.equals("quarter")) {
//                typeOfNote = 1.0;
//            }
//            else if (duration.equals("eighth")) {
//                typeOfNote = 0.5;
//            }
//            else if (duration.equals("sixteenth")) {
//                typeOfNote = 0.25;
//            }
//            else {
//                typeOfNote = 0.0;
//            }
//
//            v = (Value) this.dispatch(ast.getAST(1));
//            String partName = (String) v.getValue();
//        
//            System.out.println(partName);
//
//            // Lookup the part that plays this phrase
//            v = (Value) Interpret.symbolTable.lookupVariable(partName);
//            Part p  = (Part) v.getValue();
//
//            Phrase phrase = new Phrase(0.0);
//            
//            for(int i=0;i<numToPlay;i++){
//                Note note = new Note();
//                note.setDuration(typeOfNote);
//                phrase.addNote(note);
//            }        
////          p.add(phrase);
//        }
//        catch(ReturnValueException e) {
//            
//        }
//        
//        
//        return null;
//    }
    
//    private Value interp(PartStmt ast) {
//        
//        try {
//            Value  v    = this.dispatch(ast.getAST(0));
//            String name = (String) v.getValue();
//            Part   p    = new Part(name);
//            Interpret.symbolTable.declareVariable(name, new Value(p));
//        }
//        catch (ReturnValueException e) {
//            //
//        }
//        
//        return null;
//    }
    
//    private Value interp(GenerateStmt ast) {
//
//        Value  v    = (Value) Interpret.symbolTable.lookupVariable("score");
//        String name = (String) v.getValue();
//        
//               v    = (Value) Interpret.symbolTable.lookupVariable(name);
//        Score  score = (Score) v.getValue();
//        
//                
//        String mid = this.generateDir + name + ".mid";
//        String aif = this.generateDir + name + ".aif";
//        
//        Write.midi(score, mid );
//        float[] data = Read.audio(mid);
//        Write.audio(data, aif);
//        
//        
//        return null;
//    }
    
//    private Value interp(CreateSongStmt ast) {
//
//        Score score = new Score();
//        
//        Value val = new Value(new Score());
//        
//        // Store the score with the song name as the key.
//        // Then add another entry to lookup the song name via the internally
//        // defined key "score".
//        Interpret.symbolTable.declareVariable(ast.getSongName(), val);
//        Interpret.symbolTable.declareVariable("score", new Value(ast.getSongName()));
//        
//        
//        return null;
//    }
    
    
    
    // assignment statements
    private int interp(AssignStmt ast) throws ReturnValueException {

        // typecheck the expression
        int exprType = this.dispatch(ast.getAST(0));
 
        // get the type of the variable
        int varType = Interpret.symbolTable.lookupVariable(ast.lhsVar()).getType();
 
        // types compatible?
        int resultType = Value.getResultType(varType,exprType);
        
        // check for type errors
        if (resultType == Value.NOTYPE ||
            resultType != varType) { // second condition means: assigning supertype to subtype
            System.err.println("Error (assignmentstmt): expression type "+resultType+" cannot be assigned to variable of type "+varType);
            System.exit(1);
            return Value.NOTYPE;
        }
        
        // check if we have to insert a type promotion
        if (resultType != exprType) {
            AST newAst = new CastExpr(exprType,resultType,(Expr)ast.getAST(0));
            ast.putAST(0,newAst);
        }
        
        // statements do not have types
        return Value.NOTYPE;         
    }

    // block statements
//    private Value interp(BlockStmt ast) throws ReturnValueException {
//	// set up the scope for this block
//	Interpret.symbolTable.pushScope();
//
//	// interpret each of the statements in the block
//	for (int i = 0; i < ast.size(); i++) {
//	    this.dispatch(ast.getAST(i));
//	}
//
//	// leaving this scope -- set current scope to parent scope
//	Interpret.symbolTable.popScope();
//
//	// statements do not have return values -- null
//	return null;
//    }

    // get statements
    private int interp(GetStmt ast) {

	try {
	    // get the value string from the user
	    System.out.print("Enter a value: ");
	    String inputString = consoleInput.readLine();
            Value   value = new IntConst(inputString);

	    // assign the value to the lhs var
	    Interpret.symbolTable.updateVariable(ast.lhsVar(),value);

	    // statements do not have return values -- null
	    return Value.NOTYPE;
	}
	catch(IOException e) {
	    System.out.println("Interpreter Visitor: exception " + e);
	    System.exit(1);
	    return Value.NOTYPE;
	}
    }

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
    private int interp(PutStmt ast) throws ReturnValueException {
        
	// interpret the expression
        int type = this.dispatch(ast.getAST(0));

        Value v = values.pop();
        
	System.out.println("Output Value: " + v.toString());

	// statements do not have return values -- null
	return Value.NOTYPE;
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
    private int interp(StmtList ast) throws ReturnValueException {

	// interpret each of the statements
	for (int i = 0; i < ast.size(); i++) {
	    this.dispatch(ast.getAST(i));
	}

	// statements do not have return values -- null
	return Value.NOTYPE;
    }


    // function declaration statements
    private int interp(FuncDeclStmt ast) {

	// we are implementing static scoping, so we
	// have to insert the current scope as the parent
	// scope for this function declaration
	Function fValue = ast.Value();
	fValue.setParentScope(Interpret.symbolTable.getCurrentScope());

	// declare the function
	Interpret.symbolTable.declareFunction(ast.Name(),fValue);

	// statements do not have return values -- null
	return Value.NOTYPE;
    }

    // variable declaration statements
    private int interp(VarDeclStmt ast) throws ReturnValueException {
        
	// evaluate the init expression
	int type = this.dispatch(ast.getAST(0));
        
        Value value = values.pop();
                
	// declare the variable with its init value
	Interpret.symbolTable.declareVariable(ast.Var(), value);
        
	// statements do not have return values -- null
	return Value.NOTYPE;
    }

    // call statements -- function calls as statements -- ignore the return value
    private int interp(CallStmt ast) throws ReturnValueException {

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
	return Value.NOTYPE;
    }

    // return statements
    private int interp(ReturnStmt ast) throws ReturnValueException {

	if (ast.size() == 0) {
	    // no return value express, throw a null
	    // return value object.
	    throw new ReturnValueException(null);
	}
	else {
	    // evaluate the return expression
//	    String returnValue = this.dispatch(ast.getExpr());

	    // now throw the return value object
	    throw new ReturnValueException(new StringConst("5"));
	}
        
//        return Value.NOTYPE;
    }

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
    private int interp(NumExpr ast) {
        
        values.push(new IntConst(ast.getValue()));
        
	return Value.INTEGER;
    }

    // parenthesized expressions
//    private  Integer interp(ParenExpr ast) throws ReturnValueException {
//	return this.dispatch(ast.getAST(0));
//    }

    // rhs variable expressions
    private int interp(VarExpr ast) {
        
	// fetch the variable value from symbol table
	Value v =  Interpret.symbolTable.lookupVariable(ast.getVarName());
        values.push(v);
        
        return Value.NOTYPE;
    }

//    private Value interp(ValueExpr ast) {
//        
//	// fetch the variable value from symbol table
//	return new Value(ast.getValue());
//    }

    // call expressions - call to functions within expressions -- have
    // deal with the return value.
    private int interp(CallExpr ast) throws ReturnValueException {

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
	this.dispatch(fValue.getFunctionBody());

        Value value = values.pop();
        
        

	// pop the function scope off the stack
	Interpret.symbolTable.popScope();
        
	// we are now in the parent scope of the function --
	// we have to restore the original scope on the top of the stack
	Interpret.symbolTable.setCurrentScope(topOfStack);

	// the return value of a function call is the value of the 
	// called function
        
        /**
         * @todo get the type from the value left by the function body execution
         */
	return Value.NOTYPE;
    }
}