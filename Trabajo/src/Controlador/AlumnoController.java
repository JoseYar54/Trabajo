package Controlador;

import Modelo.Alumno;
import Modelo.Curso;
import java.util.HashSet;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class AlumnoController {

    private HashSet<Alumno> listaAlumnos;

    public AlumnoController() {
        this.listaAlumnos = new HashSet<>();
    }

    public HashSet<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public int cantidadAlumnos(){
        return listaAlumnos.size();
    }
    
    public void setListaAlumnos(HashSet<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }
    
    /**
     * Busqueda directa de alumno
    */
    public Alumno buscarAlumno(String dni){
        for (Alumno listaAlumno : listaAlumnos) {
            if (listaAlumno.getDni().equals(dni)) {
                return listaAlumno;
            }
        }
        return null;
    }
    
    /**
     * Busqueda multiple de alumnos
    */
    public HashSet<Alumno> buscarAlumno(
        String codigo, String nombre, String apPaterno, String apMaterno, 
        String dni,String nivelAcademico, String seccion, Integer grado) {

    HashSet<Alumno> resultado = new HashSet<>();
    boolean coincidencia = false;
    for (Alumno alumno : listaAlumnos) {
        coincidencia = false;
        if (codigo != null && (alumno.getCod_alumno().equalsIgnoreCase(codigo))) {
            coincidencia = true;
        }

        if (nombre != null && (alumno.getNombre().equalsIgnoreCase(nombre))) {
            coincidencia = true;
        }

        if (apPaterno != null && (alumno.getAp_paterno().equalsIgnoreCase(apPaterno))){
            coincidencia = true;
        }

        if (apMaterno != null && alumno.getAp_materno().equalsIgnoreCase(apMaterno)) {
            coincidencia = true;
        }

        if (nivelAcademico != null && alumno.getNivel_academico().equalsIgnoreCase(nivelAcademico)) {
            coincidencia = true;
        }

        if (seccion != null && alumno.getSeccion().equalsIgnoreCase(seccion)) {
            coincidencia = true;
        }

        if (grado != null && alumno.getGrado() == grado) {
            coincidencia = true;
        }
        
        if (dni != null && alumno.getDni().equals(dni)) {
            coincidencia = true;
        }

        if (coincidencia) {
            resultado.add(alumno);
        }
    }
        if (resultado.size()==0) {
            JOptionPane.showMessageDialog(null,"Busqueda sin coincidencia","Adventencia",2,null);
        }
    return resultado;
}
    
    /**
     * Agregar Alumno
    */
    public void agregarAlumno(Alumno alumno){
        if (buscarAlumno(alumno.getDni()) == null) {
            alumno.setCod_alumno(alumno.generarCodigo(cantidadAlumnos()+1));
            this.listaAlumnos.add(alumno);
        }
    }
    
    /**
     * Editar Alumno
    */
    public void editarAlumno(Alumno alumnoBuscado,Alumno alumnoNuevo){
        Iterator<Alumno> iterator = listaAlumnos.iterator();
        while (iterator.hasNext()) {
            Alumno alumno = iterator.next();
            String codAlu = alumno.getCod_alumno();
            if (alumno.getCod_alumno().equals(alumnoBuscado.getCod_alumno())) {
                iterator.remove();
                alumnoNuevo.setCod_alumno(codAlu);
                listaAlumnos.add(alumnoNuevo);
                return; 
            }
        }
    }
    
    /**
     * Eliminar Alumno
    */
    public void eliminarAlumno(String dni) {
        Alumno x = buscarAlumno(dni);
        if (x != null) {
            Iterator<Alumno> iterador = this.listaAlumnos.iterator();
            while (iterador.hasNext()) {
                Alumno listaAlumno = iterador.next();
                if (x.getDni().equals(listaAlumno.getDni())) {
                    iterador.remove();
                    break;
                }
            }
        }
    }
    
    /**
     * Mostrar alumnos
     */
    public void mostrarAlumnos(){
        for (Alumno listaAlumno : listaAlumnos) {
            System.out.println(listaAlumno.detallesPersona());
        }
    }
    
    public void asignarCurso(String dni,Curso curso){
        for (Alumno listaAlumno : listaAlumnos) {
            
        }
    }
}
