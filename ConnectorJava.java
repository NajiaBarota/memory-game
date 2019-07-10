/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;

public class ConnectorJava {

    public static String user = "root";
    public static String pass = "";
    public static String connString = "jdbc:mysql://localhost:3306/score?zeroDateTimeBehavior=convertToNull [root on Default schema]";

    public static void main(String[] args) {
        Connection conn = null;

        try {

            conn = DriverManager.getConnection(user, pass, connString);
            System.out.println("you are connected");

        } catch (SQLException e) {
            System.err.println(e);
        }
    }

}
