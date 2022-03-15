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

                System.out.println("db에서 확인 한 id, pwd ->" + fromDbId + " : " + fromDbPwd);
            } else {
                System.out.println("db에 client 에서 입력한 <" + id + ">와 < " + pwd + "> 가 없습니다.");
            }

            // 자원 해제
            rs.close();
            pstmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println("jdbc 관련 예외 발생");
            e.printStackTrace();
        }


        out.println("<html>");
        out.println("<head></head>");
        out.println("<body>");
        out.println("<h2>Login 화면</h2>");

        //DBMS Data 와 Client Form Data 비교 회원 유무 판단
        if (fromDbId != null && fromDbPwd != null
                && fromDbId.equals(id) && fromDbPwd.equals(pwd)) {
            out.println(id + "님 환영합니다.");
        } else {
            out.println("id, pwd 를 확인하세요.");
        }

        out.println("<p><p><a href='/edu/jw05/login.html'>뒤로</a>");
        out.println("</body>");
        out.println("</html>");


    }//end of doPost

}//end of class
