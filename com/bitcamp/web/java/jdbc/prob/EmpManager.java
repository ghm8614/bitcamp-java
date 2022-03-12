package com.bitcamp.web.java.jdbc.prob;

import java.sql.*;

public class EmpManager {

    static {

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void printEmployee(String name, int salary) throws SQLException {

        String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
        Connection con = DriverManager.getConnection(dburl, "hr", "hr");


        /*
        // 1. Statement 사용
        Statement stmt = con.createStatement();

        String sql =
                "SELECT employee_id, first_name, salary" +
                " FROM employees" +
                " WHERE salary > " + salary + " AND lower(first_name) LIKE lower('%al%')";

        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            System.out.print(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3) + "\n");
        }

        stmt.close();
        con.close();
         */

        // 2. PreparedStatement 사용
        String sql =
                "SELECT employee_id, first_name, salary" +
                " FROM employees" +
                " WHERE salary > ? AND lower(first_name) LIKE lower(?)";

        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setInt(1,salary);
        pstmt.setString(2,"%"+name+"%");

        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            System.out.print(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3) + "\n");
        }

        pstmt.close();
        con.close();

    }

    public static void main(String[] args) throws SQLException {

        new EmpManager().printEmployee("al", 4000);
    }
}


