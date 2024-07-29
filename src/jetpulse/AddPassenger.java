
package jetpulse;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.*;

public class AddPassenger extends javax.swing.JFrame {
  
    public AddPassenger() {
        initComponents();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        combo_gender = new javax.swing.JComboBox<>();
        emailtxt = new javax.swing.JTextField();
        addresstxt = new javax.swing.JTextField();
        agetxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        passporttxt = new javax.swing.JTextField();
        nationalitytxt = new javax.swing.JTextField();
        phonetxt = new javax.swing.JTextField();
        nametxt = new javax.swing.JTextField();
        submitbtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ADD PASSENGERS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Age");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Address");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Email Id");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Gender");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, -1, 30));

        combo_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        getContentPane().add(combo_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 160, 30));
        getContentPane().add(emailtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 160, 30));
        getContentPane().add(addresstxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 160, 30));
        getContentPane().add(agetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 160, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Phone");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, -1, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Nationality");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, -1, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Passport No");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, -1, 30));
        getContentPane().add(passporttxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, 160, 30));
        getContentPane().add(nationalitytxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 160, 30));

        phonetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonetxtActionPerformed(evt);
            }
        });
        phonetxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                phonetxtKeyPressed(evt);
            }
        });
        getContentPane().add(phonetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, 160, 30));
        getContentPane().add(nametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 160, 30));

        submitbtn.setBackground(new java.awt.Color(0, 0, 153));
        submitbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        submitbtn.setForeground(new java.awt.Color(255, 255, 255));
        submitbtn.setText("Submit");
        submitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbtnActionPerformed(evt);
            }
        });
        getContentPane().add(submitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, 100, 30));

        backbtn.setBackground(new java.awt.Color(255, 0, 0));
        backbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backbtn.setForeground(new java.awt.Color(255, 255, 255));
        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        getContentPane().add(backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 100, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/183320.jpg"))); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
                                            
        
 private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {    
      this.dispose();
    }                                       

    private void submitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbtnActionPerformed
  String Name= nametxt.getText();
        int Age=Integer.parseInt(agetxt.getText());
        String Address = addresstxt.getText();
        long Phone = Long.parseLong(phonetxt.getText());
        String Emai= emailtxt.getText();
        String Nationality = nationalitytxt.getText();
        String Gender= String.valueOf(combo_gender.getSelectedItem());
        String Passport = passporttxt.getText();
       
       try
       {
           Connection con = Conn.getConnection();
     
           String str = "Insert into addpassenger (Name,Age,Address,Phone,Emai,Nationality,Gender,Passport) values(?,?,?,?,?,?,?,?)";
           PreparedStatement pstmt=con.prepareStatement(str);
           
          pstmt.setString(1, Name);
          pstmt.setInt(2, Age);
          pstmt.setString(3, Address);
          pstmt.setLong(4, Phone);
          pstmt.setString(5, Emai);
          pstmt.setString(6, Nationality);
          pstmt.setString(7, Gender);
          pstmt.setString(8, Passport);
   
          int insert=pstmt.executeUpdate();
          if (insert>0)
              JOptionPane.showMessageDialog(null, "Add Passemger");
      
       }catch(Exception e)
       {
           System.out.println("e");
       }
   
    }//GEN-LAST:event_submitbtnActionPerformed

    private void phonetxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phonetxtKeyPressed
        String Contact=phonetxt.getText();      // String ptxtUser
        int length = Contact.length();           // length of String
        char c=evt.getKeyChar();
        
        //Check for number 0 to 9
        if(evt.getKeyChar()>='0'&& evt.getKeyChar()<='9')
        {
            // Check length not more than 10 digit
            if(length<10)
            {
                phonetxt.setEditable(true);
            }
            else
            {
                // not editable if length more than 10 digit
               phonetxt.setEditable(false);
            }
        }
        else
        {
            // Allow keys 'back space' and 'delete' for edit
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
            {
                phonetxt.setEditable(true);
            }
            else
            {
               phonetxt.setEditable(false);
            }
        }
    }//GEN-LAST:event_phonetxtKeyPressed

    private void phonetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phonetxtActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddPassenger().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addresstxt;
    private javax.swing.JTextField agetxt;
    private javax.swing.JButton backbtn;
    private javax.swing.JComboBox<String> combo_gender;
    private javax.swing.JTextField emailtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField nametxt;
    private javax.swing.JTextField nationalitytxt;
    private javax.swing.JTextField passporttxt;
    private javax.swing.JTextField phonetxt;
    private javax.swing.JButton submitbtn;
    // End of variables declaration//GEN-END:variables
}
