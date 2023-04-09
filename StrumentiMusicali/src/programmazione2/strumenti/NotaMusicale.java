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
public class NotaMusicale {

    private int tonalita;
    private NomeNotaMusicale name;

    public NotaMusicale(int tonalita, NomeNotaMusicale name) {
        this.tonalita = tonalita;
        this.name = name;
    }
    
    @Override
    public String toString(){
        return "Nome " + name + ", Tonalità: " + tonalita;
    }

}
