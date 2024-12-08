package Vista;

import Controlador.AlumnoController;
import Controlador.DocenteController;
import Tools.IconTools;
import Tools.LogicTools;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class FrmMenuPersona extends javax.swing.JFrame {
    
    private FrmElector fe;
    private AlumnoController a;
    private DocenteController d;
    
    private void setEleccion(String eleccion) {
        eleccion = eleccion;
    }
    
    private JFrame closeMenu(){
        return this;
    }
    
    public FrmMenuPersona() {
        initComponents();
        LogicTools.styleMainFrame(this);
        iconsOptions();
        
        PnlPrincipal.setBackground(IconTools.colorPnlPrinci);
        PnlCeleste.setBackground(IconTools.colorPnls);
        lblCerrar.setBackground(IconTools.colorPnls);
        
        logicButtom(lblCerrar);
        logicOption();
        
    }
    
    private void logicOption(){
        //Logica para el apartado de visualizar
        LblVisualizar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                fe=new FrmElector(closeMenu(),"Visualizar",a, d);
                fe.setVisible(true);
                setEleccion("Visualizar");
            }
        });
        
        //Logica para el apartado de Agregar
        LblAgregar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                fe=new FrmElector(closeMenu(),"Agregar",a, d);
                fe.setVisible(true);
                setEleccion("Agregar");
            }
        });
        
        //Logica para el apartado de Editar
        LblEditar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                fe=new FrmElector(closeMenu(),"Editar",a, d);
                fe.setVisible(true);
                setEleccion("Editar");
            }
        });
        
        //Logica para el apartado de Eliminar
        LblEliminar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                fe=new FrmElector(closeMenu(),"Eliminar",a, d);
                fe.setVisible(true);
                setEleccion("Eliminar");
            }
        });
    }
    
    private void logicButtom(JLabel lbl){
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
    
    /**
     * Este metodo inserta todas las decoraciones a las Lbl's de Opciones
    */
    private void iconsOptions(){
        IconTools.addIconOption(lblCerrar,"img/return1.png");
        IconTools.addIconOption(lblMainIcon,"img/icon.png");
        IconTools.addIconOption(LblVisualizar,"img/search1.png");
        IconTools.addIconOption(LblAgregar,"img/add1.png");
        IconTools.addIconOption(LblEditar,"img/update1.png");
        IconTools.addIconOption(LblEliminar,"img/delete1.png");
        
        IconTools.addMouseDecoration(lblCerrar, "img/return2.png", "img/return1.png");
        IconTools.addMouseDecoration(LblVisualizar,"img/search2.png","img/search1.png");
        IconTools.addMouseDecoration(LblAgregar,"img/add2.png","img/add1.png");
        IconTools.addMouseDecoration(LblEditar,"img/update2.png","img/update1.png");
        IconTools.addMouseDecoration(LblEliminar,"img/delete2.png","img/delete1.png");
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
        LblVisualizar = new javax.swing.JLabel();
        LblAgregar = new javax.swing.JLabel();
        LblTextAgregar = new javax.swing.JLabel();
        LblTextBuscar2 = new javax.swing.JLabel();
        LblTextEditar = new javax.swing.JLabel();
        LblTextEliminar = new javax.swing.JLabel();

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
        LblOpcion.setText("Menú Personas");

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
                .addGap(564, 564, 564)
                .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
        );
        PnlCelesteLayout.setVerticalGroup(
            PnlCelesteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCelesteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlCelesteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LblOpcion)
                    .addGroup(PnlCelesteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblMainIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        javax.swing.GroupLayout PnlPrincipalLayout = new javax.swing.GroupLayout(PnlPrincipal);
        PnlPrincipal.setLayout(PnlPrincipalLayout);
        PnlPrincipalLayout.setHorizontalGroup(
            PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlCeleste, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, Short.MAX_VALUE)
            .addGroup(PnlPrincipalLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblTextBuscar2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblVisualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LblTextAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LblAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LblTextEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LblEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LblEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LblTextEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PnlPrincipalLayout.setVerticalGroup(
            PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlPrincipalLayout.createSequentialGroup()
                .addComponent(PnlCeleste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147)
                .addGroup(PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlPrincipalLayout.createSequentialGroup()
                        .addComponent(LblEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LblTextEliminar))
                    .addGroup(PnlPrincipalLayout.createSequentialGroup()
                        .addComponent(LblEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LblTextEditar))
                    .addGroup(PnlPrincipalLayout.createSequentialGroup()
                        .addComponent(LblAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LblTextAgregar))
                    .addGroup(PnlPrincipalLayout.createSequentialGroup()
                        .addComponent(LblVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LblTextBuscar2)))
                .addContainerGap(162, Short.MAX_VALUE))
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
    private javax.swing.JLabel LblTextBuscar2;
    private javax.swing.JLabel LblTextEditar;
    private javax.swing.JLabel LblTextEliminar;
    private javax.swing.JLabel LblVisualizar;
    private javax.swing.JPanel PnlCeleste;
    private javax.swing.JPanel PnlPrincipal;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblMainIcon;
    // End of variables declaration//GEN-END:variables
}
