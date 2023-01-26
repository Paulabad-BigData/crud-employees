/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import crud.empleadosDAL.Conexion; // Se importa la clase de la conexión
import crud.empleadosBL.EmpleadosBL;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
/**
 *
 * @author PERSONAL
 */
public class fmrEmpleados extends javax.swing.JFrame {
    
    DefaultTableModel modelo;

    /**
     * Creates new form fmrEmpleados
     */
    public fmrEmpleados() {
        initComponents();
        
        String[] titulos = {"ID", "Nombre", "Correo"};
        modelo = new DefaultTableModel(null, titulos);
        tblEmployees.setModel(modelo);
        
        this.mostrarDatos();
        this.txtID.setEnabled(false);
        this.limpiar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployees = new javax.swing.JTable();
        btnCreate = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblEmployees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblEmployees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmployeesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmployees);

        btnCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crud/recursos/salvar.png"))); // NOI18N
        btnCreate.setText("Agregar");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crud/recursos/editar-codigo.png"))); // NOI18N
        btnUpdate.setText("Editar");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crud/recursos/boton-eliminar.png"))); // NOI18N
        btnDelete.setText("Borrar");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crud/recursos/cancelar.png"))); // NOI18N
        btnCancel.setText("Cancelar");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jLabel1.setText("ID");

        jLabel2.setText("Nombre: ");

        jLabel3.setText("Correo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCreate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancel))
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(11, 11, 11)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnCancel))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        Conexion objConexion = new Conexion();
        
        EmpleadosBL oEmpleados = recuperarDatosGUI();
        
        String strSentenciaInsert = String.format("INSERT INTO Employees (ID, Name, Email) "
                + "VALUES (null, '%s', '%s')", oEmpleados.getName(), oEmpleados.getEmail());
        
        objConexion.ejecutarSentenciaSQL(strSentenciaInsert);
        
        this.mostrarDatos();
        this.limpiar();
    }//GEN-LAST:event_btnCreateActionPerformed

    public void mostrarDatos() {
       
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        
        Conexion objConexion = new Conexion();
        
            try {
                ResultSet resultado = objConexion.consultarRegistros("SELECT * FROM Employees");
                while (resultado.next()) {
                    System.out.println(resultado.getString("ID"));
                    System.out.println(resultado.getString("Name"));
                    System.out.println(resultado.getString("Email"));
                    
                    Object[] oUsuario = {resultado.getString("ID"), resultado.getString("Name"), resultado.getString("Email")};
                    
                    modelo.addRow(oUsuario);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        
    }
    
    public EmpleadosBL recuperarDatosGUI() {
        EmpleadosBL oEmpleados = new EmpleadosBL();
        
        int id = (txtID.getText().isEmpty())?0: Integer.parseInt(txtID.getText());
        
        oEmpleados.setId(id);
        oEmpleados.setName(txtName.getText());
        oEmpleados.setEmail(txtEmail.getText());
        
        return oEmpleados;
    }
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        Conexion objConexion = new Conexion();
        
        EmpleadosBL oEmpleados = recuperarDatosGUI();
        
        String strSentenciaInsert = String.format("UPDATE Employees SET Name = '%s', Email = '%s' WHERE ID = %d", oEmpleados.getName(), oEmpleados.getEmail(), oEmpleados.getId());
        
        objConexion.ejecutarSentenciaSQL(strSentenciaInsert);
        
        this.mostrarDatos();
        this.limpiar();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void tblEmployeesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmployeesMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 1) {
            
            JTable receptor = (JTable)evt.getSource();
            
            txtID.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),0).toString());
            txtName.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),1).toString());
            txtEmail.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),2).toString());
        }
        
        btnCreate.setEnabled(false);
        btnUpdate.setEnabled(true);
        btnDelete.setEnabled(true);
    }//GEN-LAST:event_tblEmployeesMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        
        Conexion objConexion = new Conexion();
        
        EmpleadosBL oEmpleados = recuperarDatosGUI();
        
        String strSentenciaInsert = String.format("DELETE FROM Employees WHERE ID = %d", oEmpleados.getId());
        
        objConexion.ejecutarSentenciaSQL(strSentenciaInsert);
        
        this.mostrarDatos();
        this.limpiar();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        this.limpiar();
    }//GEN-LAST:event_btnCancelActionPerformed

    public void limpiar() {
        txtID.setText("");
        txtName.setText("");
        txtEmail.setText("");
        
        btnCreate.setEnabled(true);
        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(fmrEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fmrEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fmrEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fmrEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fmrEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEmployees;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}