/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmazione2.strumenti;

/**
 *
 * @author Starfighter
 */
public interface Strumento {

    /*
    Suonare una nota: play()
    Sapere quale nota si stia suonando: whichNoteIsPlaying()
    Sapere se si sta suonando uno strumento: isPlaying()
    Sapere se lo stumento sia accordato: isTuned()
    Accordare lo strumento: setTune();
    Sapere quale strumento si stia suonando: getInstrumentName()
    Sapere tutte le informazioni dello strumento: toString()
     */
    
    public void play(NotaMusicale nota);
    public NotaMusicale whichNoteIsPlaying();
    public boolean isPlaying();
    public boolean isTuned();
    public void setTune();
    public String getInstrumentName();
    
    
    @Override
    public String toString();
}
