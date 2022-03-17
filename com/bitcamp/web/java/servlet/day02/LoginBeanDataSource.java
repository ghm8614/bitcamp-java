package com.bitcamp.web.java.servlet.day02;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// Connection Pool 을 SPEC 화 한 javax.sql.DataSource 사용

//@WebServlet("/LoginBeanDataSource")
public class LoginBeanDataSource extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        req.setCharacterEncoding("EUC-KR");
        res.setContentType("text/html;charset=EUC_KR");
        PrintWriter out = res.getWriter();

        // Client form data 처리
        String id = req.getParameter("id");
        String pwd = req.getParameter("pwd");

        // UserVO instance 생성 및 Client Form Data 전달 (Binding)
        UserVO userVO = new UserVO();
        userVO.setId(id);
        userVO.setPwd(pwd);

        // DB 접근 Data 검색비교 UserVO.active true/false 변경
        UserDataSourceDao userDataSourceDao = new UserDataSourceDao();
        userDataSourceDao.getUser(userVO);


        out.println("<html>");
        out.println("<head></head>");
        out.println("<body>");

        out.println("<h2>Login 화면</h2>");

        if (userVO.isActive()) {
            out.println(id + "님 환영합니다.");
        } else {
            out.println("Login 실패 id, pwd를 확인하세요");
        }

        out.println("<p><p><a href='/edu/jw04/loginBeanDataSource.html'>뒤로</a>");
        out.println("</body>");
        out.println("</html>");

    }//end of doPost

}//end of class
