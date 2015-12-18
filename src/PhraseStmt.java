/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BPyne
 */
public class PhraseStmt extends Stmt {
    
    public PhraseStmt(Expr duration, String note, Expr part) {
        this.addAST(duration);
        this.note = note;
        this.addAST(part);
    }
    
    public String getNote() {
        return this.note;
    }
    
    private final String note;
}
