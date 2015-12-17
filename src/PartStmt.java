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
    
    public PartStmt(Integer type, String name) {
        this.type    = type;
        this.varname = name;
    }
    
    public Integer getInstrument() {
        return this.type;      
    }
    
    public String getVarName() {
        return this.varname;
    }
    
    private Integer type;
    private String  varname;
}
