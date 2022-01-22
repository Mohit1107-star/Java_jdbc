/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC_concepts;

import java.sql.*;
import java.lang.*;
import java.util.Scanner;

public class Non_Select {

    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Driver Loaded");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not loaded" + e);
        }
        try {
            String url = "jdbc:oracle:thin:@//LAPTOP-DA5L0BOI:1521/xe";
            String user = "system";
            String pwd = "mohit";

            Connection con = DriverManager.getConnection(url, user, pwd);
            System.out.println("Connection established");

            String qry = "insert into emp values(?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(qry);

            int id;
            double sal;
            Scanner kb = new Scanner(System.in);

            System.out.print("enter the emp id = ");
            id = kb.nextInt();
            System.out.print("enter the name = ");
            String name = kb.next();
            System.out.print("enter the salary = ");
            sal = kb.nextDouble();
            System.out.print("enter the e-mail  = ");
            String email = kb.next();
            
            pst.setInt(1,id);
            pst.setString(2, name);
            pst.setDouble(3,sal);
            pst.setString(4,email);

            int c = pst.executeUpdate();

            if (c == 1) {
                System.out.println("one row inserted ");
            } else {
                System.out.println("no row inserted");
            }
            con.close();

        } catch (SQLException e) {
            System.out.println("Exception here is" + e);
        }
    }
}
