package com.bitcamp.web.java.jdbc.prob;

import java.sql.*;

public class EmpManager3 {

    static {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void printEmployee(String city, int lo, int hi) throws SQLException {

        String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
        Connection con = DriverManager.getConnection(dburl, "hr", "hr");

        /*
        // 1. Statement 사용
        Statement stmt = con.createStatement();

        String sql =
                "SELECT E.last_name, D.department_name" +
                " FROM employees E, departments D" +
                " WHERE E.department_id = 50" +
                " AND E.salary BETWEEN "+lo+" AND "+hi+"" +
                " AND D.location_id = (SELECT location_id FROM locations WHERE city = '"+city+"')";

        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            System.out.print(rs.getString(1) + "\t" + rs.getString(2) +"\n");
        }

        stmt.close();
        con.close();
         */

        // 2. PreparedStatement 사용
        String sql =
                "SELECT E.last_name, D.department_name" +
                        " FROM employees E, departments D" +
                        " WHERE E.department_id = 50" +
                        " AND E.salary BETWEEN ? AND ?" +
                        " AND D.location_id = (SELECT location_id FROM locations WHERE city = ?)";

        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setInt(1, lo);
        pstmt.setInt(2, hi);
        pstmt.setString(3, city);

        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            System.out.print(rs.getString(1) + "\t" + rs.getString(2) + "\n");
        }

        pstmt.close();
        con.close();
    }

    public static void main(String[] args) throws SQLException {
        new EmpManager3().printEmployee("South San Francisco", 7000, 10000);
    }

}//end of class
