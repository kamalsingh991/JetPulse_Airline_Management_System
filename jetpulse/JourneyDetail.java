
package jetpulse;
import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class JourneyDetail extends javax.swing.JFrame {

   
    public JourneyDetail() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        combo_source = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        combo_destination = new javax.swing.JComboBox<>();
        closebtn = new javax.swing.JButton();
        searchbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel4.setText("Journey Flights");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, -10, 360, 80));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Source");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 100, 40));

        combo_source.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Your Source", "Delhi", "Patna", "Goa", "Ayodhya" }));
        getContentPane().add(combo_source, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, 210, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Destination");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 110, 40));

        combo_destination.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Your Destination", "Delhi", "Patna", "Goa", "Ayodhya" }));
        getContentPane().add(combo_destination, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, 210, 40));

        closebtn.setBackground(new java.awt.Color(255, 0, 0));
        closebtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        closebtn.setForeground(new java.awt.Color(255, 255, 255));
        closebtn.setText("Close");
        closebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebtnActionPerformed(evt);
            }
        });
        getContentPane().add(closebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 100, 40));

        searchbtn.setBackground(new java.awt.Color(0, 0, 204));
        searchbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchbtn.setForeground(new java.awt.Color(255, 255, 255));
        searchbtn.setText("Search");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });
        getContentPane().add(searchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 270, 100, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ticket Id", "Source", "Destination", "Class", "Price", "Flight Code", "Flight Name", "Name"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 1170, 320));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1523513-airplane-wallpapers-1920x1080-4k.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, 0, 1920, 840));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
       String source = String.valueOf(combo_source.getSelectedItem());
      String destination = String.valueOf(combo_destination.getSelectedItem());
        
        try{
            Connection con = Conn.getConnection();
            String q = "Select * from bookflight where Source ='"+source+"' and Destination = '"+destination+"'";
            PreparedStatement pstm = con.prepareStatement(q);
            ResultSet rs = pstm.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            
            DefaultTableModel dtm=(DefaultTableModel)jTable1.getModel();
            int cols = rsmd.getColumnCount();
            String[] colName = new String[cols];
            for(int i=0; i<cols;i++)
            {
                colName[i]=rsmd.getColumnName(i+1);
            }
            dtm.setColumnIdentifiers(colName);
            String TicketId,Name,Source,Destination,Class,Price,FlighCode,FlightName,JourneyDate,JourneyTime;
            
            while(rs.next())
            {
                              
             TicketId = rs.getString(1);
              Name =rs.getString(2);
              Source =rs.getString(3);
              Destination =rs.getString(4);      
              Class =rs.getString(5);
              Price =rs.getString(6);  
              FlighCode =rs.getString(7);
              FlightName =rs.getString(8);   
               JourneyDate=rs.getString(9);
               JourneyTime=rs.getString(10);
              String[] row= {TicketId,Name,Source,Destination,Class,Price,FlighCode,FlightName,JourneyDate,JourneyTime};
                dtm.addRow(row);

                
            }
        }catch(Exception e)
        {
            System.out.println(e);
        }
        
        
        
        
    }//GEN-LAST:event_searchbtnActionPerformed

    private void closebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_closebtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JourneyDetail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closebtn;
    private javax.swing.JComboBox<String> combo_destination;
    private javax.swing.JComboBox<String> combo_source;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton searchbtn;
    // End of variables declaration//GEN-END:variables
}
