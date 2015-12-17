/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author billpyne
 */
public class CreateSongStmt extends Stmt {
    
    private String name;
    
    public CreateSongStmt(String songName) {
        String noQuotes = songName.substring(1, songName.length()-1);
        this.name = noQuotes;
    }
    
    public String getSongName() {
        return this.name;
    }
}
