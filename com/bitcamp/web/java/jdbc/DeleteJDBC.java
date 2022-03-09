package com.bitcamp.web.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteJDBC {

    //Main
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
        String driver = "oracle.jdbc.driver.OracleDriver";

        Class.forName(driver);

        Connection con = DriverManager.getConnection(url, "scott", "tiger");

        Statement stmt = con.createStatement();

        //DML : delete
        String sql = "DELETE FROM firstJDBC WHERE no = 3";

        //executeUpdate() : DML ����
        int i = stmt.executeUpdate(sql);
        System.out.println("delete �� record �� ���� : " + i + " ���� ���� �����ƽ��ϴ�.");

        if (stmt != null) {
            stmt.close();
        }
        if (con != null) {
            con.close();
        }

    }//end of main

}//end of class
