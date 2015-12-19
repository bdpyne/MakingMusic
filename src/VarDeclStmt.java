// variable declaration statement

public class VarDeclStmt extends Stmt {

    private String var;
    private int    type;

    public VarDeclStmt(int t, String v, Expr e) {
	var  = v;
        type = t;
        
        System.out.println("Using the wrong constructor");
        
	this.addAST(e);
    }

    public VarDeclStmt(int t, String v, Function e) {
	var  = v;
        type = t;
        
        System.out.println("Using the right constructor");

        
        this.addAST(e);
    }
    
    public String Var() {
	return var;
    }
    
    public int getType() {
        return this.type;
    }

    public Expr Value() {
	return (Expr) this.getAST(0);
    }
}