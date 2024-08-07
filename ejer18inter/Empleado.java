package ejer18inter;
        
public class Empleado {
    public int cod_empleado;
    public String nombres;
    public double horas_trab;
    public double valor_hora;
    public double porcent_retenc;
    public double sbruto, snet;
    
    public Empleado(int cod_empleado, String nombres, double horas_trab,
            double valor_hora, double porcent_retenc){
            this.nombres=nombres;
            this.cod_empleado=cod_empleado;
            this.horas_trab=horas_trab;
            this.valor_hora=valor_hora;
            this.porcent_retenc=porcent_retenc;
    }

    double SalarBrut() {
        sbruto = horas_trab * valor_hora;
        return sbruto;
    }

    double SalarNet() {
        SalarBrut(); // Llama al método SalarBrut() para calcular sbruto
        double retencion_valor = (sbruto * porcent_retenc) / 100;
        snet = sbruto - retencion_valor;
        return snet;
    }
}

    

