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
    //Method to execute SQL code. Takes a string query as input and returns nothing
    public void executeSQL(String query)
    {
        //Defines variables
        Connection connection = null;
        Statement statement = null;

        //Loads MSACCESS driver
        try {
 
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        }
        catch(ClassNotFoundException cnfex) {
 
            System.out.println("Problem in loading or "
                    + "registering MS Access JDBC driver");
            cnfex.printStackTrace();
        }
        
        try {
            //Defines where the MSACCESS Database file is.
            //Extra functionallity as long as in the same directory doesnt matter what the users file structure is
            String msAccDB = System.getProperty("user.dir")+"\\src\\main\\"
                    + "StJohnDatabase_PAT.accdb";
            String dbURL = "jdbc:ucanaccess://"
                    + msAccDB; 
            
            //Creates Connection
            connection = DriverManager.getConnection(dbURL); 
            //Creates a prepared statement
            statement = connection.createStatement();
            //Executes the given query to the database
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
    //Method which connects to a MSACCESS Database and querys data
    //Data is returned in the form of a ResultSet. Takes string as input
    public ResultSet refresh(String query)
    {
        //Defines variables
        ResultSet resultSet = null;
        Connection connection = null;
        Statement statement = null;

        //Loads MSACCESS driver
        try {
 
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        }
        catch(ClassNotFoundException cnfex) {
 
            System.out.println("Problem in loading or "
                    + "registering MS Access JDBC driver");
            cnfex.printStackTrace();
        }

        try {
            //Defines where the MSACCESS Database file is.
            //Extra functionallity as long as in the same directory doesnt matter what the users file structure is
            String msAccDB = System.getProperty("user.dir")+"\\src\\main\\"
                    + "StJohnDatabase_PAT.accdb";
            String dbURL = "jdbc:ucanaccess://"
                    + msAccDB; 

            //Creates Connection
            connection = DriverManager.getConnection(dbURL); 
            //Creates a prepared statement
            statement = connection.createStatement();
            //Executes the given query to the database and returns a resultSet
            resultSet = statement.executeQuery(query);
 
            
                    
        }
        catch(SQLException sqlex){
            sqlex.printStackTrace();
        }
        return resultSet;
    }
    //Method to check strings
    public boolean stringCheck(String s)
    {
       boolean check = true;
       //Checks if String is empty
       if(s.isEmpty())
       {
           check = false;
           
       }
       else{
           //Makes sure that the string does not contain any integers
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
    //Method which checks if integer is less than 0
    public boolean zeroCheck(int i)
    {
        boolean check = false;
        if(i < 0)
        {
            check = true;
        }
        return check;
    }
    //Method checks if edit Query has been altered. Therefor if anything has been changed in the form
    public boolean editChange(String query)
    {
        boolean check = false;
        if(query.length() < 23)
        {
             check = true;
        }
        return check;
    }
    //Method which checks if first date is after second date or not.
    public boolean dateCheck(Date a,Date d)
    {
        boolean check = false;
        if(a.compareTo(d) > 0)
        {
            check = true;
        }
        return check;
    }
    //Method which reads in a text file returns a choosen section
        public String fileReader(int choiceNum)
        {
        File file = new File("help.txt");
        String temp;
        String output = "";
        int i = 0;
        

        try
        {
         //Splits Text file using delimiter
         Scanner scFile = new Scanner(file).useDelimiter("#");
         String line, name;
         while (scFile.hasNext())
         {
             //Gets lines values
            line = scFile.nextLine();
            //If line contains delimeter then add one to I. Signaling section is finished
            if(line.contains("#"))
            {
                i = i + 1;
            }
            else
            {
                //If given number equals the current section add line to String and return carrage.
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
        //Method which checks if given strings equal the defult textfield values
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

