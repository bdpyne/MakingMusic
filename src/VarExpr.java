// implementation of rhsvar expression

import java.util.*;

public class VarExpr extends Expr {

    private String name;

    public VarExpr(String v) {
	name = v;
    }

    public String getVarName() {
	return name;
    }
}
