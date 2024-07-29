
package jetpulse;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;


public class ViewEmployee extends javax.swing.JFrame {

    
    public ViewEmployee() {
        initComponents();
        
        
        try{
            Connection con= Conn.getConnection();
            
            Statement st = con.createStatement();
            String query ="Select * from addemployee";
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
            String Empid,FirstName, LastName, Gender, Email, Contact, Salary;
            while(rs.next())
            {
               Empid =rs.getString(1);
               FirstName =rs.getString(2);
               LastName =rs.getString(3);
               Gender =rs.getString(4);
               Email =rs.getString(5);
               Contact =rs.getString(6);
               Salary =rs.getString(7);
               
               String[] row= {Empid,FirstName, LastName,  Gender, Email, Contact, Salary};
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

        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Emp Id", "First Name", "Last Name", "Gender", "Email", "Contact", "Salary"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 330));

        closebtn.setBackground(new java.awt.Color(255, 0, 0));
        closebtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        closebtn.setForeground(new java.awt.Color(255, 255, 255));
        closebtn.setText("Close");
        closebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebtnActionPerformed(evt);
            }
        });
        getContentPane().add(closebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 90, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_closebtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closebtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
