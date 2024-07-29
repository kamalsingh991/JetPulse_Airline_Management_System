
package jetpulse;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.util.regex.Pattern;
import javax.swing.*;


public class AddEmployees extends javax.swing.JFrame {

   
    public AddEmployees() {
        initComponents();
       
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        firstnmtxt = new javax.swing.JTextField();
        lastnmtxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        combo_gender = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        emailtxt = new javax.swing.JTextField();
        contacttxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        salarytxt = new javax.swing.JTextField();
        backbtn = new javax.swing.JButton();
        registerbtn = new javax.swing.JButton();
        viewbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Registation Form");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 260, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("First Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, -1, 30));

        firstnmtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnmtxtActionPerformed(evt);
            }
        });
        getContentPane().add(firstnmtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 160, 30));
        getContentPane().add(lastnmtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 100, 160, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Last Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 100, -1, 30));

        combo_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male ", "Female" }));
        getContentPane().add(combo_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 160, 160, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Gender");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 170, -1, 16));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Email ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, -1, 30));

        emailtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailtxtActionPerformed(evt);
            }
        });
        getContentPane().add(emailtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, 160, 30));

        contacttxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contacttxtActionPerformed(evt);
            }
        });
        contacttxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                contacttxtKeyPressed(evt);
            }
        });
        getContentPane().add(contacttxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 220, 160, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Contact");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 230, -1, 15));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Salary");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 50, 30));
        getContentPane().add(salarytxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 220, 160, 30));

        backbtn.setBackground(new java.awt.Color(255, 0, 0));
        backbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backbtn.setForeground(new java.awt.Color(255, 255, 255));
        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        getContentPane().add(backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 470, 110, 40));

        registerbtn.setBackground(new java.awt.Color(0, 0, 204));
        registerbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        registerbtn.setForeground(new java.awt.Color(255, 255, 255));
        registerbtn.setText("Register");
        registerbtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        registerbtn.setMaximumSize(new java.awt.Dimension(77, 27));
        registerbtn.setMinimumSize(new java.awt.Dimension(77, 27));
        registerbtn.setPreferredSize(new java.awt.Dimension(77, 27));
        registerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerbtnActionPerformed(evt);
            }
        });
        getContentPane().add(registerbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 470, 110, 40));

        viewbtn.setBackground(new java.awt.Color(51, 255, 0));
        viewbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        viewbtn.setForeground(new java.awt.Color(255, 255, 255));
        viewbtn.setText("View");
        viewbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtnActionPerformed(evt);
            }
        });
        getContentPane().add(viewbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 470, 110, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flat-design-work-table-1-for-copy-space-in-blue-background-space-for-add-text-announcement-advertisement-massage-and-other-free-vector (1).jpg"))); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void registerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerbtnActionPerformed
        
        
        String FirstName=firstnmtxt.getText();
        String LastName=lastnmtxt.getText();     
        String Gender=String.valueOf(combo_gender.getSelectedItem());
        String Email=emailtxt.getText();
        long Contact = Long.parseLong(contacttxt.getText());
        long Salary = Long.parseLong(salarytxt.getText());
      if(Email == null || Email.isEmpty())
                {
                    JOptionPane.showMessageDialog(null,"Please Fill Email" );
                }
            String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+   "[a-zA-Z0-9_+&*-]+)*@"+  "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
          
                Pattern pattern = Pattern.compile(emailRegex);
                 if (pattern.matcher(Email).matches())
                {
                  JOptionPane.showMessageDialog(null,"Valid Email");
                }
                 else{
                        JOptionPane.showMessageDialog(null,"Invalid  Email");
                        emailtxt.setText("");
                    }
        
        
        try{
            Connection con=Conn.getConnection();
            
            
            String str="insert into addemployee( FirstName, LastName,  Gender, Email, Contact, Salary) values(?,?,?,?,?,?)";
            PreparedStatement pstmt=con.prepareStatement(str);
            pstmt.setString(1,FirstName);
            pstmt.setString(2, LastName);
         
            pstmt.setString(3, Gender);
            pstmt.setString(4,Email);
            pstmt.setLong(5, Contact);
            pstmt.setLong(6, Salary);
        
            
            int insert=pstmt.executeUpdate();
            if(insert>0)
                JOptionPane.showMessageDialog(null,"New Employee Added ");
            
            
            
                
            
            
            
            
        }catch(Exception e)
        {
            System.out.println(e);
        }
            
    }//GEN-LAST:event_registerbtnActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_backbtnActionPerformed

    private void viewbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbtnActionPerformed
        // TODO add your handling code here:
        ViewEmployee ViewEmployeeFrame = new ViewEmployee();
        ViewEmployeeFrame.setVisible(true);
    }//GEN-LAST:event_viewbtnActionPerformed

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

    private void contacttxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contacttxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contacttxtActionPerformed

    private void firstnmtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnmtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnmtxtActionPerformed

    private void emailtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailtxtActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_emailtxtActionPerformed

    

    public static void main(String args[]) {
    
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployees().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JComboBox<String> combo_gender;
    private javax.swing.JTextField contacttxt;
    private javax.swing.JTextField emailtxt;
    private javax.swing.JTextField firstnmtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField lastnmtxt;
    private javax.swing.JButton registerbtn;
    private javax.swing.JTextField salarytxt;
    private javax.swing.JButton viewbtn;
    // End of variables declaration//GEN-END:variables
}
