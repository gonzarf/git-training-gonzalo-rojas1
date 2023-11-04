import java.util.ArrayList;

/*Haz un programa que emule un juego de rapidez.
    Hay 10 participantes.
    Todos ellos pueden acceder de uno en uno a un cuenco con caramelos (pongamos que tiene 100 caramelos).
    Cada participante tiene su propia cesta.
    Tienen que llegar al cuenco, robar un caramelo, añadirlo a su cesta particular, y repetir esto hasta que no queden caramelos por robar.
    Al finalizar, el main muestra el recuento de caramelos que obtuvo cada uno.
 */
public class Jugador extends Thread{
    private ArrayList<Integer> cesta;
    private String nombre;
    private ArrayList<Integer> cestaJugador;

    public Jugador(ArrayList<Integer> cesta, String nombre) {
        this.cesta = cesta;
        this.nombre = nombre;
    }

    public ArrayList<Integer> getCesta() {
        return cesta;
    }

    public void setCesta(ArrayList<Integer> cesta) {
        this.cesta = cesta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getCestaJugador() {
        return cestaJugador;
    }

    public void setCestaJugador(ArrayList<Integer> cestaJugador) {
        this.cestaJugador = cestaJugador;
    }

    public synchronized void run(){

        while (!cesta.isEmpty()){
            int caramelo = cesta.get(0);
            cesta.remove(0);
            cestaJugador.add(caramelo);
        }
    }
}