
package jetpulse;
import java.sql.*;
import javax.swing.JOptionPane;




public class AddFlights extends javax.swing.JFrame {

    
    public AddFlights() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        flightnotxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        combo_source = new javax.swing.JComboBox<>();
        flightnametxt = new javax.swing.JTextField();
        combo_destination = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        capacitytxt = new javax.swing.JTextField();
        combo_classname = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pricetxt = new javax.swing.JTextField();
        backbtn = new javax.swing.JButton();
        addbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ADD FLIGHTS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));
        getContentPane().add(flightnotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 170, 31));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Flight Number");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Flight Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, -1, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Source");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, 30));

        combo_source.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Your Source", "Delhi", "Patna", "Goa", "Ayodhya" }));
        combo_source.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_sourceActionPerformed(evt);
            }
        });
        getContentPane().add(combo_source, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 170, 31));
        getContentPane().add(flightnametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 100, 185, 31));

        combo_destination.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Your Destination", "Delhi", "Patna", "Goa", "Ayodhya" }));
        combo_destination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_destinationActionPerformed(evt);
            }
        });
        getContentPane().add(combo_destination, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 160, 185, 31));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Destination");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, -1, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Capacity");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, 30));
        getContentPane().add(capacitytxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 170, 31));

        combo_classname.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Economy", "Business" }));
        getContentPane().add(combo_classname, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 230, 185, 31));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Class Name");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, -1, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Price");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 50, 30));

        pricetxt.setMinimumSize(new java.awt.Dimension(64, 31));
        getContentPane().add(pricetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 170, 31));

        backbtn.setBackground(new java.awt.Color(255, 0, 0));
        backbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backbtn.setForeground(new java.awt.Color(255, 255, 255));
        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        getContentPane().add(backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 540, 120, 40));

        addbtn.setBackground(new java.awt.Color(0, 0, 204));
        addbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addbtn.setForeground(new java.awt.Color(255, 255, 255));
        addbtn.setText("ADD");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });
        getContentPane().add(addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 540, 120, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/top-view-white-toy-airplane-model-blue-color-background-concept-travel_43448-410.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        
        
        int FlightNumber=Integer.parseInt(flightnotxt.getText());
        String FlightName=flightnametxt.getText();
        String Source = String.valueOf(combo_source.getSelectedItem());
        String Destination = String.valueOf(combo_destination.getSelectedItem());
        int Capacity=Integer.parseInt(capacitytxt.getText());
        String Classname=String.valueOf(combo_classname.getSelectedItem());
        int Price=Integer.parseInt(pricetxt.getText());
        
        
        
        try{
            Connection con=Conn.getConnection();
            

      
            
            String str="insert into addflight (FlightNumber,FlightName,Source,Destination,Capacity,Classname,Price) values(?,?,?,?,?,?,?)";
            PreparedStatement pstmt=con.prepareStatement(str);
            pstmt.setInt(1,FlightNumber);
            pstmt.setString(2, FlightName);
            pstmt.setString(3,Source);
            pstmt.setString(4, Destination);
            pstmt.setInt(5, Capacity);
            pstmt.setString(6, Classname);
            pstmt.setInt(7, Price);
            
            
            int insert=pstmt.executeUpdate();
            
            if(insert>0)
            JOptionPane.showMessageDialog(null, "Added Successful");
            
            flightnotxt.setText("");
            flightnametxt.setText("");      
            combo_source.setSelectedItem("");
            combo_destination.setSelectedItem("");
            capacitytxt.setText("");
            combo_classname.setSelectedItem("");
            pricetxt.setText("");     
                    
                    
        }catch(Exception e)
        {
            System.out.println(e);
        }
        
    }//GEN-LAST:event_addbtnActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
//        
        this.dispose();
    }//GEN-LAST:event_backbtnActionPerformed

    private void combo_sourceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_sourceActionPerformed
        
        
        
        
    }//GEN-LAST:event_combo_sourceActionPerformed

    private void combo_destinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_destinationActionPerformed

    }//GEN-LAST:event_combo_destinationActionPerformed

    
    public static void main(String args[]) {
         
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddFlights().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JButton backbtn;
    private javax.swing.JTextField capacitytxt;
    private javax.swing.JComboBox<String> combo_classname;
    private javax.swing.JComboBox<String> combo_destination;
    private javax.swing.JComboBox<String> combo_source;
    private javax.swing.JTextField flightnametxt;
    private javax.swing.JTextField flightnotxt;
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
    // End of variables declaration//GEN-END:variables
}
