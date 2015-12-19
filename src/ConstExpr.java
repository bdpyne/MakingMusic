/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author billpyne
 */
public class ConstExpr extends Expr {
    
    private Value value;
    
    public ConstExpr(Value v) {
        this.value = v;
    }    
    
    public Value getValue() {
        return this.value;
    }
}
