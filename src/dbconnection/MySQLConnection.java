package dbconnection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rosihanari
 */
public class MySQLConnection {
    
    // atribut untuk keperluan koneksi ke mysql
    public String dbHost;
    public String dbName;
    public String dbUser;
    public String dbPass;
    public Connection conn;

    // constructor -> sekaligus melakukan koneksi ke mysql
    public MySQLConnection(String dbHost, String dbName, String dbUser, String dbPass){
        this.dbHost = dbHost;
        this.dbName = dbName;
        this.dbUser = dbUser;
        this.dbPass = dbPass;
        
        try {
            String dbURL = "jdbc:mysql://"+ this.dbHost +":3306/" + this.dbName;
            this.conn = DriverManager.getConnection(dbURL, this.dbUser, this.dbPass);

            if (this.conn != null) {
                System.out.println("Connected");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
    
    // method untuk menutup koneksi mysql
    public void close(){
        try {
            this.conn.close();
        } catch (SQLException ex) {
            System.out.println("Penutupan koneksi gagal");
        }
    }

}
