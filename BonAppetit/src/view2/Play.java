/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view2;

import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Novak
 */
public class Play extends javax.swing.JFrame {

    /**
     * Creates new form Play
     */
    public Play() {
        initComponents();
        jScrollPane1.setBorder(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundP1 = new view2.backgroundP();
        jScrollPane1 = new javax.swing.JScrollPane();
        fieldPlay = new javax.swing.JTextArea();
        fieldStatus = new javax.swing.JTextField();
        mini = new javax.swing.JLabel();
        close = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(133, 59));
        setMinimumSize(new java.awt.Dimension(1100, 650));
        setUndecorated(true);

        fieldPlay.setEditable(false);
        fieldPlay.setBackground(new java.awt.Color(207, 208, 211));
        fieldPlay.setColumns(20);
        fieldPlay.setForeground(new java.awt.Color(60, 60, 60));
        fieldPlay.setRows(5);
        fieldPlay.setAutoscrolls(false);
        fieldPlay.setBorder(null);
        fieldPlay.setMargin(new java.awt.Insets(0, 0, 0, 0));
        fieldPlay.setMaximumSize(new java.awt.Dimension(510, 260));
        fieldPlay.setMinimumSize(new java.awt.Dimension(160, 90));
        jScrollPane1.setViewportView(fieldPlay);

        fieldStatus.setEditable(false);
        fieldStatus.setBackground(new java.awt.Color(60, 60, 60));
        fieldStatus.setFont(new java.awt.Font("Determination Mono", 0, 14)); // NOI18N
        fieldStatus.setForeground(new java.awt.Color(240, 240, 240));
        fieldStatus.setText("STATUS : GAME IS STARTED");
        fieldStatus.setBorder(null);
        fieldStatus.setMaximumSize(new java.awt.Dimension(59, 30));
        fieldStatus.setMinimumSize(new java.awt.Dimension(59, 30));
        fieldStatus.setPreferredSize(new java.awt.Dimension(59, 30));

        mini.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miniMouseClicked(evt);
            }
        });

        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout backgroundP1Layout = new javax.swing.GroupLayout(backgroundP1);
        backgroundP1.setLayout(backgroundP1Layout);
        backgroundP1Layout.setHorizontalGroup(
            backgroundP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundP1Layout.createSequentialGroup()
                .addGroup(backgroundP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundP1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(mini, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundP1Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(fieldStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 268, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(backgroundP1Layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backgroundP1Layout.setVerticalGroup(
            backgroundP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundP1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(backgroundP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(close, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(mini, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(fieldStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundP1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundP1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JTextArea getFieldPlay() {
        return fieldPlay;
    }

    public JTextField getFieldStatus() {
        return fieldStatus;
    }
    
    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void miniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniMouseClicked
        this.setState(Play.ICONIFIED);
    }//GEN-LAST:event_miniMouseClicked

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
//            java.util.logging.Logger.getLogger(Play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Play().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private view2.backgroundP backgroundP1;
    private javax.swing.JLabel close;
    private javax.swing.JTextArea fieldPlay;
    private javax.swing.JTextField fieldStatus;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mini;
    // End of variables declaration//GEN-END:variables
}
