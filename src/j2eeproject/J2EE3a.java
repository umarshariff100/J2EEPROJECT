/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2eeproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import oracle.jdbc.OracleDriver;

/**
 *
 * @author UMAR
 */
public class J2EE3a {
    public static void main(String[] args){
        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        String userid= "system";
        String passwd = "system";
        Connection con = null;
        Statement stmt = null;
        ResultSet res = null;
        
        
        try{
            DriverManager.registerDriver(new OracleDriver());
        System.out.println("Driver loaded successfully");
        }
        catch(SQLException e){
            System.out.println("Driver NOT loaded");
        }
        try{
            con = DriverManager.getConnection(url, userid, passwd);
            System.out.println("Connection establed successfully");
        }
        catch(SQLException e){
            System.out.println("Connection not established");
        }
        try{
            String s= "Select * from VTUSTUDENT";
            stmt = con.createStatement();
            res = stmt.executeQuery(s);
            
            while(res.next()== true){
                String a = res.getString(1);
                String b = res.getString(2);
                int c =  res.getInt(3);
                int d = res.getInt(4);
                int e = res.getInt(5);
                int f = res.getInt(6);
                float g = res.getFloat(7);
                
                
                System.out.println(a+ " " +b+ " " +c+ " " +d+ " " +e+ " " +f+ " " +g);
            }
        }
        catch(SQLException e){
            System.out.println("Query Not Executed");
        }
    }
    
}
