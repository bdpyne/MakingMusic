/*******************************************************************************
 *  This is the toplevel driver program for the Simple3 interpreter.
 *  For language details please see the grammar file 'simple3.g'.
 *******************************************************************************/

import org.antlr.runtime.*;
import java.util.*;

public class Interpret {

    public static SymbolTable symbolTable = new SymbolTable();

    public static void main(String[] args) throws Exception {

	// check if we have an input file, if not print out error and abort
	if (args.length == 0) {
	    System.out.println("Usage: java Interpret <input file>");
	    System.exit(1);
	} else {
	    System.out.println("Interpreting: " + args[0]);
	}

        // Set the directory into the symbol table 
        
	// set up and initialize our lexer and parser objects
	// open up the input file
        ANTLRFileStream input = new ANTLRFileStream(args[0]);
	// create the lexer with the input stream
        simple3Lexer lexer = new simple3Lexer(input);
	// create a token stream for the parser
        CommonTokenStream tokens = new CommonTokenStream(lexer);
	// create a parser object with the token stream
        simple3Parser parser = new simple3Parser(tokens);
	
	// call the toplevel recursive descent parsing function to construct
	// our IR, this will also construct the symbol table tree.
        AST ast = parser.prog();

	// dump out the AST to see if it is correct
	ast.dumpAST();

	// interpret our AST
	InterpVisitor interpVisitor = new InterpVisitor(args[1]);
	interpVisitor.dispatch(ast);
    }
}