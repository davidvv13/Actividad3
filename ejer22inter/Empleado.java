
package ejer22inter;

public class Empleado {
    String nombre;
    int horas_trabajadas;
    double salario_hora,salario_mensual;
    
    Empleado(String nombre, int horas_trabajadas, double salario_hora){
        this.nombre=nombre;
        this.horas_trabajadas=horas_trabajadas;
        this.salario_hora=salario_hora;

    }
    public double CalcularSalarioMensual(){
        salario_mensual=horas_trabajadas*salario_hora;
        return salario_mensual;
    }
}
