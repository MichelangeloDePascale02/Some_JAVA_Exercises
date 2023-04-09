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
public class StrumentoPercussione extends AbstractStrumento{
    
    private String materiale;
    
    public StrumentoPercussione(String name, String materiale){
        super(name);
        this.materiale = materiale;
    }
}
