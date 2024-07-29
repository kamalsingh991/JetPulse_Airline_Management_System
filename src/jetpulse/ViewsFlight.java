
package jetpulse;
import java.sql.*;
import javax.swing.table.DefaultTableModel;


public class ViewsFlight extends javax.swing.JFrame {

    
    public ViewsFlight() {
        initComponents();
        
        try{
            Connection con= Conn.getConnection();
            
            Statement st = con.createStatement();
            String query ="Select * from addflight";
            ResultSet rs = st.executeQuery(query);
            ResultSetMetaData rsmd = rs.getMetaData();
            
            DefaultTableModel dtm=(DefaultTableModel)tbl_viewflights.getModel();
            int cols = rsmd.getColumnCount();
            String[] colName = new String[cols];
            for(int i=0; i<cols;i++)
            {
                colName[i]=rsmd.getColumnName(i+1);
            }
            dtm.setColumnIdentifiers(colName);
            String FlightNumber,FlightName,Source,Destination,Capacity,Classname,Price;
            while(rs.next())
            {
                FlightNumber=rs.getString(1);
                FlightName=rs.getString(2);
                Source=rs.getString(3);
                Destination =rs.getString(4);
                Capacity=rs.getString(5);
                Classname=rs.getString(6);
                Price=rs.getString(7);
                
                String[] row= {FlightNumber,FlightName,Source,Destination,Capacity,Classname,Price};
                dtm.addRow(row);
            }
            
            
        }catch(Exception e)
        {
            System.out.println("e");
        }
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_viewflights = new javax.swing.JTable();
        closebtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_viewflights.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tbl_viewflights.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight Number", "Flight Name", "Source", "Destination", "Capacity", "Class Name", "Price"
            }
        ));
        jScrollPane1.setViewportView(tbl_viewflights);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 330));

        closebtn.setBackground(new java.awt.Color(255, 0, 0));
        closebtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        closebtn.setForeground(new java.awt.Color(255, 255, 255));
        closebtn.setText("Close");
        closebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebtnActionPerformed(evt);
            }
        });
        getContentPane().add(closebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, 80, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_closebtnActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewsFlight().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closebtn;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tbl_viewflights;
    // End of variables declaration//GEN-END:variables
}
