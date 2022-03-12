package com.bitcamp.web.java.jdbc.prob;

import java.sql.*;

public class Prob1 {

    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("부서의 아이디를 입력하세요..");
            System.exit(1);
        }

        String dept_id = args[0];

        Connection con = null;
        Statement stmt = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
            String user = "hr";
            String password = "hr";

            con = DriverManager.getConnection(url, user, password);

            /*
            // 1. Statement 사용
            stmt = con.createStatement();

            String sql =
                    "SELECT E.employee_id, D.department_name, E.salary, vt.AVG_salary" +
                            " FROM employees E, departments D, (SELECT department_id, AVG(salary) AVG_salary" +
                            " FROM employees" +
                            " WHERE department_id = " + dept_id +
                            " GROUP BY department_id) vt" +
                            " WHERE E.department_id = " + dept_id + " AND E.department_id=D.department_id AND E.department_id=vt.department_id";

            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.print(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3) + "\t" + rs.getInt(4) + "\n");
            }


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        */

            // 2. PreparedStatement 사용

            String sql =
                    "SELECT E.employee_id, D.department_name, E.salary, vt.AVG_salary" +
                            " FROM employees E, departments D, (SELECT department_id, AVG(salary) AVG_salary" +
                            " FROM employees" +
                            " WHERE department_id = ?" +
                            " GROUP BY department_id) vt" +
                            " WHERE E.department_id = ? AND E.department_id=D.department_id AND E.department_id=vt.department_id";

            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, dept_id);
            pstmt.setString(2, dept_id);

            rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.print(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3) + "\t" + rs.getInt(4) + "\n");
            }

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }//end of main
}//end of class
