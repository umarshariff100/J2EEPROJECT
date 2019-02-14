/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2eeproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import oracle.jdbc.OracleDriver;

/**
 *
 * @author UMAR
 */
public class J2EE2 {
    public static void main(String[] args){
        try{
            //Class.forName("oracle.jdbc.driver.OracleDriver");  (Alternate Method)
            DriverManager.registerDriver(new OracleDriver());
            System.out.println("Driver Loaded Successfully");
        }
        catch(SQLException e){
            System.out.println("Driver not loaded");
        }
        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        String userid= "system";
        String passwd = "system";
        try{
            Connection con =  DriverManager.getConnection(url, userid, passwd);
            System.out.println("Connection established successfully");
            
        }
        catch(SQLException e){
            System.out.println("Connection not established");
            
        }
        
    }
    
}
