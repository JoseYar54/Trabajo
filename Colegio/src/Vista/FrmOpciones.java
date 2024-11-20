package Vista;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class FrmOpciones extends javax.swing.JFrame {
    private final Color focusColor=new Color(108, 162, 255);
    private final Color focusSelect=new Color(232,103,89);
    private String mainOption="";
    
    public FrmOpciones() {
        initComponents();
        FrmPrinci.styleMainFrame(this);
        iconsOptions();
        interaccionOption();
        styleCloseButtom();
        mainOptionSelect();
    }
    
    private void mainOptionSelect(){
        LblAlumnos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                mainOption="Alumno";
                LblDocentes.setOpaque(false);
                LblAlumnos.setBackground(focusSelect);
                LblAlumnos.setOpaque(true);
                repaint();
            }
        });
        LblDocentes.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                mainOption="Docente";
                LblAlumnos.setOpaque(false);
                LblDocentes.setBackground(focusSelect);
                LblDocentes.setOpaque(true);
                repaint();
            }
        });
    }
    
    /**
     * Este metodo inserta todas las decoraciones a las Lbl's de Opciones
    */
    private void iconsOptions(){
        addIconOption(LblVisualizar,"img/search.png");
        addIconOption(LblAgregar,"img/add.png");
        addIconOption(LblEditar,"img/update.png");
        addIconOption(LblEliminar,"img/delete.png");
        addIconOption(LblAlumnos, "img/student.png");
        addIconOption(LblDocentes, "img/teacher.png");
        
        addMouseDecoration(LblVisualizar,focusColor);
        addMouseDecoration(LblAgregar,focusColor);
        addMouseDecoration(LblEditar,focusColor);
        addMouseDecoration(LblEliminar,focusColor);
    }
    
    /**
     * Este metodo hace es controlar que ventana se abrira (Aún sin terminar :'v)
    */
    private void interaccionOption(){
        LblVisualizar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (mainOption.equals("Alumno")) {
                    setVisible(false);
                    FrmVisualizarAlumnos fva=new FrmVisualizarAlumnos();
                    fva.setVisible(true);
                    dispose();
                }
                if (mainOption.equals("Docente")) {
                    setVisible(false);
                    FrmVisualizarDocente fvd=new FrmVisualizarDocente();
                    fvd.setVisible(true);
                    dispose();
                }
            }
        });
    }
    
    /**
    * Reconoce cuando el mouse se posa sobre cada opción
    */
    private void addMouseDecoration(JLabel lbl,Color color){
        lbl.setBackground(color);
        lbl.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                lbl.setOpaque(true);
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lbl.setOpaque(false);
                repaint();
            }
        });
    }
    
    /**
    * Realiza la inserrción del icon en el JLabel
    */
    private void addIconOption(JLabel lbl,String url){
        ImageIcon icon = new ImageIcon(url);
        Image image=icon.getImage();
        Image Tamanio=image.getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_SMOOTH);        
        lbl.setIcon(new ImageIcon(Tamanio));
        
        
    }
    
    /**
    * Le da estilo al botón cerrar, consultarle a Obed si hago estatica esta mamada
    */
    private void styleCloseButtom(){
        this.lblCerrar.setOpaque(true);
        this.lblCerrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                lblCerrar.setBackground(new Color(222,92,92));
                lblCerrar.setForeground(new Color(255,255,255));
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                lblCerrar.setBackground(new Color(153,204,255));
                lblCerrar.setForeground(new Color(0,0,0));
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
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
        LblEliminar = new javax.swing.JLabel();
        LblEditar = new javax.swing.JLabel();
        LblVisualizar = new javax.swing.JLabel();
        LblAgregar = new javax.swing.JLabel();
        LblTextAgregar = new javax.swing.JLabel();
        LblTextBuscar2 = new javax.swing.JLabel();
        LblTextEditar = new javax.swing.JLabel();
        LblTextEliminar = new javax.swing.JLabel();
        LblAlumnos = new javax.swing.JLabel();
        LblDocentes = new javax.swing.JLabel();
        LblTextDocentes = new javax.swing.JLabel();
        LblTextAlumnos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        PnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        PnlCeleste.setBackground(new java.awt.Color(153, 204, 255));

        lblCerrar.setBackground(new java.awt.Color(153, 204, 255));
        lblCerrar.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblCerrar.setForeground(new java.awt.Color(0, 0, 0));
        lblCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCerrar.setText("X");

        LblOpcion.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        LblOpcion.setForeground(new java.awt.Color(102, 102, 102));
        LblOpcion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblOpcion.setText("Menú Principal");

        javax.swing.GroupLayout PnlCelesteLayout = new javax.swing.GroupLayout(PnlCeleste);
        PnlCeleste.setLayout(PnlCelesteLayout);
        PnlCelesteLayout.setHorizontalGroup(
            PnlCelesteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlCelesteLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(LblOpcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(637, 637, 637)
                .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );
        PnlCelesteLayout.setVerticalGroup(
            PnlCelesteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCelesteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(LblOpcion))
        );

        LblEliminar.setBackground(new java.awt.Color(204, 255, 204));
        LblEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        LblEditar.setBackground(new java.awt.Color(204, 255, 204));
        LblEditar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        LblVisualizar.setBackground(new java.awt.Color(204, 255, 204));
        LblVisualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        LblAgregar.setBackground(new java.awt.Color(204, 255, 204));
        LblAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        LblTextAgregar.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        LblTextAgregar.setForeground(new java.awt.Color(102, 102, 102));
        LblTextAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTextAgregar.setText("Agregar");

        LblTextBuscar2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        LblTextBuscar2.setForeground(new java.awt.Color(102, 102, 102));
        LblTextBuscar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTextBuscar2.setText("Buscar");

        LblTextEditar.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        LblTextEditar.setForeground(new java.awt.Color(102, 102, 102));
        LblTextEditar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTextEditar.setText("Editar");

        LblTextEliminar.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        LblTextEliminar.setForeground(new java.awt.Color(102, 102, 102));
        LblTextEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTextEliminar.setText("Eliminar");

        LblAlumnos.setBackground(new java.awt.Color(204, 255, 204));
        LblAlumnos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        LblDocentes.setBackground(new java.awt.Color(204, 255, 204));
        LblDocentes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        LblTextDocentes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LblTextDocentes.setForeground(new java.awt.Color(102, 102, 102));
        LblTextDocentes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTextDocentes.setText("Docentes");

        LblTextAlumnos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LblTextAlumnos.setForeground(new java.awt.Color(102, 102, 102));
        LblTextAlumnos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTextAlumnos.setText("Alumnos");

        javax.swing.GroupLayout PnlPrincipalLayout = new javax.swing.GroupLayout(PnlPrincipal);
        PnlPrincipal.setLayout(PnlPrincipalLayout);
        PnlPrincipalLayout.setHorizontalGroup(
            PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlCeleste, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(PnlPrincipalLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(LblTextAlumnos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LblAlumnos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnlPrincipalLayout.createSequentialGroup()
                        .addGroup(PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblTextBuscar2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblVisualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LblTextAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LblAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlPrincipalLayout.createSequentialGroup()
                        .addGroup(PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LblTextEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LblEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LblEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LblTextEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(LblTextDocentes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LblDocentes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(100, 100, 100))
        );
        PnlPrincipalLayout.setVerticalGroup(
            PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlPrincipalLayout.createSequentialGroup()
                .addComponent(PnlCeleste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlPrincipalLayout.createSequentialGroup()
                        .addComponent(LblDocentes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LblTextDocentes))
                    .addGroup(PnlPrincipalLayout.createSequentialGroup()
                        .addComponent(LblAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LblTextAlumnos)))
                .addGap(41, 41, 41)
                .addGroup(PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnlPrincipalLayout.createSequentialGroup()
                                .addComponent(LblAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LblTextAgregar))
                            .addGroup(PnlPrincipalLayout.createSequentialGroup()
                                .addComponent(LblVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LblTextBuscar2)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlPrincipalLayout.createSequentialGroup()
                            .addComponent(LblEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(LblTextEliminar)))
                    .addGroup(PnlPrincipalLayout.createSequentialGroup()
                        .addComponent(LblEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LblTextEditar)))
                .addContainerGap(86, Short.MAX_VALUE))
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
    private javax.swing.JLabel LblAgregar;
    private javax.swing.JLabel LblAlumnos;
    private javax.swing.JLabel LblDocentes;
    private javax.swing.JLabel LblEditar;
    private javax.swing.JLabel LblEliminar;
    private javax.swing.JLabel LblOpcion;
    private javax.swing.JLabel LblTextAgregar;
    private javax.swing.JLabel LblTextAlumnos;
    private javax.swing.JLabel LblTextBuscar2;
    private javax.swing.JLabel LblTextDocentes;
    private javax.swing.JLabel LblTextEditar;
    private javax.swing.JLabel LblTextEliminar;
    private javax.swing.JLabel LblVisualizar;
    private javax.swing.JPanel PnlCeleste;
    private javax.swing.JPanel PnlPrincipal;
    private javax.swing.JLabel lblCerrar;
    // End of variables declaration//GEN-END:variables
}
