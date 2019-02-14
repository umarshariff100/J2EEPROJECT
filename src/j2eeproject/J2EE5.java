/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2eeproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author UMAR
 */
public class J2EE5 {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        String userid = "system";
        
       
       
        String passwd= "system";

        

        Connection con = null;
        PreparedStatement pstmt =null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Driver Loaded Successfully");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver NOT Loaded");
        }

        try {
            con = DriverManager.getConnection(url, userid, passwd);
            System.out.println("Connection established Successfully");
        } catch (SQLException e) {
            System.out.println("Connection NOT established");
        }
        try{
            String s = "INSERT INTO VTUSTUDENT VALUES(?,?,?,?,?,?,?)";
            pstmt = con.prepareStatement(s);
             Scanner scan = new Scanner(System.in);
          
            System.out.println("ENTER USN");
            String a = scan.next();
            System.out.println("ENTER NAME");
            String b = scan.next();
            System.out.println("ENTER MARKS1");
            int c = scan.nextInt();
            System.out.println("ENTER MARKS2");
            int d = scan.nextInt();
            System.out.println("ENTER MARKS3");
            int e = scan.nextInt();
            System.out.println("ENTER MARKS3");
            int f = scan.nextInt();
            System.out.println("ENTER AVG");
            float g = scan.nextFloat();
            
            pstmt.setString(1, a);
            pstmt.setString(2, b);
            pstmt.setInt(3, c);
            pstmt.setInt(4, d);
            pstmt.setInt(5, e);
            pstmt.setInt(6, f);
            pstmt.setFloat(7, g);
            
            pstmt.executeQuery();
            System.out.println("Query Exceuted Successfully");
           
            
        }
        catch(SQLException e){
            
            System.out.println("Query NOT exceuted Successfully");
        }

    }
}
