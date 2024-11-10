package Controlador;

import Modelo.Alumno;
import java.util.HashSet;

public class AlumnoController {

    private HashSet<Alumno> listaAlumnos;

    public AlumnoController() {
        this.listaAlumnos = new HashSet<>();
        Alumno alumno1 = new Alumno("Secundaria", "C", 2, "Jordy", "De la Cruz", "Yarleque", "77794489", 22);
        Alumno alumno2 = new Alumno("Primaria", "A", 3, "Maria", "Lopez", "Santos", "88832211", 10);
        Alumno alumno3 = new Alumno("Secundaria", "B", 5, "Carlos", "Perez", "Gutierrez", "99941122", 15);
        Alumno alumno4 = new Alumno("Primaria", "D", 1, "Lucia", "Fernandez", "Rios", "66623344", 8);
        
        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
    }

    public HashSet<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(HashSet<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }
    
    /**
     * Buscar Alumno
    */
    public Alumno buscarAlumno(String dni){
        for (Alumno listaAlumno : listaAlumnos) {
            if (listaAlumno.getDni().equals(dni)) {
                return listaAlumno;
            }
        }
        return null;
    }
}
