// put statement

public class PutStmt extends Stmt {

    public PutStmt(Expr e) {
	this.addAST(e);
    }
}
