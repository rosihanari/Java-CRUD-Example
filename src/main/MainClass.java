package main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import dbconnection.*;
import book.*;
/**
 *
 * @author rosihanari
 */
public class MainClass {
    public static void main(String[] args) {
        // koneksi ke mysql, ke db: mydb
        MySQLConnection db1 = new MySQLConnection("localhost", "mydb", "root", "");
        
        
        Book b1 = new Book();
        /*
        b1.insert(db1, "Pemrograman Java", "Rosihan Ari", "UNS Press", 2019);
        b1.insert(db1, "Pemrograman Python", "Rosihan Ari", "UNS Press", 2019);
        b1.insert(db1, "Pemrograman PHP", "Rosihan Ari", "UNS Press", 2019);
        */
        
        /*
        Book b2 = new Book("Pemrograman Robomind", "Rosihan Ari", "UNS PRess", 2019);
        b2.insert(db1);
        */
        
        //b1.delete(db1, 12);
        //b1.update(db1, 11, "Pemrograman R", "Budimanto", "UGM Press", 2020);
        b1.select(db1);
        
        db1.close();
    }
    
}
