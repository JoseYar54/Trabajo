package Controlador;

import Modelo.Alumno;
import Modelo.Curso;
import Modelo.Matricula;
import Tools.LogicTools;
import java.util.ArrayList;

public class MatriculaController {
    
    private ArrayList<Matricula> listaMatriculas;
    
    private AlumnoController alumnoController;
    private CursoController cursoController;

    public MatriculaController(AlumnoController alumnoController, CursoController cursoController) {
        this.alumnoController = alumnoController;
        this.cursoController = cursoController;
        this.listaMatriculas = new ArrayList<>();
    }
    
    public Matricula buscarMatricula(String dniAlumno,String codCurso){
        for (Matricula lista : listaMatriculas) {
            if (lista.getAlumno().getDni().equals(dniAlumno) && lista.getCurso().getCod_Curso().equals(codCurso)) {
                return lista;
            }
        }
        return null;
    }
    
    public void matricularAlumno(String CodigoAlumno,String CodigoCurso){
        Alumno alumno=alumnoController.buscarAlumno(CodigoAlumno);
        Curso curso=cursoController.buscarCurso(CodigoCurso);
        
        if (alumno == null) {
            LogicTools.sendMessage("El código de alumno no existe.");
            return;
        }

        if (curso == null) {
            LogicTools.sendMessage("El código de curso no existe.");
            return;
        }
        
        for (Matricula matricula : listaMatriculas) {
            if (matricula.getAlumno().equals(alumno) && matricula.getCurso().equals(curso)) {
                LogicTools.sendMessage("El alumno ya esta matriculado en este curso c:");
                return;
            }            
        }
        
        Matricula matricula=new Matricula(curso, alumno);
        
        listaMatriculas.add(matricula);
        
        alumno.agregarCurso(curso);
        curso.addAlumnoRegistrado(matricula);
        
        LogicTools.sendMessage("Alumno Registrado Correctamente");
    }
}
