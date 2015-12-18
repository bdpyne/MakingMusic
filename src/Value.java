/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import jm.music.data.*;


/**
 *
 * @author billpyne
 */
public class Value {
    
    public static final int INTEGER = 0;
    public static final int STRING  = 1;
    public static final int SCORE   = 2;
    public static final int PART    = 3;
    public static final int PHRASE  = 4;
    
    private Object payload;
    private int    type;
    
    public Value(Integer val) {
        this.payload = val;
        this.type    = INTEGER;
    }
    
    public Value(String val) {
        this.payload = val;
        this.type    = STRING;
    }
    
    public Value(Score val) {
        this.payload = val;
        this.type    = SCORE;
    }
    
    public Value(Value val) {
        this.payload = val.getValue();
        this.type    = val.getType();
    }
 
    public Value(Part val) {
        this.payload = val;
        this.type    = PART;
    }
    
    public Value(Phrase val) {
        this.payload = val;
        this.type    = PHRASE;
    }
        
    
    public  Object getValue() {
        return this.payload;
    }    
    
    public int getType() {
        return this.type;
    }
}
