package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class FrmPrinci extends javax.swing.JFrame {
    
    public FrmPrinci() {
        initComponents();
        this.setTitle("Colegio");
        styleInputs();
        styleCloseButtom();
        styleMainFrame(this);
    }
    
    /**
    * Insertar Valores Basicos del JFrame en todos los JFrames
    */
    public static void styleMainFrame(JFrame s){
        ImageIcon icon = new ImageIcon("img/icon.png");
        Image image=icon.getImage();
        s.setLocationRelativeTo(null);
        s.setIconImage(image);
        s.setTitle("Colegio");
    }
    
    private void styleInputs(){
        txtUsuario.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                txtUsuario.setText("");
                inputsDatos(txtUsuario, Color.black,"",18);
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtUsuario.getText().isEmpty()) {
                    inputsDatos(txtUsuario, Color.GRAY,"Ingresa Usuario",22);
                }
            }
        });
        
        txtPass.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                txtPass.setText("");
                inputsDatos(txtPass, Color.black,"",18);
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtPass.getText().isEmpty()) {
                    inputsDatos(txtPass, Color.GRAY,"Ingresa Usuario",22);
                }
            }
        });
    }
    
    private void inputsDatos(JTextField c,Color color,String txt,int Tamanio){
        c.setForeground(color);
        c.setFont(new Font("Arial",Font.BOLD,Tamanio));
        c.setText(txt);
    }

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
                lblCerrar.setBackground(new Color(255,255,255));
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblCerrar = new javax.swing.JLabel();
        LblIniciarSesion = new javax.swing.JLabel();
        LblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        LblContrasenia = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        BtnIngresar = new javax.swing.JButton();

        jScrollPane1.setViewportView(jTree1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 235, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lblCerrar.setBackground(new java.awt.Color(255, 255, 255));
        lblCerrar.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblCerrar.setForeground(new java.awt.Color(0, 0, 0));
        lblCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCerrar.setText("X");

        LblIniciarSesion.setBackground(new java.awt.Color(255, 255, 255));
        LblIniciarSesion.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        LblIniciarSesion.setForeground(new java.awt.Color(51, 51, 51));
        LblIniciarSesion.setText("Iniciar Sesión");

        LblUsuario.setFont(new java.awt.Font("Arial", 1, 26)); // NOI18N
        LblUsuario.setForeground(new java.awt.Color(153, 153, 153));
        LblUsuario.setText("Usuario: ");

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtUsuario.setBorder(null);
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        LblContrasenia.setFont(new java.awt.Font("Arial", 1, 26)); // NOI18N
        LblContrasenia.setForeground(new java.awt.Color(153, 153, 153));
        LblContrasenia.setText("Contraseña: ");

        txtPass.setBackground(new java.awt.Color(255, 255, 255));
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LblContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(267, 267, 267))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(BtnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(LblIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LblUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(LblContrasenia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(BtnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
    }//GEN-LAST:event_txtPassActionPerformed

    private void BtnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIngresarActionPerformed
        FrmOpciones c=new FrmOpciones();
        this.setVisible(false);
        c.setVisible(true);
    }//GEN-LAST:event_BtnIngresarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrinci().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnIngresar;
    private javax.swing.JLabel LblContrasenia;
    private javax.swing.JLabel LblIniciarSesion;
    private javax.swing.JLabel LblUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTree jTree1;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
