
package jetpulse;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;


public class ViewPassenger extends javax.swing.JFrame {

   
    public ViewPassenger() {
        initComponents();
        
         try{
            Connection con= Conn.getConnection();
            
            Statement st = con.createStatement();
            String query ="Select * from addpassenger";
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
            String Name,Gender,Age,Phone,Email,Address,Nationality,Passport;
            while(rs.next())
            {
              
              Name =rs.getString(1);
              Gender=rs.getString(2);
              Age=rs.getString(3);
              Phone =rs.getString(4);
              Email =rs.getString(5);
              Address =rs.getString(6); 
              Nationality=rs.getString(7);
              Passport=rs.getString(8);
               String[] row= {Name,Gender,Age,Phone,Email,Address,Nationality,Passport};
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)))));
        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Age", "Address", "Phone", "Email", "Nationality", "Gender", "Passport Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 228));

        closebtn.setBackground(new java.awt.Color(255, 0, 0));
        closebtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        closebtn.setForeground(new java.awt.Color(255, 255, 255));
        closebtn.setText("Close");
        closebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebtnActionPerformed(evt);
            }
        });
        getContentPane().add(closebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 90, 30));

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
                new ViewPassenger().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closebtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
