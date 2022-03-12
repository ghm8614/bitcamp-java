package com.bitcamp.web.java.jdbc.prob;

import java.sql.*;

public class EmpStatistics {

    static {

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void printStatistics(int maxSalary) throws SQLException {

        System.out.println("===========================");
        System.out.println("Max Salary : " + maxSalary);
        System.out.println("===========================");

        String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
        String id = "hr";
        String pwd = "hr";


        Connection con = DriverManager.getConnection(url, id, pwd);

        /*
        // 1. Statement ���
        Statement stmt = con.createStatement();

        String sql = "SELECT J.job_title ����, AVG(E.salary) ��ձ޿�" +
                " FROM employees E, jobs J" +
                " WHERE E.salary > " + maxSalary +
                " AND E.job_id = J.job_id" +
                " GROUP BY J.job_title" +
                " ORDER BY ��ձ޿� DESC";

        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            System.out.printf("[%s] %s\n", rs.getString(1), rs.getInt(2));
//            System.out.printf("[%s] %s\n",rs.getString(1),rs.getString(2));
//            System.out.printf("[%s] %s\n",rs.getString("����"),rs.getInt("��ձ޿�"));
//            System.out.printf("[%s] %s\n",rs.getString("����"),rs.getString("��ձ޿�"));
        }

        stmt.close();
        con.close();
        */


        // 2. PreparedStatement ���
        String sql = "SELECT J.job_title ����, AVG(E.salary) ��ձ޿�" +
                " FROM employees E, jobs J" +
                " WHERE E.salary > ? " +
                " AND E.job_id = J.job_id" +
                " GROUP BY J.job_title" +
                " ORDER BY ��ձ޿� DESC";

        PreparedStatement pstmt = con.prepareStatement(sql);

        pstmt.setInt(1, maxSalary);

        ResultSet rs = pstmt.executeQuery();

        while (rs.next()) {
            System.out.printf("[%s] %s\n", rs.getString(1), rs.getInt(2));
//            System.out.printf("[%s] %s\n",rs.getString(1),rs.getString(2));
//            System.out.printf("[%s] %s\n",rs.getString("����"),rs.getInt("��ձ޿�"));
//            System.out.printf("[%s] %s\n",rs.getString("����"),rs.getString("��ձ޿�"));
        }

        if (pstmt != null) {
            pstmt.close();
        }
        if (con != null) {
            con.close();
        }

    }//end of method


    public static void main(String[] args) throws SQLException {

        int maxSalary = 10000;
        new EmpStatistics().printStatistics(maxSalary);

        maxSalary = 15000;
        new EmpStatistics().printStatistics(maxSalary);
    }


}//end of class

