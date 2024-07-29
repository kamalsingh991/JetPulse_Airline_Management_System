
package jetpulse;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SplashScreen extends javax.swing.JFrame {

    
    public SplashScreen() {
        initComponents();
        
        Thread t;
        t = new Thread(new Runnable(){
            @Override
            public void run(){
                for(int i=1;i<=100;i++){
                    
                    try {
                        jProgressBar1.setValue(i);
                        Thread.sleep(30);
                        
                        if(i==100){
                            
                            LoginHome LoginFrame =new LoginHome();
                            LoginFrame.setVisible(true);
                           
                            LoginFrame.pack();
                            LoginFrame.setLocationRelativeTo(null);
                           
                        }
                    
                        if(jProgressBar1.getString().equals("90%")){
                            Loadinglbl.setText("Launching Application.......");
                        }
                        
                        if(jProgressBar1.getString().equals("50%")){
                            Loadinglbl.setText("Loading Modules.......");
                        }
                        
                        if(jProgressBar1.getString().equals("25%")){
                            Loadinglbl.setText("Connecting Database.......");
                        }
                
                    } catch (InterruptedException ex) {
                        Logger.getLogger(SplashScreen.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            
            }

            private void dispose() {
                throw new UnsupportedOperationException("Not supported yet."); 
            }   
        });
        t.start();     
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Loadinglbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(Loadinglbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 570, 170, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jetpulse (2).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

        jProgressBar1.setForeground(new java.awt.Color(0, 0, 255));
        jProgressBar1.setStringPainted(true);
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 1060, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SplashScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Loadinglbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
