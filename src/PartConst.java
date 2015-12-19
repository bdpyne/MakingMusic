/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import jm.music.data.*;


/**
 *
 * @author bpyne
 */
public class PartConst extends Value {
    
    private Part value;
    
    public PartConst() {
        
    }
    
    public PartConst(Part value) {
        this.value = value;
    }
    
    public Part getValue() {
        return value;
    }
    
    public int getType() {
        return Value.SCORE;
    }
    
    public String toString() {
        return value.toString();
    }             
}
