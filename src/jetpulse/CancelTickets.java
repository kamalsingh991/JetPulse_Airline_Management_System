
package jetpulse;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class CancelTickets extends javax.swing.JFrame {

    
    public CancelTickets() {
        initComponents();
        TicketId();
    }
     private void TicketId()
    {
        try{
            Connection con=Conn.getConnection();
            String sql="select * from bookflight";
            PreparedStatement pstmt=con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
 
            while(rs.next())
            {
                String TicketId=rs.getString("TicketId");
                jComboBox1.addItem(TicketId);
            }
            
            
        }catch(Exception e){
            System.out.println(e);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        flightcodetxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        flightnametxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pricetxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();
        cancelflightbtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        journeydatetxt = new javax.swing.JTextField();
        journeytimetxt = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        combo_source = new javax.swing.JTextField();
        combo_destination = new javax.swing.JTextField();
        combo_class = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cancel Your Flight Ticket");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Ticket Id");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, -1, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Source");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 70, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Class");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, 60, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Flight Code");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, -1, 30));
        getContentPane().add(flightcodetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 280, 180, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Journey Date");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, -1, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Journey Time");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 340, -1, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Flight Name");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 270, -1, 50));
        getContentPane().add(flightnametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 280, 180, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Price");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 220, 50, 30));
        getContentPane().add(pricetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 220, 180, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Destination");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 160, -1, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Name");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 100, -1, 30));
        getContentPane().add(nametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 100, 180, 30));

        cancelflightbtn.setBackground(new java.awt.Color(0, 0, 204));
        cancelflightbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancelflightbtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelflightbtn.setText("Cancel Flight");
        cancelflightbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelflightbtnActionPerformed(evt);
            }
        });
        getContentPane().add(cancelflightbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 480, 130, 40));

        backbtn.setBackground(new java.awt.Color(255, 0, 0));
        backbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backbtn.setForeground(new java.awt.Color(255, 255, 255));
        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        getContentPane().add(backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 480, 110, 40));
        getContentPane().add(journeydatetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 340, 180, 30));
        getContentPane().add(journeytimetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 340, 180, 30));

        jComboBox1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox1PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 100, 180, 30));

        combo_source.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_sourceActionPerformed(evt);
            }
        });
        getContentPane().add(combo_source, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, 180, 30));
        getContentPane().add(combo_destination, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 162, 180, 30));
        getContentPane().add(combo_class, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 220, 180, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniature-toy-airplane-colorful-paper-background_200694-69.jpg"))); // NOI18N
        jLabel13.setMaximumSize(new java.awt.Dimension(1350, 1080));
        jLabel13.setMinimumSize(new java.awt.Dimension(1350, 1080));
        jLabel13.setPreferredSize(new java.awt.Dimension(1350, 1080));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
       this.dispose();
    }//GEN-LAST:event_backbtnActionPerformed

    private void jComboBox1PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox1PopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        
        String tmp =(String)jComboBox1.getSelectedItem();
        String sql="select * from bookflight where TicketId=?";
        try{
            Connection con= Conn.getConnection();
 
            PreparedStatement pstmt=con.prepareStatement(sql);
            pstmt.setString(1, tmp);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                String add1 =rs.getString("Name");
                nametxt.setText(add1);
                String add2 =rs.getString("Source");
                combo_source.setText(add2);
                String add3 =rs.getString("Destination");
                combo_destination.setText(add3);  
                String add4 =rs.getString("Class");
                combo_class.setText(add4);
                String add6 =rs.getString("Price");
                pricetxt.setText(add6);
                String add7 =rs.getString("FlighCode");
                flightcodetxt.setText(add7);
                String add8 =rs.getString("FlightName");
               flightnametxt.setText(add8);  
                String add9 =rs.getString("JourneyDate");
                journeydatetxt.setText(add9);
                String add10 =rs.getString("JourneyTime");
                journeytimetxt.setText(add10);
                
            }
        
         }catch(Exception e)
        {
            System.out.println(e);
        }
        
    }//GEN-LAST:event_jComboBox1PopupMenuWillBecomeInvisible

    private void cancelflightbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelflightbtnActionPerformed
        // TODO add your handling code here:
        String TicketId =String.valueOf(jComboBox1.getSelectedItem());
        String Name = nametxt.getText();
        String Source = (combo_source.getText());
        String Destination = (combo_destination.getText());
        String Class = (combo_class.getText());
        int Price = Integer.parseInt(pricetxt.getText());
        String FlighCode=String.valueOf(flightcodetxt.getText());
        String FlightName = flightnametxt.getText();
        String JourneyDate= journeydatetxt.getText();
        String JourneyTime= journeytimetxt.getText();
        
       
        
        
        
        
        try{
            Connection con = Conn.getConnection();       
              String str = "delete from bookflight where TicketId = ?";
            PreparedStatement pstmt = con.prepareStatement(str);
            
            pstmt.setString(1, TicketId);
  
            int insert = pstmt.executeUpdate();
            
            if(insert>0)
                JOptionPane.showMessageDialog(null, "Cancel Flight");
    
            pstmt.executeUpdate();
        }catch(Exception e)
        {
            System.out.println(e);
        }
        
        try{
             
            Connection con = Conn.getConnection();
            String str="Insert into cancelflight (TicketId, Name, Source, Destination, Class, Price, FlighCode, FlightName,JourneyDate, JourneyTime) values (?, ?, ?, ?, ?, ?, ?, ?,?,?)";

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
   
            pstmt.executeUpdate();
        }
        
        
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        
    }//GEN-LAST:event_cancelflightbtnActionPerformed

    private void combo_sourceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_sourceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_sourceActionPerformed

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
            java.util.logging.Logger.getLogger(CancelTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CancelTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CancelTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CancelTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CancelTickets().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JButton cancelflightbtn;
    private javax.swing.JTextField combo_class;
    private javax.swing.JTextField combo_destination;
    private javax.swing.JTextField combo_source;
    private javax.swing.JTextField flightcodetxt;
    private javax.swing.JTextField flightnametxt;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JTextField pricetxt;
    // End of variables declaration//GEN-END:variables
}
