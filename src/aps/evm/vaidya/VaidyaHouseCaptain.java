/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aps.evm.vaidya;

import aps.evm.raina.ViceRainaHouseCaptain;
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
public class VaidyaHouseCaptain extends javax.swing.JFrame {
String value,xxx,pri,vpri,tea,st,nota,vvctxt;
    /**
     * Creates new form ThimayyaHouseCaptain1
     */
    public VaidyaHouseCaptain() {
        this.setUndecorated(true);
        initComponents();
    }
       public VaidyaHouseCaptain(String n) {
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
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        notab = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 35)); // NOI18N
        jLabel1.setText("<html> <body align=center>  Select  Your vaidya-house-captain  for Session <br>(2018-19)  </body>  </html>");

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/aps symbol/abhay rana.jpg"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.setOpaque(true);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 38)); // NOI18N
        jLabel11.setText("Abhay Rana");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/aps symbol/anmol.jpg"))); // NOI18N
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.setOpaque(true);
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel15.setText(" Anmol");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/aps symbol/riya arora.jpg"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.setOpaque(true);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 38)); // NOI18N
        jLabel12.setText("Riya Arora");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
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
                        .addGap(36, 36, 36)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1425, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(652, 652, 652)
                        .addComponent(notab, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(174, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(notab, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(216, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked

        
          pri="principal";
        vpri="viceprinciapl";
        tea="teacher";
        st="student";
          if(value.equals(pri)){
              
                xxx="update vaidya_captain set NoOfVotes=NoOfVotes+5 where ID=1 ";
                vvctxt=pri;
              
          }
     
          else if(value.equals(vpri)){
              
                xxx="update vaidya_captain set NoOfVotes=NoOfVotes+3 where ID=1 ";
                vvctxt=vpri;
          }
          
          
          else if(value.equals(tea)){
              
                xxx="update vaidya_captain set NoOfVotes=NoOfVotes+2 where ID=1 ";
                vvctxt=tea;
              
          }
          
          else if(value.equals(st)){
              xxx="update vaidya_captain set NoOfVotes=NoOfVotes+1 where ID=1 ";
              vvctxt=st;
          } 
        
      

        try{
            Class.forName("java.sql.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/evm","root","root");
            Statement stmt=conn.createStatement();
            //String xxx="update vaidya_captain set NoOfVotes=NoOfVotes+1 where ID=1 ";
            stmt.executeUpdate(xxx);

            this.dispose();
            ViceVaidyaHouseCaptain vrhc=new ViceVaidyaHouseCaptain(vvctxt);
            vrhc.setVisible(true);

        }

        catch(Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked

        
          pri="principal";
        vpri="viceprinciapl";
        tea="teacher";
        st="student";
          if(value.equals(pri)){
              
                xxx="update vaidya_captain set NoOfVotes=NoOfVotes+5 where ID=2 ";
                vvctxt=pri;
              
          }
     
          else if(value.equals(vpri)){
              
                xxx="update vaidya_captain set NoOfVotes=NoOfVotes+3 where ID=2 ";
                vvctxt=vpri;
          }
          
          
          else if(value.equals(tea)){
              
                xxx="update vaidya_captain set NoOfVotes=NoOfVotes+2 where ID=2 ";
                vvctxt=tea;
              
          }
          
          else if(value.equals(st)){
              xxx="update vaidya_captain set NoOfVotes=NoOfVotes+1 where ID=2 ";
              vvctxt=st;
          } 
        
        
        
        try{
            Class.forName("java.sql.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/evm","root","root");
            Statement stmt=conn.createStatement();
            //String xxx="update vaidya_captain set NoOfVotes=NoOfVotes+1 where ID=2 ";
            stmt.executeUpdate(xxx);

            this.dispose();
            ViceVaidyaHouseCaptain vrhc=new ViceVaidyaHouseCaptain(vvctxt);
            vrhc.setVisible(true);

        }

        catch(Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked

          
          pri="principal";
        vpri="viceprinciapl";
        tea="teacher";
        st="student";
          if(value.equals(pri)){
              
                xxx="update vaidya_captain set NoOfVotes=NoOfVotes+5 where ID=3 ";
                vvctxt=pri;
              
          }
     
          else if(value.equals(vpri)){
              
                xxx="update vaidya_captain set NoOfVotes=NoOfVotes+3 where ID=3 ";
                vvctxt=vpri;
          }
          
          
          else if(value.equals(tea)){
              
                xxx="update vaidya_captain set NoOfVotes=NoOfVotes+2 where ID=3 ";
                vvctxt=tea;
              
          }
          
          else if(value.equals(st)){
              xxx="update vaidya_captain set NoOfVotes=NoOfVotes+1 where ID=3 ";
              vvctxt=st;
          } 
        
          

        try{
            Class.forName("java.sql.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/evm","root","root");
            Statement stmt=conn.createStatement();
            //String xxx="update vaidya_captain set NoOfVotes=NoOfVotes+1 where ID=3 ";
            stmt.executeUpdate(xxx);

            this.dispose();
            ViceVaidyaHouseCaptain vrhc=new ViceVaidyaHouseCaptain(vvctxt);
            vrhc.setVisible(true);

        }

        catch(Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
        
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseClicked

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
            s
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
            vvctxt=pri;

        }

        else if(value.equals(vpri)){

            nota="update notateacher set noofnota=noofnota+1";
            vvctxt=vpri;
        }

        else if(value.equals(tea)){

            nota="update notateacher set noofnota=noofnota+1";
            vvctxt=tea;

        }

        else if(value.equals(st)){
            nota="update nota set noofnota=noofnota+1";
            vvctxt=st;
        }

        try{
            Class.forName("java.sql.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/evm","root","root");
            Statement stmt=conn.createStatement();

            stmt.executeUpdate(nota);

            ViceVaidyaHouseCaptain v=new ViceVaidyaHouseCaptain(vvctxt);
            v.setVisible(true);
            this.dispose();

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
            java.util.logging.Logger.getLogger(VaidyaHouseCaptain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VaidyaHouseCaptain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VaidyaHouseCaptain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VaidyaHouseCaptain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VaidyaHouseCaptain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton notab;
    // End of variables declaration//GEN-END:variables
}