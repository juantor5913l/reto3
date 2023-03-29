package Figuras;

public class R extends Figura {
    private Double ancho;
    private Double largo;
    
    public R(Double ancho, Double largo) {
        this.ancho = ancho;
        this.largo = largo;
    }
    
    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public Double getLargo() {
        return largo;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }

    public void area(){
        Double area=largo*ancho;
        System.out.println("El ancho del rectangulo es: "+ancho+", el largo del rectangulo es "+largo
        +" y el area del rectangulo es: "+area);
    }
}