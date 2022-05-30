package relaciones3.entidades;

import java.util.List;

public class Baraja {
    /*Realizar una baraja de cartas españolas orientada a objetos.
    **La baraja estará compuesta por un conjunto de cartas, 40 exactamente.*/
    private List<Carta> cartas;
    //CONSTRUCTORS
    public Baraja() {
    }

    public Baraja(List<Carta> baraja) {
        this.cartas = baraja;
    }
    
    
    //GETTERS Y SETTERS
    public List<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(List<Carta> baraja) {
        this.cartas = baraja;
    }
       
}
