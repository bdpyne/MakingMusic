
public class SymbolTable {

    private SymbolTableScope globalScope = new SymbolTableScope(null);
    private SymbolTableScope currentScope = globalScope;

    public SymbolTableScope getCurrentScope() {
	return this.currentScope;
    }

    public void setCurrentScope(SymbolTableScope scope) {
	this.currentScope = scope;
    }

    public SymbolTableScope  pushScope() {
	currentScope = new SymbolTableScope(currentScope);
	return currentScope;
    }

    public SymbolTableScope popScope() {
	// go up one entry 
	currentScope = currentScope.getParentScope();
	return currentScope;
    }

    public void declareVariable(String symbol, Value value) {
	// check that the current symbol was not already declared in the
	// current scope, if so then we have an error
	if (currentScope.lookupSymbol(symbol) != null) {
	    System.err.println("Error: redclaring variable "+symbol+".");
	    System.exit(1);
	}
	// all clear...enter the symbol into the scope        
	currentScope.enterVariable(symbol,value);
    }

    public void declareFunction(String symbol, Function value) {
	// check that the current symbol was not already declared in the
	// current scope, if so then we have an error
        
	if (currentScope.lookupSymbol(symbol) != null) {
	    System.err.println("Error: redeclaring function "+symbol+".");
	    System.exit(1);
	}
	// all clear...enter the symbol into the scope
	currentScope.enterFunction(symbol,value);
    }

    public Value lookupVariable(String symbol) {
	// lookup the symbol in the current scope
	SymbolTableScope lookupScope = currentScope;
	Object value = lookupScope.lookupSymbol(symbol);

	// if not in current scope search up the stack
	while (value == null) {
	    lookupScope = lookupScope.getParentScope();
	    if (lookupScope == null) {
		// no parent scope, symbol not found
		System.err.println("Error (lookup): variable '"+symbol+"' not declared.");
		// could do some more intelligent recovery here.
		System.exit(1);
		return null;
	    }
	    value = lookupScope.lookupSymbol(symbol);
	}
	// all done, return the value, guaranteed to be here
	// by the nature of our search procedure -- now check 
	// that it is a variable
	if (lookupScope.lookupKind(symbol).equals(SymbolTableScope.VARIABLE)) {
	    return (Value) value;
	}
	else {
		System.err.println("Error (lookup): symbol '"+symbol+"' is not a variable.");
		System.exit(1);
		return null;
	}
    }

    public Function lookupFunction(String symbol) {
	// lookup the symbol in the current scope
	SymbolTableScope lookupScope = currentScope;
        
	FunctionConst v     = (FunctionConst) lookupScope.lookupSymbol(symbol);
        Function      value = v.getValue();

        
	// if not in current scope search up the stack
	while (value == null) {
	    lookupScope = lookupScope.getParentScope();
	    if (lookupScope == null) {
		// no parent scope, symbol not found
		System.err.println("Error (lookup): function '"+symbol+"' not declared.");
		// could do some more intelligent recovery here.
		System.exit(1);
		return null;
	    }
            v     = (FunctionConst) lookupScope.lookupSymbol(symbol);
	    value = v.getValue();
	}
	// all done, return the value, guaranteed to be here
	// by the nature of our search procedure -- now check 
	// that it is a function
	if (lookupScope.lookupKind(symbol).equals(SymbolTableScope.FUNCTION)) {
	    return (Function) value;
	}
	else {
		System.err.println("Error (lookup): symbol '"+symbol+"' is not a functions.");
		System.exit(1);
		return null;
	}
    }

    public void updateVariable(String symbol, Value initValue) {
	// find the scope where the symbol was declared
	SymbolTableScope lookupScope = currentScope;
	Object value = lookupScope.lookupSymbol(symbol);

	// if not in current scope search up the stack
	while (value == null) {
	    lookupScope = lookupScope.getParentScope();
	    if (lookupScope == null) {
		// no parent scope, symbol not found
		System.err.println("Error (update): variable '"+symbol+"' not declared.");
		// could do some more intelligent recovery here.
		System.exit(1);
	    }
	    value = lookupScope.lookupSymbol(symbol);
	}
	// we found a scope where symbol is defined, update it
	// make sure that it is a variable
	if (lookupScope.lookupKind(symbol).equals(SymbolTableScope.VARIABLE)) {
	    lookupScope.enterVariable(symbol, initValue);
	}
	else {
		System.err.println("Error (update): symbol '"+symbol+"' is not a variable.");
		System.exit(1);
	}
    }
}