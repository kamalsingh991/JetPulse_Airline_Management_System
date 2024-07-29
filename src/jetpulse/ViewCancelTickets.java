
package jetpulse;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;


public class ViewCancelTickets extends javax.swing.JFrame {

   
    public ViewCancelTickets() {
        initComponents();
        
         try{
            Connection con= Conn.getConnection();
            
            Statement st = con.createStatement();
            String query ="Select * from cancelflight";
            ResultSet rs = st.executeQuery(query);
            ResultSetMetaData rsmd = rs.getMetaData();
            
            DefaultTableModel dtm=(DefaultTableModel)jTable1.getModel();
            int cols = rsmd.getColumnCount();
            String[] colName = new String[cols];
            for(int i=0; i<cols;i++)
            {
                colName[i]=rsmd.getColumnName(i+1);
            }
            dtm.setColumnIdentifiers(colName);
            String TicketId, Name, Source, Destination, Class, Price, FlighCode, FlightName,JourneyDate, JourneyTime;
            while(rs.next())
            {
              
              TicketId =rs.getString(1);
              Name=rs.getString(2);
              Source=rs.getString(3);
               Destination =rs.getString(4);
              Class =rs.getString(5);
               Price =rs.getString(6); 
              FlighCode=rs.getString(7);
              FlightName=rs.getString(8);
              JourneyDate=rs.getString(9);
              JourneyTime=rs.getString(10);
               String[] row= {TicketId, Name, Source, Destination, Class, Price, FlighCode, FlightName,JourneyDate, JourneyTime};
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
        jTable1 = new javax.swing.JTable();
        closebtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ticket ID", "Name", "Source", "Destination", "Class", "Price", "Flight Code", "Flight Name", "Journey Date", "Journey Time"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 330));

        closebtn.setBackground(new java.awt.Color(255, 0, 0));
        closebtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        closebtn.setForeground(new java.awt.Color(255, 255, 255));
        closebtn.setText("Close");
        closebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebtnActionPerformed(evt);
            }
        });
        getContentPane().add(closebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 90, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebtnActionPerformed
       this.dispose();
    }//GEN-LAST:event_closebtnActionPerformed

  
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCancelTickets().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closebtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
