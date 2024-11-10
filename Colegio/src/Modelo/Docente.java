package Modelo;

public abstract class Docente extends Persona{

    private String sede;
    private String cod_Docente;
    public static int correlativoDocente=100;

    public Docente(String sede, String nivel, String nombre, String ap_materno, String ap_paterno, String dni, int edad) {
        super(nombre, ap_materno, ap_paterno, dni, edad);
        this.sede = sede;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getCod_Docente() {
        return cod_Docente;
    }

    public void setCod_Docente(String cod_Docente) {
        this.cod_Docente = cod_Docente;
    }

}
