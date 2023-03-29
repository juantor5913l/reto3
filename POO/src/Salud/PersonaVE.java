package Salud;

import java.util.Scanner;

public class PersonaVE {
    private String tipoDoc;
    private int documento;
    private String nombre;
    private String apellido;
    
    public PersonaVE() {
        this.tipoDoc = tipoDoc;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public String getTipoDoc() {
        return tipoDoc;
    }
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }
    public int getDocumento() {
        return documento;
    }
    public void setDocumento(int documento) {
        this.documento = documento;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void pedirDatos(){
        Scanner lectura=new Scanner(System.in);
        System.out.println("Por favor dijite su tipo de documento");
        tipoDoc=lectura.next();
        System.out.println("Por favor dijite su numero de documento");
        documento=lectura.nextInt();
        System.out.println("Por favor dijite su nombre");
        nombre=lectura.next();
        System.out.println("Por favor dijite su apellido");
        apellido=lectura.next();
    }
    public void mostrarPersona(){
        System.out.println("Hola "+nombre+" "+apellido);
        System.out.println("Tu tipo de documento es: "+tipoDoc);
        System.out.println("Tu numero de documento es: "+documento);

    }
}