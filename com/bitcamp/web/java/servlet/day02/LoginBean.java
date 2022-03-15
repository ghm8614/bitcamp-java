package com.bitcamp.web.java.servlet.day02;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/LoginBean")
public class LoginBean extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        req.setCharacterEncoding("EUC-KR");
        res.setContentType("text/html;charset=EUC_KR");
        PrintWriter out = res.getWriter();

        // Client form data 처리
        String id = req.getParameter("id");
        String pwd = req.getParameter("pwd");

        // DB 접근 data 검색은 DbBean 이용 회원유무 확인
        DbBean dbBean = new DbBean();
        dbBean.setId(id);
        dbBean.setPwd(pwd);

        // DbBean.getUser() method : DB 접근 Data 검색비교
        boolean isLogin = dbBean.getUser();

        out.println("<html>");
        out.println("<head></head>");
        out.println("<body>");

        out.println("<h2>Login 화면</h2>");

        if (isLogin) {
            out.println(id + "님 환영합니다.");
        } else {
            out.println("Login 실패 id, pwd를 확인하세요");
        }

        out.println("<p><p><a href='/edu/jw05/loginBean.html'>뒤로</a>");
        out.println("</body>");
        out.println("</html>");

    }//end of doPost

}//end of class
