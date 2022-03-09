package com.bitcamp.web.java.jdbc;

import java.sql.*;

/*
 *	1. JDBC Programming  ����
 *  2. ������ JDBC Programming �������� �߻��ϴ� Exception ����
 *  3. executeQuery(SQL) , executeUpdate(SQL) Method ����
 */
public class CreateJDBC {

    ///Main Method
    public static void main(String[] args) throws Exception {

        // JDBC ������ �ʿ��� �ν��Ͻ� �� ���� ����
        Connection con = null;
        Statement stmt = null;
        String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";


        // 1. Connection : Login ������ �߻�ȭ�� Interface
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("1. driver loading OK");
        } catch (ClassNotFoundException e) {
            System.out.println("\n -> Driver Loading �� Exception �߻�\n");
            e.printStackTrace();
        }

        try {
            con = DriverManager.getConnection(url, "scott", "tiger");
            System.out.println("2. connection �ν��Ͻ� ���� �Ϸ�");
        } catch (SQLException e) {
            System.out.println("\n -> JDBC ���� �� Exception �߻� : " + e.getErrorCode());
            e.printStackTrace();
        }

        //2. Statement : Query ������ �߻�ȭ�� interface
        try {
            stmt = con.createStatement();
            System.out.println("3. statement ��ü ���� �Ϸ�");
        } catch (SQLException e) {
            System.out.println("\n -> JDBC ���� �� Exception �߻� : " + e.getErrorCode());
            e.printStackTrace();
        }

        //Create Query �����
        String createSql = "CREATE TABLE firstJDBC " +
                "( no   NUMBER(3), " +
                "name    VARCHART2(20), " +
                "email    VARCHAR2(30), " +
                "address VARCHAR2(50))";

        try {
            System.out.println("QUERY ���۰�� : " + stmt.executeUpdate(createSql));
            System.out.println("4. query ���ۿϷ�");
        } catch (SQLException e) {
            System.out.println("\n -> JDBC ���� �� Exception �߻� : " + e.getErrorCode());
            e.printStackTrace();
        }

        try {
            if (stmt != null) {
                stmt.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            System.out.println("\n -> JDBC ���� �� Exception �߻� : " + e.getErrorCode());
            e.printStackTrace();
        }

    }//end of main

}//end of class