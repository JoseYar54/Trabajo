package Vista;

import Controlador.AlumnoController;
import Modelo.Alumno;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

public class FrmVisualizar extends javax.swing.JFrame {
    private AlumnoController c=new AlumnoController();
    
    public FrmVisualizar() {
        initComponents();
        styleCloseButtom();
        FrmPrinci.styleMainFrame(this);
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
                lblCerrar.setBackground(new Color(153,204,255));
                lblCerrar.setForeground(new Color(0,0,0));
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                
                FrmOpciones c=new FrmOpciones();
                setVisible(false);
                c.setVisible(true);
                dispose();
            }
        });
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        PnlCeleste = new javax.swing.JPanel();
        lblCerrar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCaja = new javax.swing.JTextArea();
        btnBuscarAlumnos = new javax.swing.JButton();
        btnVerAlumnos = new javax.swing.JButton();
        btnVerDocentes = new javax.swing.JButton();
        btnBuscarDocentes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        PnlCeleste.setBackground(new java.awt.Color(153, 204, 255));

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
                .addGap(0, 910, Short.MAX_VALUE)
                .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PnlCelesteLayout.setVerticalGroup(
            PnlCelesteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        txtCaja.setEditable(false);
        txtCaja.setColumns(20);
        txtCaja.setRows(5);
        txtCaja.setCaretColor(new java.awt.Color(204, 255, 255));
        jScrollPane1.setViewportView(txtCaja);

        btnBuscarAlumnos.setBackground(new java.awt.Color(163, 156, 218));
        btnBuscarAlumnos.setFont(new java.awt.Font("Carlito", 1, 36)); // NOI18N
        btnBuscarAlumnos.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarAlumnos.setText("Buscar Alumno");
        btnBuscarAlumnos.setToolTipText("");
        btnBuscarAlumnos.setActionCommand("Buscar");
        btnBuscarAlumnos.setAlignmentY(0.0F);
        btnBuscarAlumnos.setBorder(null);
        btnBuscarAlumnos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscarAlumnos.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnBuscarAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAlumnosActionPerformed(evt);
            }
        });

        btnVerAlumnos.setBackground(new java.awt.Color(163, 156, 218));
        btnVerAlumnos.setFont(new java.awt.Font("Carlito", 1, 36)); // NOI18N
        btnVerAlumnos.setForeground(new java.awt.Color(255, 255, 255));
        btnVerAlumnos.setText(" Ver Alumnos");
        btnVerAlumnos.setActionCommand("VerTodo");
        btnVerAlumnos.setAlignmentY(0.0F);
        btnVerAlumnos.setBorder(null);
        btnVerAlumnos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVerAlumnos.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnVerAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerAlumnosActionPerformed(evt);
            }
        });

        btnVerDocentes.setBackground(new java.awt.Color(163, 156, 218));
        btnVerDocentes.setFont(new java.awt.Font("Carlito", 1, 36)); // NOI18N
        btnVerDocentes.setForeground(new java.awt.Color(255, 255, 255));
        btnVerDocentes.setText(" Ver Docentes");
        btnVerDocentes.setActionCommand("VerTodo");
        btnVerDocentes.setAlignmentY(0.0F);
        btnVerDocentes.setBorder(null);
        btnVerDocentes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVerDocentes.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnVerDocentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerDocentesActionPerformed(evt);
            }
        });

        btnBuscarDocentes.setBackground(new java.awt.Color(163, 156, 218));
        btnBuscarDocentes.setFont(new java.awt.Font("Carlito", 1, 36)); // NOI18N
        btnBuscarDocentes.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarDocentes.setText("Buscar Docente");
        btnBuscarDocentes.setActionCommand("Buscar");
        btnBuscarDocentes.setAlignmentY(0.0F);
        btnBuscarDocentes.setBorder(null);
        btnBuscarDocentes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscarDocentes.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnBuscarDocentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarDocentesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlCeleste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVerAlumnos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVerDocentes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscarDocentes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscarAlumnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addComponent(PnlCeleste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addComponent(btnVerDocentes, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVerAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscarDocentes, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscarAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 245, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Esta mamada se cambiará cuando termine el front :'v
    */
    private void btnBuscarAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAlumnosActionPerformed
        String dni=JOptionPane.showInputDialog(null, "Ingresa DNI");
        txtCaja.setText("");
        txtCaja.setText("Codigo\tNombre\tAp. Paterno\tAp.Materno\tDNI\tEdad\tNivel\tGrado\tSección\n");
        Alumno a=c.buscarAlumno(dni);
            txtCaja.append(a.getCod_alumno()+"\t"+a.getNombre()+"\t"+a.getAp_paterno()+"\t"+a.getAp_materno()+"\t"+
            a.getDni()+"\t"+a.getEdad()+"\t"+a.getNivel_academico()+"\t"+a.getGrado()+"\t"+a.getSeccion());
            txtCaja.append("\n");
    }//GEN-LAST:event_btnBuscarAlumnosActionPerformed

    private void btnVerAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerAlumnosActionPerformed
        imprimirDatos();
    }//GEN-LAST:event_btnVerAlumnosActionPerformed

    private void btnVerDocentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerDocentesActionPerformed
        
        
    }//GEN-LAST:event_btnVerDocentesActionPerformed

    private void btnBuscarDocentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDocentesActionPerformed
        
    }//GEN-LAST:event_btnBuscarDocentesActionPerformed

    /**
     * Metodo provisional para ver los datos xd
    */
    private void imprimirDatos(){
        txtCaja.setText("");
        txtCaja.setText("Codigo\tNombre\tAp. Paterno\tAp.Materno\tDNI\tEdad\tNivel\tGrado\tSección\n");
        
        for (Alumno a: c.getListaAlumnos()) {
            txtCaja.append(a.getCod_alumno()+"\t"+a.getNombre()+"\t"+a.getAp_paterno()+"\t"+a.getAp_materno()+"\t"+
            a.getDni()+"\t"+a.getEdad()+"\t"+a.getNivel_academico()+"\t"+a.getGrado()+"\t"+a.getSeccion());
            txtCaja.append("\n");
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnlCeleste;
    private javax.swing.JButton btnBuscarAlumnos;
    private javax.swing.JButton btnBuscarDocentes;
    private javax.swing.JButton btnVerAlumnos;
    private javax.swing.JButton btnVerDocentes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JTextArea txtCaja;
    // End of variables declaration//GEN-END:variables
}
