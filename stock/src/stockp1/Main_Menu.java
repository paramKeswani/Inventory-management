/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package stockp1;

/**
 *
 * @author Sarvadnya
 */
import javax.swing.*;
public class Main_Menu extends javax.swing.JFrame {

    /**
     * Creates new form Category
     */
    public Main_Menu() {
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

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        user = new javax.swing.JButton();
        product = new javax.swing.JButton();
        order = new javax.swing.JButton();
        customer = new javax.swing.JButton();
        purchaseinvoice = new javax.swing.JButton();
        reports = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(280, 100));
        setUndecorated(true);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("jButton1");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1046, 573, -1, 0));

        jPanel1.setBackground(new java.awt.Color(0, 255, 204));

        jLabel7.setBackground(new java.awt.Color(204, 255, 204));
        jLabel7.setFont(new java.awt.Font("Baskerville Old Face", 1, 36)); // NOI18N
        jLabel7.setText("INVENTORY MANAGEMENT SYSTEM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jLabel7)
                .addContainerGap(127, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel7)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, -1));

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        user.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        user.setText("User");
        user.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        user.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        jPanel2.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 92, 40));

        product.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        product.setText("Product");
        product.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productActionPerformed(evt);
            }
        });
        jPanel2.add(product, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 120, 37));

        order.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        order.setText("Order");
        order.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderActionPerformed(evt);
            }
        });
        jPanel2.add(order, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 92, 43));

        customer.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        customer.setText("Customer");
        customer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerActionPerformed(evt);
            }
        });
        jPanel2.add(customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 122, -1));

        purchaseinvoice.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        purchaseinvoice.setText("Purchase Invoice");
        purchaseinvoice.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        purchaseinvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseinvoiceActionPerformed(evt);
            }
        });
        jPanel2.add(purchaseinvoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 32));

        reports.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        reports.setText("Reports");
        reports.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        reports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportsActionPerformed(evt);
            }
        });
        jPanel2.add(reports, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 130, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 200, 480));

        logout.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        logout.setText("LogOut");
        logout.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 570, 103, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stockp1/imgcof.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 100, 1000, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        
         new LoginPage().setVisible(true);
          this.setVisible(false);
    }//GEN-LAST:event_logoutActionPerformed

    private void purchaseinvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseinvoiceActionPerformed
        // TODO add your handling code here:
         new Purchase_Invoice().setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_purchaseinvoiceActionPerformed

    private void customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerActionPerformed
        // TODO add your handling code here:
          new customers().setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_customerActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
        new users().setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_userActionPerformed

    private void productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productActionPerformed
        // TODO add your handling code here:
          new Products().setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_productActionPerformed

    private void orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderActionPerformed
        // TODO add your handling code here:
         new order().setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_orderActionPerformed

    private void reportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportsActionPerformed
        // TODO add your handling code here:
         new reports().setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_reportsActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

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
            java.util.logging.Logger.getLogger(Main_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
       java.awt.EventQueue.invokeLater(new Runnable() {
           public void run() {
               new Main_Menu().setVisible(true);
            }
       });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton customer;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logout;
    private javax.swing.JButton order;
    private javax.swing.JButton product;
    private javax.swing.JButton purchaseinvoice;
    private javax.swing.JButton reports;
    private javax.swing.JButton user;
    // End of variables declaration//GEN-END:variables
}