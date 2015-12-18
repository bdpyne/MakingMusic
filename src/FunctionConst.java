/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author billpyne
 */
public class FunctionConst extends Value {
    
    private Function value;
    
    
    public FunctionConst(Function value) {
        this.value=value;
    }
    
    public Function getValue() {
        return value;
    }
    
    public int getType() {
        return Value.STRING;
    }
    
    public String toString() {
        return value.toString();
    }         
}
