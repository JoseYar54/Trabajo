package Vista;

import Controlador.DataController;
import Modelo.Curso;
import Modelo.Docente;
import Tools.DataTools;
import Tools.IconTools;
import Tools.LogicTools;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrmAgregarCurso extends javax.swing.JFrame {
    public FrmAgregarCurso() {
        initComponents();
        LogicTools.styleMainFrame(this);
        LogicTools.styleCloseButtom(lblCerrar,IconTools.colorPnls);
        setBasicStyles();
        setLogicCloseButtom();
        setInputDecoration();
    }   
    
    private void setBasicStyles(){
        pnlPrincipal.setBackground(IconTools.colorPnlPrinci);
        pnlSuperior.setBackground(IconTools.colorPnls);
        lblCerrar.setBackground(IconTools.colorPnls);
        IconTools.addIconOption(lblMainIcon,"img/icon.png");
    }
    
    private void setLogicCloseButtom(){
        lblCerrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
                dispose();
            }
        });
    }
 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        pnlSuperior = new javax.swing.JPanel();
        lblCerrar = new javax.swing.JLabel();
        LblOpcion = new javax.swing.JLabel();
        lblMainIcon = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblNombreCurso = new javax.swing.JLabel();
        txtCajaNombreCurso = new javax.swing.JTextField();
        lblCodigoDocente = new javax.swing.JLabel();
        txtCajaCodigoDocente = new javax.swing.JTextField();
        lblNivelAcademico = new javax.swing.JLabel();
        cmbNivelAcademico = new javax.swing.JComboBox<>();
        btnAgregarCurso = new javax.swing.JButton();
        lblDocente = new javax.swing.JLabel();
        txtCajaDocente = new javax.swing.JTextField();
        pnlBorde = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        pnlSuperior.setBackground(new java.awt.Color(153, 204, 255));
        pnlSuperior.setRequestFocusEnabled(false);

        lblCerrar.setBackground(new java.awt.Color(153, 204, 255));
        lblCerrar.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblCerrar.setForeground(new java.awt.Color(0, 0, 0));
        lblCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCerrar.setText("X");

        LblOpcion.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        LblOpcion.setForeground(new java.awt.Color(255, 255, 255));
        LblOpcion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LblOpcion.setText("AGREGAR CURSO");

        lblMainIcon.setBackground(new java.awt.Color(204, 255, 204));
        lblMainIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnlSuperiorLayout = new javax.swing.GroupLayout(pnlSuperior);
        pnlSuperior.setLayout(pnlSuperiorLayout);
        pnlSuperiorLayout.setHorizontalGroup(
            pnlSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMainIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblOpcion, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlSuperiorLayout.setVerticalGroup(
            pnlSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSuperiorLayout.createSequentialGroup()
                .addGroup(pnlSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LblOpcion))
                    .addGroup(pnlSuperiorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblMainIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Introduzca datos del Curso:");

        lblNombreCurso.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNombreCurso.setForeground(new java.awt.Color(102, 102, 102));
        lblNombreCurso.setText("Nombre Curso      :");

        txtCajaNombreCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCajaNombreCursoCursoActionPerformed(evt);
            }
        });
        txtCajaNombreCurso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCajaNombreCursoCursoKeyTyped(evt);
            }
        });

        lblCodigoDocente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblCodigoDocente.setForeground(new java.awt.Color(102, 102, 102));
        lblCodigoDocente.setText("Código Docente:");

        txtCajaCodigoDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCajaCodigoDocenteActionPerformed(evt);
            }
        });
        txtCajaCodigoDocente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCajaCodigoDocenteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCajaCodigoDocenteKeyTyped(evt);
            }
        });

        lblNivelAcademico.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNivelAcademico.setForeground(new java.awt.Color(102, 102, 102));
        lblNivelAcademico.setText("Nivel Academico  :");

        cmbNivelAcademico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Primaria", "Secundaria" }));
        cmbNivelAcademico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNivelAcademicoActionPerformed(evt);
            }
        });

        btnAgregarCurso.setBackground(new java.awt.Color(163, 156, 218));
        btnAgregarCurso.setFont(new java.awt.Font("Carlito", 1, 36)); // NOI18N
        btnAgregarCurso.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarCurso.setText("AGREGAR CURSO");
        btnAgregarCurso.setToolTipText("");
        btnAgregarCurso.setActionCommand("Buscar");
        btnAgregarCurso.setAlignmentY(0.0F);
        btnAgregarCurso.setBorder(null);
        btnAgregarCurso.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgregarCurso.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnAgregarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCursoActionPerformed(evt);
            }
        });

        lblDocente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblDocente.setForeground(new java.awt.Color(102, 102, 102));
        lblDocente.setText("Docente: ");

        txtCajaDocente.setEditable(false);
        txtCajaDocente.setFocusable(false);
        txtCajaDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCajaDocenteActionPerformed(evt);
            }
        });
        txtCajaDocente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCajaDocenteKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAgregarCurso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblCodigoDocente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblDocente)))
                                    .addComponent(lblNivelAcademico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblNombreCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbNivelAcademico, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCajaNombreCurso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(txtCajaCodigoDocente, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtCajaDocente, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addContainerGap())))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addComponent(pnlSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCajaNombreCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCajaCodigoDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCajaDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNivelAcademico, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbNivelAcademico, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btnAgregarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlBorde.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout pnlBordeLayout = new javax.swing.GroupLayout(pnlBorde);
        pnlBorde.setLayout(pnlBordeLayout);
        pnlBordeLayout.setHorizontalGroup(
            pnlBordeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        pnlBordeLayout.setVerticalGroup(
            pnlBordeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlBorde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlBorde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private String obtenerNombreCurso(){
        return txtCajaNombreCurso.getText();
    }
    
    private String obtenerCodigoDocente(){
        return txtCajaCodigoDocente.getText();
    }
    
    private String obtenerNivel(){
        return (String)cmbNivelAcademico.getSelectedItem();
    }
    
    private void btnAgregarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCursoActionPerformed
        try{
            String nombCurso=obtenerNombreCurso();
            String codDocente=obtenerCodigoDocente();
            String nivel=obtenerNivel();
            
            Docente docente=DataController.docenteController.buscarDocente(codDocente);
            
            Curso curso=new Curso(nombCurso, docente);
            
            curso.setNivelAcademico(nivel);
                
            DataController.cursoController.agregarCurso(curso);
            LogicTools.sendMessage("Alumno registrado correctamente :D");
            LogicTools.sendMessage("El codigo del Curso es: "+curso.getCod_Curso());
            limpiarCajas();
            DataTools.writeDocData(DataController.alumnoController);
            setVisible(false);
            dispose();
        }catch(Exception e){
            LogicTools.sendMessage("Error al registrar al alumno");
            limpiarCajas();
        }
    }//GEN-LAST:event_btnAgregarCursoActionPerformed
    private void setInputDecoration(){
        int tamanio=12;
        LogicTools.setStyleInput(txtCajaNombreCurso, "Ingresa Nombre del Curso", tamanio);
        LogicTools.setStyleInput(txtCajaCodigoDocente, "Ingresa docente a asignar",tamanio);
        LogicTools.setStyleInput(txtCajaDocente, "Docente asginado", tamanio);
    }
    
    private void limpiarCajas(){
        txtCajaDocente.setText("");
        txtCajaCodigoDocente.setText("");
        txtCajaNombreCurso.setText("");
    }
    
    private void txtCajaNombreCursoCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCajaNombreCursoCursoActionPerformed
    }//GEN-LAST:event_txtCajaNombreCursoCursoActionPerformed

    private void txtCajaCodigoDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCajaCodigoDocenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCajaCodigoDocenteActionPerformed

    private void cmbNivelAcademicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNivelAcademicoActionPerformed
    }//GEN-LAST:event_cmbNivelAcademicoActionPerformed

    private void txtCajaNombreCursoCursoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCajaNombreCursoCursoKeyTyped
        LogicTools.setOnlyChars(evt, txtCajaNombreCurso, 22);
    }//GEN-LAST:event_txtCajaNombreCursoCursoKeyTyped

   private String devolverDatosDocente(String codDocente) {
        Docente docente = DataController.docenteController.buscarDocenteCOD(codDocente);
        if (docente != null) {
            return docente.getNombre() + " " + docente.getAp_paterno() + " " + docente.getAp_materno();
        } else {
            return "Docente no encontrado";
        }
}
    
    private void txtCajaCodigoDocenteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCajaCodigoDocenteKeyTyped
        LogicTools.setMaxSize(evt, txtCajaCodigoDocente,4);
    }//GEN-LAST:event_txtCajaCodigoDocenteKeyTyped

    private void txtCajaDocenteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCajaDocenteKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCajaDocenteKeyTyped

    private void txtCajaDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCajaDocenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCajaDocenteActionPerformed

    private void txtCajaCodigoDocenteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCajaCodigoDocenteKeyReleased
        if (txtCajaCodigoDocente.getText().length() == 4) {
                String codDocente = txtCajaCodigoDocente.getText().toUpperCase();
                String datosDocente = devolverDatosDocente(codDocente);

                txtCajaDocente.setText(datosDocente);
        } else {
            txtCajaDocente.setText("");
        }
    }//GEN-LAST:event_txtCajaCodigoDocenteKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblOpcion;
    private javax.swing.JButton btnAgregarCurso;
    private javax.swing.JComboBox<String> cmbNivelAcademico;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblCodigoDocente;
    private javax.swing.JLabel lblDocente;
    private javax.swing.JLabel lblMainIcon;
    private javax.swing.JLabel lblNivelAcademico;
    private javax.swing.JLabel lblNombreCurso;
    private javax.swing.JPanel pnlBorde;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlSuperior;
    private javax.swing.JTextField txtCajaCodigoDocente;
    private javax.swing.JTextField txtCajaDocente;
    private javax.swing.JTextField txtCajaNombreCurso;
    // End of variables declaration//GEN-END:variables
}
