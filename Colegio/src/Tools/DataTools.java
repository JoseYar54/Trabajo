package Tools;

import Controlador.AlumnoController;
import Controlador.CursoController;
import Controlador.DocenteController;
import Modelo.Alumno;
import Modelo.Curso;
import Modelo.Docente;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author JOSE
 */
public class DataTools {
    
    /**
     * Metodo que carga los datos del archivo local alumnos
     * @param c 
     */
    public static void readDocData(AlumnoController c){
         String linea, nombres,dni,codigo,ap_paterno,ap_materno,nivel,seccion,observacion;
         int grado;
         String separado[];
         double pro;
         try {
            File file = new File("Alumnos.txt");
            FileReader fr = new FileReader(file);
            BufferedReader bf = new BufferedReader(fr);
            while( (linea=bf.readLine())!=null ){
                separado = linea.split("-");
                codigo =separado[0];
                nombres = separado[1];
                ap_paterno = separado[2];
                ap_materno = separado[3];
                dni=separado[4];
                nivel= separado[5];
                grado= Integer.parseInt(separado[6]);
                seccion= separado[7];
                observacion=separado[8];
                Alumno a = new Alumno(nivel,seccion,grado,nombres,ap_materno,ap_paterno,dni);
                a.setObservacion(observacion);
                c.agregarAlumno(a);
            }
            bf.close();
         } catch (Exception e) {
             LogicTools.sendMessage("Error al cargar el archivo local Alumno");
         }
     }
    
    /**
     * Metodo que carga los datos del archivo local docentes
     * @param c 
     */
    public static void readDocData(DocenteController docenteController){
         String linea, nombres,dni,codigo,ap_paterno,ap_materno;
         double sueldo;
         String separado[];
         try {
            File file = new File("Docentes.txt");
            FileReader fr = new FileReader(file);
            BufferedReader bf = new BufferedReader(fr);
            while( (linea=bf.readLine())!=null ){
                separado = linea.split("-");
                codigo =separado[0];
                nombres = separado[1];
                ap_paterno = separado[2];
                ap_materno = separado[3];
                sueldo=Double.parseDouble(separado[4]);
                dni=separado[5];
                Docente docente=new Docente(sueldo, nombres, ap_materno, ap_paterno, dni);
                docenteController.agregarDocente(docente);
            }
            bf.close();
         } catch (Exception e) {
             LogicTools.sendMessage("Error al cargar el archivo local Docentes");
         }
     }
    
    /**
     * Metodo que carga los datos del archivo local Cursos
     */
    public static void readDocData(CursoController cursoController,DocenteController docenteController){
         String codigo,nombCurso,nivelAca,DocenteAsig,linea;
         String parametros[];
         try {
            File file = new File("Cursos.txt");
            FileReader fr = new FileReader(file);
            BufferedReader bf = new BufferedReader(fr);
            while((linea=bf.readLine())!=null ){
                parametros = linea.split("-");
                codigo =parametros[0];
                nombCurso = parametros[1];
                nivelAca = parametros[2];
                DocenteAsig = parametros[3];
                
                Docente docente = docenteController.buscarDocenteCOD(DocenteAsig);
                if (docente != null) {
                    Curso c = new Curso(nombCurso, docente);
                    c.setNivelAcademico(nivelAca);
                    cursoController.agregarCurso(c);
                } else {
                    LogicTools.sendMessage("Error al recepcionar un curso:\nID: " + codigo);
                }
            }
            bf.close();
         } catch (Exception e) {
             LogicTools.sendMessage("Error al cargar el archivo local Cursos");
         }
     }
    /**
     * Metodo que sobreescribe los datos del archivo local alumnos
     */
    public static void writeDocData(AlumnoController c){
        try{
        File file = new File("Alumnos.txt");
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);
        for (Alumno objEst : c.getListaAlumnos()) {
             pw.println(objEst.getCod_alumno()+"-"+
                    objEst.getNombre()+"-"+
                    objEst.getAp_paterno()+"-"+
                    objEst.getAp_materno()+"-"+
                    objEst.getDni()+"-"+
                    objEst.getNivel_academico()+"-"+
                    objEst.getGrado()+"-"+
                    objEst.getSeccion()+"-"+
                    objEst.getObservacion());
        }
        pw.close();
        }catch(Exception e){
            LogicTools.sendMessage("Error al grabar el archivo local Alumnos");
        }
     }
    
    /**
     * Metodo que sobreescribe los datos del archivo local docente
     * @param c 
     */
    public static void writeDocData(DocenteController dc){
        try{
        File file = new File("Docentes.txt");
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);
        for (Docente objEst: dc.getListaDocentes()) {
             pw.println(objEst.getCodigoDocente()+"-"+
                    objEst.getNombre()+"-"+
                    objEst.getAp_paterno()+"-"+
                    objEst.getAp_materno()+"-"+
                     objEst.getSueldo()+"-"+
                     objEst.getDni()
             );
        }
        pw.close();
        }catch(Exception e){
            LogicTools.sendMessage("Error al grabar el archivo local");
        }
     }
    
    /**
     * Metodo que sobreescribe los datos del archivo local Cursos
     */
    public static void writeDocData(CursoController cursoController){
        try{
        File file = new File("Cursos.txt");
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);
        for (Curso curso: cursoController.getListaCursos()) {
             pw.println(curso.getCod_Curso()+"-"+
                    curso.getNombcurso()+"-"+
                    curso.getNivelAcademico()+"-"+
                     curso.getDocente().getCodigoDocente()
             );
        }
        pw.close();
        }catch(Exception e){
            LogicTools.sendMessage("Error al grabar el archivo local Cursos");
        }
     }
}
