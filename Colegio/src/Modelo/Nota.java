package Modelo;

public class Nota {

    private String parametro;
    private double nota;

    public Nota(String parametro, double nota) {
        this.parametro = parametro;
        this.nota = nota;
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
