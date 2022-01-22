/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC_concepts;

import java.sql.*;
import java.lang.*;
import java.util.Scanner;

public class Non_select_update {
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
           Scanner kb=new Scanner(System.in);            
          
            System.out.print("enter the amount to be incerement = ");
            double sal=kb.nextDouble();
           
            
            
            String qry = "update emp set  salary = salary -"+sal ;
            System.out.println(" given query is = "+ qry);
            int  c = st.executeUpdate(qry);
            
            if(c==0)
                 System.out.println(" no row updated ");
            else
                System.out.println("Number of rows Updated = "+ c);
            con.close();
            
        }
        catch(SQLException  e)
        {
            System.out.println("error = " +e);
        }
}}
