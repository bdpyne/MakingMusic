/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// JMusic imports
import jm.JMC;
import jm.music.data.*;
import jm.util.Write;
import jm.music.tools.Mod;  


/**
 *
 * @author billpyne
 */
public class Song implements JMC {
    
    public Song(String name) {
        this.score = new Score();
        this.name  = name;
    }
        
    public String getName() {
        return this.name;
    }
    
    public void play() {
        System.out.println("Name is " + this.name);
    }
    
    
    private String name;
    
    // Every JMusic composition starts with a score.    
    private Score score;
}
