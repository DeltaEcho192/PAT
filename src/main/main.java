/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class main {
    public void executeSQL(String query)
    {
        Connection connection = null;
        Statement statement = null;

        try {
 
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        }
        catch(ClassNotFoundException cnfex) {
 
            System.out.println("Problem in loading or "
                    + "registering MS Access JDBC driver");
            cnfex.printStackTrace();
        }

        try {
            
            String msAccDB = System.getProperty("user.dir")+"\\src\\main\\"
                    + "StJohnDatabase_PAT.accdb";
            String dbURL = "jdbc:ucanaccess://"
                    + msAccDB; 

            connection = DriverManager.getConnection(dbURL); 

            statement = connection.createStatement();

            statement.executeUpdate(query);             
            
        } 
        catch(SQLException sqlex){
            sqlex.printStackTrace();
        }
        finally {

            try {
                if(null != connection) {

                    statement.close();

                    connection.close();
                }
            }
            catch (SQLException sqlex) {
                sqlex.printStackTrace();
            }
        }
    }
    public ResultSet refresh(String query)
    {
        ResultSet resultSet = null;
        Connection connection = null;
        Statement statement = null;

        try {
 
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        }
        catch(ClassNotFoundException cnfex) {
 
            System.out.println("Problem in loading or "
                    + "registering MS Access JDBC driver");
            cnfex.printStackTrace();
        }

        try {
            String msAccDB = System.getProperty("user.dir")+"\\src\\main\\"
                    + "StJohnDatabase_PAT.accdb";
            String dbURL = "jdbc:ucanaccess://"
                    + msAccDB; 

            connection = DriverManager.getConnection(dbURL); 

            statement = connection.createStatement();

            resultSet = statement.executeQuery(query);
 
            
                    
        }
        catch(SQLException sqlex){
            sqlex.printStackTrace();
        }
        return resultSet;
    }
    public boolean stringCheck(String s)
    {
       boolean check = true;
       
       if(s.isEmpty())
       {
           check = false;
           
       }
       else{
        for(int i = 0; i < s.length();i++)
        {
            char x = s.charAt(i);
            if(Character.isDigit(x) == true)
            {
                check = false;
            }
        }
       }
       return check;
   }
    public boolean zeroCheck(int i)
    {
        boolean check = false;
        if(i < 0)
        {
            check = true;
        }
        return check;
    }
    public boolean editChange(String query)
    {
        boolean check = false;
        if(query.length() < 23)
        {
             check = true;
        }
        return check;
    }
    public boolean dateCheck(Date a,Date d)
    {
        boolean check = false;
        if(a.compareTo(d) > 0)
        {
            check = true;
        }
        return check;
    }
    
        public String fileReader(int choiceNum)
        {
        File file = new File("help.txt");
        String temp;
        String output = "";
        int i = 0;
        

        try
        {
         Scanner scFile = new Scanner(file).useDelimiter("#");
         String line, name;
         while (scFile.hasNext())
         {
            line = scFile.nextLine();
            if(line.contains("#"))
            {
                i = i + 1;
            }
            else
            {
                if(choiceNum == i)
                {
                    output = output + line + "\n";
                }
                
            }
            
            
                    
         }
         scFile.close();
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return output;
    }
        public boolean loginCheck(String username,String password)
        {
            boolean check = false;
            if(username.contentEquals("EmployeeID") && password.contentEquals("Password"))
            {
                check = true;
            }
            return check;
        }
    
}

