// variable declaration statement

public class VarDeclStmt extends Stmt {

    private String var;

    public VarDeclStmt(String v, Expr e) {
	var = v;
	this.addAST(e);
    }

    public VarDeclStmt(String v, Function e) {
	var = v;
	this.addAST(e);
    }

    public String Var() {
	return var;
    }

    public Expr Value() {
	return (Expr) this.getAST(0);
    }
}