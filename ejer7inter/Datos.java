
package ejer7inter;

public class Datos {
    // Definir las variables A y B como miembros de la clase
    public double A;
    public double B;
    
    public Datos(double A, double B){
        this.A=A;
        this.B=B;
    }
    // Método para capturar los datos de A y B
    public String CompararDatos() {
         // Comparar A y B 
         if (A > B) {
            return String.valueOf(A)+" es mayor que "+String.valueOf(B);
        } else if (A == B) {
            return String.valueOf(A)+" es igual que "+String.valueOf(B);
        } else {
            return String.valueOf(A)+" es menor que "+String.valueOf(B);
        }

    }
}
