// argument list

import java.util.ArrayList;
import java.util.List;


public class ArgList extends AST {

    private List<String> keywords = new ArrayList<String>();

    public ArgList() {
    }

    public ArgList(VarExpr e) {
	this.addAST(e);
    }

    public ArgList(Expr e) {
	this.addAST(e);
    }
    
    public void addKeyword(String k) {
        this.keywords.add(k);
    }
    
    public List<String> getKeywords() {
        return keywords;
    }
}