/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageClassi;

/**
 *
 * @author Starfighter
 */
public class MP3 {
    
    private String nomeFisico;
    private long nBytes;
    private Song canzone;
    
    public MP3(String nomeFisico, Song canzone) {
        this.nomeFisico = nomeFisico;
        this.canzone = canzone;
    }
    
    public MP3(String nomeFisico, Song canzone, long nBytes) {
        this(nomeFisico,canzone);
        this.nBytes = nBytes;
    }
    
    public void setnBytes(long nBytes){
        this.nBytes = nBytes;
    }
    
    public long getnBytes() {
        return this.nBytes;
    }
    
    public Song getSong() {
        return this.canzone;
    }
    
    public String getPhisicalName() {
        return nomeFisico;
    }
}
