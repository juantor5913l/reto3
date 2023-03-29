package Figuras;



public class T extends Figura {
    private double base;
    private double altura;
    
    public T(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }
    public double getBase() {
        return base;
    }
    public double getAltura() {
        return altura;
    }
    public void area() {
        double area=base*altura;
        System.out.println("La base del rectangulo es "+base+", la altura del rectangulo es "+altura
        +" y el area del rectangulo es: "+area);
    }
}