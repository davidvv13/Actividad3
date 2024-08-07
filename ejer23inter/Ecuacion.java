
package ejer23inter;

public class Ecuacion {
    double A,B,C;
    
    Ecuacion(double A, double B, double C){
        this.A=A;
        this.B=B;
        this.C=C;
    }
    
    public String CalcularSolucion(){
        double x1,x2,den;
        den=2*A;
        x1=(-B+Math.sqrt(Math.pow(B, 2)-4*A*C))/den;
        x2=(-B-Math.sqrt(Math.pow(B, 2)-4*A*C))/den;
        if (Double.isNaN(x1)){
            return "La solución tiene números complejos";
        }
        else{
            if (x1==x2){
                return "La solución de la ecuación es x="+String.valueOf(x1);
            }
            else{
                return "La primera solución de la ecuación es x1="+
                        String.valueOf(x1)+".\n"+"La segunda solución de la "
                        + "ecuación es x2="+String.valueOf(x2);
                        
            }
            
        }
        
    }
}
