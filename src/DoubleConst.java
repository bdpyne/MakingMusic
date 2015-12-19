/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author billpyne
 */
public class DoubleConst extends Value {
    
    private Double value;
    
    public DoubleConst(String value) {
        this.value = new Double(value);
    }
    
    public DoubleConst(Double value) {
        this.value=value;
    }
    
    public Double getValue() {
        return value;
    }
    
    public int getType() {
        return Value.DOUBLE;
    }
    
    public String toString() {
        return value.toString();
    }             
}
