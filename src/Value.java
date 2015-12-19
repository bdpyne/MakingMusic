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
public abstract class Value {
    
    public static final int NOTYPE   = -1;
    public static final int INTEGER  = 0;
    public static final int STRING   = 1;
    public static final int SCORE    = 2;
    public static final int PART     = 3;
    public static final int PHRASE   = 4;
    public static final int FUNCTION = 5;
    public static final int DOUBLE   = 6;

    
    // Type Promotion Table
    // This table implements the following type hierarchy:
    // int < phrase < part < score < string
    // Note: functions are not allowed to appear
    // in the context of any operations.
    private static int[][] typeArray = {
      //  INTEGER  DOUBLE  STRING  SCORE   PART    PHRASE  FUNCTION
      //  --------------------------------------------------
        { INTEGER, DOUBLE, STRING, NOTYPE,  NOTYPE, NOTYPE, NOTYPE },     // INTEGER
        { DOUBLE , DOUBLE, STRING, NOTYPE,  NOTYPE, NOTYPE, NOTYPE },     // DOUBLE
        { STRING,  STRING, STRING, STRING, STRING,  STRING, NOTYPE },     // STRING
        { NOTYPE,  NOTYPE, STRING, SCORE,  NOTYPE,  NOTYPE, NOTYPE },     // SCORE
        { NOTYPE,  NOTYPE, STRING, NOTYPE,  PART,   NOTYPE, NOTYPE},      // PART
        { NOTYPE,  NOTYPE, STRING, NOTYPE,  NOTYPE, PHRASE, NOTYPE},      // PHRASE
        { NOTYPE,  NOTYPE, NOTYPE, NOTYPE, NOTYPE,  NOTYPE, NOTYPE }      // FUNCTION
    };
    
    public static int getResultType(int lt,int rt) {
        if (lt == NOTYPE || rt == NOTYPE)
           return NOTYPE;
        else
            return typeArray[lt][rt];
    }
    
    // every derived class needs to implement the following behavior
    public abstract int getType();
    public abstract String toString();     
}
