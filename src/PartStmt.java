/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BPyne
 */
public class PartStmt extends Stmt {
    
    public PartStmt(Expr e) {
        this.addAST(e);
    }    
}
