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
public class StrumentoFiato extends AbstractStrumento {

    private float height = 0;
    private float diameter = 0;
    private TipoStrumentoFiato tipo;
    private String meccanismo;

    public StrumentoFiato(String name, float height, float diameter, TipoStrumentoFiato tipo, String meccanismo) {
        super(name);
        this.height = height;
        this.diameter = diameter;
        this.tipo = tipo;
        this.meccanismo = meccanismo;
    }

    @Override
    public String toString() {
        return "Altezza: " + height + ", Diametro: " + diameter + ", Tipo: " + tipo + ", Meccanismo: " + meccanismo;
    }
}
