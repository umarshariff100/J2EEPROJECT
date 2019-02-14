/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2eeproject;

import java.sql.SQLException;

/**
 *
 * @author UMAR
 */
public class J2EE1c {
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // TODO code application logic here
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
        System.out.println("Driver loaded successfully");
        }
        catch(Exception e){
            System.out.println("Driver Not loaded successfully");
        }
        
    }
    
}
