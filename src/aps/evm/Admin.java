/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aps.evm;



import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public Admin() {
        this.setUndecorated(true);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        closeb4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        closeb4.setBackground(new java.awt.Color(255, 0, 0));
        closeb4.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        closeb4.setForeground(new java.awt.Color(255, 255, 255));
        closeb4.setText("X");
        closeb4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeb4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeb4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                closeb4MousePressed(evt);
            }
        });
        closeb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeb4ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jButton1.setText("CREATE  TABLES");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jButton1)
                .addGap(427, 427, 427)
                .addComponent(closeb4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(742, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(closeb4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(752, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeb4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeb4MouseEntered

        closeb4.setBackground(Color.BLUE);
        closeb4.setForeground(Color.RED);

        // TODO add your handling code here:
    }//GEN-LAST:event_closeb4MouseEntered

    private void closeb4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeb4MouseExited
        closeb4.setBackground(Color.RED);
        closeb4.setForeground(Color.WHITE);

        // TODO add your handling code here:
    }//GEN-LAST:event_closeb4MouseExited

    private void closeb4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeb4MousePressed
        closeb4.setBackground(Color.DARK_GRAY);
        closeb4.setForeground(Color.black);

        // TODO add your handling code here:
    }//GEN-LAST:event_closeb4MousePressed

    private void closeb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeb4ActionPerformed

        // JOptionPane.showMessageDialog(this,"BY","OK",JOptionPane.PLAIN_MESSAGE);
        //System.exit(0);
        int a=JOptionPane.showConfirmDialog(this,"Sure to Leave ?","OK",JOptionPane.YES_NO_OPTION);
        if(a==0)
        { JOptionPane.showMessageDialog(this,"BYE...","OK",JOptionPane.PLAIN_MESSAGE);
            System.exit(0);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_closeb4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        try{
            Class.forName("java.sql.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/evm","root","root");
            Statement stmt=conn.createStatement();
            
            
            
            String tabheadboy="create table Head_Boy(Name varchar(50),NoOfVotes bigint(50),ID int primary key)";
            String entheadboyap="insert into Head_Boy values('Abhishek Panwar',0,1)";
            String entheadboyap2="insert into Head_Boy values('Ayush Pun',0,2)";
            String entheadboyh="insert into Head_Boy values('Himanshu',0,3)";
            String entheadboypa="insert into Head_Boy values('Prakhar Arora',0,4)";
            String entheadboygk="insert into Head_Boy values('Gaurav Khati',0,5)";
            String entheadboygb="insert into Head_Boy values('Gaurav Bhatt',0,6)";
            
            stmt.executeUpdate(tabheadboy);
            stmt.executeUpdate(entheadboyap);
             stmt.executeUpdate(entheadboyap2);
             stmt.executeUpdate(entheadboyh);
              stmt.executeUpdate(entheadboypa);
               stmt.executeUpdate(entheadboygb);
                stmt.executeUpdate(entheadboygk);
           //////////////////////////////////////////////////////////////////////////////////////////////////////////// 
             String tabheadgirl="create table Head_Girl(Name varchar(50),NoOfVotes bigint(50),ID int primary key)";
             
              String entheadgirlss="insert into Head_Girl values('Sakshi Sharma',0,1)";
              String entheadgirlna="insert into Head_Girl values('Neha Aswal',0,2)";
              String entheadgirlrp="insert into Head_Girl values('Ritika Pundir',0,3)";
              String entheadgirlsr="insert into Head_Girl values('Sakshi Rawat',0,4)";
              String entheadgirlra="insert into Head_Girl values('Riya Arora',0,5)";
              String entheadgirlkd="insert into Head_Girl values('Kanika Dasauni',0,6)";
              String entheadgirlrb="insert into Head_Girl values('Ritika',0,7)";
              
             
                 stmt.executeUpdate(tabheadgirl);
            
               stmt.executeUpdate(entheadgirlss);
             stmt.executeUpdate(entheadgirlna);
             stmt.executeUpdate(entheadgirlrp);
              stmt.executeUpdate(entheadgirlsr);
               stmt.executeUpdate(entheadgirlra);
                stmt.executeUpdate(entheadgirlkd);
                stmt.executeUpdate(entheadgirlrb);    
           
           
             
              ////////////////////////////////////////////////////////////////////////////////////////////////////////////
             
            String tabviceheadboy="create table Vice_Head_Boy(Name varchar(50),NoOfVotes bigint(50),ID int primary key)";
            
          String entvchbln="insert into Vice_Head_Boy values('Lijin Nair',0,1)";
           String entvchbsa="insert into Vice_Head_Boy values('Saksham',0,2)";
            String entvchbas="insert into Vice_Head_Boy values('Akash Swarnkar',0,3)";
             String entvchbat="insert into Vice_Head_Boy values('Ashutosh',0,4)";
              String entvchbay="insert into Vice_Head_Boy values('Abhishek Yadav',0,5)";
            
              stmt.executeUpdate(tabviceheadboy);
              stmt.executeUpdate(entvchbln);
              stmt.executeUpdate(entvchbsa);
              stmt.executeUpdate(entvchbas);
              stmt.executeUpdate(entvchbat);
              stmt.executeUpdate(entvchbay);
            
             ////////////////////////////////////////////////////////////////////////////////////////////////////////////
            String tabviceheadgirl="create table Vice_Head_Girl(Name varchar(50),NoOfVotes bigint(50),ID int primary key)";
             String entvchgma="insert into Vice_Head_Girl values('Manisha',0,1)";
            String entvchgir="insert into Vice_Head_Girl values('Ishita Rawat',0,2)";
           String entvchgam="insert into Vice_Head_Girl values('Anjali Madhwal',0,3)";
            String entvchgdp="insert into Vice_Head_Girl values('Dipanshi Pal',0,4)";
            String entvchgvs="insert into Vice_Head_Girl values('Vibhuti Sawan',0,5)";
            String entvchgsh="insert into Vice_Head_Girl values('Shweta',0,6)";

            stmt.executeUpdate(tabviceheadgirl);
            stmt.executeUpdate(entvchgma);
            stmt.executeUpdate(entvchgir);
            stmt.executeUpdate(entvchgam);
            stmt.executeUpdate(entvchgdp);
            stmt.executeUpdate(entvchgvs);
            stmt.executeUpdate(entvchgsh);
            
            
////////////////////////////////////////////////////////////////////////////////////////////////////////////
            String tabsportsCaptain="create table SportsCaptain(Name varchar(50),NoOfVotes bigint(50),ID int primary key)";
           
              String entsportcapvg="insert into SportsCaptain values('Vidisha Gurung',0,1)";
            String entsportcapbi="insert into SportsCaptain values('Bimal',0,2)";
             stmt.executeUpdate(tabsportsCaptain);
              stmt.executeUpdate(entsportcapvg);
               stmt.executeUpdate(entsportcapbi);
            
            ////////////////////////////////////////////////////////////////////////////////////////////////////////////
            
            String tabdispcap="create table Disipline_Captain(Name varchar(50),NoOfVotes bigint(50),ID int primary key)";
             String entdispcapai="insert into Disipline_Captain values('Aishwarya',0,1)";
            String entdispcapss="insert into Disipline_Captain values('Sakshi Sharma',0,2)";
            String entdispcapip="insert into Disipline_Captain values('Isha Parmar',0,3)";
            String entdispcapra="insert into Disipline_Captain values('Riya Arora',0,4)";
            String entdispcappa="insert into Disipline_Captain values('Prakhar',0,5)";
            String entdispcapmu="insert into Disipline_Captain values('Mukul',0,6)";
            String entdispcapas="insert into Disipline_Captain values('Akash Swarnkar',0,7)";
            String entdispcapap="insert into Disipline_Captain values('Abhishek Panwar',0,8)";
            String entdispcapam="insert into Disipline_Captain values('Amitendra',0,9)";
            
            stmt.executeUpdate(tabdispcap);
             stmt.executeUpdate(entdispcapai);
              stmt.executeUpdate(entdispcapss);
              stmt.executeUpdate(entdispcapip);
              stmt.executeUpdate(entdispcapra);
              stmt.executeUpdate(entdispcappa);
              stmt.executeUpdate(entdispcapmu);
              stmt.executeUpdate(entdispcapas);
              stmt.executeUpdate(entdispcapap);
              stmt.executeUpdate(entdispcapam);
            
             ////////////////////////////////////////////////////////////////////////////////////////////////////////////
            String tabvicedispcap="create table Vice_Disipline_Captain(Name varchar(50),NoOfVotes bigint(50),ID int primary key)";
            
            String entvicedispcapamst="insert into Vice_Disipline_Captain values('Shweta Tripathi',0,1)";
            String entvicedispcapamis="insert into Vice_Disipline_Captain values('Ishita',0,2)";
             String entvicedispcapamna="insert into Vice_Disipline_Captain values('Naveen',0,3)";        
            String entvicedispcapamsh="insert into Vice_Disipline_Captain values('Shaurya',0,4)";
            String entvicedispcapamss="insert into Vice_Disipline_Captain values('Sajandeep Singh',0,5)";
            String entvicedispcapamay="insert into Vice_Disipline_Captain values('Abhishek Yadav',0,6)";
            
            stmt.executeUpdate(tabvicedispcap);
             stmt.executeUpdate(entvicedispcapamst);
              stmt.executeUpdate(entvicedispcapamis);
               stmt.executeUpdate(entvicedispcapamna);
                stmt.executeUpdate(entvicedispcapamsh);
                 stmt.executeUpdate(entvicedispcapamss);
            stmt.executeUpdate(entvicedispcapamay);
            
             ////////////////////////////////////////////////////////////////////////////////////////////////////////////
            String tabvicesportscap="create table Vice_SportsCaptain(Name varchar(50),NoOfVotes bigint(50),ID int primary key)";
            
            String entvicesportscapja="insert into Vice_SportsCaptain values('Jatin',0,1)";
            String entvicesportscapap="insert into Vice_SportsCaptain values('Abhishek Panwar',0,2)";
            String entvicesportscapsa="insert into Vice_SportsCaptain values('Sagar Adhikari',0,3)";
            
            
             stmt.executeUpdate(tabvicesportscap);
             stmt.executeUpdate(entvicesportscapja);
             stmt.executeUpdate(entvicesportscapap);
             stmt.executeUpdate(entvicesportscapsa);
            
            
             ////////////////////////////////////////////////////////////////////////////////////////////////////////////
            String tabenvcap="create table Environmental_Captain(Name varchar(50),NoOfVotes bigint(50),ID int primary key)";
            String entenvcapra="insert into Environmental_Captain values('Riya Arora',0,1)";
             String entenvcapap="insert into Environmental_Captain values('Apoorva',0,2)";
              String entenvcapmd="insert into Environmental_Captain values('Mansi Deb',0,3)";
               String entenvcapas="insert into Environmental_Captain values('Ashutosh',0,4)";
                String entenvcapta="insert into Environmental_Captain values('Tanu',0,5)";
                 String entenvcapsa="insert into Environmental_Captain values('Sajandeep',0,6)";
                String entenvcapaw="insert into Environmental_Captain values('Akash Swarnkar',0,7)";
                 String entenvcapbi="insert into Environmental_Captain values('Bipul',0,8)";
            
            
            
              stmt.executeUpdate(tabenvcap);
            stmt.executeUpdate(entenvcapra);
            stmt.executeUpdate(entenvcapap);
            stmt.executeUpdate(entenvcapmd);
            stmt.executeUpdate(entenvcapas);
            stmt.executeUpdate(entenvcapta);
            stmt.executeUpdate(entenvcapsa);
            stmt.executeUpdate(entenvcapaw);
            stmt.executeUpdate(entenvcapbi);
            
            
            
             ////////////////////////////////////////////////////////////////////////////////////////////////////////////
            String tabviceenvcap="create table Vice_Environmental_Captain(Name varchar(50),NoOfVotes bigint(50),ID int primary key)";
            
            String entviceenvcapdp="insert into Vice_Environmental_Captain values('Dipanshi Pal',0,1)";
            String entviceenvcapas="insert into Vice_Environmental_Captain values('Abhinav Semwal',0,2)";
           
            
            
            
            stmt.executeUpdate(tabviceenvcap);
            stmt.executeUpdate(entviceenvcapdp);
            stmt.executeUpdate(entviceenvcapas);
           
            
            
            
            
             ////////////////////////////////////////////////////////////////////////////////////////////////////////////
            String tabedit="create table Editorial_Captain(Name varchar(50),NoOfVotes bigint(50),ID int primary key)";
            
           String enteditcapra="insert into Editorial_Captain values('Riya Arora',0,1)";
           String enteditcapap="insert into Editorial_Captain values('Apoorva',0,2)";
           String enteditcapss="insert into Editorial_Captain values('Sakshi Sharma',0,3)";
           String enteditcaprp="insert into Editorial_Captain values('Ritika Pundir',0,4)";
            
            
            
            
            
              stmt.executeUpdate(tabedit);
             stmt.executeUpdate(enteditcapra);
            stmt.executeUpdate(enteditcapap);
            stmt.executeUpdate(enteditcapss);
            stmt.executeUpdate(enteditcaprp);
            
            
            
             ////////////////////////////////////////////////////////////////////////////////////////////////////////////
            String tabviceedit="create table Vice_Editorial_Captain(Name varchar(50),NoOfVotes bigint(50),ID int primary key)";
            
           String entviceeditcapvs="insert into Vice_Editorial_Captain values('Vibhuti Sawan',0,1)";
            String entviceeditcapmd="insert into Vice_Editorial_Captain values('Mansi Deb',0,2)";
            
            
            
            stmt.executeUpdate(tabviceedit);
              stmt.executeUpdate(entviceeditcapvs); 
              stmt.executeUpdate(entviceeditcapmd);
            
            
            
              
////////////////////////////////////////////////////////////////////////////////////////////////////////////
           

            String tabcoco="create table Co_Curricular_Captain(Name varchar(50),NoOfVotes bigint(50),ID int primary key)";
              String entcocoas="insert into Co_Curricular_Captain values('Ashutosh',0,1)";
              String entcocohi="insert into Co_Curricular_Captain values('Himanshu',0,2)";
            String entcocovi="insert into Co_Curricular_Captain values('Vidisha',0,3)";
            String entcocorp="insert into Co_Curricular_Captain values('Ritika Pundir',0,4)";
            String entcocosu="insert into Co_Curricular_Captain values('Supriya',0,5)";
            String entcocoap="insert into Co_Curricular_Captain values('Apoorva',0,6)";
            
            
            stmt.executeUpdate(tabcoco);
             stmt.executeUpdate(entcocoas);
              stmt.executeUpdate(entcocohi);
               stmt.executeUpdate(entcocovi);
                stmt.executeUpdate(entcocorp);
                 stmt.executeUpdate(entcocosu);
                  stmt.executeUpdate(entcocoap);
                
            
            
            
             ////////////////////////////////////////////////////////////////////////////////////////////////////////////
            String tabvicecoco="create table vice_Co_Curricular_Captain(Name varchar(50),NoOfVotes bigint(50),ID int primary key)";
            
            String entvicecocodp="insert into vice_Co_Curricular_Captain values('Dipanshi Pal',0,1)";
            String entvicecocoma="insert into vice_Co_Curricular_Captain values('Manisha',0,2)";
           
            
            
            stmt.executeUpdate(tabvicecoco);
          stmt.executeUpdate(entvicecocodp);
          stmt.executeUpdate(entvicecocoma);
            
            
            
             ////////////////////////////////////////////////////////////////////////////////////////////////////////////
            String tabadvhb="create table Advisory_Head_Boy(Name varchar(50),NoOfVotes bigint(50),ID int primary key)";
          String entadvhbgk="insert into Advisory_Head_Boy values('Gaurav Khati',0,1)";
          String entadvhbhi="insert into Advisory_Head_Boy values('Himanshu',0,2)";
          String entadvhbap="insert into Advisory_Head_Boy values('Ayush Pun',0,3)";
          String entadvhban="insert into Advisory_Head_Boy values('Anmol',0,4)";
          String entadvhbsa="insert into Advisory_Head_Boy values('Saksham',0,5)";
          String entadvhbli="insert into Advisory_Head_Boy values('Lijin',0,6)";
          String entadvhgsh="insert into Advisory_Head_Boy values('Shaurya',0,7)";
   
            
            
             stmt.executeUpdate(tabadvhb);
             stmt.executeUpdate(entadvhbgk);
             stmt.executeUpdate(entadvhbhi);
             stmt.executeUpdate(entadvhbap);
             stmt.executeUpdate(entadvhban);
             stmt.executeUpdate(entadvhbsa);
             stmt.executeUpdate(entadvhbli);
            stmt.executeUpdate(entadvhgsh);
            
            
             ////////////////////////////////////////////////////////////////////////////////////////////////////////////
            String tabadvhg="create table Advisory_Head_Girl(Name varchar(50),NoOfVotes bigint(50),ID int primary key)";
            
            String entadvhgai="insert into Advisory_Head_Girl values('Aishwarya',0,1)";
            String entadvhgvs="insert into Advisory_Head_Girl values('Vibhuti Sawan',0,2)";
            String entadvhgra="insert into Advisory_Head_Girl values('Riya Arora',0,3)";
            String entadvhgma="insert into Advisory_Head_Girl values('Manisha',0,4)";
            
            
            
             stmt.executeUpdate(tabadvhg);
             stmt.executeUpdate(entadvhgai);
              stmt.executeUpdate(entadvhgvs); 
              stmt.executeUpdate(entadvhgra);
               stmt.executeUpdate(entadvhgma);
                
              
             
             
            
             ////////////////////////////////////////////////////////////////////////////////////////////////////////////
            String tabmancap="create table Manekshaw_Captain(Name varchar(50),NoOfVotes bigint(50),ID int primary key)";
            String entmancapsu="insert into Manekshaw_Captain values('Supriya',0,1)";
            String entmancapam="insert into Manekshaw_Captain values('Amitendre',0,2)";
            
            
            
                 
            stmt.executeUpdate(tabmancap);
             stmt.executeUpdate(entmancapsu);
               stmt.executeUpdate(entmancapam);
            
            
            
            
             ////////////////////////////////////////////////////////////////////////////////////////////////////////////
            String tabvicemancap="create table Vice_Manekshaw_Captain(Name varchar(50),NoOfVotes bigint(50),ID int primary key)";
            
            String entvicemancapamas="insert into Vice_Manekshaw_Captain values('Ashutosh',0,1)";
            String entvicemancapamsa="insert into Vice_Manekshaw_Captain values('Sajandeep',0,2)";
            
            
             stmt.executeUpdate(tabvicemancap);
             stmt.executeUpdate(entvicemancapamas);
              stmt.executeUpdate(entvicemancapamsa);
             
            
            
            
            
            
             ////////////////////////////////////////////////////////////////////////////////////////////////////////////
            String tabthimcap="create table Thimayya_Captain(Name varchar(50),NoOfVotes bigint(50),ID int primary key)";
              String entthicapsk="insert into Thimayya_Captain values('Saurabh Kumar',0,1)";
              String entthicapss="insert into Thimayya_Captain values('Sakshi Sharma',0,2)";
              String entthicaprp="insert into Thimayya_Captain values('Ritika Pundir',0,3)";
               String entthicapds="insert into Thimayya_Captain values('Deepak Singh',0,4)";
            
            
            
            
            stmt.executeUpdate(tabthimcap);
           stmt.executeUpdate(entthicapsk);
           stmt.executeUpdate(entthicapss);
           stmt.executeUpdate(entthicaprp);
           stmt.executeUpdate(entthicapds);
            
            
            
             ////////////////////////////////////////////////////////////////////////////////////////////////////////////
            String tabvicethimcap="create table Vice_Thimayya_Captain(Name varchar(50),NoOfVotes bigint(50),ID int primary key)";
              String entvicethicapdp="insert into Vice_Thimayya_Captain values('Dipanshi Pal',0,1)";
               String entvicethicapay="insert into Vice_Thimayya_Captain values('Abhishek Yadav',0,2)";
             String entvicethicapam="insert into Vice_Thimayya_Captain values('Anjali Madhwal',0,3)";
            
            
              stmt.executeUpdate(tabvicethimcap);
           stmt.executeUpdate(entvicethicapdp);
           stmt.executeUpdate(entvicethicapay);
           stmt.executeUpdate(entvicethicapam);
            
             
            
             ////////////////////////////////////////////////////////////////////////////////////////////////////////////
             String tabraicap="create table Raina_Captain(Name varchar(50),NoOfVotes bigint(50),ID int primary key)";
             String entraicapai="insert into Raina_Captain values('Aishwarya',0,1)";
             String entraicapji="insert into Raina_Captain values('Jitender',0,2)";
             String entraicapvs="insert into Raina_Captain values('Vishal Singh',0,3)";
             String entraicapmd="insert into Raina_Captain values('Mansi Deb',0,4)";
             
             String entraicappr="insert into Raina_Captain values('Prakhar',0,6)";

            
            
              stmt.executeUpdate(tabraicap);
             stmt.executeUpdate(entraicapai);
              stmt.executeUpdate(entraicapji);
               
                stmt.executeUpdate(entraicapvs);
                 stmt.executeUpdate(entraicapmd);
                 
                  stmt.executeUpdate(entraicappr);
                 
            
            
            
             ////////////////////////////////////////////////////////////////////////////////////////////////////////////
            String tabviceraicap="create table Vice_Raina_Captain(Name varchar(50),NoOfVotes bigint(50),ID int primary key)";
          String entviceraicapja="insert into Vice_Raina_Captain values('Jatin',0,1)";
            String entviceraicapli="insert into Vice_Raina_Captain values('Lijin',0,2)";
            
            
            
             stmt.executeUpdate(tabviceraicap);
              stmt.executeUpdate(entviceraicapja);
              stmt.executeUpdate(entviceraicapli);
             
            
             ////////////////////////////////////////////////////////////////////////////////////////////////////////////
            String tabvaicap="create table Vaidya_Captain(Name varchar(50),NoOfVotes bigint(50),ID int primary key)";
            String entvaicapar="insert into Vaidya_Captain values('Abhay Rana',0,1)";
            String entvaicapan="insert into Vaidya_Captain values('Anmol',0,2)";
            String entvaicapra="insert into Vaidya_Captain values('Riya Arora',0,3)";
            
            
            
            stmt.executeUpdate(tabvaicap);
             stmt.executeUpdate(entvaicapar);
              stmt.executeUpdate(entvaicapan);
               stmt.executeUpdate(entvaicapra);
            
            
             ////////////////////////////////////////////////////////////////////////////////////////////////////////////
            String tabvicevaicap="create table Vice_Vaidya_Captain(Name varchar(50),NoOfVotes bigint(50),ID int primary key)";
          String entvicevaicapan="insert into Vice_Vaidya_Captain values('Anmol',0,1)";
          String entvicevaicapsa="insert into Vice_Vaidya_Captain values('Saksham',0,2)";
            
            
            
            
            stmt.executeUpdate(tabvicevaicap);
             stmt.executeUpdate(entvicevaicapan);
              stmt.executeUpdate(entvicevaicapsa);
              
              
              
              
            
             ////////////////////////////////////////////////////////////////////////////////////////////////////////////
          
           
          ///////////////////////////////////////////////////////////////////////////////////////////////      
                  
           String tabnota="create table NOTA(NoOfNOTA bigint(50));";
             String notas="insert into NOTA values(0)";
             
           String teanota="create table notateacher(noofnota bigint(50));";
           String notatea="insert into notateacher values(0); "; 
            stmt.executeUpdate(tabnota); 
              stmt.executeUpdate(notas); 
             stmt.executeUpdate(teanota); 
              stmt.executeUpdate(notatea);
             
           //////////////////////////////////////////////////////////////////////////////////////////////////
            
            
            
            
             
              JOptionPane.showMessageDialog(this,"Database Created");
            
        


        }

        
        
        catch(Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
        
        



        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeb4;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
