package com.bitcamp.web.java.jdbc;


import java.sql.*;

/*
PreparedStatement �� ����
1. �ݺ����� SQL ����� ȿ����
2. ������, ������Ǽ�
3. Binary data �Է½� ����
 */
public class PreparedStmtTest {

    //Main
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // �Է� ��ȿ�� üũ
        if (args.length != 3) {
            System.out.println("������ java Example02 [no��] [id��] [pwd��]");
            System.exit(0);
        }

        int no = Integer.parseInt(args[0]);
        String id = args[1];
        String pwd = args[2];

        String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";

        // 1�ܰ� : Connection
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection(url, "scott", "tiger");


        // Statement �� preparedState �� !
        /*
        Statement stmt = con.createStatement();
        String createSql = "INSERT INTO member VALUES(" + no + "," + id + "," + pwd + ")";
        int confirm = stmt.executeUpdate(createSql);
         */

        // PreparedStatement ���
        // PreparedStatement �ν��Ͻ� ������ SQL ����
        PreparedStatement pstmt = con.prepareStatement("insert into memeber values(?,?,?) ");

        // PreparedStatement method ��� ('' ���ʿ�)
        pstmt.setInt(1, no);
        pstmt.setString(2, id);
        pstmt.setString(3, pwd);
        int confirm = pstmt.executeUpdate();

        if (confirm == 1) {
            System.out.println("number TABLE DATA INSERT �Ϸ�");
        } else {
            System.out.println("number TABLE DATA INSERT ����");
        }

        if (pstmt != null) {
            pstmt.close();
        }
        if (con != null) {
            con.close();
        }


    }//end of main

}//end of class
