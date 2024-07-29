
package jetpulse;
import java.sql.*;
import javax.swing.*;

public class UpdateFlights extends javax.swing.JFrame {

    public UpdateFlights() {
        initComponents();
        FlightNumberCombo();
    
    }
    private void FlightNumberCombo()
    {
        try{
            Connection con=Conn.getConnection();
            String sql="select * from addflight";
            PreparedStatement pstmt=con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
                    
            while(rs.next())
            {
                String FlightNumber=rs.getString("FlightNumber");
                flightnumbertxt.addItem(FlightNumber);
            }
          
        }catch(Exception e){
            System.out.println(e);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        flightnametxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        combo_destination = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        capacitytxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        combo_classname = new javax.swing.JComboBox<>();
        pricetxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        delbtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        viewbtn = new javax.swing.JButton();
        combo_source = new javax.swing.JComboBox<>();
        flightnumbertxt = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("UPDATE FLIGHTS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Flight Number");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, 30));
        getContentPane().add(flightnametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 70, 170, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Flight Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, -1, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Source");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 50, 30));

        combo_destination.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Your Destination", "Delhi", "Patna", "Goa", "Ayodhya" }));
        getContentPane().add(combo_destination, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 120, 170, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Destination");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, -1, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Capacity");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, 30));
        getContentPane().add(capacitytxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 180, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Class Name");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, -1, 30));

        combo_classname.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Economy", "Bussiness" }));
        getContentPane().add(combo_classname, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 170, 170, 30));
        getContentPane().add(pricetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 180, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Price");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, 30));

        delbtn.setBackground(new java.awt.Color(255, 0, 0));
        delbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        delbtn.setForeground(new java.awt.Color(255, 255, 255));
        delbtn.setText("Delete");
        delbtn.setPreferredSize(new java.awt.Dimension(72, 27));
        delbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delbtnActionPerformed(evt);
            }
        });
        getContentPane().add(delbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 430, 90, 40));

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
        getContentPane().add(updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 430, 90, 40));

        backbtn.setBackground(new java.awt.Color(51, 255, 51));
        backbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backbtn.setForeground(new java.awt.Color(255, 255, 255));
        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        getContentPane().add(backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, 90, 40));

        viewbtn.setBackground(new java.awt.Color(51, 153, 255));
        viewbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        viewbtn.setForeground(new java.awt.Color(255, 255, 255));
        viewbtn.setText("View");
        viewbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtnActionPerformed(evt);
            }
        });
        getContentPane().add(viewbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, 90, 40));

        combo_source.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Your Source", "Delhi", "Patna", "Goa", "Ayodhya" }));
        getContentPane().add(combo_source, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 180, 30));

        flightnumbertxt.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                flightnumbertxtPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        flightnumbertxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightnumbertxtActionPerformed(evt);
            }
        });
        getContentPane().add(flightnumbertxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 180, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/airplane_GettyImages-1012117540.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
       
        this.dispose();
    }//GEN-LAST:event_backbtnActionPerformed

    private void viewbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbtnActionPerformed
       ViewsFlight ViewsFlightFrame = new ViewsFlight();
       ViewsFlightFrame.setVisible(true);
     
    }//GEN-LAST:event_viewbtnActionPerformed

    private void delbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delbtnActionPerformed
      
        
         try{
          Connection con=Conn.getConnection();
         
          PreparedStatement pstmt=con.prepareStatement("Delete from addflight where FlightNumber=?");
           pstmt.setString(1, String.valueOf(flightnumbertxt.getSelectedItem()));
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Delete Flight");
            
            
      }catch(Exception e){
          
      }
    }//GEN-LAST:event_delbtnActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
      try{
          Connection con=Conn.getConnection();
         
          PreparedStatement pstmt=con.prepareStatement("UPDATE addflight set Source=?,Destination=?,Price=?,Capacity=?,Classname=? where FlightNumber=?");
          
          
          pstmt.setString(1,String.valueOf(combo_source.getSelectedItem()));
          pstmt.setString(2, String.valueOf(combo_destination.getSelectedItem()));
          pstmt.setInt(3, Integer.parseInt(pricetxt.getText()));
          pstmt.setInt(4, Integer.parseInt(capacitytxt.getText()));
          pstmt.setString(5,String.valueOf(combo_classname.getSelectedItem()));
          pstmt.setString(6, String.valueOf(flightnumbertxt.getSelectedItem()));
          pstmt.executeUpdate();
          
         int insert=pstmt.executeUpdate();
            
            if(insert>0)
            JOptionPane.showMessageDialog(null, "Update Successful");
         
            combo_source.setSelectedItem("");
            combo_destination.setSelectedItem("");
            capacitytxt.setText("");
            combo_classname.setSelectedItem("");
            pricetxt.setText("");  
          
          
      }catch(Exception e){
          
      }

        // TODO add your handling code here:
    }//GEN-LAST:event_updatebtnActionPerformed

    private void flightnumbertxtPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_flightnumbertxtPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        
        String tmp =(String)flightnumbertxt.getSelectedItem();
        String sql="select * from addflight where FlightNumber=?";
        try{
            Connection con= Conn.getConnection();
 
            PreparedStatement pstmt=con.prepareStatement(sql);
            pstmt.setString(1, tmp);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                String add1 =rs.getString("FlightName");
                flightnametxt.setText(add1);
                String add2 =rs.getString("Source");
                combo_source.setSelectedItem(add2);
                String add3 =rs.getString("Destination");
                combo_destination.setSelectedItem(add3);
                String add4 =rs.getString("Capacity");
                capacitytxt.setText(add4);
                String add5 =rs.getString("Classname");
                combo_classname.setSelectedItem(add5);
                String add6 =rs.getString("Price");
                pricetxt.setText(add6);
            }
   
        }catch(Exception e)
        {
            System.out.println(e);
        }
        
    }//GEN-LAST:event_flightnumbertxtPopupMenuWillBecomeInvisible

    private void flightnumbertxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightnumbertxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_flightnumbertxtActionPerformed

  
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateFlights().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JTextField capacitytxt;
    private javax.swing.JComboBox<String> combo_classname;
    private javax.swing.JComboBox<String> combo_destination;
    private javax.swing.JComboBox<String> combo_source;
    private javax.swing.JButton delbtn;
    private javax.swing.JTextField flightnametxt;
    private javax.swing.JComboBox<String> flightnumbertxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField pricetxt;
    private javax.swing.JButton updatebtn;
    private javax.swing.JButton viewbtn;
    // End of variables declaration//GEN-END:variables
}
