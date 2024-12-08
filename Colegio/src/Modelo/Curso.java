package Modelo;

import java.util.ArrayList;

public class Curso {
    private String cod_Curso;
    private String nombcurso;
    private String nivelAcademico;
    
    private Docente docente;
    private ArrayList<Matricula> alumnosInscritos; 

    public Curso(String nomb_curso, Docente docente) {
        this.nombcurso = nomb_curso;
        this.docente = docente;
        this.alumnosInscritos = new ArrayList<>();
    }

    public String getCod_Curso() {
        return cod_Curso;
    }

    public void setCod_Curso(String cod_Curso) {
        this.cod_Curso = cod_Curso;
    }

    public String getNombcurso() {
        return nombcurso;
    }

    public void setNombcurso(String nombcurso) {
        this.nombcurso = nombcurso;
    }

    public String getNivelAcademico() {
        return nivelAcademico;
    }

    public void setNivelAcademico(String nivelAcademico) {
        this.nivelAcademico = nivelAcademico;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public ArrayList<Matricula> getAlumnosInscritos() {
        return alumnosInscritos;
    }

    public void setAlumnosInscritos(ArrayList<Matricula> alumnosInscritos) {
        this.alumnosInscritos = alumnosInscritos;
    }

    public void addAlumnoRegistrado(Matricula alumnoCurso){
        alumnosInscritos.add(alumnoCurso);
    }
    
    public   String generarCodigoCurso(int correlativo){
        String ultimoCorrelativo="00000"+String.valueOf(correlativo);
        return "C"+ultimoCorrelativo.substring(ultimoCorrelativo.length()-3);
    }
}
