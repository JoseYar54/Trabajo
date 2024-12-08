package Modelo;

import java.util.ArrayList;

public class Docente extends Persona{
    private String codigoDocente;
    private double sueldo;
    
    private ArrayList<Curso> cursosDictados;

    public Docente(double sueldo, String nombre, String ap_materno, String ap_paterno, String dni) {
        super(nombre, ap_materno, ap_paterno, dni);
        this.sueldo = sueldo;
        this.cursosDictados=new ArrayList<>();
    }

    public ArrayList<Curso> getCursosDictados() {
        return cursosDictados;
    }

    public void setCursosDictados(ArrayList<Curso> cursosDictados) {
        this.cursosDictados = cursosDictados;
    }

    public String getCodigoDocente() {
        return codigoDocente;
    }

    public void setCodigoDocente(String codigoDocente) {
        this.codigoDocente = codigoDocente;
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
            +"Código: "+this.getCodigoDocente()+"\n"
            + "Apellidos: "+this.getAp_paterno()+" "+this.getAp_materno()+"\n"
            + "Nombre: "+this.getNombre()+"\n"
            + "DNI: "+this.getDni()+"\n"
            + "Sueldo: "+this.getSueldo();
        return m;    
    }

    @Override
    public String generarCodigo(int correlativo) {
        String ultimoCorrelativo="00000"+String.valueOf(correlativo);
        return "D"+ultimoCorrelativo.substring(ultimoCorrelativo.length()-3);
    }
}
