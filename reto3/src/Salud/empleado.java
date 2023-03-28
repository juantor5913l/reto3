package Salud;
import java.util.Scanner;

import Salud.Persona;
public class empleado extends Persona {
    private String cargo;
    private double valorHora;
    private int horasTrabajadas;
    private String departamento;
    private String tipoDoc;
    private int documento;
    private String apellido;
    private String nombre;
    
    public void pedirDato() {
        Scanner lectura= new Scanner(System.in);
        System.out.println("Tipo de documento: " + tipoDoc);
        tipoDoc = lectura.nextLine();
        System.out.println("Número de documento: " + documento);
        documento = lectura.nextInt();
        System.out.println("Nombres: " + nombre);
        nombre = lectura.nextLine();
        System.out.println("Apellidos: " + apellido );
        apellido = lectura.nextLine();
        System.out.println("Cargo: " + cargo);
        cargo = lectura.nextLine();
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        horasTrabajadas = lectura.nextInt();
        System.out.println("Valor por hora: " + valorHora);
        valorHora = lectura.nextDouble();
        System.out.println("Total a pagar: " + calcularHonorarios());
    }

    
    public empleado() {  
        this.cargo = cargo;
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
        this.departamento = departamento;
    }
    
    public double calcularHonorarios() {
        double total = valorHora * horasTrabajadas;
        double reteica = total * 0.00966;
        return total-reteica;
    }


    
    public void mostrarEmpleados() {
        Scanner lectura= new Scanner(System.in);
        System.out.println("Tipo de documento: " + tipoDoc);
        System.out.println("Número de documento: " + documento);
        System.out.println("Nombres: " + nombre);
        System.out.println("Apellidos: " + apellido );
        System.out.println("Cargo: " + cargo);
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("Valor por hora: " + valorHora);
        System.out.println("Total a pagar: " + calcularHonorarios() );
    }
}