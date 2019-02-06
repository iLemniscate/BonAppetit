/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JButton;
import javax.swing.JComboBox;

/**
 *
 * @author Novak
 */
public class NewGame extends javax.swing.JFrame {

    /**
     * Creates new form NewGame
     */
    public NewGame() {
        initComponents();
    }

    public JButton getBtnContinue() {
        return btnContinue;
    }

    public JComboBox<String> getComboBoxDif() {
        return comboBoxDif;
    }

    public JComboBox<String> getComboBoxType() {
        return comboBoxType;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bground21 = new view.bground2();
        comboBoxType = new javax.swing.JComboBox<>();
        comboBoxDif = new javax.swing.JComboBox<>();
        btnContinue = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(483, 234));

        comboBoxType.setBackground(new java.awt.Color(0, 0, 0));
        comboBoxType.setFont(new java.awt.Font("Determination Mono", 0, 12)); // NOI18N
        comboBoxType.setForeground(new java.awt.Color(255, 255, 255));
        comboBoxType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Speed", "Defend", "Attack" }));

        comboBoxDif.setBackground(new java.awt.Color(0, 0, 0));
        comboBoxDif.setFont(new java.awt.Font("Determination Mono", 0, 12)); // NOI18N
        comboBoxDif.setForeground(new java.awt.Color(255, 255, 255));
        comboBoxDif.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Easy", "Normal", "Hard" }));

        btnContinue.setBackground(new java.awt.Color(0, 0, 0));
        btnContinue.setForeground(new java.awt.Color(255, 255, 255));
        btnContinue.setText("CONTINUE");

        javax.swing.GroupLayout bground21Layout = new javax.swing.GroupLayout(bground21);
        bground21.setLayout(bground21Layout);
        bground21Layout.setHorizontalGroup(
            bground21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bground21Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(btnContinue)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bground21Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(comboBoxDif, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addComponent(comboBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        bground21Layout.setVerticalGroup(
            bground21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bground21Layout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addGroup(bground21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxDif, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(btnContinue, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bground21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bground21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(NewGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(NewGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(NewGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(NewGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new NewGame().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private view.bground2 bground21;
    private javax.swing.JButton btnContinue;
    private javax.swing.JComboBox<String> comboBoxDif;
    private javax.swing.JComboBox<String> comboBoxType;
    // End of variables declaration//GEN-END:variables
}