/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas_pbol;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Yudi Tan
 */
public class DBConnector {
   
    public static Connection getConnection() throws SQLException{
        Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/db_missing_person","root","13032002");
    
         return connection ;       
    }
    
}
