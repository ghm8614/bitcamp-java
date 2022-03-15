package com.bitcamp.web.java.servlet.day02;//package jw04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/LoginBeanInitParam")
public class LoginBeanInitParam extends HttpServlet {

	//F
	private String jdbcDriver;
	private String jdbcURL;
	private String jdbcUser;
	private String jdbcPassword;
	
	// init() method overriding
	// web.xml(Meta-data) ��ϵ� ���� ����
	// Ŭ���̾�Ʈ�� ���� request �� 1ȸ�� ȣ�� : ���� Life Cycle
	@Override 
	public void init(ServletConfig sc) throws ServletException {
		super.init(sc);
		jdbcDriver = sc.getInitParameter("jdbcDriver");
		jdbcURL = sc.getInitParameter("jdbcURL");
		jdbcUser = sc.getInitParameter("jdbcUser");
		jdbcPassword = sc.getInitParameter("jdbcPassword");
		
		// ������ : console Ȯ��
		System.out.println("web.xml �� ��ϵ� InitParam ���� �������� Ȯ��");
		System.out.println("jdbcDriver : "+jdbcURL);
		System.out.println("jdbcURL : "+jdbcURL);
		System.out.println("jdbcUser : "+jdbcUser);
		System.out.println("jdbcPassword : "+jdbcPassword);
	}
	
	//doPost() method overriding 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 request.setCharacterEncoding("euc-kr");
		 response.setContentType("text/html;charset=euc-kr");
		 PrintWriter out= response.getWriter();
		 
		 // Client Form Data ó��
		 String id = request.getParameter("id");
		 String pwd = request.getParameter("pwd");
		 
		 // UserVo instance ���� �� Client Form Data ���� (Binding)
		 UserVO userVO = new UserVO();
		 userVO.setId(id);
		 userVO.setPwd(pwd);
		 
		 // DB ���� Data �˻� ��  UserVO.active true/false ����
		 UserInitParamDao dao = new UserInitParamDao();
		 // DB �������� driver, url, user, password ����
		 dao.setJdbcDriver(jdbcDriver);
		 dao.setJdbcURL(jdbcURL);
		 dao.setJdbcUser(jdbcUser);
		 dao.setJdbcPassword(jdbcPassword);
		 
		 dao.getUser(userVO);
		 
		 out.println("<html>");
		 out.println("<head></head>");
		 out.println("<body>");
		 
		 out.println("<h2>Login ȭ��<h2>");
		 
		 if(userVO.isActive()) {
			 out.println(id+"�� ȯ���մϴ�.");
		 }else {
			 out.println("Login ���� ! id, pwd�� Ȯ���ϼ���");
		 }
		 
		 out.println("<p><p><a href = '/edu/jw04/loginBeanInitParam.html'>�ڷ�</a>");
		 out.println("</body>");
		 out.println("</html>");
		 
	}//end of doPost

}//end of class
