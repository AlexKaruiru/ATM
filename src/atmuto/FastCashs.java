/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package atmuto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class FastCashs extends javax.swing.JFrame {

    /**
     * Creates new form FastCashs
     */
    public FastCashs() {
        initComponents();
    }

     int MyAccNum;
    public FastCashs (int AccNum) {
        initComponents();
        MyAccNum = AccNum;
        //AccNumLbl.setText("" +AccNum);
        GetBalance();
    }
     Connection  Con = null;
     PreparedStatement pst = null, pst1 = null;
     ResultSet Rs = null, Rs1 = null;
     Statement St = null, St1 = null;
     int OldBalance;
   private void GetBalance(){
       String Query = "select * from Accounttbl where AccNum='"+MyAccNum+"'";
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb?useSSL=false","root",""); 
            St1 = Con.createStatement();
            Rs1 = St1.executeQuery(Query);
            if(Rs1.next()){
                OldBalance = Rs1.getInt(9);
                BalLbl.setText("Ksh" +OldBalance);
              
            }else{
                
               }
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, e);
            
        }
        
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Withdraw20 = new javax.swing.JButton();
        Withdraw50 = new javax.swing.JButton();
        Withdraw100 = new javax.swing.JButton();
        Withdraw500 = new javax.swing.JButton();
        Withdraw200 = new javax.swing.JButton();
        Withdraw1000 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        LogoutBtn = new javax.swing.JLabel();
        BalLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 51, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MyBank");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("X");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addGap(46, 46, 46))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("FAST CASH");

        Withdraw20.setText("Ksh 20");
        Withdraw20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Withdraw20MouseClicked(evt);
            }
        });
        Withdraw20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Withdraw20ActionPerformed(evt);
            }
        });

        Withdraw50.setText("Ksh 50");
        Withdraw50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Withdraw50MouseClicked(evt);
            }
        });
        Withdraw50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Withdraw50ActionPerformed(evt);
            }
        });

        Withdraw100.setText("Ksh 100");
        Withdraw100.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Withdraw100MouseClicked(evt);
            }
        });
        Withdraw100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Withdraw100ActionPerformed(evt);
            }
        });

        Withdraw500.setText("Kshs 500");
        Withdraw500.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Withdraw500MouseClicked(evt);
            }
        });
        Withdraw500.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Withdraw500ActionPerformed(evt);
            }
        });

        Withdraw200.setText("Ksh 200");
        Withdraw200.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Withdraw200MouseClicked(evt);
            }
        });
        Withdraw200.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Withdraw200ActionPerformed(evt);
            }
        });

        Withdraw1000.setText("Kshs 1000");
        Withdraw1000.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Withdraw1000MouseClicked(evt);
            }
        });
        Withdraw1000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Withdraw1000ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 255));
        jLabel4.setText("MyBank");

        LogoutBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LogoutBtn.setForeground(new java.awt.Color(255, 51, 51));
        LogoutBtn.setText("Logout");
        LogoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutBtnMouseClicked(evt);
            }
        });

        BalLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BalLbl.setForeground(new java.awt.Color(0, 102, 255));
        BalLbl.setText("Balance");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Withdraw100, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Withdraw500, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addComponent(Withdraw20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(245, 245, 245)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Withdraw200, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Withdraw50, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Withdraw1000, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 295, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(227, Short.MAX_VALUE)
                    .addComponent(BalLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(263, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Withdraw20)
                    .addComponent(Withdraw50))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Withdraw100)
                    .addComponent(Withdraw200))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Withdraw500)
                    .addComponent(Withdraw1000))
                .addGap(4, 4, 4)
                .addComponent(LogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(217, Short.MAX_VALUE)
                    .addComponent(BalLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(192, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Withdraw20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Withdraw20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Withdraw20ActionPerformed

    private void Withdraw50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Withdraw50ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Withdraw50ActionPerformed

    private void Withdraw100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Withdraw100ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Withdraw100ActionPerformed

    private void Withdraw500ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Withdraw500ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Withdraw500ActionPerformed

    private void Withdraw200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Withdraw200ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Withdraw200ActionPerformed

    private void Withdraw1000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Withdraw1000ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Withdraw1000ActionPerformed

    private void Withdraw20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Withdraw20MouseClicked
        if (OldBalance <20){
         JOptionPane.showMessageDialog(this, "No Enough Balance");  
       }else{
           
           try{
           String Query = "Update accountTbl set Balance =? where AccNum =? ";
           Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb?useSSL=false","root",""); 
            PreparedStatement ps  = Con.prepareStatement(Query);
            ps.setInt(1, OldBalance-20);
            ps.setInt(2, MyAccNum);
            if(ps.executeUpdate() ==1)
            {
                JOptionPane.showMessageDialog(this, "Successful Withdrawal");
                 new MainMenu().setVisible(true);
                    this.dispose();
            }else{
                JOptionPane.showMessageDialog(this, "Withdrawal Not Successful");
            }
           }catch (Exception e){
               
           }
    }//GEN-LAST:event_Withdraw20MouseClicked
    }
    private void Withdraw50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Withdraw50MouseClicked
       if (OldBalance <50){
         JOptionPane.showMessageDialog(this, "No Enough Balance");  
       }else{
           
           try{
           String Query = "Update accountTbl set Balance =? where AccNum =? ";
           Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb?useSSL=false","root",""); 
            PreparedStatement ps  = Con.prepareStatement(Query);
            ps.setInt(1, OldBalance-50);
            ps.setInt(2, MyAccNum);
            if(ps.executeUpdate() ==1)
            {
                JOptionPane.showMessageDialog(this, "Successful Withdrawal");
                 new MainMenu().setVisible(true);
                 this.dispose();
            }else{
                JOptionPane.showMessageDialog(this, "Withdrawal Not Successful");
            }
           }catch (Exception e){
               
           }
    }                       
    }//GEN-LAST:event_Withdraw50MouseClicked

    private void Withdraw100MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Withdraw100MouseClicked
      if (OldBalance <100){
         JOptionPane.showMessageDialog(this, "No Enough Balance");  
       }else{
           
           try{
           String Query = "Update accountTbl set Balance =? where AccNum =? ";
           Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb?useSSL=false","root",""); 
            PreparedStatement ps  = Con.prepareStatement(Query);
            ps.setInt(1, OldBalance-100);
            ps.setInt(2, MyAccNum);
            if(ps.executeUpdate() ==1)
            {
                JOptionPane.showMessageDialog(this, "Successful Withdrawal");
                 new MainMenu().setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(this, "Withdrawal Not Successful");
            }
           }catch (Exception e){
               
           }
    }                       
    }//GEN-LAST:event_Withdraw100MouseClicked

    private void Withdraw200MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Withdraw200MouseClicked
       if (OldBalance <200){
         JOptionPane.showMessageDialog(this, "No Enough Balance");  
       }else{
           
           try{
           String Query = "Update accountTbl set Balance =? where AccNum =? ";
           Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb?useSSL=false","root",""); 
            PreparedStatement ps  = Con.prepareStatement(Query);
            ps.setInt(1, OldBalance-200);
            ps.setInt(2, MyAccNum);
            if(ps.executeUpdate() ==1)
            {
                JOptionPane.showMessageDialog(this, "Successful Withdrawal");
                 new MainMenu().setVisible(true);
                 this.dispose();
            }else{
                JOptionPane.showMessageDialog(this, "Withdrawal Not Successful");
            }
           }catch (Exception e){
               
           }
    }                       
    }//GEN-LAST:event_Withdraw200MouseClicked

    private void Withdraw500MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Withdraw500MouseClicked
       if (OldBalance <500){
         JOptionPane.showMessageDialog(this, "No Enough Balance");  
       }else{
           
           try{
           String Query = "Update accountTbl set Balance =? where AccNum =? ";
           Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb?useSSL=false","root",""); 
            PreparedStatement ps  = Con.prepareStatement(Query);
            ps.setInt(1, OldBalance-500);
            ps.setInt(2, MyAccNum);
            if(ps.executeUpdate() ==1)
            {
                JOptionPane.showMessageDialog(this, "Successful Withdrawal");
                 new MainMenu().setVisible(true);
                  this.dispose();
            }else{
                JOptionPane.showMessageDialog(this, "Withdrawal Not Successful");
            }
           }catch (Exception e){
               
           }
    }                       
    }//GEN-LAST:event_Withdraw500MouseClicked

    private void Withdraw1000MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Withdraw1000MouseClicked
       if (OldBalance <1000){
         JOptionPane.showMessageDialog(this, "No Enough Balance");  
       }else{
           
           try{
           String Query = "Update accountTbl set Balance =? where AccNum =? ";
           Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb?useSSL=false","root",""); 
            PreparedStatement ps  = Con.prepareStatement(Query);
            ps.setInt(1, OldBalance-1000);
            ps.setInt(2, MyAccNum);
            if(ps.executeUpdate() ==1)
            {
                JOptionPane.showMessageDialog(this, "Successful Withdrawal");
                 new MainMenu().setVisible(true);
                 this.dispose();
            }else{
                JOptionPane.showMessageDialog(this, "Withdrawal Not Successful");
            }
           }catch (Exception e){
               
           }
    }                       
    }//GEN-LAST:event_Withdraw1000MouseClicked

    private void LogoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutBtnMouseClicked
         new MainMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutBtnMouseClicked
    
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
            java.util.logging.Logger.getLogger(FastCashs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FastCashs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FastCashs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FastCashs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FastCashs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BalLbl;
    private javax.swing.JLabel LogoutBtn;
    private javax.swing.JButton Withdraw100;
    private javax.swing.JButton Withdraw1000;
    private javax.swing.JButton Withdraw20;
    private javax.swing.JButton Withdraw200;
    private javax.swing.JButton Withdraw50;
    private javax.swing.JButton Withdraw500;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    
}
