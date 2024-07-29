
package jetpulse;
import javax.swing.*;
import java.sql.*;

public class EmployeeLogin extends javax.swing.JFrame {

   
    public EmployeeLogin() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usernametxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        passwordtxt = new javax.swing.JPasswordField();
        lgnbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Username");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, -1, -1));

        usernametxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        usernametxt.setPreferredSize(new java.awt.Dimension(64, 24));
        jPanel1.add(usernametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 190, 35));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setText("Employee Login");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, -1, -1));
        jPanel1.add(passwordtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 190, 35));

        lgnbtn.setBackground(new java.awt.Color(0, 0, 204));
        lgnbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lgnbtn.setForeground(new java.awt.Color(255, 255, 255));
        lgnbtn.setText("LOGIN");
        lgnbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lgnbtnActionPerformed(evt);
            }
        });
        jPanel1.add(lgnbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 100, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG_1443-1_2.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 550));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lgnbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lgnbtnActionPerformed
        
        String usernm=usernametxt.getText();
        String password=String.valueOf(passwordtxt.getPassword());
        
        try{
            Connection con = Conn.getConnection();
            String q="select Username,Password from employeelogin where Username='"+usernm+"' and Password='"+password+"'";
            PreparedStatement pstmt=con.prepareStatement(q);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next())
            {
                JOptionPane.showMessageDialog(null, "Login Sucessfull");
                this.dispose();
                 EmployeeDashboard EmployeeDashboardFrame =new EmployeeDashboard();
                 EmployeeDashboardFrame.setVisible(true);
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

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton lgnbtn;
    private javax.swing.JPasswordField passwordtxt;
    private javax.swing.JTextField usernametxt;
    // End of variables declaration//GEN-END:variables
}
