
import java.util.*;

public class SymbolTableScope {
    public static final Integer VARIABLE = new Integer(0);
    public static final Integer FUNCTION = new Integer(10);

    // scope stack is built as a linked list
    private SymbolTableScope parentScope = null;

    // symbols are kept in a hashmap indexed by their name
    // their initialization value depends on their kind:
    //    variable - an Integer object
    //    function - a Function object
    private HashMap<String,Value> value = new HashMap<String,Value>();
    private HashMap<String,Integer> kind = new HashMap<String,Integer>();

    public SymbolTableScope(SymbolTableScope parentScope) {
	this.parentScope = parentScope;
    }

    public SymbolTableScope getParentScope() {
	return parentScope;
    }

    public void setParentScope(SymbolTableScope parentScope) {
	this.parentScope = parentScope;
    }

    public void enterVariable(String name, Value value) {
	this.value.put(name,value);
	this.kind.put(name,VARIABLE);
    }

    public void enterFunction(String name, Function value) {
//	this.value.put(name,value);
	this.kind.put(name,FUNCTION);
    }

    public Object lookupSymbol(String name) {
	return value.get(name);
    }

    public Integer lookupKind(String name) {
	return kind.get(name);
    }
}
