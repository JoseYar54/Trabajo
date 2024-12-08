package Vista;

import Tools.IconTools;
import Tools.LogicTools;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
public class FrmMenuCursos extends javax.swing.JFrame {

    private final String urlAgregarCurso1="img/addCourse1.png",
            urlAgregarCurso2="img/addCourse2.png",
            urlAsignar1="img/assignTeacher1.png",
            urlAsignar2="img/assignTeacher2.png",
            urlEliminarCurso1="img/deleteCourse1.png",
            urlEliminarCurso2="img/deleteCourse2.png",
            urlVisualizarCurso1="img/viewCourse1.png",
            urlVisualizarCurso2="img/viewCourse2.png";
    
    public FrmMenuCursos() {
        
        initComponents();
        LogicTools.styleMainFrame(this);

        PnlPrincipal.setBackground(IconTools.colorPnlPrinci);
        PnlCeleste.setBackground(IconTools.colorPnls);
        lblCerrar.setBackground(IconTools.colorPnls);
        
        logicCloseButtom(lblCerrar);
        logicOption();
        addStyleIcons();
    }
    /**
     * Este metodo inserta todas las decoraciones a las Lbl's de Opciones
    */
    private void addStyleIcons(){
        IconTools.addIconOption(lblMainIcon,"img/icon.png");
        IconTools.addIconOption(lblCerrar,"img/return1.png");
        IconTools.addIconOption(LblAgregarCurso,urlAgregarCurso1);
        IconTools.addIconOption(LblEliminarCurso,urlEliminarCurso1);
        IconTools.addIconOption(lblAsignarCurso, urlAsignar1);
        IconTools.addIconOption(lblVisualizarCurso, urlVisualizarCurso1);
        IconTools.addMouseDecoration(lblCerrar, "img/return2.png", "img/return1.png");
        IconTools.addMouseDecoration(lblAsignarCurso,urlAsignar2,urlAsignar1);
        IconTools.addMouseDecoration(LblEliminarCurso,urlEliminarCurso2,urlEliminarCurso1);
        IconTools.addMouseDecoration(LblAgregarCurso,urlAgregarCurso2,urlAgregarCurso1);
        IconTools.addMouseDecoration(lblVisualizarCurso,urlVisualizarCurso2,urlVisualizarCurso1);
    }
    private void logicOption(){
        //Logica para el apartado de Visualizar
        lblVisualizarCurso.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
                FrmVisualizarCursos frmVisualizarCursos=new FrmVisualizarCursos();
                frmVisualizarCursos.setVisible(true);
                dispose();
            }
        });
        
        //Logica para el apartado de Agregar
        LblAgregarCurso.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {   
                FrmAgregarCurso  frmAgregarCurso=new FrmAgregarCurso();
                frmAgregarCurso.setVisible(true);
                dispose();
            }
        });
        
        //Logica para el apartado de Asignar
        lblAsignarCurso.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }
        });
        
        //Logica para el apartado de Eliminar
        LblEliminarCurso.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }
        });
    }
    
    private void logicCloseButtom(JLabel lbl){
        lbl.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
                FrmMenuPrincipal p=new FrmMenuPrincipal();
                dispose();
                p.setVisible(true);
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnlPrincipal = new javax.swing.JPanel();
        PnlCeleste = new javax.swing.JPanel();
        lblCerrar = new javax.swing.JLabel();
        LblOpcion = new javax.swing.JLabel();
        lblMainIcon = new javax.swing.JLabel();
        LblEliminarCurso = new javax.swing.JLabel();
        LblAgregarCurso = new javax.swing.JLabel();
        LblTextAgregar = new javax.swing.JLabel();
        LblTextEliminar = new javax.swing.JLabel();
        LblTextAgregar1 = new javax.swing.JLabel();
        LblTextEliminar1 = new javax.swing.JLabel();
        lblAsignarCurso = new javax.swing.JLabel();
        LblTextAsignar1 = new javax.swing.JLabel();
        LblTextAsignar2 = new javax.swing.JLabel();
        lblVisualizarCurso = new javax.swing.JLabel();
        lblTxtVisualizar1 = new javax.swing.JLabel();
        lblTxtVisualizar2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        PnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        PnlCeleste.setBackground(new java.awt.Color(153, 204, 255));

        lblCerrar.setBackground(new java.awt.Color(153, 204, 255));
        lblCerrar.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblCerrar.setForeground(new java.awt.Color(0, 0, 0));
        lblCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        LblOpcion.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        LblOpcion.setForeground(new java.awt.Color(255, 255, 255));
        LblOpcion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblOpcion.setText("MENÚ CURSOS");

        lblMainIcon.setBackground(new java.awt.Color(204, 255, 204));
        lblMainIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout PnlCelesteLayout = new javax.swing.GroupLayout(PnlCeleste);
        PnlCeleste.setLayout(PnlCelesteLayout);
        PnlCelesteLayout.setHorizontalGroup(
            PnlCelesteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlCelesteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMainIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LblOpcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(623, 623, 623)
                .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        PnlCelesteLayout.setVerticalGroup(
            PnlCelesteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCelesteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlCelesteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PnlCelesteLayout.createSequentialGroup()
                        .addGroup(PnlCelesteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LblOpcion)
                            .addComponent(lblMainIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LblEliminarCurso.setBackground(new java.awt.Color(204, 255, 204));
        LblEliminarCurso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        LblAgregarCurso.setBackground(new java.awt.Color(204, 255, 204));
        LblAgregarCurso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        LblTextAgregar.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        LblTextAgregar.setForeground(new java.awt.Color(102, 102, 102));
        LblTextAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTextAgregar.setText("Agregar");

        LblTextEliminar.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        LblTextEliminar.setForeground(new java.awt.Color(102, 102, 102));
        LblTextEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTextEliminar.setText("Eliminar");

        LblTextAgregar1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        LblTextAgregar1.setForeground(new java.awt.Color(102, 102, 102));
        LblTextAgregar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTextAgregar1.setText("Curso");

        LblTextEliminar1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        LblTextEliminar1.setForeground(new java.awt.Color(102, 102, 102));
        LblTextEliminar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTextEliminar1.setText("Curso");

        lblAsignarCurso.setBackground(new java.awt.Color(204, 255, 204));
        lblAsignarCurso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        LblTextAsignar1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        LblTextAsignar1.setForeground(new java.awt.Color(102, 102, 102));
        LblTextAsignar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTextAsignar1.setText("Asignar");

        LblTextAsignar2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        LblTextAsignar2.setForeground(new java.awt.Color(102, 102, 102));
        LblTextAsignar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTextAsignar2.setText("Curso");

        lblVisualizarCurso.setBackground(new java.awt.Color(204, 255, 204));
        lblVisualizarCurso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblTxtVisualizar1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblTxtVisualizar1.setForeground(new java.awt.Color(102, 102, 102));
        lblTxtVisualizar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTxtVisualizar1.setText("Vizualizar");

        lblTxtVisualizar2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblTxtVisualizar2.setForeground(new java.awt.Color(102, 102, 102));
        lblTxtVisualizar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTxtVisualizar2.setText("Cursos");

        javax.swing.GroupLayout PnlPrincipalLayout = new javax.swing.GroupLayout(PnlPrincipal);
        PnlPrincipal.setLayout(PnlPrincipalLayout);
        PnlPrincipalLayout.setHorizontalGroup(
            PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlCeleste, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, Short.MAX_VALUE)
            .addGroup(PnlPrincipalLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTxtVisualizar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTxtVisualizar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblVisualizarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LblTextAgregar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LblTextAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LblAgregarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LblTextAsignar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LblTextAsignar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAsignarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(LblEliminarCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LblTextEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LblTextEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100))
        );
        PnlPrincipalLayout.setVerticalGroup(
            PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlPrincipalLayout.createSequentialGroup()
                .addComponent(PnlCeleste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147)
                .addGroup(PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PnlPrincipalLayout.createSequentialGroup()
                            .addComponent(LblEliminarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(LblTextEliminar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(LblTextEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PnlPrincipalLayout.createSequentialGroup()
                            .addComponent(lblAsignarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(LblTextAsignar1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(LblTextAsignar2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PnlPrincipalLayout.createSequentialGroup()
                        .addComponent(lblVisualizarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTxtVisualizar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTxtVisualizar2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnlPrincipalLayout.createSequentialGroup()
                        .addComponent(LblAgregarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LblTextAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LblTextAgregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(126, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblAgregarCurso;
    private javax.swing.JLabel LblEliminarCurso;
    private javax.swing.JLabel LblOpcion;
    private javax.swing.JLabel LblTextAgregar;
    private javax.swing.JLabel LblTextAgregar1;
    private javax.swing.JLabel LblTextAsignar1;
    private javax.swing.JLabel LblTextAsignar2;
    private javax.swing.JLabel LblTextEliminar;
    private javax.swing.JLabel LblTextEliminar1;
    private javax.swing.JPanel PnlCeleste;
    private javax.swing.JPanel PnlPrincipal;
    private javax.swing.JLabel lblAsignarCurso;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblMainIcon;
    private javax.swing.JLabel lblTxtVisualizar1;
    private javax.swing.JLabel lblTxtVisualizar2;
    private javax.swing.JLabel lblVisualizarCurso;
    // End of variables declaration//GEN-END:variables
}
