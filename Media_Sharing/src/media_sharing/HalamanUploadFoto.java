/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package media_sharing;

import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class HalamanUploadFoto extends javax.swing.JFrame {

    /**
     * Creates new form HalamanUploadFoto
     */
    public HalamanUploadFoto() {
        initComponents();
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
        FotoArea = new javax.swing.JTextArea();
        UploadButton = new javax.swing.JButton();
        ViphoLabel = new javax.swing.JLabel();
        SearchLabel = new javax.swing.JTextField();
        TagPersonButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();
        BrowseButton = new javax.swing.JButton();
        OkButton = new javax.swing.JButton();
        NamaFotoText = new javax.swing.JTextField();
        VButton = new javax.swing.JButton();
        FButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FotoArea.setColumns(20);
        FotoArea.setRows(5);
        jScrollPane1.setViewportView(FotoArea);

        UploadButton.setText("Upload");

        ViphoLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ViphoLabel.setText("VIPHO");

        SearchLabel.setBackground(new java.awt.Color(204, 204, 204));

        TagPersonButton.setText("Tag Person");
        TagPersonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TagPersonButtonActionPerformed(evt);
            }
        });

        LogoutButton.setText("Logout");

        BrowseButton.setText("Browse");

        OkButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        OkButton.setText("OK");

        NamaFotoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaFotoTextActionPerformed(evt);
            }
        });

        VButton.setText("V");

        FButton.setText("F");

        jLabel2.setText("UserName");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(ViphoLabel)
                .addGap(35, 35, 35)
                .addComponent(SearchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OkButton)
                .addGap(18, 18, 18)
                .addComponent(VButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LogoutButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TagPersonButton)
                                .addComponent(NamaFotoText, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(BrowseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(UploadButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(4, 4, 4))))
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ViphoLabel)
                    .addComponent(SearchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OkButton)
                    .addComponent(VButton)
                    .addComponent(FButton))
                .addGap(7, 7, 7)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TagPersonButton)
                    .addComponent(BrowseButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NamaFotoText, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UploadButton))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TagPersonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TagPersonButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TagPersonButtonActionPerformed

    private void NamaFotoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaFotoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaFotoTextActionPerformed

//    /**
//     * @param args the command line arguments
//     */
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
//            java.util.logging.Logger.getLogger(HalamanUploadFoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(HalamanUploadFoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(HalamanUploadFoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(HalamanUploadFoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new HalamanUploadFoto().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BrowseButton;
    private javax.swing.JButton FButton;
    private javax.swing.JTextArea FotoArea;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JTextField NamaFotoText;
    private javax.swing.JButton OkButton;
    private javax.swing.JTextField SearchLabel;
    private javax.swing.JButton TagPersonButton;
    private javax.swing.JButton UploadButton;
    private javax.swing.JButton VButton;
    private javax.swing.JLabel ViphoLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public JTextField getSearchLabel() {
        return SearchLabel;
    }

    public JButton getOkButton() {
        return OkButton;
    }

    public JButton getLogoutButton() {
        return LogoutButton;
    }

    public JTextArea getFotoArea() {
        return FotoArea;
    }

    public JButton getTagPersonButton() {
        return TagPersonButton;
    }

    public JButton getUploadButton() {
        return UploadButton;
    }

    public JButton getBrowseButton() {
        return BrowseButton;
    }

    public JTextField getNamaFotoText() {
        return NamaFotoText;
    }

    public JButton getVButton() {
        return VButton;
    }

    public JButton getFButton() {
        return FButton;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public JLabel getViphoLabel() {
        return ViphoLabel;
    }

    public void setViphoLabel(JLabel ViphoLabel) {
        this.ViphoLabel = ViphoLabel;
    }
    
    public void MouseListener (MouseListener e){
        ViphoLabel.addMouseListener(e);
    }
    
    HalamanUploadFotoController controller;
    public void setController(HalamanUploadFotoController controller){
        this.controller = controller;
        getBrowseButton().addActionListener(controller);
        getOkButton().addActionListener(controller);
        getLogoutButton().addActionListener(controller);
        getTagPersonButton().addActionListener(controller);
        getUploadButton().addActionListener(controller);
        getVButton().addActionListener(controller);
        getFButton().addActionListener(controller);
    }
}
