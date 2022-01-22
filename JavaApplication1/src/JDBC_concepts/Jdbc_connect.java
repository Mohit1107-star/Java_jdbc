/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC_concepts;

import java.sql.*;
import java.lang.*;
import java.util.*;

public class Jdbc_connect {
    public static void main(String[] args) {
        try{
           Class.forName("oracle.jdbc.driver.OracleDriver");
           
            System.out.println("Driver Loaded");
        }
        catch(ClassNotFoundException e){
            System.out.println("Driver not loaded"+ e);
        }
    }
}

