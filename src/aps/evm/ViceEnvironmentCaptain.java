/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aps.evm;

import java.awt.Color;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class ViceEnvironmentCaptain extends javax.swing.JFrame {
String value,xxx,pri,vpri,tea,st,nota,ectxt;

    /**
     * Creates new form HeadBoy
     */
    public ViceEnvironmentCaptain() {
        this.setUndecorated(true);
     
        initComponents();
     
    }
     public ViceEnvironmentCaptain(String n) {
     
      this.setUndecorated(true);
        initComponents();
     value=n;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        notab = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 35)); // NOI18N
        jLabel1.setText("<html>\n<body align=center>\n\n\nSelect  Your vice-environment-captain  for Session<br> (2018-19)\n\n\n\n</body>\n</html>");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/aps symbol/abhinav semwal.jpg"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.setOpaque(true);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 37)); // NOI18N
        jLabel9.setText("Abhinav Semwal");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        jLabel8.setText("Dipanshi Pal");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/aps symbol/dipanshi pal.jpg"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        notab.setBackground(new java.awt.Color(204, 0, 0));
        notab.setFont(new java.awt.Font("Agency FB", 0, 40)); // NOI18N
        notab.setForeground(new java.awt.Color(255, 255, 255));
        notab.setText("!!!  NOTA  !!!");
        notab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        notab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                notabMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                notabMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                notabMousePressed(evt);
            }
        });
        notab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notabActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(notab, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(notab, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(191, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        /* try{
        JFXPanel j=new JFXPanel();
        String uri=new File("C:\\Users\\user\\Documents\\NetBeansProjects\\APS EVM\\src\\sound\\beep.wav").toURI().toString();
        new MediaPlayer(new Media(uri)).play();
        
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(this, e.getMessage());
        }*/

          pri="principal";
        vpri="viceprinciapl";
        tea="teacher";
        st="student";
          if(value.equals(pri)){
              
                xxx="update vice_environmental_captain set NoOfVotes=NoOfVotes+5 where ID=2 ";
                ectxt=pri;
              
          }
     
          else if(value.equals(vpri)){
              
                xxx="update vice_environmental_captain set NoOfVotes=NoOfVotes+3 where ID=2 ";
                ectxt=vpri;
          }
          
          
          else if(value.equals(tea)){
              
                xxx="update vice_environmental_captain set NoOfVotes=NoOfVotes+2 where ID=2 ";
                ectxt=tea;
              
          }
          
          else if(value.equals(st)){
              xxx="update vice_environmental_captain set NoOfVotes=NoOfVotes+1 where ID=2 ";
              ectxt=st;
          }  
        
        
        try{
            Class.forName("java.sql.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/evm","root","root");
            Statement stmt=conn.createStatement();
            //String xxx="update vice_vice_environmental_captain set NoOfVotes=NoOfVotes+1 where ID=2 ";
            stmt.executeUpdate(xxx);

            this.dispose();
           EditorialCaptain ec=new EditorialCaptain(ectxt);
            ec.setVisible(true);

        }

        catch(Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

        
         pri="principal";
        vpri="viceprinciapl";
        tea="teacher";
        st="student";
          if(value.equals(pri)){
              
                xxx="update vice_environmental_captain set NoOfVotes=NoOfVotes+5 where ID=1 ";
                ectxt=pri;
              
          }
     
          else if(value.equals(vpri)){
              
                xxx="update vice_environmental_captain set NoOfVotes=NoOfVotes+3 where ID=1 ";
                ectxt=vpri;
          }
          
          
          else if(value.equals(tea)){
              
                xxx="update vice_environmental_captain set NoOfVotes=NoOfVotes+2 where ID=1 ";
                ectxt=tea;
              
          }
          
          else if(value.equals(st)){
              xxx="update vice_environmental_captain set NoOfVotes=NoOfVotes+1 where ID=1 ";
              ectxt=st;
          }  
        
       
             try{
            Class.forName("java.sql.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/evm","root","root");
            Statement stmt=conn.createStatement();
            //String xxx="update vice_vice_environmental_captain set NoOfVotes=NoOfVotes+1 where ID=1 ";
            stmt.executeUpdate(xxx);

            this.dispose();
           EditorialCaptain ec=new EditorialCaptain(ectxt);
            ec.setVisible(true);

        }

        catch(Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
            
            
        
     

      

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseEntered

    private void notabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notabMouseEntered

        notab.setBackground(Color.blue);
        notab.setForeground(Color.black);

        // TODO add your handling code here:
    }//GEN-LAST:event_notabMouseEntered

    private void notabMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notabMouseExited

        notab.setBackground(Color.red);
        notab.setForeground(Color.white);
        // TODO add your handling code here:
    }//GEN-LAST:event_notabMouseExited

    private void notabMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notabMousePressed
        notab.setBackground(Color.DARK_GRAY);
        notab.setForeground(Color.red);

        // TODO add your handling code here:
    }//GEN-LAST:event_notabMousePressed

    private void notabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notabActionPerformed

        /*   try{
            JFXPanel j=new JFXPanel();
            String uri=new File("C:\\Users\\user\\Documents\\NetBeansProjects\\APS EVM\\src\\sound\\beep.wav").toURI().toString();
            new MediaPlayer(new Media(uri)).play();

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }*/

        pri="principal";
        vpri="viceprinciapl";
        tea="teacher";
        st="student";
        if(value.equals(pri)){

            nota="update notateacher set noofnota=noofnota+1";
            ectxt=pri;

        }

        else if(value.equals(vpri)){

            nota="update notateacher set noofnota=noofnota+1";
            ectxt=vpri;
        }

        else if(value.equals(tea)){

            nota="update notateacher set noofnota=noofnota+1";
            ectxt=tea;

        }

        else if(value.equals(st)){
            nota="update nota set noofnota=noofnota+1";
            ectxt=st;
        }

        try{
            Class.forName("java.sql.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/evm","root","root");
            Statement stmt=conn.createStatement();

            stmt.executeUpdate(nota);
this.dispose();
           EditorialCaptain ec=new EditorialCaptain(ectxt);
            ec.setVisible(true);
        }

        catch(Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_notabActionPerformed

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
            java.util.logging.Logger.getLogger(ViceEnvironmentCaptain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViceEnvironmentCaptain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViceEnvironmentCaptain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViceEnvironmentCaptain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
       
      
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViceEnvironmentCaptain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton notab;
    // End of variables declaration//GEN-END:variables
}
