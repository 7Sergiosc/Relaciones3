package relaciones3;

import java.util.ArrayList;
import java.util.List;
import relaciones3.entidades.Baraja;
import relaciones3.entidades.Carta;
import relaciones3.servicios.ServicioBaraja;

public class Relaciones3 {

    public static void main(String[] args) {
        ServicioBaraja b1 = new ServicioBaraja();
        
        Baraja b = b1.crearBaraja();
        List<Carta> r = new ArrayList<>(); //Cartas ya repartidas
        
       // b1.mostrarBaraja(b);
        
        b1.barajar(b);
        
        b1.darCartas(25, b, r);
        b1.cartasDisponibles(b);
        b1.siguienteCarta(b);
    }
    
}
