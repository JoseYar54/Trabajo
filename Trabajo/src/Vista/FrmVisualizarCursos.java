package Vista;

import Controlador.DataController;
import Modelo.Curso;
import Tools.IconTools;
import Tools.LogicTools;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class FrmVisualizarCursos extends javax.swing.JFrame {
    
    public FrmVisualizarCursos() {
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
                FrmMenuCursos frmMenuCursos=new FrmMenuCursos();
                frmMenuCursos.setVisible(true);
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
        btnVerCursos = new javax.swing.JButton();
        lblCodigoCurso = new javax.swing.JLabel();
        txtCajaCodigoCurso = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblNombreCurso = new javax.swing.JLabel();
        txtCajaNombreCurso = new javax.swing.JTextField();
        lblNivelAca = new javax.swing.JLabel();
        lblCodDocente = new javax.swing.JLabel();
        txtCajaCodigoDocente = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        cmbNivelAcademico = new javax.swing.JComboBox<>();

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
        LblOpcion.setText("BUSCAR CURSO");

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

        btnVerCursos.setBackground(new java.awt.Color(163, 156, 218));
        btnVerCursos.setFont(new java.awt.Font("Carlito", 1, 36)); // NOI18N
        btnVerCursos.setForeground(new java.awt.Color(255, 255, 255));
        btnVerCursos.setText("Ver Cursos");
        btnVerCursos.setActionCommand("VerTodo");
        btnVerCursos.setAlignmentY(0.0F);
        btnVerCursos.setBorder(null);
        btnVerCursos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVerCursos.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnVerCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerCursosActionPerformed(evt);
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
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCajaCodigoCursoKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("BUSQUEDA DE CURSO PERSONALIZADA:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("VER TODOS LOS CURSOS:");

        lblNombreCurso.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNombreCurso.setForeground(new java.awt.Color(102, 102, 102));
        lblNombreCurso.setText("Nombre del Curso:");

        txtCajaNombreCurso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCajaNombreCursoKeyTyped(evt);
            }
        });

        lblNivelAca.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNivelAca.setForeground(new java.awt.Color(102, 102, 102));
        lblNivelAca.setText("Nivel Academico:");

        lblCodDocente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblCodDocente.setForeground(new java.awt.Color(102, 102, 102));
        lblCodDocente.setText("Código Docente:");

        txtCajaCodigoDocente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCajaCodigoDocenteKeyTyped(evt);
            }
        });

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

        cmbNivelAcademico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Primaria", "Secundaria" }));

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(pnlPrincipalLayout.createSequentialGroup()
                            .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblNivelAca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblNombreCurso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(lblCodigoCurso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCodDocente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(12, 12, 12)
                            .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cmbNivelAcademico, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCajaNombreCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCajaCodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCajaCodigoDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(btnVerCursos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addComponent(btnVerCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCajaCodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombreCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCajaNombreCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNivelAca, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbNivelAcademico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCajaCodigoDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
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

    private void btnVerCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerCursosActionPerformed
        imprimirDatos();
    }//GEN-LAST:event_btnVerCursosActionPerformed

    private void txtCajaCodigoCursoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCajaCodigoCursoKeyTyped
        LogicTools.setMaxSize(evt, txtCajaCodigoCurso,4);
    }//GEN-LAST:event_txtCajaCodigoCursoKeyTyped

    private void txtCajaNombreCursoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCajaNombreCursoKeyTyped
        LogicTools.setOnlyChars(evt, txtCajaNombreCurso, 20);
    }//GEN-LAST:event_txtCajaNombreCursoKeyTyped

    private void txtCajaCodigoDocenteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCajaCodigoDocenteKeyTyped
        LogicTools.setMaxSize(evt, txtCajaCodigoDocente,4);
    }//GEN-LAST:event_txtCajaCodigoDocenteKeyTyped

    private String recibirCodigo(){
        return txtCajaCodigoCurso.getText();
    }
    
    private String recibirNombreCurso(){
        return txtCajaNombreCurso.getText();
    }
    
    private String recibirNivelAcademico(){
        return String.valueOf(cmbNivelAcademico.getSelectedItem());
    }
    
    private String recibirCodigoDocente(){
        return txtCajaCodigoDocente.getText();
    }
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            String codigo = recibirCodigo();
            String nombre = recibirNombreCurso();
            String nivel = recibirNivelAcademico();
            String codDocente = recibirCodigoDocente();
            
            limpiarCajas();
            
            ArrayList<Curso> busquedaFiltrada=DataController.cursoController.buscarCurso(codigo,nombre,nivel,codDocente);
            txtCaja.setText("");
            txtCaja.setText("Código Curso   \tNomb Curso\tNivel \tCódigo Doc\tDocente   \n");
        
        for (Curso curso: busquedaFiltrada) {
            txtCaja.append(curso.getCod_Curso()+"\t"+curso.getNombcurso()+"\t"+curso.getNivelAcademico()+
            "\t"+curso.getDocente().getCodigoDocente()+"\t"+curso.getDocente().getAp_paterno()
            +" "+curso.getDocente().getAp_materno()+" "+curso.getDocente().getNombre());
            txtCaja.append("\n");
        }
        
        } catch (Exception e) {
        LogicTools.sendMessage("Error al buscar alumno: " + e.getMessage());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void limpiarCajas(){
        txtCajaCodigoDocente.setText("");
        cmbNivelAcademico.setSelectedItem("-");
        txtCajaCodigoCurso.setText("");
        txtCajaNombreCurso.setText("");
    }
    
    private void txtCajaCodigoCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCajaCodigoCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCajaCodigoCursoActionPerformed
    
    /**
     * Metodo provisional para ver los datos xd
    */
    private void imprimirDatos(){
        txtCaja.setText("");
        txtCaja.setText("Código Curso   \tNomb Curso\tNivel \tCódigo Doc\tDocente   \n");
        
        for (Curso curso: DataController.cursoController.getListaCursos()) {
            txtCaja.append(curso.getCod_Curso()+"\t"+curso.getNombcurso()+"\t"+curso.getNivelAcademico()+
            "\t"+curso.getDocente().getCodigoDocente()+"\t"+curso.getDocente().getAp_paterno()
            +" "+curso.getDocente().getAp_materno()+" "+curso.getDocente().getNombre());
            txtCaja.append("\n");
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblOpcion;
    private javax.swing.JPanel PnlCeleste;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnVerCursos;
    private javax.swing.JComboBox<String> cmbNivelAcademico;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblCodDocente;
    private javax.swing.JLabel lblCodigoCurso;
    private javax.swing.JLabel lblMainIcon;
    private javax.swing.JLabel lblNivelAca;
    private javax.swing.JLabel lblNombreCurso;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JTextArea txtCaja;
    private javax.swing.JTextField txtCajaCodigoCurso;
    private javax.swing.JTextField txtCajaCodigoDocente;
    private javax.swing.JTextField txtCajaNombreCurso;
    // End of variables declaration//GEN-END:variables
}
