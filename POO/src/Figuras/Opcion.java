package Figuras;
import java.util.Scanner;
public class Opcion {
    public static void main(String[] args) {
        double base, altura, largo, ancho, radio;
        int respuesta=1, respuesta2;
        Scanner lectura=new Scanner(System.in);
        
            while (respuesta==1) {
            System.out.println("Elige de que figura quieres calcular el area");
            System.out.println("1.Triangulo");
            System.out.println("2.Rectangulo");
            System.out.println("3.Circulo");
            System.out.print("Cual escoje?: ");
            respuesta2=lectura.nextInt();
            switch (respuesta2) {
                case 1:
                System.out.println("Ingrese el valor de la base del triangulo");
                base=lectura.nextDouble();
                System.out.println("Ingrese el valor de la altura del triangulo");
                altura=lectura.nextDouble();
                T area1=new T(base, altura);
                    break;
                case 2:
                System.out.println("Ingrese el valor del ancho del rectangulo");
                ancho=lectura.nextDouble();
                System.out.println("Ingrese el valor del largo del rectangulo");
                largo=lectura.nextDouble();
                R area2=new R(ancho, largo);
                area2.area();
                    break;
                case 3:
                System.out.println("Ingrese el valor del radio del circulo");
                radio=lectura.nextDouble();
                C area3=new C(radio, radio);
                area3.area();

                    break;
            }
       
    }  
    System.out.println("Gracias por utilizar el programa");
    }
}

