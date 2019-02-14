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
import java.util.Scanner;

/**
 *
 * @author UMAR
 */
public class J2EE3b {

    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        String userid;
        System.out.println("Enter user ID");
        Scanner scan = new Scanner(System.in);
        userid = scan.next();
        String passwd = "system";
        
        System.out.println("Enter password ");
        
        passwd = scan.next();
        
        Connection con = null;
        Statement stmt = null;
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
            String s = "SELECT * FROM VTUSTUDENT";
            stmt = con.createStatement();
            res = stmt.executeQuery(s);
            System.out.println("Query Executed Successfully");
        } catch (SQLException e) {
            System.out.println("Query NOT exceuted Successfully");
        }
        try {
            while (true==res.next()) {
                String a = res.getString("USN");
                String b = res.getString("NAME");
                int c = res.getInt("MARKS1");
                int d = res.getInt("MARKS2");
                int e = res.getInt("MARKS3");
                int f = res.getInt("MARKS4");
                float g = res.getFloat("AVG");

                System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f + " " + g);
            }
        }
        catch (SQLException e) {
            System.out.println("UNable to print the Result");
        }
    }

}
