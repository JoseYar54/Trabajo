package Vista;

import Tools.IconTools;
import Tools.LogicTools;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class FrmMenuNotas extends javax.swing.JFrame {
    private String urlAgregar1="img/addGrade1.png",urlAgregar2="img/addGrade2.png",
            urlEditarNota1="img/editGrade1.png",urlEditarNota2="img/editGrade2.png",
            urlEliminarNota1="img/deleteGrade1.png",urlEliminarNota2="img/deleteGrade2.png";
    private FrmElector fe;
    private JFrame principal;

    private JFrame getPrincipal() {
        return principal;
    }
    
    public FrmMenuNotas() {
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
        IconTools.addIconOption(LblEditar,urlEditarNota1);
        IconTools.addIconOption(LblEliminar,urlEliminarNota1);
        IconTools.addIconOption(LblAgregar, urlAgregar1);
        IconTools.addMouseDecoration(lblCerrar, "img/return2.png", "img/return1.png");
        IconTools.addMouseDecoration(LblEditar,urlEditarNota2,urlEditarNota1);
        IconTools.addMouseDecoration(LblEliminar,urlEliminarNota2,urlEliminarNota1);
        IconTools.addMouseDecoration(LblAgregar,urlAgregar2,urlAgregar1);
    }
    private void logicOption(){
        //Logica para el apartado de Agregar
        LblAgregar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                fe.setVisible(true);
            }
        });
        
        //Logica para el apartado de Editar
        LblEditar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                fe.setVisible(true);
            }
        });
        
        //Logica para el apartado de Eliminar
        LblEliminar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                fe.setVisible(true);
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
        LblEliminar = new javax.swing.JLabel();
        LblEditar = new javax.swing.JLabel();
        LblAgregar = new javax.swing.JLabel();
        LblTextAgregar = new javax.swing.JLabel();
        LblTextEditar = new javax.swing.JLabel();
        LblTextEliminar = new javax.swing.JLabel();
        LblTextAgregar1 = new javax.swing.JLabel();
        LblTextEditar1 = new javax.swing.JLabel();
        LblTextEliminar1 = new javax.swing.JLabel();

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
        LblOpcion.setText("Menú Notas");

        lblMainIcon.setBackground(new java.awt.Color(204, 255, 204));
        lblMainIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout PnlCelesteLayout = new javax.swing.GroupLayout(PnlCeleste);
        PnlCeleste.setLayout(PnlCelesteLayout);
        PnlCelesteLayout.setHorizontalGroup(
            PnlCelesteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlCelesteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMainIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblOpcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(641, 641, 641)
                .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        PnlCelesteLayout.setVerticalGroup(
            PnlCelesteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCelesteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlCelesteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblOpcion)
                    .addGroup(PnlCelesteLayout.createSequentialGroup()
                        .addComponent(lblMainIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LblEliminar.setBackground(new java.awt.Color(204, 255, 204));
        LblEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        LblEditar.setBackground(new java.awt.Color(204, 255, 204));
        LblEditar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        LblAgregar.setBackground(new java.awt.Color(204, 255, 204));
        LblAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        LblTextAgregar.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        LblTextAgregar.setForeground(new java.awt.Color(102, 102, 102));
        LblTextAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTextAgregar.setText("Agregar");

        LblTextEditar.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        LblTextEditar.setForeground(new java.awt.Color(102, 102, 102));
        LblTextEditar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTextEditar.setText("Editar");

        LblTextEliminar.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        LblTextEliminar.setForeground(new java.awt.Color(102, 102, 102));
        LblTextEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTextEliminar.setText("Eliminar");

        LblTextAgregar1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        LblTextAgregar1.setForeground(new java.awt.Color(102, 102, 102));
        LblTextAgregar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTextAgregar1.setText("Notas");

        LblTextEditar1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        LblTextEditar1.setForeground(new java.awt.Color(102, 102, 102));
        LblTextEditar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTextEditar1.setText("Notas");

        LblTextEliminar1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        LblTextEliminar1.setForeground(new java.awt.Color(102, 102, 102));
        LblTextEliminar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTextEliminar1.setText("Notas");

        javax.swing.GroupLayout PnlPrincipalLayout = new javax.swing.GroupLayout(PnlPrincipal);
        PnlPrincipal.setLayout(PnlPrincipalLayout);
        PnlPrincipalLayout.setHorizontalGroup(
            PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlCeleste, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, Short.MAX_VALUE)
            .addGroup(PnlPrincipalLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LblTextAgregar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LblTextAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LblAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105)
                .addGroup(PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LblTextEditar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LblTextEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LblEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                .addGap(102, 102, 102)
                .addGroup(PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(LblEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LblTextEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LblTextEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PnlPrincipalLayout.setVerticalGroup(
            PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlPrincipalLayout.createSequentialGroup()
                .addComponent(PnlCeleste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147)
                .addGroup(PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlPrincipalLayout.createSequentialGroup()
                        .addGroup(PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnlPrincipalLayout.createSequentialGroup()
                                .addComponent(LblEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LblTextEliminar))
                            .addGroup(PnlPrincipalLayout.createSequentialGroup()
                                .addComponent(LblEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LblTextEditar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblTextEditar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblTextEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PnlPrincipalLayout.createSequentialGroup()
                        .addComponent(LblAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    private javax.swing.JLabel LblAgregar;
    private javax.swing.JLabel LblEditar;
    private javax.swing.JLabel LblEliminar;
    private javax.swing.JLabel LblOpcion;
    private javax.swing.JLabel LblTextAgregar;
    private javax.swing.JLabel LblTextAgregar1;
    private javax.swing.JLabel LblTextEditar;
    private javax.swing.JLabel LblTextEditar1;
    private javax.swing.JLabel LblTextEliminar;
    private javax.swing.JLabel LblTextEliminar1;
    private javax.swing.JPanel PnlCeleste;
    private javax.swing.JPanel PnlPrincipal;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblMainIcon;
    // End of variables declaration//GEN-END:variables
}
