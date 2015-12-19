/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author billpyne
 */
public class DoubleExpr extends Expr {
    
    private double value;
    
    public DoubleExpr(String value) {        
        this.value = Double.parseDouble(value);
    }    
    
    public DoubleExpr(Double value) {        
        this.value = value;
    }    
    
    public Double getValue() {
        return this.value;
    }
}
