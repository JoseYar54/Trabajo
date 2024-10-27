package Modelo;

public class DocenteFull extends Docente{
    private double sueldo;

    public DocenteFull(double sueldo, String sede, String nivel, String nombre, String ap_materno, String ap_paterno, String dni, int edad) {
        super(sede, nivel, nombre, ap_materno, ap_paterno, dni, edad);
        this.sueldo = sueldo;
        this.setCod_Docente(generarCodigo());
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String detallesPersona() {
        String m="\n"
            + "------Docente Full------"+"\n"
            + "Apellidos: "+this.getAp_paterno()+" "+this.getAp_materno()+"\n"
            + "Nombre: "+this.getNombre()+"\n"
            + "DNI: "+this.getDni()+"\n"
            + "Sede: "+this.getSede()+"\n"
            + "Sueldo: "+this.getSueldo();
        return m;    
    }

    @Override
    public String generarCodigo() {
        String c="DF-"+this.getDni().substring(0,3)+String.valueOf(Docente.correlativoDocente);
        return c;
    }
    
}
