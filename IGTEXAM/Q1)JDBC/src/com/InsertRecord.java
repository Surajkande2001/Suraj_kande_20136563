package com;

 

 

import java.sql.*;
import java.util.Scanner;

 

 

public class InsertRecord {

 

 

    public static void main(String[] args) {

 

        try {

 

 

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/IGT1","root","@#Shubham1");

 

            PreparedStatement p = con.prepareStatement("insert into employee10 values(?, ?, ?, ?, ?)");

 

            Scanner sc = new Scanner(System.in);

 

            System.out.println("Enter id: ");
            int id = sc.nextInt();

 

            System.out.println("Enter name: ");
            String name = sc.next();

 

            System.out.println("Enter age: ");
            int age = sc.nextInt();

 

            System.out.println("Enter salery: ");
            int sal = sc.nextInt();

 

            System.out.println("Enter designation: ");
            String des = sc.next();

 

            p.setInt(1, id);
            p.setString(2, name);
            p.setInt(3, age);
            p.setInt(4, sal);
            p.setString(5, des);

 

            p.execute();
            p.close();

 

        } catch(Exception e) {

 

            System.out.println(e);
        }
           System.out.println("data inserted succesfully !!!!!!!");
    }
}