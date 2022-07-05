
import javax.swing.DefaultListModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author velih
 */
public class Demo extends javax.swing.JFrame {

    /**
     * Creates new form Demo
     */
    DefaultListModel defaultListModel;  
    public Demo() {
        initComponents();
        defaultListModel = new DefaultListModel();
        lstStudents.setModel(defaultListModel);
//        defaultListModel.addElement("Velihan");
//        defaultListModel.add(0, "Altan");
//        defaultListModel.removeElement("Velihan");
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
        lstStudents = new javax.swing.JList<>();
        lblStudentName = new javax.swing.JLabel();
        txtStudentName = new javax.swing.JTextField();
        btnAddStudent = new javax.swing.JButton();
        btnRemoveStudent = new javax.swing.JButton();
        btnRemoveSelectedStudent = new javax.swing.JButton();
        lblMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lstStudents.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lstStudents.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstStudents);

        lblStudentName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblStudentName.setText("Student Name:");

        txtStudentName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtStudentName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudentNameActionPerformed(evt);
            }
        });

        btnAddStudent.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAddStudent.setText("Add Student");
        btnAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStudentActionPerformed(evt);
            }
        });

        btnRemoveStudent.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRemoveStudent.setText("Delete Student");
        btnRemoveStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveStudentActionPerformed(evt);
            }
        });

        btnRemoveSelectedStudent.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRemoveSelectedStudent.setText("Delete Selected Student");
        btnRemoveSelectedStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveSelectedStudentActionPerformed(evt);
            }
        });

        lblMessage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(297, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAddStudent)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRemoveStudent))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRemoveSelectedStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(83, 83, 83))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemoveStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemoveSelectedStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStudentActionPerformed
//        DefaultListModel defaultListModel = new DefaultListModel();
//        lstStudents.setModel(defaultListModel);
//        lblMessage.setText("Item added : " + txtStudentName.getText());
        defaultListModel.addElement(txtStudentName.getText());
        lblMessage.setText("Item added : " + txtStudentName.getText());
        txtStudentName.setText("");
//        if (txtStudentName.getText() == null || txtStudentName.getText() == "") {
//            lblMessage.setText("No item found to add!");
//        } else {
//            defaultListModel.addElement(txtStudentName.getText());
//            lblMessage.setText("Item added : " + txtStudentName.getText());
//        }
    }//GEN-LAST:event_btnAddStudentActionPerformed

    private void btnRemoveStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveStudentActionPerformed
//        lstStudents.setModel(defaultListModel);
//        lblMessage.setText("Item removed : " + txtStudentName.getText());
        defaultListModel.removeElement(txtStudentName.getText());
        lblMessage.setText("Item removed : " + txtStudentName.getText());
        txtStudentName.setText("");
//        if (txtStudentName.getText() == null || txtStudentName.getText() == "") {
//            lblMessage.setText("No item found to remove!");
//        } else {
//            defaultListModel.removeElement(txtStudentName.getText());
//            lblMessage.setText("Item removed : " + txtStudentName.getText());
//        } 
    }//GEN-LAST:event_btnRemoveStudentActionPerformed

    private void txtStudentNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudentNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStudentNameActionPerformed

    private void btnRemoveSelectedStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveSelectedStudentActionPerformed
        // defaultListModel.removeElementAt(lstStudents.getSelectedIndex());
        int index = lstStudents.getSelectedIndex(); // returns -1 if there is no selection.
        
        if (index != -1) { // to avoid ArrayIndexOutOfBoundsException.
            defaultListModel.removeElementAt(index);
            lblMessage.setText("Selected item removed from the list!");
        } else {
            lblMessage.setText("No item selected!");
        }
        
    }//GEN-LAST:event_btnRemoveSelectedStudentActionPerformed

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
            java.util.logging.Logger.getLogger(Demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Demo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddStudent;
    private javax.swing.JButton btnRemoveSelectedStudent;
    private javax.swing.JButton btnRemoveStudent;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblStudentName;
    private javax.swing.JList<String> lstStudents;
    private javax.swing.JTextField txtStudentName;
    // End of variables declaration//GEN-END:variables
}