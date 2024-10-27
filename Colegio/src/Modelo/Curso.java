package Modelo;

import java.util.ArrayList;

public class Curso {
    private String cod_Curso;
    private String nomb_curso;
    private double horasPorClase;
    private ArrayList<Nota> notas;
    public static int correlativoCurso=100;

    public Curso(String nomb_curso, double horasPorClase) {
        this.nomb_curso = nomb_curso;
        this.horasPorClase = horasPorClase;
        this.cod_Curso=generarCodigoCurso();
    }

    public String getCod_Curso() {
        return cod_Curso;
    }

    public void setCod_Curso(String cod_Curso) {
        this.cod_Curso = cod_Curso;
    }

    public String getNomb_curso() {
        return nomb_curso;
    }

    public void setNomb_curso(String nomb_curso) {
        this.nomb_curso = nomb_curso;
    }

    public double getHorasPorClase() {
        return horasPorClase;
    }

    public void setHorasPorClase(double horasPorClase) {
        this.horasPorClase = horasPorClase;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;
    }
    
    private String generarCodigoCurso(){
        correlativoCurso++;
        String Codigo="C-"+this.getNomb_curso().substring(0,2)+String.valueOf(correlativoCurso);
        return Codigo;
    }
}
