/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author billpyne
 */
public class Value {
    
    public static final int INTEGER = 0;
    public static final int STRING  = 1;
    
    private Object payload;
    private int    type;
    
    public Value(Integer val) {
        this.payload = val;
        this.type    = INTEGER;
    }
    
    public Value(String val) {
        this.payload = val;
        this.type    = STRING;
    }
    
    public Value(Value val) {
        this.payload = val.getValue();
        this.type    = val.getType();
    }
 
    
    public  Object getValue() {
        return this.payload;
    }    
    
    public int getType() {
        return this.type;
    }
}
