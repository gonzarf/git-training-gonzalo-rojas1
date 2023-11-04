import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> cesta = new ArrayList<>();
        ArrayList<Jugador> jugadores = new ArrayList<>();
        Scanner sc = new Scanner(System.in);



        System.out.println("Introduzca numero de jugadores:");
        int numjugadores = sc.nextInt();

        for (int i = 0; i<numjugadores; i++){

            Jugador nuevo = new Jugador(cesta,"jugador " + (i +1));
            jugadores.add(nuevo);

        }

        for (int i = 0; i<jugadores.size(); i++){

           System.out.println(jugadores.get(i).getNombre());

        }

        System.out.println("Introduzca numero de caramelos que tendrá la cesta:");
        int caramelos = sc.nextInt();

        for (int i = 0; i<caramelos;i++){
            cesta.add(i+1);
        }

        for (int i = 0; i<cesta.size(); i++){



        }




    }
}