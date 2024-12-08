package Vista;

import Controlador.AlumnoController;
import Controlador.DataController;
import Controlador.DocenteController;
import Tools.IconTools;
import Tools.LogicTools;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FrmElector extends javax.swing.JFrame {
    private final JFrame principal;
    private final String opcion;
    
    public FrmElector(JFrame principal,String opcion,AlumnoController a,DocenteController d) {
        initComponents();
        
        this.opcion=opcion;
        this.principal=principal;
        LogicTools.styleMainFrame(this);
        
        PnlPrincipal.setBackground(IconTools.colorPnlPrinci);
        PnlCeleste.setBackground(IconTools.colorPnls);
        lblCerrar.setBackground(IconTools.colorPnls);
        
        iconsOptions();
        logicCloseOption();
        openSelectedOption();
    }
    
    private void openSelectedOption(){
        lblAlumnos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (opcion.equals("Visualizar")) {
                    FrmVisualizarAlumnos frmVisualizarAlumnos=new FrmVisualizarAlumnos();
                    frmVisualizarAlumnos.setVisible(true);
                    setVisible(false);
                    principal.setVisible(false);
                    dispose();
                }
                if(opcion.equals("Agregar")){
                    FrmAgregarAlumno agregarAlumnos=new FrmAgregarAlumno();
                    agregarAlumnos.setVisible(true);
                    setVisible(false);
                    dispose();
                }
                if(opcion.equals("Editar")){
                    try {
                        String dni=null;
                        dni=JOptionPane.showInputDialog(null,"Ingresa DNI de alumno a editar","Buscar Alumno",1);
                        if (dni.length()==8 && DataController.alumnoController.buscarAlumno(dni)!=null) {
                            FrmEditarAlumno editarAlumno=new FrmEditarAlumno(DataController.alumnoController.buscarAlumno(dni));
                            editarAlumno.setVisible(true);
                        }else{
                            LogicTools.sendMessage("Error al ingresar el alumno buscado");
                        }
                    } catch (Exception k) {
                        System.out.println("Error previsto controlado");
                    }
                    setVisible(false);
                    dispose();
                }
                
                if(opcion.equals("Eliminar")){
                    FrmEliminarAlumno eliminarAlumno=new FrmEliminarAlumno();
                    eliminarAlumno.setVisible(true);
                    setVisible(false);
                    dispose();
                }
            }
        });
        
        lblDocente.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (opcion.equals("Visualizar")) {
                    FrmVisualizarDocente frmVisualizarDocente=new FrmVisualizarDocente();
                    frmVisualizarDocente.setVisible(true);
                    setVisible(false);
                    principal.setVisible(false);
                    dispose();
                }
                if(opcion.equals("Agregar")){
                    FrmAgregarDocente frmAgregarDocente=new FrmAgregarDocente(DataController.docenteController);
                    frmAgregarDocente.setVisible(true);
                    setVisible(false);
                    dispose();
                }
                if(opcion.equals("Editar")){
                    try {
                        String dni=null;
                        dni=JOptionPane.showInputDialog(null,"Ingresa DNI del docente a editar","Buscar Docente",1);
                        if (dni.length()==8 && DataController.docenteController.buscarDocente(dni)!=null) {
                            FrmEditarDocente editarDocente=new FrmEditarDocente(DataController.docenteController.buscarDocente(dni));
                            editarDocente.setVisible(true);
                        }else{
                            LogicTools.sendMessage("El docente buscado no existe");
                        }
                    } catch (Exception k) {
                        System.out.println("Error previsto controlado");
                    }
                    setVisible(false);
                    dispose();
                }
                
                if(opcion.equals("Eliminar")){
                    FrmEliminarDocente eliminarDocente=new FrmEliminarDocente();
                    eliminarDocente.setVisible(true);
                    setVisible(false);
                    dispose();
                }
            }
        });
    }
    
    
    private void logicCloseOption(){
        //Logica para el apartado de visualizar
        lblCerrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
                dispose();
            }
        });
    }
    
    /**
     * Este metodo inserta todas las decoraciones a las Lbl's de Opciones
    */
    private void iconsOptions(){
        LogicTools.styleCloseButtom(lblCerrar,IconTools.colorPnls);
        IconTools.addIconOption(lblMainIcon,"img/icon.png");
        IconTools.addIconOption(lblAlumnos,"img/student1.png");
        IconTools.addIconOption(lblDocente,"img/teacher1.png");
        
        IconTools.addMouseDecoration(lblAlumnos,"img/student2.png","img/student1.png");
        IconTools.addMouseDecoration(lblDocente,"img/teacher2.png","img/teacher1.png");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnlPrincipal = new javax.swing.JPanel();
        PnlCeleste = new javax.swing.JPanel();
        LblOpcion = new javax.swing.JLabel();
        lblMainIcon = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();
        lblAlumnos = new javax.swing.JLabel();
        lblDocente = new javax.swing.JLabel();
        LblTextAgregar = new javax.swing.JLabel();
        LblTextBuscar2 = new javax.swing.JLabel();
        pnlFondo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        PnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        PnlCeleste.setBackground(new java.awt.Color(153, 204, 255));

        LblOpcion.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        LblOpcion.setForeground(new java.awt.Color(255, 255, 255));
        LblOpcion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblOpcion.setText("Escoger Opción");

        lblMainIcon.setBackground(new java.awt.Color(204, 255, 204));
        lblMainIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblCerrar.setBackground(new java.awt.Color(153, 204, 255));
        lblCerrar.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblCerrar.setForeground(new java.awt.Color(0, 0, 0));
        lblCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCerrar.setText("X");

        javax.swing.GroupLayout PnlCelesteLayout = new javax.swing.GroupLayout(PnlCeleste);
        PnlCeleste.setLayout(PnlCelesteLayout);
        PnlCelesteLayout.setHorizontalGroup(
            PnlCelesteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlCelesteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMainIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PnlCelesteLayout.setVerticalGroup(
            PnlCelesteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCelesteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PnlCelesteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LblOpcion)
                    .addGroup(PnlCelesteLayout.createSequentialGroup()
                        .addComponent(lblMainIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))))
            .addComponent(lblCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lblAlumnos.setBackground(new java.awt.Color(204, 255, 204));
        lblAlumnos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblDocente.setBackground(new java.awt.Color(204, 255, 204));
        lblDocente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        LblTextAgregar.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        LblTextAgregar.setForeground(new java.awt.Color(102, 102, 102));
        LblTextAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTextAgregar.setText("Docente");

        LblTextBuscar2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        LblTextBuscar2.setForeground(new java.awt.Color(102, 102, 102));
        LblTextBuscar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTextBuscar2.setText("Alumno");

        javax.swing.GroupLayout PnlPrincipalLayout = new javax.swing.GroupLayout(PnlPrincipal);
        PnlPrincipal.setLayout(PnlPrincipalLayout);
        PnlPrincipalLayout.setHorizontalGroup(
            PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlPrincipalLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblTextBuscar2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addGroup(PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblTextAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112))
            .addComponent(PnlCeleste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PnlPrincipalLayout.setVerticalGroup(
            PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlPrincipalLayout.createSequentialGroup()
                .addComponent(PnlCeleste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlPrincipalLayout.createSequentialGroup()
                        .addComponent(lblDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LblTextAgregar))
                    .addGroup(PnlPrincipalLayout.createSequentialGroup()
                        .addComponent(lblAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LblTextBuscar2)))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pnlFondo.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout pnlFondoLayout = new javax.swing.GroupLayout(pnlFondo);
        pnlFondo.setLayout(pnlFondoLayout);
        pnlFondoLayout.setHorizontalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        pnlFondoLayout.setVerticalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblOpcion;
    private javax.swing.JLabel LblTextAgregar;
    private javax.swing.JLabel LblTextBuscar2;
    private javax.swing.JPanel PnlCeleste;
    private javax.swing.JPanel PnlPrincipal;
    private javax.swing.JLabel lblAlumnos;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblDocente;
    private javax.swing.JLabel lblMainIcon;
    private javax.swing.JPanel pnlFondo;
    // End of variables declaration//GEN-END:variables
}
