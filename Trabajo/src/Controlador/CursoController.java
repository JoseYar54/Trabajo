package Controlador;

import Modelo.Curso;
import Modelo.Docente;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class CursoController {
    
    ArrayList<Curso> listaCursos;

    public CursoController() {
        this.listaCursos = new ArrayList<>();
    }
    
    public int cantidadCursos(){
        return this.listaCursos.size();
    }

    public ArrayList<Curso> getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(ArrayList<Curso> listaCursos) {
        this.listaCursos = listaCursos;
    }
    
    public void agregarCurso(Curso curso){
        if (buscarCurso(curso.getCod_Curso())== null) {
            curso.setCod_Curso(curso.generarCodigoCurso(cantidadCursos()+1));
            listaCursos.add(curso);
        }
    }
    
    public void eliminarCurso(String codigoCurso){
        Curso x = buscarCurso(codigoCurso);
        if (x != null) {
            Iterator<Curso> iterador = this.listaCursos.iterator();
            while (iterador.hasNext()) {
                Curso c = iterador.next();
                if (x.getCod_Curso().equals(codigoCurso)) {
                    iterador.remove();
                    break;
                }
            }
        }
    }
    
    public Curso buscarCurso(String codCurso){
        for (Curso listaCurso : listaCursos) {
            if (listaCurso.getCod_Curso().equals(codCurso)) {
                return listaCurso;
            }
        }
        return null;
    }
    
    public void asignarDocente(String codCurso,Docente docente){
        for (Curso listaCurso : listaCursos) {
            if (listaCurso.getCod_Curso().equals(codCurso)) {
                listaCurso.setDocente(docente);
            }
        }
    }
    
    public ArrayList<Curso> buscarCurso(String codigo,String nombreCurso,String nivelAcademico,String codDocente){
        ArrayList<Curso> resultado = new ArrayList<>();
        boolean coincidencia = false;
        for (Curso curso : listaCursos) {
            coincidencia = false;
            if (codigo != null && (curso.getCod_Curso().equalsIgnoreCase(codigo))) {
                coincidencia = true;
            }

            if (nivelAcademico != null && (curso.getNivelAcademico().equalsIgnoreCase(nivelAcademico))) {
                coincidencia = true;
            }

            if (nombreCurso != null && (curso.getNombcurso().equalsIgnoreCase(nombreCurso))) {
                coincidencia = true;
            }
            
            if (codDocente != null && (curso.getDocente().getCodigoDocente().equalsIgnoreCase(codDocente))) {
                coincidencia = true;
            }
            
            if (coincidencia) {
                resultado.add(curso);
            }
        }
        if (resultado.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Busqueda sin coincidencia","Adventencia",2,null);
        }
    return resultado;
    }
    
    public String listarCursos(){
        String lista="";
        for (Curso listaCurso : listaCursos) {
            lista=lista+"\n"
                +"-----------------------------"
                +"Curso: "+listaCurso.getNombcurso()
                +"Docente: "+listaCurso.getDocente().getNombre()
                +"Nivel Academico: "+listaCurso.getNivelAcademico()
                +"Alumnos matriculados: "+listaCurso.getAlumnosInscritos().size();
        }
        return lista;
    }
}
