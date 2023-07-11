/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author AsadullauhSojib
 */
public class tables {
    public static void main(String[] args){
        Connection con = null;
        Statement st = null;
        try{
            con=ConnectionProvider.getCon();
            st=con.createStatement();
            st.executeUpdate("Create table users (name varchar (200),email varchar(200),password varchar(80),securityQuestion varchar (500),answer varchar(200),address varchar(200),status varchar(20))");
            st.executeUpdate("Create table flat(flatNo varchar(10),flatType varchar(200),bedRoom varchar (200),rent int,status varchar (100))");
            st.executeUpdate("create table renter(id int,name varchar(200),phoneNumber varchar(11),nationality varchar(50),gender varchar(50),email varchar(200),idProof varchar(200),checkIn varchar(100),flatNo varchar(10),bedRoom varchar(200),flatType varchar(200),rentPerMonth int(10),numberOfMonthStay int(10),totalAmount varchar(200))");
            
            JOptionPane.showMessageDialog(null,"Table Created Successfully");
        }
            
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        finally
        {
            try
            {
                con.close();
                st.close();
            }  
        catch(Exception e)
            {      
            }
        }
       
    }
}
