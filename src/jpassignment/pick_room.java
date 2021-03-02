/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpassignment;


import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JFrame;

/**
 *
 * @author devil
 */
public class pick_room extends javax.swing.JFrame {

    private StaffMain staffmain;
    private Booking booking;
    private Date startDate,endDate;
    
    public pick_room(JFrame v,Date sd, Date ed){
        initComponents();
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        
        if (v instanceof Booking){
         this.booking = (Booking)v;
        }
        else{
            this.staffmain = (StaffMain)v;
        }
        startDate = sd;
        endDate = ed;
        String a = sdf.format(sd);
        String b = sdf.format(ed);
        LocalDate startDate = LocalDate.parse(a);
        LocalDate endDate = LocalDate.parse(b);
        
        File file = new File("booking.txt");
        
        try{
            
            Scanner inputFile = new Scanner(file);

            while (inputFile.hasNext()){
                inputFile.nextLine();
                inputFile.nextLine();
                inputFile.nextLine();
                inputFile.nextLine();
                inputFile.nextLine();
                String date1 = inputFile.nextLine();
                String date2 = inputFile.nextLine();
                String room = inputFile.nextLine();
                LocalDate startDate_r = LocalDate.parse(date1);
                LocalDate endDate_r = LocalDate.parse(date2);
                

                inputFile.nextLine();
                for(int i=1;i<21;i++){   

if (startDate.isBefore(endDate_r) == true 
        && startDate_r.isBefore(endDate) == true 
        && startDate.isBefore(endDate) == true 
        && startDate_r.isBefore(endDate_r) == true) {
        this.disablebook(i,room);
   
}
                    }
            }
            inputFile.close();
        }
        catch (FileNotFoundException ex){
            System.out.println("Unable to open file due to "+ex);
                
            }
    }
       
    
    public void disablebook(int i, String rn){
        String roomname;
         switch (i) {
  case 1:
   roomname = this.Room1.getText();
   if(roomname.equals(rn)){
    this.Room1.setEnabled(false);}
    break;
  case 2:
   roomname = this.Room2.getText();
   if(roomname.equals(rn)){
    this.Room2.setEnabled(false);}
    break;
  case 3:
   roomname = this.Room3.getText();
   if(roomname.equals(rn)){
    this.Room3.setEnabled(false);}
    break;
  case 4:
    roomname = this.Room4.getText();
   if(roomname.equals(rn)){
    this.Room4.setEnabled(false);}
    break;
  case 5:
   roomname = this.Room5.getText();
   if(roomname.equals(rn)){
    this.Room5.setEnabled(false);}
    break;
  case 6:
   roomname = this.Room6.getText();
   if(roomname.equals(rn)){
    this.Room6.setEnabled(false);}
    break;
  case 7:
   roomname = this.Room7.getText();
   if(roomname.equals(rn)){
    this.Room7.setEnabled(false);}
    break;
      case 8:
   roomname = this.Room8.getText();
   if(roomname.equals(rn)){
    this.Room8.setEnabled(false);}
    break;
      case 9:
   roomname = this.Room9.getText();
   if(roomname.equals(rn)){
    this.Room9.setEnabled(false);}
    break;
      case 10:
   roomname = this.Room10.getText();
   if(roomname.equals(rn)){
    this.Room10.setEnabled(false);}
    break;
      case 11:
   roomname = this.Room11.getText();
   if(roomname.equals(rn)){
    this.Room11.setEnabled(false);}
    break;
      case 12:
   roomname = this.Room12.getText();
   if(roomname.equals(rn)){
    this.Room12.setEnabled(false);}
    break;
      case 13:
   roomname = this.Room13.getText();
   if(roomname.equals(rn)){
    this.Room13.setEnabled(false);}
    break;
      case 14:
   roomname = this.Room14.getText();
   if(roomname.equals(rn)){
    this.Room14.setEnabled(false);}
    break;
      case 15:
   roomname = this.Room15.getText();
   if(roomname.equals(rn)){
    this.Room15.setEnabled(false);}
    break;
      case 16:
   roomname = this.Room16.getText();
   if(roomname.equals(rn)){
    this.Room16.setEnabled(false);}
    break;
      case 17:
   roomname = this.Room17.getText();
   if(roomname.equals(rn)){
    this.Room17.setEnabled(false);}
    break;
      case 18:
   roomname = this.Room18.getText();
   if(roomname.equals(rn)){
    this.Room18.setEnabled(false);}
    break;
      case 19:
   roomname = this.Room19.getText();
   if(roomname.equals(rn)){
    this.Room19.setEnabled(false);}
    break;
      case 20:
   roomname = this.Room20.getText();
   if(roomname.equals(rn)){
    this.Room20.setEnabled(false);}
    break;
    
}
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
        jLabel2 = new javax.swing.JLabel();
        Room1 = new javax.swing.JButton();
        Room2 = new javax.swing.JButton();
        Room3 = new javax.swing.JButton();
        Room4 = new javax.swing.JButton();
        Room5 = new javax.swing.JButton();
        Room6 = new javax.swing.JButton();
        Room7 = new javax.swing.JButton();
        Room8 = new javax.swing.JButton();
        Room9 = new javax.swing.JButton();
        Room10 = new javax.swing.JButton();
        Room11 = new javax.swing.JButton();
        Room12 = new javax.swing.JButton();
        Room13 = new javax.swing.JButton();
        Room14 = new javax.swing.JButton();
        Room15 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Room16 = new javax.swing.JButton();
        Room17 = new javax.swing.JButton();
        Room18 = new javax.swing.JButton();
        Room19 = new javax.swing.JButton();
        Room20 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel1.setText("Pick a room");

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel2.setText("Floor 1");

        Room1.setBackground(new java.awt.Color(250, 134, 134));
        Room1.setText("Room 1");
        Room1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Room1ActionPerformed(evt);
            }
        });

        Room2.setBackground(new java.awt.Color(250, 134, 134));
        Room2.setText("Room 2");
        Room2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Room2ActionPerformed(evt);
            }
        });

        Room3.setBackground(new java.awt.Color(250, 134, 134));
        Room3.setText("Room 3");
        Room3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Room3ActionPerformed(evt);
            }
        });

        Room4.setBackground(new java.awt.Color(250, 134, 134));
        Room4.setText("Room 4");
        Room4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Room4ActionPerformed(evt);
            }
        });

        Room5.setBackground(new java.awt.Color(250, 134, 134));
        Room5.setText("Room 5");
        Room5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Room5ActionPerformed(evt);
            }
        });

        Room6.setBackground(new java.awt.Color(250, 134, 134));
        Room6.setText("Room 6");
        Room6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Room6ActionPerformed(evt);
            }
        });

        Room7.setBackground(new java.awt.Color(250, 134, 134));
        Room7.setText("Room 7");
        Room7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Room7ActionPerformed(evt);
            }
        });

        Room8.setBackground(new java.awt.Color(250, 134, 134));
        Room8.setText("Room 8");
        Room8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Room8ActionPerformed(evt);
            }
        });

        Room9.setBackground(new java.awt.Color(250, 134, 134));
        Room9.setText("Room 9");
        Room9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Room9ActionPerformed(evt);
            }
        });

        Room10.setBackground(new java.awt.Color(250, 134, 134));
        Room10.setText("Room 10");
        Room10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Room10ActionPerformed(evt);
            }
        });

        Room11.setBackground(new java.awt.Color(126, 187, 246));
        Room11.setText("Room 11");
        Room11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Room11ActionPerformed(evt);
            }
        });

        Room12.setBackground(new java.awt.Color(126, 187, 246));
        Room12.setText("Room 12");
        Room12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Room12ActionPerformed(evt);
            }
        });

        Room13.setBackground(new java.awt.Color(126, 187, 246));
        Room13.setText("Room 13");
        Room13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Room13ActionPerformed(evt);
            }
        });

        Room14.setBackground(new java.awt.Color(126, 187, 246));
        Room14.setText("Room 14");
        Room14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Room14ActionPerformed(evt);
            }
        });

        Room15.setBackground(new java.awt.Color(126, 187, 246));
        Room15.setText("Room 15");
        Room15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Room15ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel3.setText("Floor 2");

        Room16.setBackground(new java.awt.Color(126, 187, 246));
        Room16.setText("Room 16");
        Room16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Room16ActionPerformed(evt);
            }
        });

        Room17.setBackground(new java.awt.Color(126, 187, 246));
        Room17.setText("Room 17");
        Room17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Room17ActionPerformed(evt);
            }
        });

        Room18.setBackground(new java.awt.Color(126, 187, 246));
        Room18.setText("Room 18");
        Room18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Room18ActionPerformed(evt);
            }
        });

        Room19.setBackground(new java.awt.Color(126, 187, 246));
        Room19.setText("Room 19");
        Room19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Room19ActionPerformed(evt);
            }
        });

        Room20.setBackground(new java.awt.Color(126, 187, 246));
        Room20.setText("Room 20");
        Room20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Room20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Room6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Room7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Room8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Room9, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Room10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Room1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Room2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(Room3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Room4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Room5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Room11, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Room12, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Room13, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Room16, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Room17, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Room18, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Room14, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Room15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Room19, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Room20, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Room1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Room3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Room4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Room5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Room2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Room8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Room7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Room9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Room10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Room6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Room11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Room12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Room13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Room14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Room15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Room18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Room19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Room17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Room16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Room20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Room19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Room19ActionPerformed
       if (this.booking != null ){
          booking.changeButtonText(Room19.getText());  
       }
       else{
          staffmain.changeButtonText(Room19.getText());  
       }

        this.dispose();
    }//GEN-LAST:event_Room19ActionPerformed

    private void Room12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Room12ActionPerformed
       if (this.booking != null ){
          booking.changeButtonText(Room12.getText());  
       }
       else{
          staffmain.changeButtonText(Room12.getText());  
       }
        this.dispose();
    }//GEN-LAST:event_Room12ActionPerformed

    private void Room11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Room11ActionPerformed
       if (this.booking != null ){
          booking.changeButtonText(Room11.getText());  
       }
       else{
          staffmain.changeButtonText(Room11.getText());  
       }
        this.dispose();  // TODO add your handling code here:
    }//GEN-LAST:event_Room11ActionPerformed

    private void Room1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Room1ActionPerformed
       if (this.booking != null ){
          booking.changeButtonText(Room1.getText());  
       }
       else{
          staffmain.changeButtonText(Room1.getText());  
       }

        this.dispose();  // TODO add your handling code here:
    }//GEN-LAST:event_Room1ActionPerformed

    private void Room3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Room3ActionPerformed
        if (this.booking != null ){
          booking.changeButtonText(Room3.getText());  
       }
       else{
          staffmain.changeButtonText(Room3.getText());  
       }

        this.dispose();       // TODO add your handling code here:
    }//GEN-LAST:event_Room3ActionPerformed

    private void Room2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Room2ActionPerformed
       if (this.booking != null ){
          booking.changeButtonText(Room2.getText());  
       }
       else{
          staffmain.changeButtonText(Room2.getText());  
       }

        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_Room2ActionPerformed

    private void Room4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Room4ActionPerformed
       if (this.booking != null ){
          booking.changeButtonText(Room4.getText());  
       }
       else{
          staffmain.changeButtonText(Room4.getText());  
       }

        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_Room4ActionPerformed

    private void Room5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Room5ActionPerformed
       if (this.booking != null ){
          booking.changeButtonText(Room5.getText());  
       }
       else{
          staffmain.changeButtonText(Room5.getText());  
       }

        this.dispose();          // TODO add your handling code here:
    }//GEN-LAST:event_Room5ActionPerformed

    private void Room8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Room8ActionPerformed
       if (this.booking != null ){
          booking.changeButtonText(Room8.getText());  
       }
       else{
          staffmain.changeButtonText(Room8.getText());  
       }

        this.dispose();          // TODO add your handling code here:
    }//GEN-LAST:event_Room8ActionPerformed

    private void Room7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Room7ActionPerformed
       if (this.booking != null ){
          booking.changeButtonText(Room7.getText());  
       }
       else{
          staffmain.changeButtonText(Room7.getText());  
       }

        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_Room7ActionPerformed

    private void Room6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Room6ActionPerformed
        if (this.booking != null ){
          booking.changeButtonText(Room6.getText());  
       }
       else{
          staffmain.changeButtonText(Room6.getText());  
       }

        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_Room6ActionPerformed

    private void Room9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Room9ActionPerformed
         if (this.booking != null ){
          booking.changeButtonText(Room9.getText());  
       }
       else{
          staffmain.changeButtonText(Room9.getText());  
       }

        this.dispose();          // TODO add your handling code here:
    }//GEN-LAST:event_Room9ActionPerformed

    private void Room10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Room10ActionPerformed
       if (this.booking != null ){
          booking.changeButtonText(Room10.getText());  
       }
       else{
          staffmain.changeButtonText(Room10.getText());  
       }

        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_Room10ActionPerformed

    private void Room13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Room13ActionPerformed
       if (this.booking != null ){
          booking.changeButtonText(Room13.getText());  
       }
       else{
          staffmain.changeButtonText(Room13.getText());  
       }

        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_Room13ActionPerformed

    private void Room14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Room14ActionPerformed
       if (this.booking != null ){
          booking.changeButtonText(Room14.getText());  
       }
       else{
          staffmain.changeButtonText(Room14.getText());  
       }

        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_Room14ActionPerformed

    private void Room15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Room15ActionPerformed
        if (this.booking != null ){
          booking.changeButtonText(Room15.getText());  
       }
       else{
          staffmain.changeButtonText(Room15.getText());  
       }

        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_Room15ActionPerformed

    private void Room16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Room16ActionPerformed
         if (this.booking != null ){
          booking.changeButtonText(Room16.getText());  
       }
       else{
          staffmain.changeButtonText(Room16.getText());  
       }

        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_Room16ActionPerformed

    private void Room17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Room17ActionPerformed
       if (this.booking != null ){
          booking.changeButtonText(Room17.getText());  
       }
       else{
          staffmain.changeButtonText(Room17.getText());  
       }

        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_Room17ActionPerformed

    private void Room18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Room18ActionPerformed
       if (this.booking != null ){
          booking.changeButtonText(Room18.getText());  
       }
       else{
          staffmain.changeButtonText(Room18.getText());  
       }

        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_Room18ActionPerformed

    private void Room20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Room20ActionPerformed
       if (this.booking != null ){
          booking.changeButtonText(Room20.getText());  
       }
       else{
          staffmain.changeButtonText(Room20.getText());  
       }

        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_Room20ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Room1;
    private javax.swing.JButton Room10;
    private javax.swing.JButton Room11;
    private javax.swing.JButton Room12;
    private javax.swing.JButton Room13;
    private javax.swing.JButton Room14;
    private javax.swing.JButton Room15;
    private javax.swing.JButton Room16;
    private javax.swing.JButton Room17;
    private javax.swing.JButton Room18;
    private javax.swing.JButton Room19;
    private javax.swing.JButton Room2;
    private javax.swing.JButton Room20;
    private javax.swing.JButton Room3;
    private javax.swing.JButton Room4;
    private javax.swing.JButton Room5;
    private javax.swing.JButton Room6;
    private javax.swing.JButton Room7;
    private javax.swing.JButton Room8;
    private javax.swing.JButton Room9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
