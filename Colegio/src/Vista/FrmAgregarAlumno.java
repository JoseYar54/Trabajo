package Vista;

import Controlador.DataController;
import Modelo.Alumno;
import Tools.DataTools;
import Tools.IconTools;
import Tools.LogicTools;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrmAgregarAlumno extends javax.swing.JFrame {
    public FrmAgregarAlumno() {
        initComponents();
        LogicTools.styleMainFrame(this);
        LogicTools.styleCloseButtom(lblCerrar,IconTools.colorPnls);
        setBasicStyles();
        setLogicCloseButtom();
        setInputDecoration();
        txtObservaciones.setWrapStyleWord(true);
        txtObservaciones.setLineWrap(true);
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
        lblNombre = new javax.swing.JLabel();
        txtCajaNombre = new javax.swing.JTextField();
        lblApPa = new javax.swing.JLabel();
        txtCajaApPaterno = new javax.swing.JTextField();
        lblDNI = new javax.swing.JLabel();
        txtCajaDNI = new javax.swing.JTextField();
        lblNivel = new javax.swing.JLabel();
        cmbNivel = new javax.swing.JComboBox<>();
        lblGrado = new javax.swing.JLabel();
        cmbGrado = new javax.swing.JComboBox<>();
        lblSeccion = new javax.swing.JLabel();
        cmbSeccion = new javax.swing.JComboBox<>();
        btnAgregarAlumno = new javax.swing.JButton();
        lblObservaciones = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        lblApMat1 = new javax.swing.JLabel();
        txtCajaApMaterno = new javax.swing.JTextField();
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
        LblOpcion.setText("AGREGAR ALUMNO");

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
                .addComponent(LblOpcion, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
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
        jLabel2.setText("Introduzca datos del alumno:");

        lblNombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(102, 102, 102));
        lblNombre.setText("Nombre:");

        txtCajaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCajaNombreActionPerformed(evt);
            }
        });
        txtCajaNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCajaNombreKeyTyped(evt);
            }
        });

        lblApPa.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblApPa.setForeground(new java.awt.Color(102, 102, 102));
        lblApPa.setText("A. Paterno:");

        txtCajaApPaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCajaApPaternoActionPerformed(evt);
            }
        });
        txtCajaApPaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCajaApPaternoKeyTyped(evt);
            }
        });

        lblDNI.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblDNI.setForeground(new java.awt.Color(102, 102, 102));
        lblDNI.setText("DNI:");

        txtCajaDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCajaDNIKeyTyped(evt);
            }
        });

        lblNivel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNivel.setForeground(new java.awt.Color(102, 102, 102));
        lblNivel.setText("Nivel:");

        cmbNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Primaria", "Secundaria" }));
        cmbNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNivelActionPerformed(evt);
            }
        });

        lblGrado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblGrado.setForeground(new java.awt.Color(102, 102, 102));
        lblGrado.setText("Grado: ");

        cmbGrado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "1", "2", "3", "4", "5" }));

        lblSeccion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblSeccion.setForeground(new java.awt.Color(102, 102, 102));
        lblSeccion.setText("Sección:");

        cmbSeccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "A", "B", "C", "D" }));
        cmbSeccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSeccionActionPerformed(evt);
            }
        });

        btnAgregarAlumno.setBackground(new java.awt.Color(163, 156, 218));
        btnAgregarAlumno.setFont(new java.awt.Font("Carlito", 1, 36)); // NOI18N
        btnAgregarAlumno.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarAlumno.setText("AGREGAR ALUMNO");
        btnAgregarAlumno.setToolTipText("");
        btnAgregarAlumno.setActionCommand("Buscar");
        btnAgregarAlumno.setAlignmentY(0.0F);
        btnAgregarAlumno.setBorder(null);
        btnAgregarAlumno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgregarAlumno.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnAgregarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAlumnoActionPerformed(evt);
            }
        });

        lblObservaciones.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblObservaciones.setForeground(new java.awt.Color(102, 102, 102));
        lblObservaciones.setText("Observaciones:");

        txtObservaciones.setColumns(20);
        txtObservaciones.setRows(5);
        txtObservaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtObservacionesKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtObservaciones);

        lblApMat1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblApMat1.setForeground(new java.awt.Color(102, 102, 102));
        lblApMat1.setText("A. Materno: ");

        txtCajaApMaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCajaApMaternoKeyTyped(evt);
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
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblObservaciones, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(lblGrado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lblNivel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lblApPa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lblNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lblSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblApMat1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cmbSeccion, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cmbGrado, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cmbNivel, javax.swing.GroupLayout.Alignment.TRAILING, 0, 160, Short.MAX_VALUE))
                                    .addComponent(txtCajaNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(txtCajaApPaterno)
                                    .addComponent(txtCajaApMaterno)
                                    .addComponent(txtCajaDNI)))
                            .addComponent(btnAgregarAlumno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addComponent(pnlSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApPa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCajaApPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApMat1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCajaApMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCajaDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgregarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
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
            .addGap(0, 604, Short.MAX_VALUE)
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

    private String obtenerNombre(){
        return txtCajaNombre.getText();
    }
    
    private String obtenerApPaterno(){
        return txtCajaApPaterno.getText();
    }
    
    private String obtenerApMaterno(){
        return txtCajaApMaterno.getText();
    }
    
    private String obtenerDNI(){
        return txtCajaDNI.getText();
    }
    
    private String obtenerNivel(){
        return (String)cmbNivel.getSelectedItem();
    }
    
    private String obtenerSeccion(){
        return (String)cmbSeccion.getSelectedItem();
    }
    
    private int obtenerGrado(){
        return Integer.parseInt((String)cmbGrado.getSelectedItem());
    }
    
    private void btnAgregarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAlumnoActionPerformed
        try{
            String nomb=obtenerNombre();
            String apMa=obtenerApMaterno();
            String apPa=obtenerApPaterno();
            String dni=obtenerDNI();
            int grado=0;
            try {
                grado=obtenerGrado();
            } catch (Exception e) {
                System.out.println("Se capturo un error previsto");
            }
            String nivel=obtenerNivel();
            String seccion=obtenerSeccion();
            
            Alumno alumno=new  Alumno(nivel, seccion, grado, nomb, apMa, apPa, dni);
            
            if (DataController.alumnoController.buscarAlumno(dni)==null) {
                if (txtObservaciones.getText().length()>5) {
                    alumno.setObservacion(txtObservaciones.getText());
                }
                DataController.alumnoController.agregarAlumno(alumno);
                LogicTools.sendMessage("Alumno registrado correctamente :D");
                LogicTools.sendMessage("El codigo del alumno es: "+alumno.getCod_alumno());
                limpiarCajas();
                DataTools.writeDocData(DataController.alumnoController);
                setVisible(false);
                dispose();
            }else{
                LogicTools.sendMessage("El DNI del alumno que se desea ingresar ya esta registrado");
                limpiarCajas();
            }
            
        }catch(Exception e){
            LogicTools.sendMessage("Error al registrar al alumno");
            limpiarCajas();
        }
    }//GEN-LAST:event_btnAgregarAlumnoActionPerformed
    private void setInputDecoration(){
        int tamanio=12;
        LogicTools.setStyleInput(txtCajaNombre, "Ingresa un Nombre", tamanio);
        LogicTools.setStyleInput(txtCajaApPaterno, "Ingresa apellido paterno",tamanio);
        LogicTools.setStyleInput(txtCajaApMaterno, "Ingresa apellido materno", tamanio);
        LogicTools.setStyleInput(txtCajaDNI, "Ingresa DNI",tamanio);
    }
    
    private void limpiarCajas(){
        txtCajaApMaterno.setText("");
        txtCajaApPaterno.setText("");
        txtCajaDNI.setText("");
        txtCajaNombre.setText("");
        txtObservaciones.setText("");
    }
    
    private void txtCajaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCajaNombreActionPerformed
    }//GEN-LAST:event_txtCajaNombreActionPerformed

    private void txtCajaApPaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCajaApPaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCajaApPaternoActionPerformed

    private void cmbNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNivelActionPerformed
        LogicTools.setLogicCmbBoxGradoAlum(cmbGrado, cmbNivel);
    }//GEN-LAST:event_cmbNivelActionPerformed

    private void cmbSeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSeccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSeccionActionPerformed

    private void txtCajaNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCajaNombreKeyTyped
        LogicTools.setOnlyChars(evt, txtCajaNombre, 18);
    }//GEN-LAST:event_txtCajaNombreKeyTyped

    private void txtCajaApPaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCajaApPaternoKeyTyped
        LogicTools.setOnlyChars(evt, txtCajaApPaterno, 25);
    }//GEN-LAST:event_txtCajaApPaternoKeyTyped

    private void txtCajaDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCajaDNIKeyTyped
        LogicTools.setOnlyNumbers(evt, txtCajaDNI, 8);
    }//GEN-LAST:event_txtCajaDNIKeyTyped

    private void txtObservacionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtObservacionesKeyTyped
        LogicTools.setMaxSize(evt, txtObservaciones, 150);
    }//GEN-LAST:event_txtObservacionesKeyTyped

    private void txtCajaApMaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCajaApMaternoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCajaApMaternoKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblOpcion;
    private javax.swing.JButton btnAgregarAlumno;
    private javax.swing.JComboBox<String> cmbGrado;
    private javax.swing.JComboBox<String> cmbNivel;
    private javax.swing.JComboBox<String> cmbSeccion;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApMat1;
    private javax.swing.JLabel lblApPa;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblDNI;
    private javax.swing.JLabel lblGrado;
    private javax.swing.JLabel lblMainIcon;
    private javax.swing.JLabel lblNivel;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblObservaciones;
    private javax.swing.JLabel lblSeccion;
    private javax.swing.JPanel pnlBorde;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlSuperior;
    private javax.swing.JTextField txtCajaApMaterno;
    private javax.swing.JTextField txtCajaApPaterno;
    private javax.swing.JTextField txtCajaDNI;
    private javax.swing.JTextField txtCajaNombre;
    private javax.swing.JTextArea txtObservaciones;
    // End of variables declaration//GEN-END:variables
}
