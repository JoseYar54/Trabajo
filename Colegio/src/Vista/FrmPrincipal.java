package Vista;

import org.netbeans.lib.awtextra.AbsoluteLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrmPrincipal extends javax.swing.JFrame {

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnIngresar;
    private javax.swing.JLabel LblContrasenia;
    private javax.swing.JLabel LblIniciarSesion;
    private javax.swing.JLabel LblUsuario;
    private javax.swing.JPanel PnlPanelLateralIzq;
    private javax.swing.JPanel PnlPanelPrincipal;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JPasswordField txtCajitaPass;
    private javax.swing.JTextField txtCajitaUsuario;
    // End of variables declaration//GEN-END:variables
    private Dimension d = null;

    public FrmPrincipal() {
        estilosFrmPrincipaal();
        initComponents();

        estilosBotonCerrar();
        estilosCuadritos();
    }
    
    public void estilosCuadritos(){
        txtCajitaUsuario.setFont(new java.awt.Font("Carlito", 1, 24));
        this.txtCajitaUsuario.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (!txtCajitaUsuario.getText().isEmpty()) {
                    setStyle(txtCajitaPass, Color.BLACK, "");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtCajitaUsuario.getText().isEmpty()) {
                    setStyle(txtCajitaPass, Color.GRAY, "Ingrese usuario");
                }
            }
        });
        
        this.txtCajitaPass.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                // getpassword
                if (!txtCajitaPass.getText().isEmpty()) {
                    setStyle(txtCajitaPass, Color.BLACK, "");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtCajitaPass.getText().isEmpty()) {
                    setStyle(txtCajitaPass, Color.GRAY, "Contraseña");
                }
            }
        });
    }

    private void setStyle(JTextField textCajita, Color color , String texto){
        textCajita.setForeground(color);
        textCajita.setText(texto);
    }
    
    public void estilosFrmPrincipaal(){
        d=Toolkit.getDefaultToolkit().getScreenSize();
        int alto=(int)(d.height-(d.height*0.25));
        int ancho=(int)(d.width-(d.width*0.25));
        this.setSize(ancho, alto);
        int y=(d.height-this.getHeight())/2;
        int x=(d.width-this.getWidth())/2;
        this.setLocation(x,y);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void estilosBotonCerrar(){
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

        PnlPanelPrincipal = new javax.swing.JPanel();
        PnlPanelLateralIzq = new javax.swing.JPanel();
        LblIniciarSesion = new javax.swing.JLabel();
        LblUsuario = new javax.swing.JLabel();
        LblContrasenia = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        txtCajitaPass = new javax.swing.JPasswordField();
        txtCajitaUsuario = new javax.swing.JTextField();
        lblCerrar = new javax.swing.JLabel();
        BtnIngresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        PnlPanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        PnlPanelPrincipal.setLayout(new AbsoluteLayout());

        PnlPanelLateralIzq.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout PnlPanelLateralIzqLayout = new javax.swing.GroupLayout(PnlPanelLateralIzq);
        PnlPanelLateralIzq.setLayout(PnlPanelLateralIzqLayout);
        PnlPanelLateralIzqLayout.setHorizontalGroup(
            PnlPanelLateralIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, (int)(d.width * 0.25), Short.MAX_VALUE)
        );
        PnlPanelLateralIzqLayout.setVerticalGroup(
            PnlPanelLateralIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );

        PnlPanelPrincipal.add(PnlPanelLateralIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 850));

        LblIniciarSesion.setBackground(new java.awt.Color(255, 255, 255));
        LblIniciarSesion.setFont(new java.awt.Font("Carlito", 1, 48)); // NOI18N
        LblIniciarSesion.setForeground(new java.awt.Color(51, 51, 51));
        LblIniciarSesion.setText("Iniciar Sesión");
        PnlPanelPrincipal.add(LblIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 470, 90));

        LblUsuario.setFont(new java.awt.Font("Carlito", 1, 24)); // NOI18N
        LblUsuario.setForeground(new java.awt.Color(153, 153, 153));
        LblUsuario.setText("Usuario: ");
        PnlPanelPrincipal.add(LblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 150, 30));

        LblContrasenia.setFont(new java.awt.Font("Carlito", 1, 24)); // NOI18N
        LblContrasenia.setForeground(new java.awt.Color(153, 153, 153));
        LblContrasenia.setText("Contraseña: ");
        PnlPanelPrincipal.add(LblContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, 150, 30));
        PnlPanelPrincipal.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 480, 340, 20));
        PnlPanelPrincipal.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 340, 20));

        txtCajitaPass.setBackground(new java.awt.Color(255, 255, 255));
        txtCajitaPass.setFont(new java.awt.Font("Carlito", 1, 24)); // NOI18N
        txtCajitaPass.setForeground(new java.awt.Color(102, 102, 102));
        txtCajitaPass.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCajitaPass.setText("Contraseña");
        txtCajitaPass.setBorder(null);
        txtCajitaPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCajitaPassActionPerformed(evt);
            }
        });
        PnlPanelPrincipal.add(txtCajitaPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 440, 340, 40));

        txtCajitaUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtCajitaUsuario.setBorder(null);
        txtCajitaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCajitaUsuarioActionPerformed(evt);
            }
        });
        PnlPanelPrincipal.add(txtCajitaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 340, 40));

        lblCerrar.setBackground(new java.awt.Color(255, 255, 255));
        lblCerrar.setFont(new java.awt.Font("Carlito", 1, 48)); // NOI18N
        lblCerrar.setForeground(new java.awt.Color(0, 0, 0));
        lblCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCerrar.setText("X ");
        lblCerrar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        PnlPanelPrincipal.add(lblCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 80, 80));

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
        PnlPanelPrincipal.add(BtnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 600, 170, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCajitaPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCajitaPassActionPerformed
        txtCajitaPass.setBorder(null);
        
    }//GEN-LAST:event_txtCajitaPassActionPerformed

    private void txtCajitaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCajitaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCajitaUsuarioActionPerformed

    private void BtnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIngresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnIngresarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

}
