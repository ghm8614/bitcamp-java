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

        // Client form data ó��
        String id = req.getParameter("id");
        String pwd = req.getParameter("pwd");

        // DB ���� data �˻��� DbBean �̿� ȸ������ Ȯ��
        DbBean dbBean = new DbBean();
        dbBean.setId(id);
        dbBean.setPwd(pwd);

        // DbBean.getUser() method : DB ���� Data �˻���
        boolean isLogin = dbBean.getUser();

        out.println("<html>");
        out.println("<head></head>");
        out.println("<body>");

        out.println("<h2>Login ȭ��</h2>");

        if (isLogin) {
            out.println(id + "�� ȯ���մϴ�.");
        } else {
            out.println("Login ���� id, pwd�� Ȯ���ϼ���");
        }

        out.println("<p><p><a href='/edu/jw05/loginBean.html'>�ڷ�</a>");
        out.println("</body>");
        out.println("</html>");

    }//end of doPost

}//end of class
