/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpassignment;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author devil
 */
public class StaffMain extends javax.swing.JFrame {

private List<String> bkid = new ArrayList<>();
private List<String> custname = new ArrayList<>();
private List<String> email = new ArrayList<>();
private List<String> icnumber = new ArrayList<>();
private List<String> contactnumber = new ArrayList<>();
private List<String> startdate = new ArrayList<>();
private List<String> enddate = new ArrayList<>();
private List<String> roomnumber = new ArrayList<>();
 
    public StaffMain() {
        initComponents();
        
         File file = new File("booking.txt");
         try{
            
            Scanner inputFile = new Scanner(file);
            
            while (inputFile.hasNext()){
                String bookid = inputFile.nextLine();
                if (bookid !=null)bkid.add(bookid);
                
                String name =  inputFile.nextLine();
                if (name !=null)custname.add(name);
                
                String em = inputFile.nextLine();
                if (em !=null)email.add(em);
                
                String icnum = inputFile.nextLine();
                if (icnum !=null)icnumber.add(icnum);
                
                String contactnum = inputFile.nextLine();
                if (contactnum !=null)contactnumber.add(contactnum);
                
                String date1 = inputFile.nextLine();
                if (date1 !=null)startdate.add(date1);
                
                String date2 = inputFile.nextLine();
                if (date2 !=null)enddate.add(date2);
                
                String room = inputFile.nextLine();
                if (room !=null)roomnumber.add(room);

                inputFile.nextLine();
                
                DefaultTableModel model = (DefaultTableModel)tbStaffMain.getModel();
                model.addRow(new Object[]{bookid,name,em,icnum,contactnum,date1,date2,room});
            }
            inputFile.close();
         }
         
         
         catch (FileNotFoundException ex){
             JOptionPane.showMessageDialog(null,"There is no records, feel free to create one.");
         }
       
    }

