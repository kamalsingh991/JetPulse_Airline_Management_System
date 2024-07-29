
package jetpulse;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.*;

public class UpdatePassengers extends javax.swing.JFrame {

    
    public UpdatePassengers() {
        initComponents();
        PassportNo();
    }
    
    private void PassportNo()
    {
        try{
            Connection con=Conn.getConnection();
            String sql="select * from addpassenger";
            PreparedStatement pstmt=con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
           
            
            
            while(rs.next())
            {
                String passport=rs.getString("passport");
                passporttxt.addItem(passport);
            }
            
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        combo_gender = new javax.swing.JComboBox<>();
        emailtxt = new javax.swing.JTextField();
        addresstxt = new javax.swing.JTextField();
        agetxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        phonetxt = new javax.swing.JTextField();
        nationalitytxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        updatebtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        passporttxt = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Update Passenger Details");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Age");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 50, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Address");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, -1, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Email Id");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, -1, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Gender");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 180, -1, 30));

        combo_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        getContentPane().add(combo_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 180, 170, 30));
        getContentPane().add(emailtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, 160, 30));
        getContentPane().add(addresstxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, 160, 30));
        getContentPane().add(agetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 160, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 60, 30));

        nametxt.setOpaque(true);
        getContentPane().add(nametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, 170, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Phone");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 240, -1, 30));

        phonetxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                phonetxtKeyPressed(evt);
            }
        });
        getContentPane().add(phonetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 240, 170, 30));
        getContentPane().add(nationalitytxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 300, 170, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Nationality");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 300, 80, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Passport No");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 120, 90, 30));

        updatebtn.setBackground(new java.awt.Color(0, 0, 153));
        updatebtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updatebtn.setForeground(new java.awt.Color(255, 255, 255));
        updatebtn.setText("Update");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        getContentPane().add(updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 510, 90, 30));

        backbtn.setBackground(new java.awt.Color(255, 0, 0));
        backbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backbtn.setForeground(new java.awt.Color(255, 255, 255));
        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        getContentPane().add(backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 510, 90, 30));

        passporttxt.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                passporttxtPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        getContentPane().add(passporttxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 120, 170, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vignette_66594OEEZJZAPOYUGJMN_cover.jpg"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(-160, 0, 1340, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_backbtnActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        
        try{
            
            Connection con =Conn.getConnection();
            
            PreparedStatement pstmt = con.prepareStatement("Update addpassenger set Name=?, Age=?, Address=?,Phone=?, Emai=?, Nationality=?,Gender=? where Passport=?");
            pstmt.setString(1,nametxt.getText() );
            pstmt.setInt(2, Integer.parseInt(agetxt.getText()));
            pstmt.setString(3, addresstxt.getText());
            pstmt.setLong(4,Long.parseLong(phonetxt.getText()));
            pstmt.setString(5, emailtxt.getText());          
            pstmt.setString(6, nationalitytxt.getText());
            pstmt.setString(7, String.valueOf(combo_gender.getSelectedItem()));
            
            pstmt.setString(8, String.valueOf(passporttxt.getSelectedItem()));
            
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Update Successfully");
       
        }
        catch(Exception e ){
            System.out.println(e);
        }
      
    }//GEN-LAST:event_updatebtnActionPerformed

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

    private void passporttxtPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_passporttxtPopupMenuWillBecomeInvisible
       
       String tmp =(String)passporttxt.getSelectedItem();
        String sql="select * from addpassenger where passport=?";
        try{
            Connection con= Conn.getConnection();
            PreparedStatement pstmt=con.prepareStatement(sql);
            pstmt.setString(1, tmp);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                String add1 =rs.getString("Name");
                nametxt.setText(add1);
                String add2 =rs.getString("Age");
                agetxt.setText(add2);
                String add3 =rs.getString("Address");
                addresstxt.setText(add3);
                String add4 =rs.getString("Phone");
                phonetxt.setText(add4);
                String add5 =rs.getString("Emai");
                emailtxt.setText(add5);
                String add6 =rs.getString("Nationality");
                nationalitytxt.setText(add6);
                String add7 =rs.getString("Gender");
                combo_gender.setSelectedItem(add7);
            }
        
         }catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_passporttxtPopupMenuWillBecomeInvisible

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdatePassengers().setVisible(true);
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
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nametxt;
    private javax.swing.JTextField nationalitytxt;
    private javax.swing.JComboBox<String> passporttxt;
    private javax.swing.JTextField phonetxt;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
