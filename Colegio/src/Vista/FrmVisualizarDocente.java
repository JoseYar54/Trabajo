package Vista;

import Controlador.AlumnoController;
import Modelo.Alumno;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

public class FrmVisualizarDocente extends javax.swing.JFrame {
    private AlumnoController c=new AlumnoController();
    
    public FrmVisualizarDocente() {
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
        LblOpcion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCaja = new javax.swing.JTextArea();
        btnBuscarDocente = new javax.swing.JButton();
        btnVerDocente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtCajaCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCajaNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCajaApPaterno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCajaApMaterno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cmbGrado = new javax.swing.JComboBox<>();
        cmbNivel = new javax.swing.JComboBox<>();
        cmbSeccion = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        PnlCeleste.setBackground(new java.awt.Color(153, 204, 255));

        lblCerrar.setBackground(new java.awt.Color(153, 204, 255));
        lblCerrar.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblCerrar.setForeground(new java.awt.Color(0, 0, 0));
        lblCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCerrar.setText("X");

        LblOpcion.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        LblOpcion.setForeground(new java.awt.Color(102, 102, 102));
        LblOpcion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LblOpcion.setText("VISUALIZAR DOCENTES");

        javax.swing.GroupLayout PnlCelesteLayout = new javax.swing.GroupLayout(PnlCeleste);
        PnlCeleste.setLayout(PnlCelesteLayout);
        PnlCelesteLayout.setHorizontalGroup(
            PnlCelesteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlCelesteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PnlCelesteLayout.setVerticalGroup(
            PnlCelesteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCelesteLayout.createSequentialGroup()
                .addGroup(PnlCelesteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblOpcion))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        txtCaja.setEditable(false);
        txtCaja.setColumns(20);
        txtCaja.setRows(5);
        txtCaja.setCaretColor(new java.awt.Color(204, 255, 255));
        jScrollPane1.setViewportView(txtCaja);

        btnBuscarDocente.setBackground(new java.awt.Color(163, 156, 218));
        btnBuscarDocente.setFont(new java.awt.Font("Carlito", 1, 36)); // NOI18N
        btnBuscarDocente.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarDocente.setText("Buscar Docente");
        btnBuscarDocente.setToolTipText("");
        btnBuscarDocente.setActionCommand("Buscar");
        btnBuscarDocente.setAlignmentY(0.0F);
        btnBuscarDocente.setBorder(null);
        btnBuscarDocente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscarDocente.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnBuscarDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarDocenteActionPerformed(evt);
            }
        });

        btnVerDocente.setBackground(new java.awt.Color(163, 156, 218));
        btnVerDocente.setFont(new java.awt.Font("Carlito", 1, 36)); // NOI18N
        btnVerDocente.setForeground(new java.awt.Color(255, 255, 255));
        btnVerDocente.setText(" Ver Docentes");
        btnVerDocente.setActionCommand("VerTodo");
        btnVerDocente.setAlignmentY(0.0F);
        btnVerDocente.setBorder(null);
        btnVerDocente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVerDocente.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnVerDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerDocenteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Código:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("BUSQUEDA PERSONALIZADA:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("VER TODOS LOS DOCENTES:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("A. Paterno:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("A. Materno: ");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Nivel:");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Grado: ");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Sección:");

        cmbNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Primaria", "Secundaria" }));

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
                    .addComponent(btnVerDocente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscarDocente, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCajaApMaterno, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(txtCajaCodigo)
                            .addComponent(txtCajaNombre)
                            .addComponent(txtCajaApPaterno)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(30, 30, 30)))
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)))
                .addContainerGap())
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addComponent(PnlCeleste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnVerDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCajaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCajaApPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCajaApMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
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
    private void btnBuscarDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDocenteActionPerformed
        String dni=JOptionPane.showInputDialog(null, "Ingresa DNI");
        txtCaja.setText("");
        txtCaja.setText("Codigo\tNombre\tAp. Paterno\tAp.Materno\tDNI\tEdad\tNivel\tGrado\tSección\n");
        Alumno a=c.buscarAlumno(dni);
            txtCaja.append(a.getCod_alumno()+"\t"+a.getNombre()+"\t"+a.getAp_paterno()+"\t"+a.getAp_materno()+"\t"+
            a.getDni()+"\t"+a.getEdad()+"\t"+a.getNivel_academico()+"\t"+a.getGrado()+"\t"+a.getSeccion());
            txtCaja.append("\n");
    }//GEN-LAST:event_btnBuscarDocenteActionPerformed

    private void btnVerDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerDocenteActionPerformed
        imprimirDatos();
    }//GEN-LAST:event_btnVerDocenteActionPerformed

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
    private javax.swing.JLabel LblOpcion;
    private javax.swing.JPanel PnlCeleste;
    private javax.swing.JButton btnBuscarDocente;
    private javax.swing.JButton btnVerDocente;
    private javax.swing.JComboBox<String> cmbGrado;
    private javax.swing.JComboBox<String> cmbNivel;
    private javax.swing.JComboBox<String> cmbSeccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JTextArea txtCaja;
    private javax.swing.JTextField txtCajaApMaterno;
    private javax.swing.JTextField txtCajaApPaterno;
    private javax.swing.JTextField txtCajaCodigo;
    private javax.swing.JTextField txtCajaNombre;
    // End of variables declaration//GEN-END:variables
}
