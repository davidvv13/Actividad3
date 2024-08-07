
package ejer10inter;

public class Estudiante {
    int Numero_de_inscripcion; 
    String Nombre;
    double Patrimonio;
    int Estrato_social;
    double costo_matricula;

    public Estudiante(int Numero_de_inscripcion,String Nombre,double Patrimonio,
            int Estrato_social) {
        this.Numero_de_inscripcion=Numero_de_inscripcion;
        this.Nombre=Nombre;
        this.Patrimonio=Patrimonio;
        this.Estrato_social=Estrato_social;
    }
    
    public double calculo_matricula(){
        costo_matricula = 50000;
        
        if (Patrimonio > 2000000 && Estrato_social > 3) { 
            costo_matricula += 0.03 * Patrimonio;; 
        }
        return costo_matricula;
    }
}
