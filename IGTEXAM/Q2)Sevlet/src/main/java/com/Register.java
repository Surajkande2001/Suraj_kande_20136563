package com;

 

import java.io.IOException;
import java.io.PrintWriter;

 

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 

 

 


import java.sql.*;


 

@WebServlet("/Register")
public class Register extends HttpServlet {
    private static final long serialVersionUID = 1L;

 

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        int SID = Integer.parseInt(request.getParameter("SID"));
        String SNAME = request.getParameter("SNAME");
        int PHONE = Integer.parseInt(request.getParameter("PHONE"));
        int MARKS = Integer.parseInt(request.getParameter("MARKS"));
        String BRANCH = request.getParameter("BRANCH");

 




 

        PrintWriter out = response.getWriter();

 

        try {

 

 

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/IGT1", "root", "@#Shubham1");

 

            PreparedStatement p = con.prepareStatement("insert into Student values(?, ?, ?, ?, ?)");

 

            p.setInt(1, SID);
            p.setString(2, SNAME);
            p.setInt(3, PHONE);
            p.setInt(4, MARKS);
            p.setString(5, BRANCH);

 

            p.execute();
            p.close();

 

            out.print("<h1>");
            out.print("SID" + SID + "<br>");
            out.print("SNAME: " + SNAME + "<br>");
            out.print("PHONE" + PHONE + "<br>");
            out.print("MARKS" + MARKS + "<br>");
            out.print("MARKS: " + BRANCH + "<br>");
            out.print("</h1>");
            out.print("Inserted");
        } catch(Exception e) {

 

            System.out.println(e);
        }    

 

    }

 

}