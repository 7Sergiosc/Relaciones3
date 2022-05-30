package relaciones3.entidades;

import java.util.List;
import relaciones3.enumeraciones.Palo;

public class Carta {
    //Esta clase debe contener un método toString() que retorne el número de carta y el palo.
    
    private int numero; //Una carta tiene un número entre 1 y 12 (el 8 y el 9 no los incluimos) 
    private Palo palo; //Un palo (espadas, bastos, oros y copas). 

    public Carta() {
    }

    public Carta(int numero, Palo palo) {
        this.numero = numero;
        this.palo = palo;
    }
    
    

    
    //TOSTRING HACER-------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return "Carta{" + numero + " de " + palo + '}';
    }
    
    
}
