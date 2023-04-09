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
public class Song {
    private String titolo;
    private String autore;
    private int anno;
    
    public Song(String titolo, String autore, int anno) {
        this.titolo = titolo;
        this.autore = autore;
        this.anno = anno;
    }
    
    public String getAuthor(){
        return autore;
    }
}
