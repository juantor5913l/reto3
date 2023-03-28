package Principal;

import Salud.Persona;

public class Inicio {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.pedirDatos();
        persona1.mostrarPersona();
        persona1.calcularImc();
        persona1.mayorEdad();
    }
}