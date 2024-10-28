package Modelo;

public class DocenteParcial extends Docente{

    private int horas_trajadas;
    private double pago_por_hora;

    public DocenteParcial(int horas_trajadas, double pago_por_hora, String sede, String nivel, String nombre, String ap_materno, String ap_paterno, String dni, int edad) {
        super(sede, nivel, nombre, ap_materno, ap_paterno, dni, edad);
        this.horas_trajadas = horas_trajadas;
        this.pago_por_hora = pago_por_hora;
        this.correlativoDocente++;
        this.setCod_Docente(generarCodigo());

    }

    public int getHoras_trajadas() {
        return horas_trajadas;
    }

    public void setHoras_trajadas(int horas_trajadas) {
        this.horas_trajadas = horas_trajadas;
    }

    public double getPago_por_hora() {
        return pago_por_hora;
    }

    public void setPago_por_hora(double pago_por_hora) {
        this.pago_por_hora = pago_por_hora;
    }

    public double pagoneto(){
        return this.horas_trajadas*this.pago_por_hora;
    }
    
    @Override
    public String detallesPersona() {
        String m="\n"
                + "------Docente Parcial------"+"\n"
                + "Apellidos: "+this.getAp_paterno()+" "+this.getAp_materno()+"\n"
                + "Nombre: "+this.getNombre()+"\n"
                + "DNI: "+this.getDni()+"\n"
                + "Sede: "+this.getSede()+"\n"
                + "Pago por Horas: "+this.getPago_por_hora()+"\n"
                + "Horas Trabajadas: "+this.getHoras_trajadas()+"\n"
                + "Pago Neto: "+this.pagoneto();
        return m;
    }

    @Override
    public String generarCodigo() {
        String c="DP-"+this.getDni().substring(0,3)+String.valueOf(Docente.correlativoDocente);
        return c;
    }
}
