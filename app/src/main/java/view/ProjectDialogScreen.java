package view;

import controller.ProjectController;
import javax.swing.JOptionPane;
import model.Project;

/**
 *
 * @author Barbara
 */
public class ProjectDialogScreen extends javax.swing.JDialog {

    ProjectController controller;

    public ProjectDialogScreen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        controller = new ProjectController();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelToolBarTitle = new javax.swing.JPanel();
        jLabelToobarTitle = new javax.swing.JLabel();
        jLabelSaveButton = new javax.swing.JLabel();
        jPanelProjects = new javax.swing.JPanel();
        jLabelName = new javax.swing.JLabel();
        jLabelDescription = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescription = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 500));
        setSize(new java.awt.Dimension(500, 500));

        jPanelToolBarTitle.setBackground(new java.awt.Color(144, 199, 199));

        jLabelToobarTitle.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabelToobarTitle.setText("Projeto");

        jLabelSaveButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSaveButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\barba\\OneDrive\\Documentos\\NetBeansProjects\\toDoApp\\app\\src\\main\\icons\\plus.png")); // NOI18N
        jLabelSaveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSaveButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelToolBarTitleLayout = new javax.swing.GroupLayout(jPanelToolBarTitle);
        jPanelToolBarTitle.setLayout(jPanelToolBarTitleLayout);
        jPanelToolBarTitleLayout.setHorizontalGroup(
            jPanelToolBarTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelToolBarTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelToobarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelSaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelToolBarTitleLayout.setVerticalGroup(
            jPanelToolBarTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelSaveButton, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
            .addComponent(jLabelToobarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelProjects.setBackground(java.awt.Color.white);

        jLabelName.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabelName.setText(" Nome:");

        jLabelDescription.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabelDescription.setText(" Descrição:");

        jTextFieldName.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jTextFieldName.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldName.setToolTipText("");
        jTextFieldName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNameActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextAreaDescription.setColumns(20);
        jTextAreaDescription.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jTextAreaDescription.setForeground(new java.awt.Color(153, 153, 153));
        jTextAreaDescription.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescription);

        javax.swing.GroupLayout jPanelProjectsLayout = new javax.swing.GroupLayout(jPanelProjects);
        jPanelProjects.setLayout(jPanelProjectsLayout);
        jPanelProjectsLayout.setHorizontalGroup(
            jPanelProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProjectsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                    .addComponent(jLabelDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldName))
                .addContainerGap())
        );
        jPanelProjectsLayout.setVerticalGroup(
            jPanelProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProjectsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDescription)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelToolBarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelProjects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelToolBarTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelProjects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNameActionPerformed

    private void jLabelSaveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSaveButtonMouseClicked
        // TODO add your handling code here:
        try {
            if (!jTextFieldName.getText().isEmpty()) { //se o campo de nome não estiver vazio: cadastrar projeto
                Project project = new Project();
                project.setName(jTextFieldName.getText()); // o método getText() retorna o texto escrito no campo JTextFieldName
                project.setDescription(jTextAreaDescription.getText());

                controller.save(project);
                JOptionPane.showMessageDialog(rootPane, "Projeto salvo com sucesso!"); //mensagem de sucesso aparece após salvar
                dispose();

            } else { 
                JOptionPane.showMessageDialog(rootPane, "É necessário o nome do projeto.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_jLabelSaveButtonMouseClicked

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
                if ("Java swing".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProjectDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjectDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjectDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjectDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ProjectDialogScreen dialog = new ProjectDialogScreen(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelDescription;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelSaveButton;
    private javax.swing.JLabel jLabelToobarTitle;
    private javax.swing.JPanel jPanelProjects;
    private javax.swing.JPanel jPanelToolBarTitle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDescription;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables
}
