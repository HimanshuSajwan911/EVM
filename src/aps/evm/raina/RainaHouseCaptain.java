/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aps.evm.raina;

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
public class RainaHouseCaptain extends javax.swing.JFrame {
String value,xxx,pri,vpri,tea,st,nota,vrctxt;
    /**
     * Creates new form ThimayyaHouseCaptain1
     */
    public RainaHouseCaptain() {
        this.setUndecorated(true);
        initComponents();
    }

    public RainaHouseCaptain(String n) {
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
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        notab = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 45)); // NOI18N
        jLabel1.setText("<html> <body align=center>  Select  Your raina-house-captain  for <br>Session (2018-19)  </body>  </html>");

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/aps symbol/vishal singh.jpg"))); // NOI18N
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.setOpaque(true);
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        jLabel15.setText("Vishal Singh");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        jLabel8.setText("Aishwarya");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/aps symbol/AISHWARYA.jpg"))); // NOI18N
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
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/aps symbol/mansi deb.jpg"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.setOpaque(true);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        jLabel9.setText("Mansi Deb");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/aps symbol/jitender.jpg"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.setOpaque(true);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        jLabel11.setText("Jitender");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/aps symbol/Prakhar Arora.jpg"))); // NOI18N
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.setOpaque(true);
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        jLabel19.setText("Prakhar");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 325, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 363, Short.MAX_VALUE)
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
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 44, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(notab, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(346, 346, 346))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(163, 163, 163)
                        .addComponent(notab, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(152, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

        
        pri="principal";
        vpri="viceprinciapl";
        tea="teacher";
        st="student";
          if(value.equals(pri)){
              
                xxx="update raina_captain set NoOfVotes=NoOfVotes+5 where ID=1 ";
                vrctxt=pri;
              
          }
     
          else if(value.equals(vpri)){
              
                xxx="update raina_captain set NoOfVotes=NoOfVotes+3 where ID=1 ";
                vrctxt=vpri;
          }
          
          
          else if(value.equals(tea)){
              
                xxx="update raina_captain set NoOfVotes=NoOfVotes+2 where ID=1 ";
                vrctxt=tea;
              
          }
          
          else if(value.equals(st)){
              xxx="update raina_captain set NoOfVotes=NoOfVotes+1 where ID=1 ";
              vrctxt=st;
          } 
        

        try{
            Class.forName("java.sql.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/evm","root","root");
            Statement stmt=conn.createStatement();
            //String xxx="update raina_captain set NoOfVotes=NoOfVotes+1 where ID=1 ";
            stmt.executeUpdate(xxx);

            this.dispose();
            ViceRainaHouseCaptain vrhc=new ViceRainaHouseCaptain(vrctxt);
            vrhc.setVisible(true);

        }

        catch(Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        
         
        pri="principal";
        vpri="viceprinciapl";
        tea="teacher";
        st="student";
          if(value.equals(pri)){
              
                xxx="update raina_captain set NoOfVotes=NoOfVotes+5 where ID=5 ";
                vrctxt=pri;
              
          }
     
          else if(value.equals(vpri)){
              
                xxx="update raina_captain set NoOfVotes=NoOfVotes+3 where ID=5 ";
                vrctxt=vpri;
          }
          
          
          else if(value.equals(tea)){
              
                xxx="update raina_captain set NoOfVotes=NoOfVotes+2 where ID=5 ";
                vrctxt=tea;
              
          }
          
          else if(value.equals(st)){
              xxx="update raina_captain set NoOfVotes=NoOfVotes+1 where ID=5 ";
              vrctxt=st;
          } 
        

        try{
            Class.forName("java.sql.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/evm","root","root");
            Statement stmt=conn.createStatement();
            //String xxx="update raina_captain set NoOfVotes=NoOfVotes+1 where ID=5 ";
            stmt.executeUpdate(xxx);

            this.dispose();
            ViceRainaHouseCaptain vrhc=new ViceRainaHouseCaptain(vrctxt);
            vrhc.setVisible(true);

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
              
                xxx="update raina_captain set NoOfVotes=NoOfVotes+5 where ID=2 ";
                vrctxt=pri;
              
          }
     
          else if(value.equals(vpri)){
              
                xxx="update raina_captain set NoOfVotes=NoOfVotes+3 where ID=2";
                vrctxt=vpri;
          }
          
          
          else if(value.equals(tea)){
              
                xxx="update raina_captain set NoOfVotes=NoOfVotes+2 where ID=2 ";
                vrctxt=tea;
              
          }
          
          else if(value.equals(st)){
              xxx="update raina_captain set NoOfVotes=NoOfVotes+1 where ID=2 ";
              vrctxt=st;
          } 
        

        try{
            Class.forName("java.sql.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/evm","root","root");
            Statement stmt=conn.createStatement();
            //String xxx="update raina_captain set NoOfVotes=NoOfVotes+1 where ID=2 ";
            stmt.executeUpdate(xxx);

            this.dispose();
            ViceRainaHouseCaptain vrhc=new ViceRainaHouseCaptain(vrctxt);
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
              
                xxx="update raina_captain set NoOfVotes=NoOfVotes+5 where ID=4 ";
                vrctxt=pri;
              
          }
     
          else if(value.equals(vpri)){
              
                xxx="update raina_captain set NoOfVotes=NoOfVotes+3 where ID=4 ";
                vrctxt=vpri;
          }
          
          
          else if(value.equals(tea)){
              
                xxx="update raina_captain set NoOfVotes=NoOfVotes+2 where ID=4 ";
                vrctxt=tea;
              
          }
          
          else if(value.equals(st)){
              xxx="update raina_captain set NoOfVotes=NoOfVotes+1 where ID=4 ";
              vrctxt=st;
          } 
        
        

        try{
            Class.forName("java.sql.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/evm","root","root");
            Statement stmt=conn.createStatement();
            //String xxx="update raina_captain set NoOfVotes=NoOfVotes+1 where ID=4 ";
            stmt.executeUpdate(xxx);

            this.dispose();
            ViceRainaHouseCaptain vrhc=new ViceRainaHouseCaptain(vrctxt);
            vrhc.setVisible(true);

        }

        catch(Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked

        
         
        pri="principal";
        vpri="viceprinciapl";
        tea="teacher";
        st="student";
          if(value.equals(pri)){
              
                xxx="update raina_captain set NoOfVotes=NoOfVotes+5 where ID=6 ";
                vrctxt=pri;
              
          }
     
          else if(value.equals(vpri)){
              
                xxx="update raina_captain set NoOfVotes=NoOfVotes+3 where ID=6 ";
                vrctxt=vpri;
          }
          
          
          else if(value.equals(tea)){
              
                xxx="update raina_captain set NoOfVotes=NoOfVotes+2 where ID=6 ";
                vrctxt=tea;
              
          }
          
          else if(value.equals(st)){
              xxx="update raina_captain set NoOfVotes=NoOfVotes+1 where ID=6 ";
              vrctxt=st;
          } 
        
        
        try{
            Class.forName("java.sql.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/evm","root","root");
            Statement stmt=conn.createStatement();
            //String xxx="update raina_captain set NoOfVotes=NoOfVotes+1 where ID=7 ";
            stmt.executeUpdate(xxx);

            this.dispose();
            ViceRainaHouseCaptain vrhc=new ViceRainaHouseCaptain(vrctxt);
            vrhc.setVisible(true);

        }

        catch(Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel18MouseClicked

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
            vrctxt=pri;

        }

        else if(value.equals(vpri)){

            nota="update notateacher set noofnota=noofnota+1";
            vrctxt=vpri;
        }

        else if(value.equals(tea)){

            nota="update notateacher set noofnota=noofnota+1";
            vrctxt=tea;

        }

        else if(value.equals(st)){
            nota="update nota set noofnota=noofnota+1";
            vrctxt=st;
        }

        try{
            Class.forName("java.sql.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/evm","root","root");
            Statement stmt=conn.createStatement();

            stmt.executeUpdate(nota);

            ViceRainaHouseCaptain v=new ViceRainaHouseCaptain(vrctxt);
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
            java.util.logging.Logger.getLogger(RainaHouseCaptain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RainaHouseCaptain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RainaHouseCaptain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RainaHouseCaptain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RainaHouseCaptain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JButton notab;
    // End of variables declaration//GEN-END:variables
}
