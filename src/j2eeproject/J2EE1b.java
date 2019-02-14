/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2eeproject;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author UMAR
 */
public class J2EE1b {
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        try{
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        System.out.println("Driver loaded successfully");
        }
        catch(SQLException e){
            System.out.println("Driver NOT loaded");
        }
    }
    
}
