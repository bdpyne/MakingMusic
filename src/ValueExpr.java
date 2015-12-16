/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author billpyne
 */
public class ValueExpr extends Expr {
    
    private Value val;
    
    public ValueExpr(Value v) {
        this.val = v;
    }
    
    public Value getValue() {
        
        return this.val;
    }
}
