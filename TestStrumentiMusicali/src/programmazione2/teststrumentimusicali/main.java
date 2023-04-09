/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmazione2.teststrumentimusicali;
import programmazione2.strumenti.*;

/**
 *
 * @author Starfighter
 */

public class main {
    
    public static void main(String args[]){
        Strumento strumento = new StrumentoFiato("fiatoOttone", 35, 17, TipoStrumentoFiato.LEGNO, "basico");
        Strumento strumento2 = new StrumentoFiato("fiatoTraverso", 35, 6, TipoStrumentoFiato.LEGNO, "basico");
        strumento2.setTune();
        
        Strumento strumento3 = new StrumentoPercussione("percussione", "legno");
        Strumento strumento4 = new StrumentoPercussione("percussione2", "legno");
        
        Strumento strumento5 = new StrumentoArco("arco", 3);
        
        Orchestra orchestra = new Orchestra(5);
        orchestra.addElement(strumento);
        orchestra.addElement(strumento2);
        orchestra.addElement(strumento3);
        orchestra.addElement(strumento4);
        orchestra.addElement(strumento5);
        
        
    }
    
    private void execMethods(Orchestra orchestra){
        String[] result = orchestra.getAllInfo();
    
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
