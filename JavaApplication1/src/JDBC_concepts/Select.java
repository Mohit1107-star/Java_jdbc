/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC_concepts;

import java.sql.*;
import java.lang.*;
import java.util.Scanner;

public class Select {
    public static void main(String[] args) {
        try{
           Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Driver Loaded");
        }
        catch(ClassNotFoundException e){
            System.out.println("Driver not loaded"+ e);
        }
        
        try{
           String url = "jdbc:oracle:thin:@//LAPTOP-DA5L0BOI:1521/xe";
           String user = "system";
           String pwd = "mohit";
           
           Connection con = DriverManager.getConnection(url,user,pwd);
           System.out.println("Connection established");
           Statement st = con.createStatement();
           
           String qry = "select id,name,salary,email from emp";
           int id;
           String name;
           double sal;
           String email;
           
           ResultSet rs = st.executeQuery(qry);
           
           while(rs.next()){
               
               id = rs.getInt("id");
               name = rs.getString("name");
               sal = rs.getDouble("salary");
               email = rs.getString("email");
               System.out.println(id + "\t"+ name + "\t"+ sal);
           }
           con.close();
            
        }
        catch(SQLException  e)
        {
            System.out.println("error = " +e);
        }
    }
}
