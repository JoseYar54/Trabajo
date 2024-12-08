package Vista;

import Controlador.DataController;
import Tools.IconTools;
import Tools.LogicTools;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
public class FrmMenuPrincipal extends javax.swing.JFrame {
    
    private final String urlPersonasIcon1="img/Personas1.png",
            urlPersonasIcon2="img/Personas2.png",
            urlNotasIcon1="img/Notas1.png",
            urlNotasIcon2="img/Notas2.png",
            urlCursos1="img/course1.png",
            urlCursos2="img/course2.png";
    private FrmElector fe;
    
    public FrmMenuPrincipal() {
        DataController.inicializarDatos();
        
        initComponents();
        LogicTools.styleMainFrame(this);
        
        PnlPrincipal.setBackground(IconTools.colorPnlPrinci);
        PnlCeleste.setBackground(IconTools.colorPnls);
        lblCerrar.setBackground(IconTools.colorPnls);
        
        addDecorationIcons();
        logicButtom(lblCerrar);
        logicOption();
    }
    
    private void addDecorationIcons(){
        IconTools.addIconOption(lblCerrar,"img/return1.png");
        IconTools.addIconOption(lblMainIcon,"img/icon.png");
        IconTools.addIconOption(lblNotas, urlNotasIcon1);
        IconTools.addIconOption(lblPersonas, urlPersonasIcon1);
        IconTools.addIconOption(lblCursos, urlCursos1);
        IconTools.addMouseDecoration(lblCerrar,"img/return2.png","img/return1.png");
        IconTools.addMouseDecoration(lblPersonas, urlPersonasIcon2, urlPersonasIcon1);
        IconTools.addMouseDecoration(lblNotas, urlNotasIcon2, urlNotasIcon1);
        IconTools.addMouseDecoration(lblCursos, urlCursos2, urlCursos1);
    }
    
    private void logicOption(){
        //Logica para el apartado de Personas
        lblPersonas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
                FrmMenuPersona frmMenuPersona=new FrmMenuPersona();
                frmMenuPersona.setVisible(true);
                dispose();
            }
        });
        
        //Logica para el apartado de Notas
        lblNotas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
                FrmMenuNotas frmMenuNotas=new FrmMenuNotas();
                frmMenuNotas.setVisible(true);
                dispose();
            }
        });
        
        //Logica para el apartado de Notas
        lblCursos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
                FrmMenuCursos frmMenuCursos=new FrmMenuCursos();
                frmMenuCursos.setVisible(true);
                dispose();
            }
        });
    }
    
    private void logicButtom(JLabel lbl){
        lbl.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
                FrmPrinci p=new FrmPrinci();
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
        lblNotas = new javax.swing.JLabel();
        lblPersonas = new javax.swing.JLabel();
        LblTextBuscar2 = new javax.swing.JLabel();
        LblTextEditar = new javax.swing.JLabel();
        LblTextBuscar3 = new javax.swing.JLabel();
        LblTextBuscar4 = new javax.swing.JLabel();
        lblCursos = new javax.swing.JLabel();
        LblTextEditar1 = new javax.swing.JLabel();
        LblTextBuscar5 = new javax.swing.JLabel();

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
        LblOpcion.setText("Menú Principal");

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
                .addGap(570, 570, 570)
                .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
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

        lblNotas.setBackground(new java.awt.Color(204, 255, 204));
        lblNotas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblPersonas.setBackground(new java.awt.Color(204, 255, 204));
        lblPersonas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        LblTextBuscar2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        LblTextBuscar2.setForeground(new java.awt.Color(102, 102, 102));
        LblTextBuscar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTextBuscar2.setText("Visualizar");

        LblTextEditar.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        LblTextEditar.setForeground(new java.awt.Color(102, 102, 102));
        LblTextEditar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTextEditar.setText("Visualizar");

        LblTextBuscar3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        LblTextBuscar3.setForeground(new java.awt.Color(102, 102, 102));
        LblTextBuscar3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTextBuscar3.setText("Notas");

        LblTextBuscar4.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        LblTextBuscar4.setForeground(new java.awt.Color(102, 102, 102));
        LblTextBuscar4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTextBuscar4.setText("Personas");

        lblCursos.setBackground(new java.awt.Color(204, 255, 204));
        lblCursos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        LblTextEditar1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        LblTextEditar1.setForeground(new java.awt.Color(102, 102, 102));
        LblTextEditar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTextEditar1.setText("Visualizar");

        LblTextBuscar5.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        LblTextBuscar5.setForeground(new java.awt.Color(102, 102, 102));
        LblTextBuscar5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTextBuscar5.setText("Cursos");

        javax.swing.GroupLayout PnlPrincipalLayout = new javax.swing.GroupLayout(PnlPrincipal);
        PnlPrincipal.setLayout(PnlPrincipalLayout);
        PnlPrincipalLayout.setHorizontalGroup(
            PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlCeleste, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, Short.MAX_VALUE)
            .addGroup(PnlPrincipalLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LblTextBuscar4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LblTextBuscar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(121, 121, 121)
                .addGroup(PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblTextBuscar3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(LblTextEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblTextBuscar5, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(LblTextEditar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCursos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(130, 130, 130))
        );
        PnlPrincipalLayout.setVerticalGroup(
            PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlPrincipalLayout.createSequentialGroup()
                .addComponent(PnlCeleste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addGroup(PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PnlPrincipalLayout.createSequentialGroup()
                        .addComponent(lblNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LblTextEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(PnlPrincipalLayout.createSequentialGroup()
                            .addComponent(lblCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(LblTextEditar1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGroup(PnlPrincipalLayout.createSequentialGroup()
                            .addComponent(lblPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(LblTextBuscar2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblTextBuscar5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LblTextBuscar4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LblTextBuscar3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(136, 136, 136))
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
    private javax.swing.JLabel LblOpcion;
    private javax.swing.JLabel LblTextBuscar2;
    private javax.swing.JLabel LblTextBuscar3;
    private javax.swing.JLabel LblTextBuscar4;
    private javax.swing.JLabel LblTextBuscar5;
    private javax.swing.JLabel LblTextEditar;
    private javax.swing.JLabel LblTextEditar1;
    private javax.swing.JPanel PnlCeleste;
    private javax.swing.JPanel PnlPrincipal;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblCursos;
    private javax.swing.JLabel lblMainIcon;
    private javax.swing.JLabel lblNotas;
    private javax.swing.JLabel lblPersonas;
    // End of variables declaration//GEN-END:variables
}