    public static void editBooking(String editing_bookingid, String newname, String newemail, String newic, String newcontact, String newroom){
    String tempfile = "tempbooking.txt";
    File oldfile = new File("booking.txt");
    File newfile = new File(tempfile);
    String bkid,name,email,ic,contact,sdate,edate,room;
    
    try{
         FileWriter fw = new FileWriter(tempfile,true);
         BufferedWriter bw = new BufferedWriter(fw);
         Scanner sc = new Scanner(oldfile);
                 
            while (sc.hasNext()){
                bkid = sc.nextLine();
                name = sc.nextLine();
                email = sc.nextLine();
                ic = sc.nextLine();
                contact = sc.nextLine();
                sdate = sc.nextLine();
                edate = sc.nextLine();
                room = sc.nextLine();            

                sc.nextLine();
           
             if(bkid.equals(editing_bookingid))
             {
            bw.write(editing_bookingid);
            bw.newLine(); 
            bw.write(newname);
            bw.newLine();            
            bw.write(newemail);
            bw.newLine();  
            bw.write(newic);
            bw.newLine();  
            bw.write(newcontact);
            bw.newLine();            
            bw.write(sdate);
            bw.newLine();  
            bw.write(edate);
            bw.newLine();  
            bw.write(newroom);
            bw.newLine(); 
            bw.write("---");
            bw.newLine();  
             }
             else{
            bw.write(bkid);
            bw.newLine(); 
            bw.write(name);
            bw.newLine();            
            bw.write(email);
            bw.newLine();  
            bw.write(ic);
            bw.newLine();  
            bw.write(contact);
            bw.newLine();            
            bw.write(sdate);
            bw.newLine();  
            bw.write(edate);
            bw.newLine();  
            bw.write(room);
            bw.newLine(); 
            bw.write("---");
            bw.newLine();  
             }
             
         }
 
             sc.close();            
              bw.flush();
             bw.close();
             oldfile.delete();
             File dump = new File("booking.txt");
             newfile.renameTo(dump);
       
         
    }catch (IOException ex) {
        Logger.getLogger(StaffMain.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    
    public static void deleteBooking(String selected_bookingid){
    String tempfile = "tempbooking.txt";
    File oldfile = new File("booking.txt");
    File newfile = new File(tempfile);
    
    String tempreceipt = "tempreceipt.txt";
    File oldreceipt = new File("receipt.txt");
    File newreceipt = new File(tempreceipt);
    String bkid,name,email,ic,contact,sdate,edate,room;

    
    try{
         FileWriter fw = new FileWriter(tempfile,true);
         BufferedWriter bw = new BufferedWriter(fw);
         Scanner sc = new Scanner(oldfile);
        
         
                 
            while (sc.hasNext()){
                bkid = sc.nextLine();
                name = sc.nextLine();
                email = sc.nextLine();
                ic = sc.nextLine();
                contact = sc.nextLine();
                sdate = sc.nextLine();
                edate = sc.nextLine();
                room = sc.nextLine();            

                sc.nextLine();
           
             if(bkid.equals(selected_bookingid) == false)
             {
            bw.write(bkid);
            bw.newLine(); 
            bw.write(name);
            bw.newLine();            
            bw.write(email);
            bw.newLine();  
            bw.write(ic);
            bw.newLine();  
            bw.write(contact);
            bw.newLine();            
            bw.write(sdate);
            bw.newLine();  
            bw.write(edate);
            bw.newLine();  
            bw.write(room);
            bw.newLine(); 
            bw.write("---");
            bw.newLine();  
             }
             
         }
 
             sc.close();            
              bw.flush();
             bw.close();
             oldfile.delete();
             File dump = new File("booking.txt");
             newfile.renameTo(dump);
      
    }catch (IOException ex) {
        System.out.println(ex);
    }
    }
    
    public static void deleteReceipt(String selected_bookingid){
    String tempfile = "tempreceipt.txt";
    File oldfile = new File("receipt.txt");
    File newfile = new File(tempfile);
   
    String bkid,roomfees,servicetaxs,tourismtaxs,totalcharge,payamount,changeamount;

    
    try{
         FileWriter fw = new FileWriter(tempfile,true);
         BufferedWriter bw = new BufferedWriter(fw);
         Scanner sc = new Scanner(oldfile);
            
            while (sc.hasNext()){
                roomfees = sc.nextLine();
                servicetaxs = sc.nextLine();
                tourismtaxs = sc.nextLine();
                totalcharge = sc.nextLine();
                payamount = sc.nextLine();
                changeamount = sc.nextLine();
                bkid = sc.nextLine();         

                sc.nextLine();
           
             if(bkid.equals(selected_bookingid) == false)
             {
            bw.write(roomfees);
            bw.newLine(); 
            bw.write(servicetaxs);
            bw.newLine();            
            bw.write(tourismtaxs);
            bw.newLine();  
            bw.write(totalcharge);
            bw.newLine();  
            bw.write(payamount);
            bw.newLine();            
            bw.write(changeamount);
            bw.newLine();  
            bw.write(bkid);
            bw.newLine();  
            bw.write("---");
            bw.newLine();  
             }
             
         }
 
             sc.close();            
             bw.flush();
             bw.close();
             oldfile.delete();
             File dump2 = new File("receipt.txt");
             newfile.renameTo(dump2);
      
    }catch (IOException ex) {
        System.out.println(ex);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tbStaffMain = new javax.swing.JTable();
        lbStaff = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lbEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lbName1 = new javax.swing.JLabel();
        txtIC = new javax.swing.JTextField();
        lbName2 = new javax.swing.JLabel();
        txtNumber = new javax.swing.JTextField();
        lbName3 = new javax.swing.JLabel();
        lbName4 = new javax.swing.JLabel();
        txtSearch_SM = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnLogout_SM = new javax.swing.JButton();
        btnBooking_SM = new javax.swing.JButton();
        btnViewReceipt_SM = new javax.swing.JButton();
        lbName5 = new javax.swing.JLabel();
        txtStartDate = new javax.swing.JTextField();
        lbName6 = new javax.swing.JLabel();
        lbName7 = new javax.swing.JLabel();
        txtEndDate = new javax.swing.JTextField();
        lbDOS_SM = new javax.swing.JLabel();
        lbName8 = new javax.swing.JLabel();
        lbbookid = new javax.swing.JLabel();
        btnpickroom = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        tbStaffMain.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BookingID", "Name", "Email", "IC/Passport", "Contact Number", "Start Date", "End Date", "Room"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbStaffMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbStaffMainMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbStaffMain);

        lbStaff.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        lbStaff.setText("STAFF");

        lbName.setText("Name");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        lbEmail.setText("Email");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        lbName1.setText("IC/Passport");

        txtIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtICActionPerformed(evt);
            }
        });

        lbName2.setText("Contact Number");

        txtNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumberActionPerformed(evt);
            }
        });

        lbName3.setText("Room ID");

        lbName4.setText("Days of stays:");

        txtSearch_SM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearch_SMActionPerformed(evt);
            }
        });
        txtSearch_SM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearch_SMKeyPressed(evt);
            }
        });

        jLabel1.setText("Search");

        btnModify.setText("Modify");
        btnModify.setEnabled(false);
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.setEnabled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnLogout_SM.setText("Logout");
        btnLogout_SM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogout_SMActionPerformed(evt);
            }
        });

        btnBooking_SM.setText("Booking for customer");
        btnBooking_SM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBooking_SMActionPerformed(evt);
            }
        });

        btnViewReceipt_SM.setText("View Receipt");
        btnViewReceipt_SM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewReceipt_SMActionPerformed(evt);
            }
        });

        lbName5.setBackground(new java.awt.Color(192, 192, 192));
        lbName5.setText("Booking date");

        txtStartDate.setEditable(false);
        txtStartDate.setText("Start Date");
        txtStartDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStartDateActionPerformed(evt);
            }
        });

        lbName6.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        lbName6.setForeground(new java.awt.Color(55, 55, 55));
        lbName6.setText("From");

        lbName7.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        lbName7.setForeground(new java.awt.Color(55, 55, 55));
        lbName7.setText("To");

        txtEndDate.setEditable(false);
        txtEndDate.setText("End date");
        txtEndDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEndDateActionPerformed(evt);
            }
        });

        lbDOS_SM.setText("D.O.S");

        lbName8.setText("Booking ID :");

        lbbookid.setText("---");

        btnpickroom.setText("Room");
        btnpickroom.setEnabled(false);
        btnpickroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpickroomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnViewReceipt_SM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbStaff, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBooking_SM, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSearch_SM, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 437, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbName8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbbookid))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbName)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbEmail)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbName1)
                                    .addComponent(txtIC, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbName2)
                                    .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lbName5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbName3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnpickroom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lbName4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lbDOS_SM)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnLogout_SM, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(lbName6)
                                            .addGap(103, 103, 103)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbName7)
                                        .addComponent(txtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSearch_SM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbName8)
                        .addComponent(lbbookid)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbName)
                            .addComponent(lbEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbName2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbName1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbName3)
                        .addGap(3, 3, 3)
                        .addComponent(btnpickroom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbName5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbName6, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbName7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbName4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbDOS_SM))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnModify)
                            .addComponent(btnDelete))))
                .addGap(56, 56, 56)
                .addComponent(btnBooking_SM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogout_SM)
                    .addComponent(btnViewReceipt_SM))
                .addGap(19, 19, 19))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtICActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtICActionPerformed

    private void txtNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumberActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
       int opt = JOptionPane.showConfirmDialog(null,"Complete editing?","Edit Confirmation",JOptionPane.YES_NO_OPTION);
       if(opt == 0){
        String getbookid = lbbookid.getText();
        String newname = txtName.getText();
        String newemail = txtEmail.getText();
        String newIC = txtIC.getText();
        String newnumb = txtNumber.getText();
        String newroom = btnpickroom.getText();
        this.editBooking(getbookid, newname, newemail, newIC, newnumb,newroom);
        
        this.dispose();
        new StaffMain().setVisible(true);
       }
    }//GEN-LAST:event_btnModifyActionPerformed

    private void txtStartDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStartDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStartDateActionPerformed

    private void txtEndDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEndDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEndDateActionPerformed

    private void tbStaffMainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbStaffMainMouseClicked
        try{
            int row = tbStaffMain.getSelectedRow();
            String clicked_id = (tbStaffMain.getModel().getValueAt(row,0).toString());
            int n = bkid.size();
            int recordcounter;
            for(int i = 0; i < n; i++){
            if (bkid.get(i) == clicked_id){
                recordcounter = i;
                lbbookid.setText(clicked_id);
                txtName.setText(custname.get(recordcounter));
                txtEmail.setText(email.get(recordcounter));
                txtIC.setText(icnumber.get(recordcounter));
                txtNumber.setText(contactnumber.get(recordcounter));
                txtStartDate.setText(startdate.get(recordcounter));
                txtEndDate.setText(enddate.get(recordcounter));
                btnpickroom.setText(roomnumber.get(recordcounter));
                
                LocalDate a = LocalDate.parse(startdate.get(recordcounter));
                LocalDate b = LocalDate.parse(enddate.get(recordcounter));
                long stayofdays = ChronoUnit.DAYS.between(a, b);
                String days = Long.toString(stayofdays);
                lbDOS_SM.setText(days);
                btnpickroom.setEnabled(true);
                btnModify.setEnabled(true);
                btnDelete.setEnabled(true);
                
            }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
// TODO add your handling code here:
    }//GEN-LAST:event_tbStaffMainMouseClicked

    private void btnpickroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpickroomActionPerformed
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String s = txtStartDate.getText();
        String e = txtEndDate.getText();
       try{
           Date Start = sdf.parse(s);
           Date End = sdf.parse(e);

        if (Start != null && End != null){
        new pick_room(this,Start,End).setVisible(true);}
        else{
            JOptionPane.showMessageDialog(null,"Please select a proper date before selecting rooms.");
        }

       } catch(ParseException parse_date_error){
           JOptionPane.showMessageDialog(null,"Can't open room selection due to " + parse_date_error);
       }
        
  

    }//GEN-LAST:event_btnpickroomActionPerformed

    private void btnBooking_SMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBooking_SMActionPerformed
    new Booking().setVisible(true);
    this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_btnBooking_SMActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
              int opt = JOptionPane.showConfirmDialog(null,"Are you sure you want to delete the selected record?","Delete confirmation",JOptionPane.YES_NO_OPTION);
       if(opt == 0){
        String getbookid = lbbookid.getText();
        this.deleteBooking(getbookid);
        this.deleteReceipt(getbookid);
        this.dispose();
        new StaffMain().setVisible(true); 
       }// TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtSearch_SMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearch_SMActionPerformed
