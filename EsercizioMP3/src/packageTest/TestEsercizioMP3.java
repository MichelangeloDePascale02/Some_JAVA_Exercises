/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageTest;

import packageClassi.MP3;
import packageClassi.Song;

/**
 *
 * @author Starfighter
 */
public class TestEsercizioMP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Song canzone1 = new Song("Ardimento Lento","Annalisa, Fede e Pasquale Ardimento",2021);
        MP3 mp3_1 = new MP3("Ardimento Lento - 2021.mp3",canzone1);
        
        System.out.println(mp3_1.getPhisicalName());
        Song canzoneDaPrendere = mp3_1.getSong();
    }    
}
