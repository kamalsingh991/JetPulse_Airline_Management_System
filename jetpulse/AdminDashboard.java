
package jetpulse;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;


public class AdminDashboard extends javax.swing.JFrame {

    
    public AdminDashboard() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        addflightbtn = new javax.swing.JButton();
        updateflightbtn = new javax.swing.JButton();
        addemployeebtn = new javax.swing.JButton();
        updateemployeebtn = new javax.swing.JButton();
        viewflightbtn = new javax.swing.JButton();
        logoutbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Admin Dashboard");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, -1, -1));

        addflightbtn.setBackground(new java.awt.Color(51, 89, 150));
        addflightbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addflightbtn.setForeground(new java.awt.Color(255, 255, 255));
        addflightbtn.setText("Add Flights");
        addflightbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addflightbtnActionPerformed(evt);
            }
        });
        getContentPane().add(addflightbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 200, 40));

        updateflightbtn.setBackground(new java.awt.Color(51, 89, 150));
        updateflightbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updateflightbtn.setForeground(new java.awt.Color(255, 255, 255));
        updateflightbtn.setText("Update Flights");
        updateflightbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateflightbtnActionPerformed(evt);
            }
        });
        getContentPane().add(updateflightbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 120, 200, 40));

        addemployeebtn.setBackground(new java.awt.Color(51, 89, 150));
        addemployeebtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addemployeebtn.setForeground(new java.awt.Color(255, 255, 255));
        addemployeebtn.setText("Add Employee");
        addemployeebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addemployeebtnActionPerformed(evt);
            }
        });
        getContentPane().add(addemployeebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 200, 40));

        updateemployeebtn.setBackground(new java.awt.Color(51, 89, 150));
        updateemployeebtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updateemployeebtn.setForeground(new java.awt.Color(255, 255, 255));
        updateemployeebtn.setText("Update Employee");
        updateemployeebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateemployeebtnActionPerformed(evt);
            }
        });
        getContentPane().add(updateemployeebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 210, 200, 40));

        viewflightbtn.setBackground(new java.awt.Color(51, 89, 150));
        viewflightbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        viewflightbtn.setForeground(new java.awt.Color(255, 255, 255));
        viewflightbtn.setText("View Flight");
        viewflightbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewflightbtnActionPerformed(evt);
            }
        });
        getContentPane().add(viewflightbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, 200, 40));

        logoutbtn.setBackground(new java.awt.Color(255, 0, 0));
        logoutbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logoutbtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutbtn.setText("Logout");
        logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbtnActionPerformed(evt);
            }
        });
        getContentPane().add(logoutbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 0, -1, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HD-wallpaper-aircraft-airplane-s.jpg"))); // NOI18N
        jLabel2.setOpaque(true);
        jLabel2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                jLabel2ComponentMoved(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 940));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addflightbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addflightbtnActionPerformed
        AddFlights AddFlightFrame =new AddFlights();
        AddFlightFrame.setVisible(true);
         
        
    }//GEN-LAST:event_addflightbtnActionPerformed

    private void updateflightbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateflightbtnActionPerformed
        UpdateFlights UpdateFlightsFrame=new UpdateFlights(); 
        UpdateFlightsFrame.setVisible(true);
        
    }//GEN-LAST:event_updateflightbtnActionPerformed

    private void addemployeebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addemployeebtnActionPerformed
        AddEmployees AddEmployeesFrame=new AddEmployees();
        AddEmployeesFrame.setVisible(true);
       
    }//GEN-LAST:event_addemployeebtnActionPerformed

    private void updateemployeebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateemployeebtnActionPerformed
        UpdateEmployees UpdateEmployeesFrame=new UpdateEmployees();
        UpdateEmployeesFrame.setVisible(true);
    
    }//GEN-LAST:event_updateemployeebtnActionPerformed

    private void viewflightbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewflightbtnActionPerformed
        ViewsFlight ViewFlightsFrame=new ViewsFlight();       
        ViewFlightsFrame.setVisible(true);
        
    }//GEN-LAST:event_viewflightbtnActionPerformed

    private void jLabel2ComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel2ComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2ComponentMoved

    private void logoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtnActionPerformed
      this.dispose();
        LoginHome LoginHomeFrame = new LoginHome();
       LoginHomeFrame.setVisible(true);
       
        
    }//GEN-LAST:event_logoutbtnActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addemployeebtn;
    private javax.swing.JButton addflightbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JButton logoutbtn;
    private javax.swing.JButton updateemployeebtn;
    private javax.swing.JButton updateflightbtn;
    private javax.swing.JButton viewflightbtn;
    // End of variables declaration//GEN-END:variables
}
