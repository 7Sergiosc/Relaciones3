package relaciones3.servicios;

import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import relaciones3.entidades.Baraja;
import relaciones3.entidades.Carta;
import relaciones3.enumeraciones.Palo;

public class ServicioBaraja {

    public Baraja crearBaraja() {
        ArrayList<Carta> cartas = new ArrayList();
        Carta carta;
        Palo palo = null;

        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0:
                    palo = Palo.ESPADA;
                    break;
                case 1:
                    palo
                            = Palo.BASTO;
                    break;
                case 2:
                    palo
                            = Palo.ORO;
                    break;
                case 3:
                    palo
                            = Palo.COPA;
                    break;
            }
            for (int j = 0; j < 10; j++) {
                if (j < 7) {
                    carta = new Carta(j + 1, palo);
                } else {
                    carta = new Carta(j + 3, palo);
                }
                cartas.add(carta);
            }
        }

        return new Baraja(cartas);
    }

    /**
     * Cambia de posición todas las cartas aleatoriamente.
     *
     * @param b
     */
    public void barajar(Baraja b) {
        Collections.shuffle(b.getCartas());
    }

    /**
     * Devuelve la siguiente carta que está en la baraja, cuando no haya más o
     * se haya llegado al final, se indica al usuario que no hay más cartas.
     *
     * @param b
     */
    public void siguienteCarta(Baraja b) {
        if (!b.getCartas().isEmpty()) {
            System.out.println("La siguiente carta en la baraja es: " + b.getCartas().get(0).toString());
        } else {
            System.out.println("No quedan más cartas en la baraja");
        }
    }

    /**
     * Muestra la cantidad de cartas disponibles por repartir.
     *
     * @param b
     */
    public void cartasDisponibles(Baraja b) {
        if (b.getCartas().isEmpty()) {
            System.out.println("No quedan cartas para repartir");
        } else {
            System.out.println("Quedan aún " + b.getCartas().size() + " cartas para repartir.");
        }
    }

    /**
     * Dado un número de cartas que nos pidan, le devolveremos ese número de
     * cartas. En caso de que haya menos cartas que las pedidas, no devolveremos
     * nada, pero debemos indicárselo al usuario.
     *
     * @param cantCartas Cantidad de cartas a repartir
     * @param b BARAJA
     * @param repartidas
     * @return
     */
    public void darCartas(int cantCartas, Baraja b, List<Carta> repartidas) {

        if (cantCartas <= b.getCartas().size()) {
            System.out.println("REPARTIENDO CARTAS..\n...");
            List<Carta> aux;

            repartidas.addAll(b.getCartas().subList(0, cantCartas));
            aux = b.getCartas().subList(cantCartas, b.getCartas().size());

            b.setCartas(aux);

            System.out.println("CARTAS REPARTIDAS CORRECTAMENTE!");
        } else {
            System.out.println("No hay suficientes cartas para repartir");
        }

    }

    /**
     * mostramos aquellas cartas que ya han salido, si no ha salido ninguna
     * indicárselo al usuario
     *
     * @param r
     */
    public void cartasMonton(List<Carta> r) {
        System.out.println("CARTAS REPARTIDAS: ");
        if (!r.isEmpty()) {

            for (Carta carta : r) {
                System.out.println(carta);
            }
        } else {
            System.out.println("No se ha repartido ninguna carta");
        }

    }

    /**
     * Muestra todas las cartas hasta el final. Es decir, si se saca una carta y
     * luego se llama al método, este no mostrara esa primera carta
     *
     * @param b
     */
    public void mostrarBaraja(Baraja b) {
        for (int i = 0; i < b.getCartas().size(); i++) {
            System.out.println(b.getCartas().get(i));
        }
    }

}
