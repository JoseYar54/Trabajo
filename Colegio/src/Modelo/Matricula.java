package Modelo;

import java.util.ArrayList;

public class Matricula {
    String codigo;
    Curso curso;
    Alumno alumno;
    
    ArrayList<Nota> notas;

    public Matricula(Curso curso, Alumno alumno) {
        this.curso = curso;
        this.alumno = alumno;
        notas=new ArrayList<>();
    }

    public void agregarNota(Nota nota){
        this.notas.add(nota);
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;
    }
}
