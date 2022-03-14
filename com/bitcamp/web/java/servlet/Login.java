package com.bitcamp.web.java.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

//@WebServlet
public class Login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        req.setCharacterEncoding("EUC-KR");
        res.setContentType("text/html;charset=EUC_KR");
        PrintWriter out = res.getWriter();

        // Client form data 처리
        String id = req.getParameter("id");
        String pwd = req.getParameter("pwd");

        // ========== jdbc 시작 ===========
        // DBMS 에서 추출한 id, pwd 처리를 위한 변수선언
        String fromDbId = null;
        String fromDbPwd = null;

        try {
            String dburl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
            String dbuser = "scott";
            String dbpwd = "tiger";


            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection(dburl, dbuser, dbpwd);

            PreparedStatement pstmt = con.prepareStatement("SELECT id, pwd FROM users WHERE id=?");
            pstmt.setString(1, id);
            ResultSet rs = pstmt.executeQuery();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
