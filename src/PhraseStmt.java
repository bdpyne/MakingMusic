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
    
    public PhraseStmt(String name) {
        this.varname = name;
    }
    
    public String getVarName() {
        return this.varname;
    }
    
    private String varname;
}
