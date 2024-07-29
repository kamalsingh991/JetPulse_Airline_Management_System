
package jetpulse;
import java.sql.*;
import javax.swing.JOptionPane;


public class ADMINLOGIN extends javax.swing.JFrame {

  
    public ADMINLOGIN() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usernm = new javax.swing.JLabel();
        unamtxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lgnbtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        passtxt = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usernm.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        usernm.setText("Username");
        getContentPane().add(usernm, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, 40));
        getContentPane().add(unamtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 190, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 90, 30));

        lgnbtn.setBackground(new java.awt.Color(0, 51, 255));
        lgnbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lgnbtn.setForeground(new java.awt.Color(255, 255, 255));
        lgnbtn.setText("Login");
        lgnbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lgnbtnActionPerformed(evt);
            }
        });
        getContentPane().add(lgnbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 100, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" ADMIN LOGIN");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 230, 40));

        passtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passtxtActionPerformed(evt);
            }
        });
        getContentPane().add(passtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 190, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vignette_66594OEEZJZAPOYUGJMN_cover.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lgnbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lgnbtnActionPerformed
         String usernm=unamtxt.getText();
         String password = String.valueOf(passtxt.getPassword());
         
         
         try{

               Connection con= Conn.getConnection();
               String q="select Username,Password from adminlogin where Username='"+usernm+"' and Password='"+password+"'";
               PreparedStatement pstmt=con.prepareStatement(q);
               ResultSet rs = pstmt.executeQuery();
               
               if(rs.next())
               {
                   JOptionPane.showMessageDialog(null, "Login Sucessful");
                    this.dispose();
                    AdminDashboard AdminDashboardFrame =new AdminDashboard();
                    AdminDashboardFrame.setVisible(true);
                    
               }
               else
               {
                   JOptionPane.showMessageDialog(null, "Invalid Login");
               }
               
         }
         catch(Exception e)
         {
             System.out.println("e");
                     
         }
    }//GEN-LAST:event_lgnbtnActionPerformed

    private void passtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passtxtActionPerformed

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
            java.util.logging.Logger.getLogger(ADMINLOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ADMINLOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ADMINLOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ADMINLOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ADMINLOGIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton lgnbtn;
    private javax.swing.JPasswordField passtxt;
    private javax.swing.JTextField unamtxt;
    private javax.swing.JLabel usernm;
    // End of variables declaration//GEN-END:variables
}
