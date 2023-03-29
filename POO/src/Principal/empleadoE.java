package Principal;
import Salud.Empleado;
import Salud.PersonaVE;
import java.util.Scanner;
public class empleadoE {
    public static void main(String[] args) {
        String tipoDoc;
        int documento;
        String nombre;
        String apellido;
        String cargo;
        double valorHora;
        int horasTrabajadas;
        String departamento;
    PersonaVE inicio=new PersonaVE();
    Empleado ini=new Empleado();
    Scanner lectura=new Scanner(System.in);
    inicio.pedirDatos();
    ini.pedirDatos2();
    System.out.println("Hola "+ini.getNombre());
    System.err.println("Tu tipo de documento es" +ini.getTipoDoc());
    System.out.println("Tu cargo es: "+ini.getCargo());
    System.out.println("Tu valor de horas es: "+ini.getValorHora());
    System.out.println("Tus horas trabajadas son: "+ini.getHorasTrabajadas());
    System.out.println("Tu departamento es: "+ini.getDepartamento());
    ini.calcularHonorarios();
    }
}