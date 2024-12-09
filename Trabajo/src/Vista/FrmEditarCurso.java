package Vista;

import Controlador.DataController;
import Modelo.Curso;
import Modelo.Docente;
import Tools.DataTools;
import Tools.IconTools;
import Tools.LogicTools;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrmEditarCurso extends javax.swing.JFrame {
    
    private Curso cursoEditar;
    
    public FrmEditarCurso() {
        initComponents();
        LogicTools.styleMainFrame(this);
        LogicTools.styleCloseButtom(lblCerrar,IconTools.colorPnls);
        setBasicStyles();
        setLogicCloseButtom();
        setEmptyInputs();
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
    
    private void setEmptyInputs(){
            txtCajaDocenteAsignado.setEnabled(false);
            txtCajaCodigoDocente.setEnabled(false);
            txtCajaNombreCurso.setEnabled(false);
            cmbNivelAcademico.setEnabled(false);
            btnEditarCurso.setEnabled(false);

            txtCajaDocenteAsignado.setText("");
            txtCajaCodigoDocente.setText("");
            txtCajaDocenteAsignado.setText("");
            txtCajaNombreCurso.setText("");
            cmbNivelAcademico.setSelectedItem("-");
    }
 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFondo = new javax.swing.JPanel();
        pnlPrincipal = new javax.swing.JPanel();
        pnlSuperior = new javax.swing.JPanel();
        LblOpcion = new javax.swing.JLabel();
        lblMainIcon = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();
        lblMensaje = new javax.swing.JLabel();
        lblNombreCurso = new javax.swing.JLabel();
        txtCajaNombreCurso = new javax.swing.JTextField();
        lblCodigoDocente = new javax.swing.JLabel();
        txtCajaCodigoDocente = new javax.swing.JTextField();
        lblNivelAcademico = new javax.swing.JLabel();
        cmbNivelAcademico = new javax.swing.JComboBox<>();
        btnEditarCurso = new javax.swing.JButton();
        lblDocenteAsigando = new javax.swing.JLabel();
        txtCajaDocenteAsignado = new javax.swing.JTextField();
        lblCodigoCurso = new javax.swing.JLabel();
        txtCajaCodigoCurso = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        lblFondo.setBackground(new java.awt.Color(51, 51, 51));

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        pnlSuperior.setBackground(new java.awt.Color(153, 204, 255));
        pnlSuperior.setRequestFocusEnabled(false);

        LblOpcion.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        LblOpcion.setForeground(new java.awt.Color(255, 255, 255));
        LblOpcion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LblOpcion.setText("EDITAR CURSO");

        lblMainIcon.setBackground(new java.awt.Color(204, 255, 204));
        lblMainIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblCerrar.setBackground(new java.awt.Color(153, 204, 255));
        lblCerrar.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblCerrar.setForeground(new java.awt.Color(0, 0, 0));
        lblCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCerrar.setText("X");

        javax.swing.GroupLayout pnlSuperiorLayout = new javax.swing.GroupLayout(pnlSuperior);
        pnlSuperior.setLayout(pnlSuperiorLayout);
        pnlSuperiorLayout.setHorizontalGroup(
            pnlSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMainIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlSuperiorLayout.setVerticalGroup(
            pnlSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LblOpcion)
                    .addComponent(lblMainIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblMensaje.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblMensaje.setForeground(new java.awt.Color(102, 102, 102));
        lblMensaje.setText("Insertar el ID del curso para poder editar el curso:");

        lblNombreCurso.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNombreCurso.setForeground(new java.awt.Color(102, 102, 102));
        lblNombreCurso.setText("Nombre Curso:");

        txtCajaNombreCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCajaNombreCursoActionPerformed(evt);
            }
        });
        txtCajaNombreCurso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCajaNombreCursoKeyTyped(evt);
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
        lblNivelAcademico.setText("Nivel Academico:");

        cmbNivelAcademico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Primaria", "Secundaria" }));
        cmbNivelAcademico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNivelAcademicoActionPerformed(evt);
            }
        });

        btnEditarCurso.setBackground(new java.awt.Color(163, 156, 218));
        btnEditarCurso.setFont(new java.awt.Font("Carlito", 1, 36)); // NOI18N
        btnEditarCurso.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarCurso.setText("EDITAR CURSO");
        btnEditarCurso.setToolTipText("");
        btnEditarCurso.setActionCommand("Buscar");
        btnEditarCurso.setAlignmentY(0.0F);
        btnEditarCurso.setBorder(null);
        btnEditarCurso.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditarCurso.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnEditarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCursoActionPerformed(evt);
            }
        });

        lblDocenteAsigando.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblDocenteAsigando.setForeground(new java.awt.Color(102, 102, 102));
        lblDocenteAsigando.setText("Docente Asiganado:");

        txtCajaDocenteAsignado.setEditable(false);
        txtCajaDocenteAsignado.setFocusable(false);
        txtCajaDocenteAsignado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCajaDocenteAsignadoKeyTyped(evt);
            }
        });

        lblCodigoCurso.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblCodigoCurso.setForeground(new java.awt.Color(102, 102, 102));
        lblCodigoCurso.setText("Código Curso:");

        txtCajaCodigoCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCajaCodigoCursoActionPerformed(evt);
            }
        });
        txtCajaCodigoCurso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCajaCodigoCursoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCajaCodigoCursoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEditarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(pnlPrincipalLayout.createSequentialGroup()
                            .addComponent(lblCodigoCurso)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCajaCodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlPrincipalLayout.createSequentialGroup()
                            .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblDocenteAsigando, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblNivelAcademico, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblNombreCurso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblCodigoDocente, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGap(39, 39, 39)
                            .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtCajaNombreCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCajaCodigoDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCajaDocenteAsignado, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmbNivelAcademico, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addComponent(pnlSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCajaCodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCajaCodigoDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigoDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCajaNombreCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDocenteAsigando, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCajaDocenteAsignado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNivelAcademico, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbNivelAcademico, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout lblFondoLayout = new javax.swing.GroupLayout(lblFondo);
        lblFondo.setLayout(lblFondoLayout);
        lblFondoLayout.setHorizontalGroup(
            lblFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        lblFondoLayout.setVerticalGroup(
            lblFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCajaDocenteAsignadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCajaDocenteAsignadoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCajaDocenteAsignadoKeyTyped

    private Docente obtenerDocente(String Codigo){
        return DataController.docenteController.buscarDocenteCOD(Codigo);
    }
    
    private Curso cursoEditar(String codCurso){
        Curso curso=DataController.cursoController.buscarCurso(codCurso);
        return curso;
    }
    
    private void btnEditarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCursoActionPerformed
        DataController.inicializarDatos();
        try{
            String nombCurso=obtenerNombreCurso();
            String codDocente=obtenerCodigoDocente();
            String nivel=obtenerNivelAcademico();
            String codigo=txtCajaCodigoCurso.getText().toUpperCase();
            Docente docente=obtenerDocente(codDocente);
            Curso curso=new Curso(nombCurso,docente);
            curso.setCod_Curso(codigo);
            curso.setNivelAcademico(nivel);
            
            DataController.cursoController.editarCurso(cursoEditar, curso);
            LogicTools.sendMessage("Curso editado correctamente :D");
            DataTools.writeDocData(DataController.cursoController);
            setVisible(false);
            dispose();
        }catch(Exception e){
            LogicTools.sendMessage("Error al editar el Curso: "+e.getMessage());
            setEmptyInputs();
        }
    }//GEN-LAST:event_btnEditarCursoActionPerformed

    private void cmbNivelAcademicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNivelAcademicoActionPerformed
    }//GEN-LAST:event_cmbNivelAcademicoActionPerformed

    private void txtCajaCodigoDocenteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCajaCodigoDocenteKeyTyped
        LogicTools.setMaxSize(evt, txtCajaCodigoDocente, 4);
    }//GEN-LAST:event_txtCajaCodigoDocenteKeyTyped

    private void txtCajaCodigoDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCajaCodigoDocenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCajaCodigoDocenteActionPerformed

    private void txtCajaNombreCursoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCajaNombreCursoKeyTyped
        LogicTools.setOnlyChars(evt, txtCajaNombreCurso, 18);
    }//GEN-LAST:event_txtCajaNombreCursoKeyTyped

    private void txtCajaNombreCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCajaNombreCursoActionPerformed

    }//GEN-LAST:event_txtCajaNombreCursoActionPerformed
    
    private void txtCajaCodigoDocenteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCajaCodigoDocenteKeyReleased
        if (txtCajaCodigoDocente.getText().length() == 4) {
                String codDocente = txtCajaCodigoDocente.getText().toUpperCase();
                String datosDocente = devolverDatosDocente(codDocente);

                txtCajaDocenteAsignado.setText(datosDocente);
        } else {
            txtCajaDocenteAsignado.setText("");
        }
    }//GEN-LAST:event_txtCajaCodigoDocenteKeyReleased

    private void txtCajaCodigoCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCajaCodigoCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCajaCodigoCursoActionPerformed

    private String devolverDatosDocente(String codDocente) {
        Docente docente = DataController.docenteController.buscarDocenteCOD(codDocente);
        if (docente != null) {
            return docente.getNombre() + " " + docente.getAp_paterno() + " " + docente.getAp_materno();
        } else {
            return "Docente no encontrado";
        }
    }
    
    private void txtCajaCodigoCursoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCajaCodigoCursoKeyReleased
        try {
            if (txtCajaCodigoCurso.getText().length()==4) {
                this.cursoEditar = cursoEditar(txtCajaCodigoCurso.getText().toUpperCase());
                System.out.println(cursoEditar.toString());
                if (cursoEditar!=null) {
                    btnEditarCurso.setEnabled(true);
                    txtCajaDocenteAsignado.setEnabled(true);
                    txtCajaCodigoDocente.setEnabled(true);
                    txtCajaNombreCurso.setEnabled(true);
                    cmbNivelAcademico.setEnabled(true);
                    txtCajaCodigoDocente.setText(cursoEditar.getDocente().getCodigoDocente());
                    txtCajaDocenteAsignado.setText(cursoEditar.getDocente().getAp_paterno()+" "+cursoEditar.getDocente().getAp_materno()+" "+cursoEditar.getDocente().getNombre());
                    txtCajaNombreCurso.setText(cursoEditar.getNombcurso());
                    cmbNivelAcademico.setSelectedItem(cursoEditar.getNivelAcademico());    
                }else{
                    LogicTools.sendMessage("Curso no existe!");
                    setEmptyInputs();
                }
            }else{
                setEmptyInputs();
            }
        } catch (Exception e) {
            LogicTools.sendMessage("Error al buscar curso");
        }
    }//GEN-LAST:event_txtCajaCodigoCursoKeyReleased

    private void txtCajaCodigoCursoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCajaCodigoCursoKeyTyped
        LogicTools.setMaxSize(evt, txtCajaCodigoCurso, 4);
    }//GEN-LAST:event_txtCajaCodigoCursoKeyTyped

    private String obtenerNombreCurso(){
        return txtCajaNombreCurso.getText();
    }
    
    private String obtenerCodigoDocente(){
        return txtCajaCodigoDocente.getText();
    }
    
    private String obtenerNivelAcademico(){
        return (String)cmbNivelAcademico.getSelectedItem();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblOpcion;
    private javax.swing.JButton btnEditarCurso;
    private javax.swing.JComboBox<String> cmbNivelAcademico;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblCodigoCurso;
    private javax.swing.JLabel lblCodigoDocente;
    private javax.swing.JLabel lblDocenteAsigando;
    private javax.swing.JPanel lblFondo;
    private javax.swing.JLabel lblMainIcon;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblNivelAcademico;
    private javax.swing.JLabel lblNombreCurso;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlSuperior;
    private javax.swing.JTextField txtCajaCodigoCurso;
    private javax.swing.JTextField txtCajaCodigoDocente;
    private javax.swing.JTextField txtCajaDocenteAsignado;
    private javax.swing.JTextField txtCajaNombreCurso;
    // End of variables declaration//GEN-END:variables
}
