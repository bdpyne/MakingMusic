/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author billpyne
 */
public class NoteStmt extends Stmt {
    
    public NoteStmt(Expr instrument, Expr rhy, String phrase) {
        this.addAST(instrument);
        this.addAST(rhy);
        this.phrase     = phrase;
    }
    
    public String getPhrase() {
        return this.phrase;
    }
    
    private String phrase;
}
