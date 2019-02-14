/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2eeproject;

import java.sql.*;
import oracle.jdbc.OracleDriver;

/**
 *
 * @author UMAR
 */
public class J2EEPROJECT {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        try{
        DriverManager.registerDriver(new OracleDriver());
        System.out.println("Driver loaded successfully");
        }
        catch(SQLException e){
            System.out.println("Driver NOT loaded");
        }
    }
    
}
