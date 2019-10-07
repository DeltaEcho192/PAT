/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author admin
 */
public class patient_screen extends javax.swing.JFrame {

    /**
     * Creates new form patient_screen
     */
    public int x = 0;
    public int z = -1;
    public ResultSet resultSet = null;
    main M = new main();
    
    
    public patient_screen() {
        initComponents();
        this.getContentPane().setBackground(Color.white);
        refresh();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        patientL = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        patientTable = new javax.swing.JTable();
        nameL = new javax.swing.JLabel();
        surnameL = new javax.swing.JLabel();
        ageL = new javax.swing.JLabel();
        genderL = new javax.swing.JLabel();
        bloodL = new javax.swing.JLabel();
        allergiesL = new javax.swing.JLabel();
        nameT = new javax.swing.JTextField();
        surnameT = new javax.swing.JTextField();
        AgeT = new javax.swing.JTextField();
        bloodD = new javax.swing.JComboBox<>();
        genderD = new javax.swing.JComboBox<>();
        allergiesT = new javax.swing.JTextField();
        docIDL = new javax.swing.JLabel();
        bednumL = new javax.swing.JLabel();
        diagnosisL = new javax.swing.JLabel();
        treatmentL = new javax.swing.JLabel();
        medicationL = new javax.swing.JLabel();
        docIDT = new javax.swing.JTextField();
        bedNumT = new javax.swing.JTextField();
        diagonsisT = new javax.swing.JTextField();
        treatmentT = new javax.swing.JTextField();
        medicationT = new javax.swing.JTextField();
        newB = new javax.swing.JButton();
        dischargeB = new javax.swing.JButton();
        editB = new javax.swing.JButton();
        firstB = new javax.swing.JButton();
        upB = new javax.swing.JButton();
        downB = new javax.swing.JButton();
        lastB = new javax.swing.JButton();
        helpB = new javax.swing.JButton();
        backB = new javax.swing.JButton();
        refreshB = new javax.swing.JButton();
        titleL = new javax.swing.JLabel();
        subTitleL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1110, 800));

        patientL.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        patientL.setText("Patients");

        patientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PatID", "PName", "PSurname", "Age", "Gender", "BloodType", "Allergies", "DocID", "BedNum", "Diagnosis", "Treatment", "Medication"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(patientTable);

        nameL.setText("Name");

        surnameL.setText("Surname");

        ageL.setText("Age");

        genderL.setText("Gender");

        bloodL.setText("Blood Type");

        allergiesL.setText("Allergies");

        bloodD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "O Pos", "O Neg", "AB Pos" }));

        genderD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        genderD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderDActionPerformed(evt);
            }
        });

        docIDL.setText("Doc ID");

        bednumL.setText("Bed Num");

        diagnosisL.setText("Diagnosis");

        treatmentL.setText("Treatment");

        medicationL.setText("Medication");

        medicationT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicationTActionPerformed(evt);
            }
        });

        newB.setText("New Patient");
        newB.setPreferredSize(new java.awt.Dimension(150, 23));
        newB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBActionPerformed(evt);
            }
        });

        dischargeB.setText("Discharge Patient");
        dischargeB.setPreferredSize(new java.awt.Dimension(150, 23));
        dischargeB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dischargeBActionPerformed(evt);
            }
        });

        editB.setText("Edit Patient");
        editB.setPreferredSize(new java.awt.Dimension(150, 23));
        editB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBActionPerformed(evt);
            }
        });

        firstB.setText("<<");
        firstB.setPreferredSize(new java.awt.Dimension(55, 23));
        firstB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstBActionPerformed(evt);
            }
        });

        upB.setText("<");
        upB.setPreferredSize(new java.awt.Dimension(55, 23));
        upB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upBActionPerformed(evt);
            }
        });

        downB.setText(">");
        downB.setPreferredSize(new java.awt.Dimension(55, 23));
        downB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downBActionPerformed(evt);
            }
        });

        lastB.setText(">>");
        lastB.setPreferredSize(new java.awt.Dimension(55, 23));
        lastB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastBActionPerformed(evt);
            }
        });

        helpB.setText("Help");
        helpB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpBActionPerformed(evt);
            }
        });

        backB.setText("Back");
        backB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBActionPerformed(evt);
            }
        });

        refreshB.setText("Refresh");
        refreshB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBActionPerformed(evt);
            }
        });

        titleL.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titleL.setText("St John's Hospital");

        subTitleL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        subTitleL.setText("Administavtive Program");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(46, 46, 46)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(newB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(35, 35, 35)
                                    .addComponent(dischargeB, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(35, 35, 35)
                                    .addComponent(editB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(firstB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(35, 35, 35)
                                    .addComponent(upB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(35, 35, 35)
                                    .addComponent(downB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(35, 35, 35)
                                    .addComponent(lastB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(refreshB)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                                    .addComponent(helpB)
                                    .addGap(39, 39, 39)
                                    .addComponent(backB))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(105, 105, 105)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(surnameL)
                                .addComponent(nameL)
                                .addComponent(ageL)
                                .addComponent(genderL)
                                .addComponent(bloodL)
                                .addComponent(allergiesL))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(genderD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bloodD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(surnameT, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                .addComponent(nameT)
                                .addComponent(AgeT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(allergiesT))
                            .addGap(279, 279, 279)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(docIDL)
                                .addComponent(bednumL)
                                .addComponent(diagnosisL)
                                .addComponent(treatmentL)
                                .addComponent(medicationL))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(bedNumT)
                                .addComponent(docIDT, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(diagonsisT, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(treatmentT)
                                .addComponent(medicationT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(patientL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(titleL)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(subTitleL)))
                                .addGap(260, 260, 260))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(patientL))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titleL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(subTitleL)
                        .addGap(28, 28, 28)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameL)
                    .addComponent(nameT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(docIDL)
                    .addComponent(docIDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(surnameL)
                    .addComponent(surnameT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bednumL)
                    .addComponent(bedNumT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageL)
                    .addComponent(AgeT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diagnosisL)
                    .addComponent(diagonsisT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderL)
                    .addComponent(genderD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(treatmentL)
                    .addComponent(treatmentT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bloodL)
                    .addComponent(bloodD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(medicationL)
                    .addComponent(medicationT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(allergiesL)
                    .addComponent(allergiesT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dischargeB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(upB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(downB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(helpB)
                    .addComponent(backB)
                    .addComponent(refreshB))
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gotoRow(int row)
    {
        patientTable.setRowSelectionInterval(row, row);
        patientTable.scrollRectToVisible(patientTable.getCellRect(row, 0, true));
        
    }
    
    private void refresh()
    {
        x = 0;

        try {
            x = x + 1; 
            //Defines colomun names
            String[] columnNames = {"PatID","PName","PSurname","Age","Gender","BloodType","Allergies","DocID","BedNum","Diagnosis","Treatment","Medication"};
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(columnNames);
            patientTable.setModel(model);

            String query = "SELECT * FROM tblPatient";
            resultSet = M.refresh(query);
            
            //Gets resultSet then loops through it and adds it to the table row by row
            while(resultSet.next()) {
                int patID = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String Surname = resultSet.getString(3);
                int age = resultSet.getInt(7);
                String gender = resultSet.getString(4);
                String bloodtype = resultSet.getString(5);
                String allergies = resultSet.getString(6);
                int docID = resultSet.getInt(8);
                int bedNum = resultSet.getInt(9);
                String diagonis = resultSet.getString(12);
                String Treatment = resultSet.getString(10);
                int medication = resultSet.getInt(11);
                    
                x = x + 1;
                model.addRow(new Object[] {patID,name,Surname,age,gender,bloodtype,allergies,docID,bedNum,diagonis,Treatment,medication});
            }
              
                    
        }
        catch(SQLException sqlex){
            sqlex.printStackTrace();
        }
        finally {

            try {
                resultSet.close();
                
            }
            catch (SQLException sqlex) {
                sqlex.printStackTrace();
            }
        }
    }

    
    private void genderDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderDActionPerformed

    private void medicationTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicationTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medicationTActionPerformed

    private void editBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBActionPerformed
        //Checks if the field is empty. If not then adds the value to the query
        try
        {
            String query = "UPDATE tblPatient SET ";
            int i = 0;
            if(M.stringCheck(nameT.getText()) == true)
            {
                String name = nameT.getText();
                query += "PName = '"+name+"',";
                
            }

            if(M.stringCheck(surnameT.getText()) == true)
            {
                query += "PSurname = '"+surnameT.getText()+"',";
                
            }
            if(!AgeT.getText().isEmpty())
            {
                if(M.zeroCheck(Integer.parseInt(AgeT.getText())) == false)
                {
                    query += "Age = "+Integer.parseInt(AgeT.getText())+",";
                
                }
                else
                {
                    throw new Exception("Age was less than 0");
                }
                
            }
            if(!allergiesT.getText().isEmpty())
            {
                query += "Allergies = '"+allergiesT.getText()+"',";
            }
            if(!docIDT.getText().isEmpty())
            {
                if(M.zeroCheck(Integer.parseInt(docIDT.getText())) == false)
                {
                    query += "DocID = "+Integer.parseInt(docIDT.getText())+","; 
                }
                else
                {
                    throw new Exception("DocID was less than 0");
                }
            }
            if(!bedNumT.getText().isEmpty())
            {
                if(M.zeroCheck(Integer.parseInt(bedNumT.getText()))== false)
                {
                query += "bedNum = "+Integer.parseInt(bedNumT.getText())+",";
                }
                else
                {
                    throw new Exception("Bed Num was less than 0");
                }
                
            }
            if(!diagonsisT.getText().isEmpty())
            {
                query += "Diagnosis = '"+diagonsisT.getText()+"',";
            }
            if(!treatmentT.getText().isEmpty())
            {
                query += "Treatment = '"+treatmentT.getText()+"',";
            }
            if(!medicationT.getText().isEmpty())
            {
                if(M.zeroCheck(Integer.parseInt(medicationT.getText()))== false)
                {
                    query += "Medication = "+Integer.parseInt(medicationT.getText())+",";
                }
                else
                {
                    throw new Exception("Medication is less than 0");
                }

            }

            Object genderO = genderD.getSelectedItem();
            String gender = genderO.toString();
            //checks if the current value on the table is the same as the selected one
            if(!patientTable.getValueAt(z,4).equals(gender))
            {
                query += "Gender = '"+gender+"',";
            }
            
            Object bloodTypeO = bloodD.getSelectedItem();
            String bloodType = bloodTypeO.toString();
            //checks if the current value on the table is the same as the selected one
            if(!patientTable.getValueAt(z,5).equals(bloodType))
            {
                query += "BloodType = '"+bloodType+"',";
            }
              query = query.substring(0,query.length() - 1);
              //If the query is less than a certain length it has not been changed therefor it throws a error
              if(M.editChange(query) == true)
              {
                  throw new Exception("Nothing has been changed");
              }
              //Gets the ID value from the currently selected row and adds to the query
              query += " WHERE PatID = "+patientTable.getValueAt(z,0);
              System.out.println(query);
              M.executeSQL(query);
              refresh();
              
        }
        catch(Exception ex)
        {
             JOptionPane.showMessageDialog(null,ex,"Error",
                    JOptionPane.ERROR_MESSAGE);         
        }
    }//GEN-LAST:event_editBActionPerformed

    private void downBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downBActionPerformed
        gotoRow(z+1);
        z = z + 1;
    }//GEN-LAST:event_downBActionPerformed

    private void dischargeBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dischargeBActionPerformed
        String query = "DELETE FROM tblPatient WHERE PatID = "+patientTable.getValueAt(z, 0);
        System.out.println(query);
        M.executeSQL(query);
        x = x -1;
        refresh();
    }//GEN-LAST:event_dischargeBActionPerformed

    private void newBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBActionPerformed
        //Checks all values and then adds them to a SQL Insert statment
        try
        {
            boolean check = true;
            String name = nameT.getText();
            if(M.stringCheck(name) == false)
            {
                throw new Exception("There was a issue with the name");
            }
            String Surname = surnameT.getText();
            if(M.stringCheck(Surname) == false)
            {
                throw new Exception("There was a issue with the Surname");
            }
            int age = Integer.parseInt(AgeT.getText());
            if(age < 0)
            {
                throw new Exception("Age was less than 0");
            }
            Object genderO = genderD.getSelectedItem();
            String gender = genderO.toString();
            Object bloodTypeO = bloodD.getSelectedItem();
            String bloodType = bloodTypeO.toString();
            String allergies = allergiesT.getText();
            if(allergies.isEmpty())
            {
                throw new Exception("No entry was made for allergies");
            }
            int docID = Integer.parseInt(docIDT.getText());
            if(docID < 0)
            {
                throw new Exception("DocID was less than 0");
            }
            int bedNum = Integer.parseInt(bedNumT.getText());
            if(bedNum < 0)
            {
                throw new Exception("Bed Num was less than 0");
            }
            String diagnosis = diagonsisT.getText();
            if(diagnosis.isEmpty())
            {
                throw new Exception("No entry was made for the Diagnosis");
            }
            String Treatment = treatmentT.getText();
            if(Treatment.isEmpty())
            {
                throw new Exception("No entry was made for Treatment");
            }
            int medication = Integer.parseInt(medicationT.getText());
            if(medication < 0)
            {
                throw new Exception("Medications was less than 0");
            }

                String query  = "INSERT INTO tblPatient (PName,PSurname,Age,Gender,BloodType,Allergies,DocID,bedNum,Diagnosis,Treatment,medication) VALUES ('"+name+"','"+Surname+"',"+age+",'"+gender+"','"+bloodType+"','"+allergies+"',"+docID+
                    ","+bedNum+",'"+diagnosis+"','"+Treatment+"',"+medication+")";
            
                System.out.println(query);
                M.executeSQL(query);
                refresh();

        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex,"Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_newBActionPerformed

    private void upBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upBActionPerformed
      if(z > 0)
      {
        gotoRow(z-1);
        z = z - 1;
      }
    }//GEN-LAST:event_upBActionPerformed

    private void refreshBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBActionPerformed
        refresh();
    }//GEN-LAST:event_refreshBActionPerformed

    private void lastBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastBActionPerformed
        System.out.println(x);
        z = x-2;
        gotoRow(x-2);
        
    }//GEN-LAST:event_lastBActionPerformed

    private void firstBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstBActionPerformed
        z = 0;
        gotoRow(0);
    }//GEN-LAST:event_firstBActionPerformed

    private void backBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBActionPerformed
        main_screen MainSc = new main_screen();
        MainSc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backBActionPerformed

    private void helpBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpBActionPerformed
        help_screen help = new help_screen();
        help.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_helpBActionPerformed

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
            java.util.logging.Logger.getLogger(patient_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(patient_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(patient_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(patient_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new patient_screen().setVisible(true);
                
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AgeT;
    private javax.swing.JLabel ageL;
    private javax.swing.JLabel allergiesL;
    private javax.swing.JTextField allergiesT;
    private javax.swing.JButton backB;
    private javax.swing.JTextField bedNumT;
    private javax.swing.JLabel bednumL;
    private javax.swing.JComboBox<String> bloodD;
    private javax.swing.JLabel bloodL;
    private javax.swing.JLabel diagnosisL;
    private javax.swing.JTextField diagonsisT;
    private javax.swing.JButton dischargeB;
    private javax.swing.JLabel docIDL;
    private javax.swing.JTextField docIDT;
    private javax.swing.JButton downB;
    private javax.swing.JButton editB;
    private javax.swing.JButton firstB;
    private javax.swing.JComboBox<String> genderD;
    private javax.swing.JLabel genderL;
    private javax.swing.JButton helpB;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton lastB;
    private javax.swing.JLabel medicationL;
    private javax.swing.JTextField medicationT;
    private javax.swing.JLabel nameL;
    private javax.swing.JTextField nameT;
    private javax.swing.JButton newB;
    private javax.swing.JLabel patientL;
    private javax.swing.JTable patientTable;
    private javax.swing.JButton refreshB;
    private javax.swing.JLabel subTitleL;
    private javax.swing.JLabel surnameL;
    private javax.swing.JTextField surnameT;
    private javax.swing.JLabel titleL;
    private javax.swing.JLabel treatmentL;
    private javax.swing.JTextField treatmentT;
    private javax.swing.JButton upB;
    // End of variables declaration//GEN-END:variables
}
