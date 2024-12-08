package Vista;

import Controlador.DataController;
import Modelo.Alumno;
import Tools.DataTools;
import Tools.IconTools;
import Tools.LogicTools;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashSet;

public class FrmVisualizarAlumnos extends javax.swing.JFrame {
    public FrmVisualizarAlumnos() {
        initComponents();
        addStyleIconTools();
        addLogicCloseButtom();
        imprimirDatos();
    }
    
    private void addLogicCloseButtom(){
        lblCerrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
                FrmMenuPersona frmMenuPersona=new FrmMenuPersona();
                frmMenuPersona.setVisible(true);
                dispose(); 
            }
        });
    }
    
    private void addStyleIconTools(){
        LogicTools.styleMainFrame(this);
        setBackground(IconTools.colorPnlPrinci);
        PnlCeleste.setBackground(IconTools.colorPnls);
        IconTools.addIconOption(lblMainIcon,"img/icon.png");
        IconTools.addIconOption(lblCerrar,"img/return1.png");
        IconTools.addMouseDecoration(lblCerrar,"img/return2.png","img/return1.png");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        PnlCeleste = new javax.swing.JPanel();
        lblCerrar = new javax.swing.JLabel();
        LblOpcion = new javax.swing.JLabel();
        lblMainIcon = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCaja = new javax.swing.JTextArea();
        btnVerAlumnos = new javax.swing.JButton();
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
        btnBuscar = new javax.swing.JButton();
        lblDNI = new javax.swing.JLabel();
        txtCajaDNI = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        PnlCeleste.setBackground(new java.awt.Color(153, 204, 255));

        lblCerrar.setBackground(new java.awt.Color(153, 204, 255));
        lblCerrar.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        LblOpcion.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        LblOpcion.setForeground(new java.awt.Color(255, 255, 255));
        LblOpcion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LblOpcion.setText("BUSCAR ALUMNOS");

        lblMainIcon.setBackground(new java.awt.Color(204, 255, 204));
        lblMainIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout PnlCelesteLayout = new javax.swing.GroupLayout(PnlCeleste);
        PnlCeleste.setLayout(PnlCelesteLayout);
        PnlCelesteLayout.setHorizontalGroup(
            PnlCelesteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlCelesteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMainIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(LblOpcion, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                .addGap(486, 486, 486)
                .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PnlCelesteLayout.setVerticalGroup(
            PnlCelesteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCelesteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlCelesteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMainIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblOpcion)
                    .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        txtCaja.setEditable(false);
        txtCaja.setColumns(20);
        txtCaja.setRows(5);
        txtCaja.setCaretColor(new java.awt.Color(204, 255, 255));
        jScrollPane1.setViewportView(txtCaja);

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

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Código:");

        txtCajaCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCajaCodigoKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("BUSQUEDA DE ALUMNO PERSONALIZADA:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("VER TODOS LOS ALUMNOS:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Nombre:");

        txtCajaNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCajaNombreKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("A. Paterno:");

        txtCajaApPaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCajaApPaternoKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("A. Materno: ");

        txtCajaApMaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCajaApMaternoKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Nivel:");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Grado: ");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Sección:");

        cmbGrado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "1", "2", "3", "4", "5", "6" }));
        cmbGrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGradoActionPerformed(evt);
            }
        });

        cmbNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Primaria", "Secundaria" }));
        cmbNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNivelActionPerformed(evt);
            }
        });

        cmbSeccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "A", "B", "C", "D" }));

        btnBuscar.setBackground(new java.awt.Color(163, 156, 218));
        btnBuscar.setFont(new java.awt.Font("Carlito", 1, 36)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.setToolTipText("");
        btnBuscar.setActionCommand("Buscar");
        btnBuscar.setAlignmentY(0.0F);
        btnBuscar.setBorder(null);
        btnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblDNI.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblDNI.setForeground(new java.awt.Color(102, 102, 102));
        lblDNI.setText("DNI: ");

        txtCajaDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCajaDNIKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblDNI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCajaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCajaApPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCajaApMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCajaDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnVerAlumnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(PnlCeleste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addComponent(PnlCeleste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnVerAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCajaDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
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

    private void btnVerAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerAlumnosActionPerformed
        DataTools.writeDocData(DataController.alumnoController);
        imprimirDatos();
    }//GEN-LAST:event_btnVerAlumnosActionPerformed

    private void txtCajaCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCajaCodigoKeyTyped
        
    }//GEN-LAST:event_txtCajaCodigoKeyTyped

    private void txtCajaNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCajaNombreKeyTyped
        LogicTools.setOnlyChars(evt, txtCajaNombre, 20);
    }//GEN-LAST:event_txtCajaNombreKeyTyped

    private void txtCajaApPaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCajaApPaternoKeyTyped
        LogicTools.setOnlyChars(evt, txtCajaApPaterno, 20);
    }//GEN-LAST:event_txtCajaApPaternoKeyTyped

    private void txtCajaApMaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCajaApMaternoKeyTyped
        LogicTools.setOnlyChars(evt, txtCajaApMaterno, 20);
    }//GEN-LAST:event_txtCajaApMaternoKeyTyped

    private String recibirNivel(){
        return (String)cmbNivel.getSelectedItem();
    }
    
    private String recibirSeccion(){
        return (String)cmbSeccion.getSelectedItem();
    }
    
    private int recibirGrado(){
        return Integer.parseInt((String)cmbGrado.getSelectedItem());
    }
    
    private String recibirNombre(){
        return txtCajaNombre.getText();
    }
    
    private String recibirApPa(){
        return txtCajaApPaterno.getText();
    }
    
    private String recibirApMa(){
        return txtCajaApMaterno.getText();
    }
    
    private String recibirDni(){
        return txtCajaDNI.getText();
    }
    
    private String recibirCodigo(){
        return txtCajaCodigo.getText();
    }
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Integer grado=0;
        try {
            String codigo = recibirCodigo();
            String nivel = recibirNivel();
            String seccion = recibirSeccion();
            try {
                grado = recibirGrado();
            } catch (Exception e) {
                System.out.println("Se controlo el error");
            }
            String nombre = recibirNombre();
            String apPaterno = recibirApPa();
            String apMaterno = recibirApMa();
            String dni = recibirDni();
            limpiarCajas();
            
            HashSet<Alumno> busquedaFiltrada=DataController.alumnoController.buscarAlumnos(codigo,nombre, apPaterno, apMaterno,dni,nivel, seccion, grado);
            txtCaja.setText("");
            txtCaja.setText("Codigo\tNombre\tAp. Paterno\tAp.Materno\tDNI\tNivel\tGrado\tSección\n");
            for (Alumno alumno : busquedaFiltrada) {
                txtCaja.append(alumno.getCod_alumno()+"\t"+alumno.getNombre()+"\t"+alumno.getAp_paterno()+"\t"+alumno.getAp_materno()
                +"\t"+alumno.getDni()+"\t"+alumno.getNivel_academico()+"\t"+alumno.getGrado()+"\t"+alumno.getSeccion());
                txtCaja.append("\n");
            }
        
        } catch (Exception e) {
        LogicTools.sendMessage("Error al buscar alumno: " + e.getMessage());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void limpiarCajas(){
        txtCajaApMaterno.setText("");
        txtCajaApPaterno.setText("");
        txtCajaCodigo.setText("");
        txtCajaDNI.setText("");
        txtCajaNombre.setText("");
        cmbGrado.setSelectedItem("-");
        cmbSeccion.setSelectedItem("-");
        cmbNivel.setSelectedItem("-");
    }
    
    private void cmbGradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGradoActionPerformed
        
        
    }//GEN-LAST:event_cmbGradoActionPerformed

    private void cmbNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNivelActionPerformed
        LogicTools.setLogicCmbBoxGradoAlum(cmbGrado, cmbNivel);
    }//GEN-LAST:event_cmbNivelActionPerformed

    private void txtCajaDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCajaDNIKeyTyped
        LogicTools.setOnlyNumbers(evt, txtCajaDNI, 8);
    }//GEN-LAST:event_txtCajaDNIKeyTyped
    
    /**
     * Metodo provisional para ver los datos xd
    */
    private void imprimirDatos(){
        txtCaja.setText("");
        txtCaja.setText("Codigo\tNombre\tAp. Paterno\tAp.Materno\tDNI\tNivel\tGrado\tSección\n");
        
        for (Alumno alumno: DataController.alumnoController.getListaAlumnos()) {
            txtCaja.append(alumno.getCod_alumno()+"\t"+alumno.getNombre()+"\t"+alumno.getAp_paterno()+"\t"+alumno.getAp_materno()+"\t"+
            alumno.getDni()+"\t"+alumno.getNivel_academico()+"\t"+alumno.getGrado()+"\t"+alumno.getSeccion());
            txtCaja.append("\n");
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblOpcion;
    private javax.swing.JPanel PnlCeleste;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnVerAlumnos;
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
    private javax.swing.JLabel lblDNI;
    private javax.swing.JLabel lblMainIcon;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JTextArea txtCaja;
    private javax.swing.JTextField txtCajaApMaterno;
    private javax.swing.JTextField txtCajaApPaterno;
    private javax.swing.JTextField txtCajaCodigo;
    private javax.swing.JTextField txtCajaDNI;
    private javax.swing.JTextField txtCajaNombre;
    // End of variables declaration//GEN-END:variables
}
