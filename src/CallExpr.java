// call expression

public class CallExpr extends Expr {

    private String functionName;

    // constructor for function calls with 
    // no parameters
    public CallExpr(String v) {
	functionName = v;
    }

    public CallExpr(String v, ArgList a) {
	functionName = v;
	// actual parameter list
	this.addAST(a);
    }

    public String getFunctionName() {
	return functionName;
    }

    public ArgList getActualParameters() {

        ArgList list;

        if (this.size() > 0) {
            list = (ArgList) getAST(0);
        }
        else {
            list = new ArgList();            
        }
        
	return list;
    }
}