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
abstract class AbstractStrumento implements Strumento {

    private NotaMusicale nota;
    private boolean isPlaying = false;
    private boolean isTuned = false;
    private String name;

    public AbstractStrumento(String name){
        this.name = name;
    }
    
    @Override
    public String getInstrumentName() {
        return name;
    }

    @Override
    public void setTune() {
        isTuned = true;
    }

    @Override
    public boolean isTuned() {
        return isTuned;
    }

    @Override
    public boolean isPlaying() {
        return isPlaying;
    }

    @Override
    public NotaMusicale whichNoteIsPlaying() {
        return nota;
    }

    @Override
    public void play(NotaMusicale nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        if(!nota.equals(null)){
        return "Nome: " + name + ", Nota: " + nota.toString() + ", Sta suonando: " + isPlaying + ", E' accordato: " + isTuned;
        }
        else {
            return "NullString";
        }
    }
    
}
