// implementation of num expression

public class NumExpr extends Expr {
    private int value;

    public NumExpr(int v) {
	value = v;
    }

    public NumExpr(String v) {
	value = Integer.parseInt(v);
    }    

    public int getValue() {
	return value;
    }
}
