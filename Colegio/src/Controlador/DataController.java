package Controlador;

import Tools.DataTools;

public class DataController {

    public static AlumnoController alumnoController = new AlumnoController();
    public static DocenteController docenteController = new DocenteController();
    public static CursoController cursoController = new CursoController();
    public static MatriculaController matriculaController = new MatriculaController(alumnoController, cursoController);
    public static NotaController notaController = new NotaController(matriculaController);

    // Método para inicializar todos los datos al inicio de la aplicación
    public static void inicializarDatos() {
        DataTools.readDocData(alumnoController);
        DataTools.readDocData(docenteController);
        DataTools.readDocData(cursoController, docenteController);
    }

    public static AlumnoController getAlumnoController() {
        return alumnoController;
    }

    public static DocenteController getDocenteController() {
        return docenteController;
    }

    public static CursoController getCursoController() {
        return cursoController;
    }

    public static MatriculaController getMatriculaController() {
        return matriculaController;
    }

    public static NotaController getNotaController() {
        return notaController;
    }

    // Métodos adicionales para recargar información específica
    public static void recargarDatosAlumnos() {
        DataTools.readDocData(alumnoController);
    }
    
    public static void recargarDatosDocentes() {
        DataTools.readDocData(docenteController);
    }
    
    public static void recargarDatosCursos() {
        DataTools.readDocData(cursoController,docenteController);
    }
}
