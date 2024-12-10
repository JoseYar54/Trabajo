package Controlador;

import Modelo.Alumno;
import Modelo.Docente;
import java.util.HashSet;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class DocenteController {

    private HashSet<Docente> listaDocentes;

    public DocenteController() {
        this.listaDocentes = new HashSet<>();
    }

    public HashSet<Docente> getListaDocentes() {
        return listaDocentes;
    }

    public int cantidadDocentes(){
        return listaDocentes.size();
    }
    
    public void setListaDocentes(HashSet<Docente> listaDocentes) {
        this.listaDocentes= this.listaDocentes;
    }
    
    /**
     * Busqueda directa de Docente
    */
    public Docente buscarDocente(String dni){
        for (Docente listaDocente : listaDocentes) {
            if (listaDocente.getDni().equals(dni)) {
                return listaDocente;
            }
        }
        return null;
    }
    
    /**
     * Busqueda directa de Docente
    */
    public Docente buscarDocenteCOD(String codigo){
        for (Docente listaDocente : listaDocentes) {
            if (listaDocente.getCodigoDocente().equals(codigo)) {
                return listaDocente;
            }
        }
        return null;
    }
    
    /**
     * Busqueda multiple de Docentes
    */
    public HashSet<Docente> buscarDocentes(
        String codigo, String nombre, String apPaterno, String apMaterno, 
        String dni) {

    HashSet<Docente> resultado = new HashSet<>();
    boolean coincidencia = false;
    for (Docente listaDocente: listaDocentes) {
        coincidencia = false;
        if (codigo != null && (listaDocente.getCodigoDocente().equalsIgnoreCase(codigo))) {
            coincidencia = true;
        }

        if (nombre != null && (listaDocente.getNombre().equalsIgnoreCase(nombre))) {
            coincidencia = true;
        }

        if (apPaterno != null && (listaDocente.getAp_paterno().equalsIgnoreCase(apPaterno))){
            coincidencia = true;
        }

        if (apMaterno != null && listaDocente.getAp_materno().equalsIgnoreCase(apMaterno)) {
            coincidencia = true;
        }
        
        if (dni != null && listaDocente.getDni().equals(dni)) {
            coincidencia = true;
        }

        if (coincidencia) {
            resultado.add(listaDocente);
        }
    }
        if (resultado.size()==0) {
            JOptionPane.showMessageDialog(null,"Busqueda sin coincidencia","Adventencia",2,null);
        }
    return resultado;
}
    
    /**
     * Agregar Docente
    */
    public void agregarDocente(Docente docente){
        if (buscarDocente(docente.getDni()) == null) {
            docente.setCodigoDocente(docente.generarCodigo(cantidadDocentes()+1));
            this.listaDocentes.add(docente);
        }
    }
    
    /**
     * Editar Docente
    */
    public void editarDocente(Docente docenteBuscado,Docente docenteNuevo){
        Iterator<Docente> iterator = listaDocentes.iterator();
        while (iterator.hasNext()) {
            Docente docente = iterator.next();
            String codDoc = docente.getCodigoDocente();
            if (docente.getCodigoDocente().equals(docenteBuscado.getCodigoDocente())) {
                iterator.remove();
                docenteNuevo.setCodigoDocente(codDoc);
                listaDocentes.add(docenteNuevo);
                return; 
            }
        }
    }
    
    /**
     * Eliminar Docente
    */
    public void eliminarDocente(String dni) {
        Docente x = buscarDocente(dni);
        if (x != null) {
            Iterator<Docente> iterador = this.listaDocentes.iterator();
            while (iterador.hasNext()) {
                Docente listaDocente = iterador.next();
                if (x.getDni().equals(listaDocente.getDni())) {
                    iterador.remove();
                    break;
                }
            }
        }
    }
    
    
    /**
     * Mostrar docentes
     */
    public void mostrarDocentes(){
        for (Docente docentes: listaDocentes) {
            System.out.println(docentes.detallesPersona());
        }
    }
}
