/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Java imports
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

// JMusic imports
import jm.JMC;
import jm.constants.ProgramChanges;
import jm.constants.Instruments;
import jm.music.data.*;
import jm.util.Write;
import jm.music.tools.Mod;  
import jm.util.Read;


/**
 *
 * @author billpyne
 */
public class Song implements JMC {
    
    // Keeping instrument enumerations sync'ed
    public final static int DRUM  = Instruments.DRUM;
    public final static int PIANO = Instruments.PIANO;
    
    
    public Song(String name) {
        this.score = new Score();
        this.name  = name;
        this.partKeys = new ArrayList<String>();
        this.parts    = new HashMap<String,Part>();
    }
        
    public String getName() {
        return this.name;
    }
    
    public void createPart(String name, Integer instrument) {
        this.partKeys.add(name);
        this.parts.put(name, new Part(instrument));
    }

    public void addPhrase(String part) {
        Part p = (Part) this.parts.get(part);
        
        Phrase phrase = new Phrase(0.0);
        for(int i=0;i<4;i++){
            Note note = new Note(36, C);
            phrase.addNote(note);
            Note rest = new Note(REST, C);
            phrase.addNote(rest);
	}        
        p.add(phrase);
    }
    
    public void generate() {
        
        // All all the parts to the score. Each part has its own phrasings
        // already.
        for(String key : partKeys) {
            Part p = (Part) parts.get(key);
            score.addPart(p);
        }
        
//        String dir = "/Users/billpyne/Documents/";
        String dir = "c:\\temp\\";
                
        String mid = dir + this.name + ".mid";
        String aif = dir + this.name + ".aif";
        
        Write.midi(this.score, mid );
        float[] data = Read.audio(mid);
        Write.audio(data, aif);
    }
    
    
    private String name;
    
    // Every JMusic composition starts with a score.    
    private Score score;
    
    // Part - can be different instruments or the same instrument played with 
    // different limbs, e.g. drums or piano
    private HashMap<String,Part> parts;
    private List<String> partKeys;
}
