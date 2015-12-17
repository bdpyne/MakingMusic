// an exception object that holds our function return value

public class ReturnValueException extends Exception {

    private Value returnValue = null;

    public ReturnValueException (Value returnValue) {
	this.returnValue = returnValue;
    }

    public Value getReturnValue () {
	return this.returnValue;
    }
}