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
public class ScoreConst extends Value {
    
    private Score value;
    
    public ScoreConst() {
        
    }
    
    public ScoreConst(Score value) {
        this.value = value;
    }
    
    public Score getValue() {
        return value;
    }
    
    public int getType() {
        return Value.SCORE;
    }
    
    public String toString() {
        return value.toString();
    }         
}
