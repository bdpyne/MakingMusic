
import jm.constants.Instruments;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author billpyne
 */
public interface Constants {
    
    // Keeping instrument enumerations sync'ed
    // Need to declare my own because importing the JMusic library doesn't seem
    // to be in the class path that Antlr is using.
    public final static int DRUM  = Instruments.DRUM;
    public final static int PIANO = Instruments.PIANO;    
}
