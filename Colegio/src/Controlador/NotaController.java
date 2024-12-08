package Controlador;

import Modelo.Matricula;
import Modelo.Nota;

public class NotaController {
    
    private MatriculaController matriculaController;
    
    public NotaController(MatriculaController matriculaController) {
        this.matriculaController = matriculaController;
    }

    public void agregarNota(String dniAlumno,String codCurso,String parametro,double nota){
        
        Matricula matricula = matriculaController.buscarMatricula(dniAlumno, codCurso);
        Nota n=new Nota(parametro, nota, matricula);
        matricula.agregarNota(n);
    }
}
