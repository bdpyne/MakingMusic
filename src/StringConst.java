/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bpyne
 */
public class StringConst extends Value {
    
    private String value;
    
    
    public StringConst(String value) {
        this.value=value;
    }
    
    public String getValue() {
        return value;
    }
    
    public int getType() {
        return Value.STRING;
    }
    
    public String toString() {
        return value;
    }     
}
