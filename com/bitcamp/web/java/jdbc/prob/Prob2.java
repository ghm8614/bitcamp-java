package com.bitcamp.web.java.jdbc.prob;

import java.sql.*;

public class Prob2 {

    private static void printEmployeeList(String cityName, String deptName) throws Exception {

        Class.forName("oracle.jdbc.driver.OracleDriver");

        String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
        String id = "hr";
        String pwd = "hr";

        Connection con = DriverManager.getConnection(dburl, id, pwd);

        /*
        // 1. Statement 사용
        Statement stmt = con.createStatement();

        String sql =
                "SELECT L.city, D.department_name, E.first_name, E.salary " +
                " FROM employees E, departments D, locations L" +
                " WHERE E.department_id = D.department_id " +
                " AND L.location_id=D.location_id" +
                " AND lower(L.city) LIKE lower('%"+cityName+"%')" +
                " AND lower(D.department_name) LIKE lower('%"+deptName+"%')";

        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            System.out.print(rs.getString(1) + "\t" + rs.getString(2) + "\t"+rs.getString(3)+"\t"+rs.getInt(4)+"\n");
        }

        stmt.close();
        con.close();
         */

        // 2. PreparedStatement 사용

        String sql =
                "SELECT L.city, D.department_name, E.first_name, E.salary " +
                        " FROM employees E, departments D, locations L" +
                        " WHERE E.department_id = D.department_id " +
                        " AND L.location_id=D.location_id" +
                        " AND lower(L.city) LIKE lower(?)" +
                        " AND lower(D.department_name) LIKE lower(?)";

        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, "%"+cityName+"%");
        pstmt.setString(2, "%"+deptName+"%");

        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            System.out.print(rs.getString(1) + "\t" + rs.getString(2) + "\t"+rs.getString(3)+"\t"+rs.getInt(4)+"\n");
        }

        pstmt.close();
        con.close();
    }

    public static void main(String[] args) throws Exception {
        printEmployeeList("lon", "resource");
    }
}
