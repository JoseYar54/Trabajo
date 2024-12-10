package Vista;

import Tools.IconTools;
import Tools.LogicTools;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;

public class FrmMain extends javax.swing.JFrame {
    Color colorPnlLateral=new Color(86,104,118);
    
    public FrmMain() {
        initComponents();
        this.setTitle("Colegio");
        LogicTools.styleCloseButtom(lblCerrar,IconTools.colorPnlPrinci);
        LogicTools.styleMainFrame(this);
        setColorFrame();
        IconTools.addIconOption(lblMainIcon,"img/icon.png");
        setLogicCloseButtom();
        
    }
    
    private void setColorFrame(){
        PnlLateral.setBackground(colorPnlLateral);
        pnlPrincipal.setBackground(IconTools.colorPnlPrinci);
        lblCerrar.setBackground(IconTools.colorPnlPrinci);
        txtUsuario.setBackground(IconTools.colorPnlPrinci);
        txtPass.setBackground(IconTools.colorPnlPrinci);
        LogicTools.setStyleInput(txtUsuario, "Ingresar Usuario",22);
        LogicTools.setStyleInput(txtPass, "Contraseña",22);
        sptContra.setBackground(Color.gray);
        sptUsuario.setBackground(Color.gray);
    }
    
    private void setLogicCloseButtom(){
        lblCerrar.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        pnlPrincipal = new javax.swing.JPanel();
        PnlLateral = new javax.swing.JPanel();
        lblMainIcon = new javax.swing.JLabel();
        LblUsuario1 = new javax.swing.JLabel();
        LblUsuario2 = new javax.swing.JLabel();
        LblUsuario3 = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();
        LblIniciarSesion = new javax.swing.JLabel();
        LblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        sptUsuario = new javax.swing.JSeparator();
        LblContrasenia = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        sptContra = new javax.swing.JSeparator();
        BtnIngresar = new javax.swing.JButton();

        jScrollPane1.setViewportView(jTree1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        lblMainIcon.setBackground(new java.awt.Color(204, 255, 204));
        lblMainIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        LblUsuario1.setFont(new java.awt.Font("Arial", 1, 26)); // NOI18N
        LblUsuario1.setForeground(new java.awt.Color(255, 255, 255));
        LblUsuario1.setText("Matemáticas");

        LblUsuario2.setFont(new java.awt.Font("Arial", 1, 26)); // NOI18N
        LblUsuario2.setForeground(new java.awt.Color(255, 255, 255));
        LblUsuario2.setText("University");

        LblUsuario3.setFont(new java.awt.Font("Arial", 1, 26)); // NOI18N
        LblUsuario3.setForeground(new java.awt.Color(255, 255, 255));
        LblUsuario3.setText("La ciencia de las");

        javax.swing.GroupLayout PnlLateralLayout = new javax.swing.GroupLayout(PnlLateral);
        PnlLateral.setLayout(PnlLateralLayout);
        PnlLateralLayout.setHorizontalGroup(
            PnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlLateralLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(PnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlLateralLayout.createSequentialGroup()
                        .addComponent(lblMainIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlLateralLayout.createSequentialGroup()
                        .addComponent(LblUsuario2)
                        .addGap(80, 80, 80))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlLateralLayout.createSequentialGroup()
                        .addGroup(PnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblUsuario3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlLateralLayout.createSequentialGroup()
                                .addComponent(LblUsuario1)
                                .addGap(23, 23, 23)))
                        .addGap(47, 47, 47))))
        );
        PnlLateralLayout.setVerticalGroup(
            PnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlLateralLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LblUsuario2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMainIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblUsuario3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
        );

        lblCerrar.setBackground(new java.awt.Color(255, 255, 255));
        lblCerrar.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCerrar.setText("X");

        LblIniciarSesion.setBackground(new java.awt.Color(255, 255, 255));
        LblIniciarSesion.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        LblIniciarSesion.setForeground(new java.awt.Color(51, 51, 51));
        LblIniciarSesion.setText("Iniciar Sesión");

        LblUsuario.setFont(new java.awt.Font("Consolas", 1, 26)); // NOI18N
        LblUsuario.setForeground(new java.awt.Color(153, 153, 153));
        LblUsuario.setText("Usuario: ");

        txtUsuario.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtUsuario.setBorder(null);
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        LblContrasenia.setFont(new java.awt.Font("Consolas", 1, 26)); // NOI18N
        LblContrasenia.setForeground(new java.awt.Color(153, 153, 153));
        LblContrasenia.setText("Contraseña: ");

        txtPass.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtPass.setForeground(new java.awt.Color(102, 102, 102));
        txtPass.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPass.setText("Contraseña");
        txtPass.setBorder(null);
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });

        BtnIngresar.setBackground(new java.awt.Color(102, 153, 255));
        BtnIngresar.setFont(new java.awt.Font("Carlito", 1, 36)); // NOI18N
        BtnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        BtnIngresar.setText("Ingresar");
        BtnIngresar.setAlignmentY(0.0F);
        BtnIngresar.setBorder(null);
        BtnIngresar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIngresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addComponent(PnlLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sptContra, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sptUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LblContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(267, 267, 267))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                                .addComponent(BtnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64))))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(LblIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LblUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sptUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(LblContrasenia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sptContra, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(BtnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        getContentPane().add(pnlPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
    }//GEN-LAST:event_txtPassActionPerformed

    private void BtnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIngresarActionPerformed
        setVisible(false);
        FrmMenuPrincipal c=new FrmMenuPrincipal();
        c.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnIngresarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnIngresar;
    private javax.swing.JLabel LblContrasenia;
    private javax.swing.JLabel LblIniciarSesion;
    private javax.swing.JLabel LblUsuario;
    private javax.swing.JLabel LblUsuario1;
    private javax.swing.JLabel LblUsuario2;
    private javax.swing.JLabel LblUsuario3;
    private javax.swing.JPanel PnlLateral;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblMainIcon;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JSeparator sptContra;
    private javax.swing.JSeparator sptUsuario;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
