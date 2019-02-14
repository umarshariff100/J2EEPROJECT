/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2eeproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

/**
 *
 * @author UMAR
 */
public class J2EE6{

    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        String userid;
        System.out.println("Enter user ID");
        Scanner scan = new Scanner(System.in);
        userid = scan.next();
        String passwd;
        
        System.out.println("Enter password ");
        
        passwd = scan.next();
        
        Connection con = null;
      
        ResultSet res = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Driver Loaded Successfully");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver NOT Loaded");
        }

        try {
            con = DriverManager.getConnection(url, userid, passwd);
            System.out.println("Connection established Successfuuly");
        } catch (SQLException e) {
            System.out.println("Connection NOT established");
        }
        try {
            String s = "DELETE FROM VTUSTUDENT WHERE USN=?";
            
            PreparedStatement pstmt = con.prepareStatement(s);
            
            System.out.println("Enter the USN number");
            
            String temp = scan.next();
            pstmt.setString(1, temp);
            pstmt.executeQuery();
            System.out.println("Query Executed Successfully");
            
        } catch (SQLException e) {
            System.out.println("Query NOT exceuted Successfully");
        }
        
        
    }

}


