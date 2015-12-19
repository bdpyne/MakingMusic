// function value

public class Function extends AST {

    // we are implementing static scoping, so once
    // we declare a function during interpretation we
    // need to keep track of the scope were it was declared.
    private SymbolTableScope parentScope = null;
    
    // Return type
    private int type;

    public Function(int type, ArgList formalParameters, Stmt body) {
        this.type = type;
	this.addAST(formalParameters);
	this.addAST(body);
    }

    public Function(Stmt body) {
	// formal parameter list is empty
	this.addAST(new ArgList());
	this.addAST(body);
    }

    public ArgList getFormalParameters() {
	return (ArgList) this.getAST(0);
    }

    public Stmt getFunctionBody() {
	return (Stmt) this.getAST(1);
    }

    public void setParentScope (SymbolTableScope parentScope) {
	this.parentScope = parentScope;
    }

    public SymbolTableScope getParentScope () {
	return this.parentScope;
    }
    
    public int getType() {
        return this.type;
    }
}
