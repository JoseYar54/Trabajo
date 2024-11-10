package Modelo;

public class DocenteCurso {
    
    private Curso curso;
    private Docente docente;
    private String nivel;

    public DocenteCurso(Curso curso, Docente docente, String nivel) {
        this.curso = curso;
        this.docente = docente;
        this.nivel = nivel;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    
}
