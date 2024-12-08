package Modelo;

import java.util.ArrayList;
import java.util.Objects;

public class Alumno extends Persona{

    private String cod_alumno;
    private String nivel_academico;
    private int grado;
    private String seccion;
    private String observacion="Sin observaciones";
    
    private ArrayList<Curso> cursos;

    public Alumno(String nivel_academico, String seccion, int grado, String nombre, String ap_materno, String ap_paterno, String dni) {
        super(nombre, ap_materno, ap_paterno, dni);
        this.nivel_academico = nivel_academico;
        this.seccion = seccion;
        this.grado = grado;
        this.cursos = new ArrayList<>();
    }
    
    public void agregarCurso(Curso curso){
        this.cursos.add(curso);
    }
    
    public String getCod_alumno() {
        return cod_alumno;
    }

    public void setCod_alumno(String cod_alumno) {
        this.cod_alumno = cod_alumno;
    }

    public String getNivel_academico() {
        return nivel_academico;
    }

    public void setNivel_academico(String nivel_academico) {
        this.nivel_academico = nivel_academico;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Override
    public String detallesPersona() {
        String m="\n"
            + "------Alumno------"+"\n"
            + "Apellidos: "+this.getAp_paterno()+" "+this.getAp_materno()+"\n"
            + "Nombre: "+this.getNombre()+"\n"
            + "DNI: "+this.getDni()+"\n"
            + "Nivel Academico: "+this.getNivel_academico()+"\n"
            + "Seccion: "+this.getSeccion()+"\n"
            + "Grado: "+this.getGrado()+"\n"
            + "Observación: "+this.getObservacion();
        return m;
    }
    @Override
    public String generarCodigo(int correlativo) {
        String ultimoCorrelativo="00000"+String.valueOf(correlativo);
        return "A"+ultimoCorrelativo.substring(ultimoCorrelativo.length()-3);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.cod_alumno);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        return Objects.equals(this.cod_alumno, other.cod_alumno);
    }
}
