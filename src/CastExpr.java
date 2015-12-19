/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author billpyne
 */
public class CastExpr extends Expr {
    
    private int eType;
    private int rType;
    
    
    public CastExpr(int exprType, int resultType, Expr e) {
        
        this.eType = exprType;
        this.rType = resultType;
        this.addAST(e);
    }
    
    public int getExpressionType() {
        return this.eType;
    }
    
    public int getResultType() {
        return this.rType;
    }
}
