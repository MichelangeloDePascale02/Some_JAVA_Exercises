/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmazione2.teststrumentimusicali;
import java.util.Random;
import programmazione2.strumenti.*;

/**
 *
 * @author Starfighter
 */
public class Orchestra {

    private Strumento[] strumenti;
    private static int MAX_STRUMENTI = 10; //indica il numero massimo teorico
    private int numStrumenti = 0; //indica il numero massimo pratico
    private int topStrumenti = 0;

    public Orchestra(int numStrumenti) {
        if (numStrumenti < MAX_STRUMENTI) {
            this.numStrumenti = numStrumenti;
        } else {
            this.numStrumenti = MAX_STRUMENTI;
        }
        strumenti = new Strumento[this.numStrumenti];
    }

    private boolean isEmpty() {
        boolean result = true;
        if (topStrumenti > 0) {
            result = false;
        }
        return result;
    }

    public void addElement(Strumento strumento) {
        if (topStrumenti < numStrumenti) {
            strumenti[topStrumenti++] = strumento;
        }
    }

    public String[] getAllTunedInstruments() {
        String[] result;
        if (!isEmpty()) {
            int count = 0;
            for (int i = 0; i < topStrumenti; i++) {
                if (strumenti[i].isTuned()) {
                    count++;
                }
            }
            int resultIndex = 0;
            result = new String[count];
            for (int i = 0; i < topStrumenti; i++) {
                if (strumenti[i].isTuned()) {
                    result[resultIndex] = strumenti[i].getInstrumentName();
                    resultIndex++;
                }
            }
        } else {
            result = new String[0];
        }
        return result;
    }

    public void setAllInstruments() {
        if (!isEmpty()) {
            for (int i = 0; i < topStrumenti; i++) {
                strumenti[i].setTune();
            }
        }
    }

    public String[] getAllInfo() {
        String[] result;
        if (!isEmpty()) {
            result = new String[topStrumenti];
            for (int i = 0; i < topStrumenti; i++) {
                result[i] = strumenti[i].toString();
            }
        } else {
            result = new String[0];
        }
        return result;
    }
    
    public void playAllInstruments(){
        Random random = new Random();
        NomeNotaMusicale[] note = NomeNotaMusicale.values();
        int number = 0;
        
        for (int i = 0; i < topStrumenti; i++) {
            number = random.nextInt(7);
            strumenti[i].play(new NotaMusicale(number,note[number]));
        }
    }
}
