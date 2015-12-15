// argument list

public class ArgList extends AST {

    public ArgList() {
    }

    public ArgList(VarExpr e) {
	this.addAST(e);
    }

    public ArgList(Expr e) {
	this.addAST(e);
    }
}