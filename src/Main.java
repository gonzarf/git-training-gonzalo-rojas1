import java.util.ArrayList;
import java.util.Scanner;

/*Haz un programa que pida al usuario cuántos hilos (numHilos) quiere lanzar.
Los hilos realizarán una carrera. Cada hilo espera un tiempo aleatorio entre 10 y 25 milisegundos
y a continuación van a poner su nombre en la lista de llegada a la meta.
Al final, el hilo principal muestra dicha lista.*/
public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> posiciones = new ArrayList<>();

        System.out.println("Cuantos hilos quiere lanzar: ");
        int numHilos = sc.nextInt();

        ArrayList<Coche> coches = new ArrayList<>();

        for (int i = 0; i< numHilos;i++) {
            Coche coche = new Coche("coche " + (i + 1), posiciones);
            coches.add(coche);
        }

        for (Coche hilo: coches) {
            hilo.start();
        }

        for (Coche hilo: coches) {
            try {
                hilo.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(posiciones.toString());
    }
}