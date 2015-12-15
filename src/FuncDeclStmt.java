// function declaration statement

public class FuncDeclStmt extends Stmt {

    private String name;

    public FuncDeclStmt(String name, Function f) {
	this.name = name;
	this.addAST(f);
    }

    public String Name() {
	return name;
    }

    public Function Value() {
	return (Function) this.getAST(0);
    }
}