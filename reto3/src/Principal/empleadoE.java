package Principal;

import java.util.Scanner;

import Salud.empleado;

public class empleadoE {
    public static void main(String[] args) {
        empleado persona1 = new empleado();
        persona1.pedirDato();
        persona1.mostrarEmpleados();
    }
}
