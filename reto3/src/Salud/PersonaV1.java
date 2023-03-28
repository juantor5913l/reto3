package Salud;

import java.util.Scanner;

public class PersonaV1{
    private String tipoDoc;
    private String documento;
    private String nombre;
    private String apellido;
    private double peso;
    private double estatura;
    private int edad;
    private char sexo;
    private double imc; 

    public void pedirDatos() {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese el tipo de documento: ");
        tipoDoc = lectura.nextLine();
        System.out.println("Ingrese el número de documento: ");
        documento = lectura.nextLine();
        System.out.println("Ingrese el nombre: ");
        nombre = lectura.nextLine();
        System.out.println("Ingrese el apellido: ");
        apellido = lectura.nextLine();
        System.out.println("Ingrese el peso en kg: ");
        peso = Double.parseDouble(lectura.nextLine());
        System.out.println("Ingrese la estatura en m: ");
        estatura = Double.parseDouble(lectura.nextLine());
        System.out.println("Ingrese la edad: ");
        edad = Integer.parseInt(lectura.nextLine());
        System.out.println("Ingrese el sexo (M o F): ");
        sexo = lectura.nextLine().charAt(0);
    }

    public void mostrarPersona() {
        System.out.println("Tipo de documento: " + tipoDoc);
        System.out.println("Número de documento: " + documento);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Sexo: " + sexo);
    }

    public double calcularImc(double peso, double estatura){
        double pesoA;
        imc=estatura*estatura;
        pesoA=peso/imc;
        return pesoA;
    }
    
    public void mayorEdad() {
        if (edad >= 18) {
            System.out.println(nombre + " es mayor de edad");
        } else {
            System.out.println(nombre + " es menor de edad");
        }
    }
}

