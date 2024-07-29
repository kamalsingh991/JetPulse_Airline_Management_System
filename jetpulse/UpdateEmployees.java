
package jetpulse;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.*;

public class UpdateEmployees extends javax.swing.JFrame {

    
    public UpdateEmployees() {
        initComponents();
        EmployeeID();
    }
    
    private void EmployeeID()
    {
        try{
            Connection con=Conn.getConnection();
            String sql="select * from addemployee";
            PreparedStatement pstmt=con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
         
            while(rs.next())
            {
                String Empid=rs.getString("Empid");
                empid.addItem(Empid);
            }
     
        }catch(Exception e){
            System.out.println(e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        firstnmtxt = new javax.swing.JTextField();
        emailtxt = new javax.swing.JTextField();
        salarytxt = new javax.swing.JTextField();
        contacttxt = new javax.swing.JTextField();
        combo_gender = new javax.swing.JComboBox<>();
        lastnmtxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        backbtn = new javax.swing.JButton();
        viewbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        empid = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("First Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Email ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Salary");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 50, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Contact");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, -1, 15));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Gender");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, -1, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Last Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, -1, 30));
        getContentPane().add(firstnmtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 160, 30));
        getContentPane().add(emailtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 160, 30));
        getContentPane().add(salarytxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 160, 30));

        contacttxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                contacttxtKeyPressed(evt);
            }
        });
        getContentPane().add(contacttxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 160, 30));

        combo_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male ", "Female" }));
        getContentPane().add(combo_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 160, 30));
        getContentPane().add(lastnmtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 160, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("UPDATE EMPLOYEES");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, -1, -1));

        backbtn.setBackground(new java.awt.Color(51, 255, 51));
        backbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backbtn.setForeground(new java.awt.Color(255, 255, 255));
        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        getContentPane().add(backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 90, 40));

        viewbtn.setBackground(new java.awt.Color(51, 153, 255));
        viewbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        viewbtn.setForeground(new java.awt.Color(255, 255, 255));
        viewbtn.setText("View");
        viewbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtnActionPerformed(evt);
            }
        });
        getContentPane().add(viewbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, 90, 40));

        deletebtn.setBackground(new java.awt.Color(255, 0, 0));
        deletebtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deletebtn.setForeground(new java.awt.Color(255, 255, 255));
        deletebtn.setText("Delete");
        deletebtn.setPreferredSize(new java.awt.Dimension(72, 27));
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });
        getContentPane().add(deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, 90, 40));

        updatebtn.setBackground(new java.awt.Color(0, 0, 204));
        updatebtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updatebtn.setForeground(new java.awt.Color(255, 255, 255));
        updatebtn.setText("Update");
        updatebtn.setPreferredSize(new java.awt.Dimension(72, 27));
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        getContentPane().add(updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 470, 90, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Employee ID  :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        empid.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                empidPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        getContentPane().add(empid, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 170, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/top-view-office-blue-desk_50939-259.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        AdminDashboard AdminDashboardFrame = new AdminDashboard();
        AdminDashboardFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backbtnActionPerformed

    private void viewbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbtnActionPerformed
        ViewEmployee ViewEmployeeFrame = new ViewEmployee();
        ViewEmployeeFrame.setVisible(true);
    }//GEN-LAST:event_viewbtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        // TODO add your handling code here:
        try{
            Connection con =Conn.getConnection();
            
            PreparedStatement pstmt=con.prepareStatement("Delete from addemployee where Empid=?");
            pstmt.setString(1, String.valueOf(empid.getSelectedItem()));
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Delete Employee");
            
        }catch(Exception e)
        {
            System.out.println("e");
        }
        
        
    }//GEN-LAST:event_deletebtnActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        try{
            Connection con =Conn.getConnection();
            
            PreparedStatement pstmt=con.prepareStatement("Update addemployee set FirstName=?, LastName=?,Gender=?,Email=?,Contact=?,Salary=? where Empid=?");
            pstmt.setString(1, firstnmtxt.getText());
            pstmt.setString(2, lastnmtxt.getText());
            pstmt.setString(3, String.valueOf(combo_gender.getSelectedItem()));
            pstmt.setString(4, emailtxt.getText());
            pstmt.setLong(5,Long.parseLong(contacttxt.getText()));
            pstmt.setLong(6, Long.parseLong(salarytxt.getText()));             
            pstmt.setString(7, String.valueOf(empid.getSelectedItem()));
            pstmt.executeUpdate();
           
            
            int insert=pstmt.executeUpdate();
            if(insert>0)
                JOptionPane.showMessageDialog(null, "Update Successful");
            
                    
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        
    }//GEN-LAST:event_updatebtnActionPerformed

    private void contacttxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contacttxtKeyPressed
       String Contact=contacttxt.getText();      // String ptxtUser
        int length = Contact.length();           // length of String
        char c=evt.getKeyChar();
        
        //Check for number 0 to 9
        if(evt.getKeyChar()>='0'&& evt.getKeyChar()<='9')
        {
            // Check length not more than 10 digit
            if(length<10)
            {
                contacttxt.setEditable(true);
            }
            else
            {
                // not editable if length more than 10 digit
               contacttxt.setEditable(false);
            }
        }
        else
        {
            // Allow keys 'back space' and 'delete' for edit
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
            {
                contacttxt.setEditable(true);
            }
            else
            {
                contacttxt.setEditable(false);
            }
        }
    }//GEN-LAST:event_contacttxtKeyPressed

    private void empidPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_empidPopupMenuWillBecomeInvisible
        
        String tmp =(String)empid.getSelectedItem();
        String sql="select * from addemployee where Empid=?";
        try{
            Connection con= Conn.getConnection();
 
            PreparedStatement pstmt=con.prepareStatement(sql);
            pstmt.setString(1, tmp);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                String add1 =rs.getString("FirstName");
                firstnmtxt.setText(add1);
                String add2 =rs.getString("LastName");
                lastnmtxt.setText(add2);
                String add3 =rs.getString("Gender");
                combo_gender.setSelectedItem(add3);
                String add4 =rs.getString("Email");
                emailtxt.setText(add4);
                String add5 =rs.getString("Contact");
                contacttxt.setText(add5);
                String add6 =rs.getString("Salary");
                salarytxt.setText(add6);
            }
        
         }catch(Exception e)
        {
            System.out.println(e);
        }
      
    }//GEN-LAST:event_empidPopupMenuWillBecomeInvisible

    
    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateEmployees().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JComboBox<String> combo_gender;
    private javax.swing.JTextField contacttxt;
    private javax.swing.JButton deletebtn;
    private javax.swing.JTextField emailtxt;
    private javax.swing.JComboBox<String> empid;
    private javax.swing.JTextField firstnmtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField lastnmtxt;
    private javax.swing.JTextField salarytxt;
    private javax.swing.JButton updatebtn;
    private javax.swing.JButton viewbtn;
    // End of variables declaration//GEN-END:variables
}
