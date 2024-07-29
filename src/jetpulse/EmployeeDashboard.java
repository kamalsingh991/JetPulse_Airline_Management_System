
package jetpulse;

public class EmployeeDashboard extends javax.swing.JFrame {

    public EmployeeDashboard() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logoutbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        addpassengerprofilemenu = new javax.swing.JMenuItem();
        viewpassengerprofilemenu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        updatepassengerprofilemenu = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        bookflightmenu = new javax.swing.JMenuItem();
        viewbookedflightmenu = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        journeydetailsmenu = new javax.swing.JMenuItem();
        flightzonemenu = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        cancelticketmenu = new javax.swing.JMenuItem();
        viewcancelticket = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoutbtn.setBackground(new java.awt.Color(255, 0, 0));
        logoutbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logoutbtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutbtn.setText("Logout");
        logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbtnActionPerformed(evt);
            }
        });
        jPanel1.add(logoutbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1460, 0, -1, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Airport-Boeing-737-Aviation-Background-1920x1080.jpg"))); // NOI18N
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-310, 0, 1910, 860));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 860));

        jMenuBar1.setBorderPainted(false);
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuBar1.setMargin(new java.awt.Insets(4, 5, 3, 50));
        jMenuBar1.setMaximumSize(new java.awt.Dimension(1080, 32773));
        jMenuBar1.setMinimumSize(new java.awt.Dimension(1080, 32));
        jMenuBar1.setName(""); // NOI18N
        jMenuBar1.setOpaque(true);
        jMenuBar1.setPreferredSize(new java.awt.Dimension(1080, 32));

        jMenu1.setText("Passenger Profile");
        jMenu1.setToolTipText("");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        addpassengerprofilemenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addpassengerprofilemenu.setText("Add Passenger Profile");
        addpassengerprofilemenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addpassengerprofilemenuActionPerformed(evt);
            }
        });
        jMenu1.add(addpassengerprofilemenu);

        viewpassengerprofilemenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        viewpassengerprofilemenu.setText("View Passenger Profile");
        viewpassengerprofilemenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewpassengerprofilemenuActionPerformed(evt);
            }
        });
        jMenu1.add(viewpassengerprofilemenu);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Manage Passenger");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        updatepassengerprofilemenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updatepassengerprofilemenu.setText("Update Passenger Profile");
        updatepassengerprofilemenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatepassengerprofilemenuActionPerformed(evt);
            }
        });
        jMenu2.add(updatepassengerprofilemenu);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Your Flight");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        bookflightmenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bookflightmenu.setText("Book Flight");
        bookflightmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookflightmenuActionPerformed(evt);
            }
        });
        jMenu3.add(bookflightmenu);

        viewbookedflightmenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        viewbookedflightmenu.setText("View Booked Flight");
        viewbookedflightmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbookedflightmenuActionPerformed(evt);
            }
        });
        jMenu3.add(viewbookedflightmenu);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Flight Details");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        journeydetailsmenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        journeydetailsmenu.setText("Journey Details");
        journeydetailsmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                journeydetailsmenuActionPerformed(evt);
            }
        });
        jMenu4.add(journeydetailsmenu);

        flightzonemenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        flightzonemenu.setText("Flight Zone");
        flightzonemenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightzonemenuActionPerformed(evt);
            }
        });
        jMenu4.add(flightzonemenu);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Cancellation");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        cancelticketmenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancelticketmenu.setText("Cancel Ticket");
        cancelticketmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelticketmenuActionPerformed(evt);
            }
        });
        jMenu5.add(cancelticketmenu);

        viewcancelticket.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        viewcancelticket.setText("View Canceled Ticket");
        viewcancelticket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewcancelticketActionPerformed(evt);
            }
        });
        jMenu5.add(viewcancelticket);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addpassengerprofilemenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addpassengerprofilemenuActionPerformed
        
        AddPassenger AddPassengerFrame = new AddPassenger();
        AddPassengerFrame.setVisible(true);    
    }//GEN-LAST:event_addpassengerprofilemenuActionPerformed

    private void viewpassengerprofilemenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewpassengerprofilemenuActionPerformed
         
        ViewPassenger ViewPassengerFrame = new ViewPassenger();
        ViewPassengerFrame.setVisible(true);   
    }//GEN-LAST:event_viewpassengerprofilemenuActionPerformed

    private void updatepassengerprofilemenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatepassengerprofilemenuActionPerformed
        
        UpdatePassengers UpdatePassengerFrame = new UpdatePassengers();
        UpdatePassengerFrame.setVisible(true);
   
    }//GEN-LAST:event_updatepassengerprofilemenuActionPerformed

    private void bookflightmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookflightmenuActionPerformed
        
        BookFlights BookFlightsFrame = new BookFlights();
        BookFlightsFrame.setVisible(true);
    
    }//GEN-LAST:event_bookflightmenuActionPerformed

    private void viewbookedflightmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbookedflightmenuActionPerformed
        
        ViewFlights ViewFlightsFrame = new ViewFlights();
        ViewFlightsFrame.setVisible(true);   
    }//GEN-LAST:event_viewbookedflightmenuActionPerformed

    private void journeydetailsmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_journeydetailsmenuActionPerformed
        
        JourneyDetail JourneyDetailFrame = new JourneyDetail();
        JourneyDetailFrame.setVisible(true);
        
    }//GEN-LAST:event_journeydetailsmenuActionPerformed

    private void flightzonemenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightzonemenuActionPerformed
      
        FlightZones FlightZonesFrame = new FlightZones();
        FlightZonesFrame.setVisible(true);
        
    }//GEN-LAST:event_flightzonemenuActionPerformed

    private void cancelticketmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelticketmenuActionPerformed
        
        CancelTickets CancelTicketsFrame = new CancelTickets();
        CancelTicketsFrame.setVisible(true);
    
    }//GEN-LAST:event_cancelticketmenuActionPerformed

    private void viewcancelticketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewcancelticketActionPerformed
        
        ViewCancelTickets ViewCancelTicketsFrame = new ViewCancelTickets();
        ViewCancelTicketsFrame.setVisible(true);
        
    }//GEN-LAST:event_viewcancelticketActionPerformed

    private void logoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        LoginHome LoginHomeFrame =  new LoginHome();
        LoginHomeFrame.setVisible(true);
    }//GEN-LAST:event_logoutbtnActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addpassengerprofilemenu;
    private javax.swing.JMenuItem bookflightmenu;
    private javax.swing.JMenuItem cancelticketmenu;
    private javax.swing.JMenuItem flightzonemenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem journeydetailsmenu;
    private javax.swing.JButton logoutbtn;
    private javax.swing.JMenuItem updatepassengerprofilemenu;
    private javax.swing.JMenuItem viewbookedflightmenu;
    private javax.swing.JMenuItem viewcancelticket;
    private javax.swing.JMenuItem viewpassengerprofilemenu;
    // End of variables declaration//GEN-END:variables
}
