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
        MySQLConnection db1 = new MySQLConnection("localhost", "mydb", "root", "");
        
        Book b1 = new Book("Pemrograman Java", "Rosihan Ari", "UNS Press", 2019);
        //b1.insert(db1);
        //b1.delete(db1, 2);
        //b1.update(db1, 3, "Pemrograman Python", "Budiman", "UGM Press", 2017);
        b1.select(db1);
        
        db1.close();
    }
    
}
