package Juegos;
import java.util.Random;
import java.util.Scanner;

public class reto4 implements interfaz {
    private String jugador;
    private int eleccion;
    private int computadora;

    Scanner lectura=new Scanner(System.in);
    public void inicio(){
        System.out.println("Ingrese el nombre del jugador");
        jugador=lectura.next();
    }
    public void juego(){
        System.out.println(jugador+" Que opcion vas a escoger para jugar?");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijera");
        System.out.print("Cual escoje?: ");
        eleccion=lectura.nextInt();
        Random random=new Random();
        computadora=random.nextInt(3)+1;
    }
    public void fin(){
        if (eleccion == computadora) {
            System.out.println("Empate!");
        } else if ((eleccion == 0 && computadora == 2) ||
                   (eleccion == 1 && computadora == 0) ||
                   (eleccion == 2 && computadora == 1)) {
            System.out.println("¡El usuario gana!");
        } else {
            System.out.println("¡La computadora gana!");
        }
        System.out.println("Gracias por jugar");
    }
}

