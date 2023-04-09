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
public class StrumentoArco extends AbstractStrumento{
    
    private int numCorde = 0;
    
    public StrumentoArco(String name, int numCorde){
        super(name);
        this.numCorde = numCorde;
    }
}
