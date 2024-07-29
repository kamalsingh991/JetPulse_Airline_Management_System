
package jetpulse;
import javax.swing.*;

public class LoginHome extends javax.swing.JFrame {

   
    public LoginHome() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        admin = new javax.swing.JLabel();
        employee = new javax.swing.JLabel();
        employeelgnbtn = new javax.swing.JButton();
        adminlgnbtn = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("JetPulse");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 150, 50));

        admin.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        admin.setForeground(new java.awt.Color(255, 255, 255));
        admin.setText("Admin");
        getContentPane().add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 92, 80, 40));

        employee.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        employee.setForeground(new java.awt.Color(255, 255, 255));
        employee.setText("Employee");
        getContentPane().add(employee, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, 50));

        employeelgnbtn.setBackground(new java.awt.Color(0, 255, 0));
        employeelgnbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        employeelgnbtn.setForeground(new java.awt.Color(255, 255, 255));
        employeelgnbtn.setText("Login");
        employeelgnbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeelgnbtnActionPerformed(evt);
            }
        });
        getContentPane().add(employeelgnbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 110, 30));

        adminlgnbtn.setBackground(new java.awt.Color(0, 0, 204));
        adminlgnbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        adminlgnbtn.setForeground(new java.awt.Color(255, 255, 255));
        adminlgnbtn.setText("Login");
        adminlgnbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminlgnbtnActionPerformed(evt);
            }
        });
        getContentPane().add(adminlgnbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 110, 30));

        exitbtn.setBackground(new java.awt.Color(255, 0, 0));
        exitbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        exitbtn.setForeground(new java.awt.Color(255, 255, 255));
        exitbtn.setText("Exit");
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });
        getContentPane().add(exitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 90, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/download.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 628, 344));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void adminlgnbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminlgnbtnActionPerformed
            ADMINLOGIN LoginFrame =new ADMINLOGIN();
            LoginFrame.setVisible(true);
            LoginFrame.pack();
            LoginFrame.setLocationRelativeTo(null);
            this.dispose();
    }//GEN-LAST:event_adminlgnbtnActionPerformed

    private void employeelgnbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeelgnbtnActionPerformed
        
        EmployeeLogin EmployeeLoginFrame =new EmployeeLogin();
            EmployeeLoginFrame.setVisible(true);
            EmployeeLoginFrame.pack();
            EmployeeLoginFrame.setLocationRelativeTo(null);
            this.dispose();
            
            
    }//GEN-LAST:event_employeelgnbtnActionPerformed

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitbtnActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel admin;
    private javax.swing.JButton adminlgnbtn;
    private javax.swing.JLabel employee;
    private javax.swing.JButton employeelgnbtn;
    private javax.swing.JButton exitbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
