package com.bitcamp.web.java.servlet.day02;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

//@WebServlet("/Login")
public class Login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        req.setCharacterEncoding("EUC-KR");
        res.setContentType("text/html;charset=EUC_KR");
        PrintWriter out = res.getWriter();

        // Client form data ó��
        String id = req.getParameter("id");
        String pwd = req.getParameter("pwd");

        // ========== jdbc ���� ===========
        // DBMS ���� ������ id, pwd ó���� ���� ��������
        String fromDbId = null;
        String fromDbPwd = null;

        try {
            String dburl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
            String dbuser = "scott";
            String dbpwd = "tiger";

            // 1.
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection(dburl, dbuser, dbpwd);

            // 2.
            PreparedStatement pstmt = con.prepareStatement("SELECT id, pwd FROM users WHERE id=?");
            pstmt.setString(1, id);

            // 3.
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                fromDbId = rs.getString("id");
                fromDbPwd = rs.getString("pwd");

                System.out.println("db���� Ȯ�� �� id, pwd ->" + fromDbId + " : " + fromDbPwd);
            } else {
                System.out.println("db�� client ���� �Է��� <" + id + ">�� < " + pwd + "> �� �����ϴ�.");
            }

            // �ڿ� ����
            rs.close();
            pstmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println("jdbc ���� ���� �߻�");
            e.printStackTrace();
        }


        out.println("<html>");
        out.println("<head></head>");
        out.println("<body>");
        out.println("<h2>Login ȭ��</h2>");

        //DBMS Data �� Client Form Data �� ȸ�� ���� �Ǵ�
        if (fromDbId != null && fromDbPwd != null
                && fromDbId.equals(id) && fromDbPwd.equals(pwd)) {
            out.println(id + "�� ȯ���մϴ�.");
        } else {
            out.println("id, pwd �� Ȯ���ϼ���.");
        }

        out.println("<p><p><a href='/edu/jw05/login.html'>�ڷ�</a>");
        out.println("</body>");
        out.println("</html>");


    }//end of doPost

}//end of class
