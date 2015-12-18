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
public class PhraseConst extends Value {
    
    private Phrase value;
    
    public PhraseConst(Phrase value) {
        this.value = value;
    }
    
    public Phrase getValue() {
        return value;
    }
    
    public int getType() {
        return Value.SCORE;
    }
    
    public String toString() {
        return value.toString();
    }                 
}
