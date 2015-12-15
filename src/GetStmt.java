// get statement

public class GetStmt extends Stmt {

    private String lhsvar;

    public GetStmt(String v) {
	lhsvar = v;
    }

    public String lhsVar() {
	return lhsvar;
    }
}