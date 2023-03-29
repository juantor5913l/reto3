package Figuras;

public class C extends Figura {
    
        private double radio;
        private double pi=3.14;
        
        public C(double radio, double pi) {
            this.radio = radio;
            this.pi = pi;
        }
        
    
        public double getPi() {
            return pi;
        }
    
   
        public void area(){
            double area=pi*radio*radio;
            System.out.println("El radio del circulo es: "+radio+" Y el area del circulo es: "+area);
        }
    }

