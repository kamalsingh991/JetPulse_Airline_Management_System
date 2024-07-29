
package jetpulse;
import java.sql.*;

import javax.swing.*;

public class BookFlights extends javax.swing.JFrame {

    
    public BookFlights() {
        initComponents();
        PassportNo();
//         FlightNumberCombo;
    }
    private void FlightNumberCombo()
    {
        String Source = String.valueOf(combo_source.getSelectedItem());
        String Destination = String.valueOf(combo_destination.getSelectedItem());
        try{
//            String Source = String.valueOf(combo_source.getSelectedItem());
//            String Destination = String.valueOf(combo_destination.getSelectedItem());
            Connection con=Conn.getConnection();
            String sql="select FlightNumber from addflight where Source = '"+Source+"' AND Destination = '"+Destination+"'";
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

        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        combo_source = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        flightnametxt = new javax.swing.JTextField();
        pricetxt = new javax.swing.JTextField();
        combo_destination = new javax.swing.JComboBox<>();
        nametxt = new javax.swing.JTextField();
        bookbtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        combo_class = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        journeytimetxt = new javax.swing.JTextField();
        journeydatetxt = new javax.swing.JTextField();
        flightnumbertxt = new javax.swing.JComboBox<>();
        passporttxt = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Passport No");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Source");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 70, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Class");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Flight Number");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, 30));

        combo_source.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Your Source", "Delhi", "Patna", "Goa", "Ayodhya" }));
        getContentPane().add(combo_source, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 180, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Name");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, -1, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Destination");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, -1, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Price");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, -1, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Flight Name");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, -1, 30));
        getContentPane().add(flightnametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, 180, 30));
        getContentPane().add(pricetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 180, 30));

        combo_destination.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Your Source", "Delhi", "Patna", "Goa", "Ayodhya" }));
        combo_destination.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                combo_destinationMouseClicked(evt);
            }
        });
        combo_destination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_destinationActionPerformed(evt);
            }
        });
        getContentPane().add(combo_destination, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, 180, 30));
        getContentPane().add(nametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 180, 30));

        bookbtn.setBackground(new java.awt.Color(0, 0, 255));
        bookbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bookbtn.setForeground(new java.awt.Color(255, 255, 255));
        bookbtn.setText("Book");
        bookbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookbtnActionPerformed(evt);
            }
        });
        getContentPane().add(bookbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 470, 100, 40));

        backbtn.setBackground(new java.awt.Color(255, 0, 0));
        backbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backbtn.setForeground(new java.awt.Color(255, 255, 255));
        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        getContentPane().add(backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, 90, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Book JetPulse Airlines Flight");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        combo_class.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Economy ", "Business" }));
        getContentPane().add(combo_class, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 180, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Journey Date");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Journey Time");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, -1, 30));

        journeytimetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                journeytimetxtActionPerformed(evt);
            }
        });
        getContentPane().add(journeytimetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, 180, 30));
        getContentPane().add(journeydatetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 180, 30));

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
        getContentPane().add(flightnumbertxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 180, 30));

        passporttxt.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                passporttxtPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        passporttxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passporttxtActionPerformed(evt);
            }
        });
        getContentPane().add(passporttxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 180, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/top-view-white-toy-airplane-model-blue-color-background-concept-travel_43448-410.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        
        this.dispose();
        
    }//GEN-LAST:event_backbtnActionPerformed

    private void bookbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookbtnActionPerformed
        
        String TicketId =String.valueOf(passporttxt.getSelectedItem());
        String Name = nametxt.getText();
        String Source = String.valueOf(combo_source.getSelectedItem());
        String Destination = String.valueOf(combo_destination.getSelectedItem());
        String Class = String.valueOf(combo_class.getSelectedItem());
        int Price = Integer.parseInt(pricetxt.getText());
        String FlighCode=String.valueOf(flightnumbertxt.getSelectedItem());
        String FlightName = flightnametxt.getText();
        String JourneyDate= journeydatetxt.getText();
        String JourneyTime= journeytimetxt.getText();
      
        try{
            Connection con = Conn.getConnection();
            String str="Insert into bookflight (TicketId, Name, Source, Destination, Class, Price, FlighCode, FlightName,JourneyDate, JourneyTime) values (?, ?, ?, ?, ?, ?, ?, ?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(str);
            
            pstmt.setString(1, TicketId);
            pstmt.setString(2, Name);
            pstmt.setString(3, Source);
            pstmt.setString(4, Destination);
            pstmt.setString(5, Class);
            pstmt.setInt(6, Price);
            pstmt.setString(7, FlighCode);
            pstmt.setString(8, FlightName);
            pstmt.setString(9, JourneyDate);
            pstmt.setString(10, JourneyTime);
   
            int insert = pstmt.executeUpdate();
            
            if(insert>0)
                JOptionPane.showMessageDialog(null, "Book Flight");
    
            pstmt.executeUpdate();
        }catch(Exception e)
        {
            System.out.println(e);
        }
        
        
    }//GEN-LAST:event_bookbtnActionPerformed

    private void journeytimetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_journeytimetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_journeytimetxtActionPerformed

    private void flightnumbertxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightnumbertxtActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_flightnumbertxtActionPerformed

    private void combo_destinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_destinationActionPerformed
        // TODO add your handling code here:
//        FlightNumberCombo();
    }//GEN-LAST:event_combo_destinationActionPerformed

    private void combo_destinationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combo_destinationMouseClicked
FlightNumberCombo();        // TODO add your handling code here:
    }//GEN-LAST:event_combo_destinationMouseClicked

    private void passporttxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passporttxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passporttxtActionPerformed

    private void passporttxtPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_passporttxtPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        
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
                 }
        
         }catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_passporttxtPopupMenuWillBecomeInvisible

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
                String add2 =rs.getString("Classname");
                combo_class.setSelectedItem(add2);
                String add3 =rs.getString("Price");
                pricetxt.setText(add3);
            }
         
        }catch(Exception e)
        {
            System.out.println(e);
        }
        
    }//GEN-LAST:event_flightnumbertxtPopupMenuWillBecomeInvisible

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookFlights().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JButton bookbtn;
    private javax.swing.JComboBox<String> combo_class;
    private javax.swing.JComboBox<String> combo_destination;
    private javax.swing.JComboBox<String> combo_source;
    private javax.swing.JTextField flightnametxt;
    private javax.swing.JComboBox<String> flightnumbertxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField journeydatetxt;
    private javax.swing.JTextField journeytimetxt;
    private javax.swing.JTextField nametxt;
    private javax.swing.JComboBox<String> passporttxt;
    private javax.swing.JTextField pricetxt;
    // End of variables declaration//GEN-END:variables
}