DefaultTableModel model = (DefaultTableModel) tbStaffMain.getModel();
TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
tbStaffMain.setRowSorter(tr);
tr.setRowFilter(RowFilter.regexFilter(txtSearch_SM.getText().trim()));     // TODO add your handling code here:
    }//GEN-LAST:event_txtSearch_SMActionPerformed

    private void txtSearch_SMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearch_SMKeyPressed
// TODO add your handling code here:
    }//GEN-LAST:event_txtSearch_SMKeyPressed

    private void btnViewReceipt_SMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewReceipt_SMActionPerformed
    new Receipt().setVisible(true);
    this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewReceipt_SMActionPerformed

    private void btnLogout_SMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogout_SMActionPerformed
          int o = JOptionPane.showConfirmDialog(null,"Are you sure you want to logout?","Logout",JOptionPane.YES_NO_OPTION);   
          if (o == 0){
        this.dispose();
        new Login().setVisible(true);   
          }// TODO add your handling code here:
    }//GEN-LAST:event_btnLogout_SMActionPerformed
    public void changeButtonText(String r){
        this.btnpickroom.setText(r);
    }
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBooking_SM;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnLogout_SM;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnViewReceipt_SM;
    private javax.swing.JButton btnpickroom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDOS_SM;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbName1;
    private javax.swing.JLabel lbName2;
    private javax.swing.JLabel lbName3;
    private javax.swing.JLabel lbName4;
    private javax.swing.JLabel lbName5;
    private javax.swing.JLabel lbName6;
    private javax.swing.JLabel lbName7;
    private javax.swing.JLabel lbName8;
    private javax.swing.JLabel lbStaff;
    private javax.swing.JLabel lbbookid;
    private javax.swing.JTable tbStaffMain;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndDate;
    private javax.swing.JTextField txtIC;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNumber;
    private javax.swing.JTextField txtSearch_SM;
    private javax.swing.JTextField txtStartDate;
    // End of variables declaration//GEN-END:variables
}
