/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bpyne
 */
public class IntConst extends Value {
    
    private Integer value;
    
    public IntConst(String value) {
        this.value = new Integer(value);
    }
    
    public IntConst(Integer value) {
        this.value=value;
    }
    
    public Integer getValue() {
        return value;
    }
    
    public int getType() {
        return Value.INTEGER;
    }
    
    public String toString() {
        return value.toString();
    }         
}
