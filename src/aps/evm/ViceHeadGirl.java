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
public class ViceHeadGirl extends javax.swing.JFrame {

       String value,xxx,pri,vpri,tea,st,vhbtxt,nota,ahbtxt;
    /**
     * Creates new form HeadBoy
     */
    public ViceHeadGirl() {
        this.setUndecorated(true);
        
        
        initComponents();
       
    }

    public ViceHeadGirl(String n) {
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
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        notab = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 35)); // NOI18N
        jLabel1.setText("<html> <body align=center>  Select  Your VICE-HEAD GIRL  for Session (2018-19)  </body>  </html>");

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/aps symbol/dipanshi pal.jpg"))); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.setOpaque(true);
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel12.setText("Dipanshi Pal");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addContainerGap())
        );

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/aps symbol/ishita rawat.jpg"))); // NOI18N
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

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel9.setText("Ishita Rawat");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addContainerGap())
        );

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel14.setText("Shweta");

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/aps symbol/shweta.jpg"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.setOpaque(true);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addContainerGap())
        );

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel13.setText("Vibhuti Sawan");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/aps symbol/vibhuti sawan.jpg"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.setOpaque(true);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addContainerGap())
        );

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel10.setText("Anjali Madhwal");

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/aps symbol/anjali mandhwal.jpg"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.setOpaque(true);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addContainerGap())
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel8.setText("Manisha");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/aps symbol/manisha.jpg"))); // NOI18N
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
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
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
                .addGap(43, 43, 43)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(86, 86, 86))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(notab, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 721, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(notab, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(162, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked

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
              
                xxx="update Vice_head_girl set NoOfVotes=NoOfVotes+5 where ID=4 ";
                ahbtxt=pri;
              
          }
     
          else if(value.equals(vpri)){
              
                xxx="update Vice_head_girl set NoOfVotes=NoOfVotes+3 where ID=4 ";
                ahbtxt=vpri;
          }
          
          
          else if(value.equals(tea)){
              
                xxx="update Vice_head_girl set NoOfVotes=NoOfVotes+2 where ID=4 ";
                ahbtxt=tea;
              
          }
          
          else if(value.equals(st)){
              xxx="update Vice_head_girl set NoOfVotes=NoOfVotes+1 where ID=4 ";
              ahbtxt=st;
          }       
          
        try{
            Class.forName("java.sql.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/evm","root","root");
            Statement stmt=conn.createStatement();
            //String xxx="update Vice_head_girl set NoOfVotes=NoOfVotes+1 where ID=4 ";
            stmt.executeUpdate(xxx);

            this.dispose();
            AdvisoryHeadBoy dc=new AdvisoryHeadBoy(ahbtxt);
            dc.setVisible(true);

        }

        catch(Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        pri="principal";
        vpri="viceprinciapl";
        tea="teacher";
        st="student";
          if(value.equals(pri)){
              
                xxx="update Vice_head_girl set NoOfVotes=NoOfVotes+5 where ID=2 ";
                ahbtxt=pri;
              
          }
     
          else if(value.equals(vpri)){
              
                xxx="update Vice_head_girl set NoOfVotes=NoOfVotes+3 where ID=2 ";
                ahbtxt=vpri;
          }
          
          
          else if(value.equals(tea)){
              
                xxx="update Vice_head_girl set NoOfVotes=NoOfVotes+2 where ID=2 ";
                ahbtxt=tea;
              
          }
          
          else if(value.equals(st)){
              xxx="update Vice_head_girl set NoOfVotes=NoOfVotes+1 where ID=2 ";
              ahbtxt=st;
          }       
          

        try{
            Class.forName("java.sql.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/evm","root","root");
            Statement stmt=conn.createStatement();
            //String xxx="update Vice_head_girl set NoOfVotes=NoOfVotes+1 where ID=2 ";
            stmt.executeUpdate(xxx);

            this.dispose();
            AdvisoryHeadBoy dc=new AdvisoryHeadBoy(ahbtxt);
            dc.setVisible(true);

        }

        catch(Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked

        pri="principal";
        vpri="viceprinciapl";
        tea="teacher";
        st="student";
          if(value.equals(pri)){
              
                xxx="update Vice_head_girl set NoOfVotes=NoOfVotes+5 where ID=6 ";
                ahbtxt=pri;
              
          }
     
          else if(value.equals(vpri)){
              
                xxx="update Vice_head_girl set NoOfVotes=NoOfVotes+3 where ID=6 ";
                ahbtxt=vpri;
          }
          
          
          else if(value.equals(tea)){
              
                xxx="update Vice_head_girl set NoOfVotes=NoOfVotes+2 where ID=6 ";
                ahbtxt=tea;
              
          }
          
          else if(value.equals(st)){
              xxx="update Vice_head_girl set NoOfVotes=NoOfVotes+1 where ID=6 ";
              ahbtxt=st;
          }       
          

        try{
            Class.forName("java.sql.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/evm","root","root");
            Statement stmt=conn.createStatement();
            //String xxx="update Vice_head_girl set NoOfVotes=NoOfVotes+1 where ID=6 ";
            stmt.executeUpdate(xxx);

            this.dispose();
            AdvisoryHeadBoy dc=new AdvisoryHeadBoy(ahbtxt);
            dc.setVisible(true);

        }

        catch(Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
       pri="principal";
        vpri="viceprinciapl";
        tea="teacher";
        st="student";
          if(value.equals(pri)){
              
                xxx="update Vice_head_girl set NoOfVotes=NoOfVotes+5 where ID=5 ";
                ahbtxt=pri;
              
          }
     
          else if(value.equals(vpri)){
              
                xxx="update Vice_head_girl set NoOfVotes=NoOfVotes+3 where ID=5 ";
                ahbtxt=vpri;
          }
          
          
          else if(value.equals(tea)){
              
                xxx="update Vice_head_girl set NoOfVotes=NoOfVotes+2 where ID=5 ";
                ahbtxt=tea;
              
          }
          
          else if(value.equals(st)){
              xxx="update Vice_head_girl set NoOfVotes=NoOfVotes+1 where ID=5 ";
              ahbtxt=st;
          }       
          

        try{
            Class.forName("java.sql.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/evm","root","root");
            Statement stmt=conn.createStatement();
            //String xxx="update Vice_head_girl set NoOfVotes=NoOfVotes+1 where ID=5 ";
            stmt.executeUpdate(xxx);

            this.dispose();
            AdvisoryHeadBoy dc=new AdvisoryHeadBoy(ahbtxt);
            dc.setVisible(true);

        }

        catch(Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked

       pri="principal";
        vpri="viceprinciapl";
        tea="teacher";
        st="student";
          if(value.equals(pri)){
              
                xxx="update Vice_head_girl set NoOfVotes=NoOfVotes+5 where ID=3 ";
                ahbtxt=pri;
              
          }
     
          else if(value.equals(vpri)){
              
                xxx="update Vice_head_girl set NoOfVotes=NoOfVotes+3 where ID=3 ";
                ahbtxt=vpri;
          }
          
          
          else if(value.equals(tea)){
              
                xxx="update Vice_head_girl set NoOfVotes=NoOfVotes+2 where ID=3 ";
                ahbtxt=tea;
              
          }
          
          else if(value.equals(st)){
              xxx="update Vice_head_girl set NoOfVotes=NoOfVotes+1 where ID=3 ";
              ahbtxt=st;
          }       
          
        try{
            Class.forName("java.sql.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/evm","root","root");
            Statement stmt=conn.createStatement();
            //String xxx="update Vice_head_girl set NoOfVotes=NoOfVotes+1 where ID=3 ";
            stmt.executeUpdate(xxx);

            this.dispose();
            AdvisoryHeadBoy dc=new AdvisoryHeadBoy(ahbtxt);
            dc.setVisible(true);

        }

        catch(Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

        pri="principal";
        vpri="viceprinciapl";
        tea="teacher";
        st="student";
          if(value.equals(pri)){
              
                xxx="update Vice_head_girl set NoOfVotes=NoOfVotes+5 where ID=1 ";
                ahbtxt=pri;
              
          }
     
          else if(value.equals(vpri)){
              
                xxx="update Vice_head_girl set NoOfVotes=NoOfVotes+3 where ID=1 ";
                ahbtxt=vpri;
          }
          
          
          else if(value.equals(tea)){
              
                xxx="update Vice_head_girl set NoOfVotes=NoOfVotes+2 where ID=1 ";
                ahbtxt=tea;
              
          }
          
          else if(value.equals(st)){
              xxx="update Vice_head_girl set NoOfVotes=NoOfVotes+1 where ID=1 ";
              ahbtxt=st;
          }       
          

             try{
            Class.forName("java.sql.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/evm","root","root");
            Statement stmt=conn.createStatement();
            //String xxx="update Vice_head_girl set NoOfVotes=NoOfVotes+1 where ID=1 ";
            stmt.executeUpdate(xxx);

            this.dispose();
            AdvisoryHeadBoy dc=new AdvisoryHeadBoy(ahbtxt);
            dc.setVisible(true);

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
            ahbtxt=pri;

        }

        else if(value.equals(vpri)){

            nota="update notateacher set noofnota=noofnota+1";
            ahbtxt=vpri;
        }

        else if(value.equals(tea)){

            nota="update notateacher set noofnota=noofnota+1";
            ahbtxt=tea;

        }

        else if(value.equals(st)){
            nota="update nota set noofnota=noofnota+1";
            ahbtxt=st;
        }

        try{
            Class.forName("java.sql.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/evm","root","root");
            Statement stmt=conn.createStatement();

            stmt.executeUpdate(nota);

            this.dispose();
            AdvisoryHeadBoy dc=new AdvisoryHeadBoy(ahbtxt);
            dc.setVisible(true);

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
            java.util.logging.Logger.getLogger(ViceHeadGirl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViceHeadGirl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViceHeadGirl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViceHeadGirl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViceHeadGirl().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton notab;
    // End of variables declaration//GEN-END:variables
}
