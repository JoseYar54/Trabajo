package Modelo;

public class Nota {

    private String codNota;
    private String parametro;
    private double nota;
    
    private Matricula matricula;

    public Nota(String parametro, double nota, Matricula matricula) {
        this.parametro = parametro;
        this.nota = nota;
        this.matricula = matricula;
    }

    public String getCodNota() {
        return codNota;
    }

    public void setCodNota(String codNota) {
        this.codNota = codNota;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }
    
    public String getParametro() {
        return parametro;
    }

    public void setParametro(String parametro) {
        this.parametro = parametro;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
}
