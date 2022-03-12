package com.bitcamp.web.java.jdbc.prob;

import java.sql.*;

public class EmpManager2 {

    static {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void printEmployee(String jobs[]) throws SQLException {

        String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
        Connection con = DriverManager.getConnection(dburl, "hr", "hr");

        /*
        // 1. Statement 사용
        Statement stmt = con.createStatement();

        String sql =
                "SELECT E.employee_id, E.first_name, E.salary" +
                " FROM employees E, jobs J" +
                " WHERE E.job_id = J.job_id AND J.job_title IN ('"+jobs[0]+"','"+jobs[1]+"')";

        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            System.out.print(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3) + "\n");
        }

        stmt.close();
        con.close();
         */


        // 2. PreparedStatement 사용
        String sql =
                "SELECT E.employee_id, E.first_name, E.salary" +
                " FROM employees E, jobs J" +
                " WHERE E.job_id = J.job_id AND J.job_title IN (?,?)";

        PreparedStatement pstmt = con.prepareStatement(sql);

        pstmt.setString(1, jobs[0]);
        pstmt.setString(2, jobs[1]);

        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            System.out.print(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3) + "\n");
        }

        if (pstmt != null) {
            pstmt.close();
        }
        if (con != null) {
            con.close();
        }

    }

    public static void main(String[] args) throws SQLException {

        String[] jobs = {"Accountant", "Stock Clerk"};
        new EmpManager2().printEmployee(jobs);
    }

}
