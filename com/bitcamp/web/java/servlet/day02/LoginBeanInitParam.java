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
	// web.xml(Meta-data) 등록된 정보 추출
	// 클라이언트의 최초 request 에 1회만 호출 : 서블릿 Life Cycle
	@Override 
	public void init(ServletConfig sc) throws ServletException {
		super.init(sc);
		jdbcDriver = sc.getInitParameter("jdbcDriver");
		jdbcURL = sc.getInitParameter("jdbcURL");
		jdbcUser = sc.getInitParameter("jdbcUser");
		jdbcPassword = sc.getInitParameter("jdbcPassword");
		
		// 디버깅용 : console 확인
		System.out.println("web.xml 에 등록된 InitParam 값을 추출유무 확인");
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
		 
		 // Client Form Data 처리
		 String id = request.getParameter("id");
		 String pwd = request.getParameter("pwd");
		 
		 // UserVo instance 생성 및 Client Form Data 전달 (Binding)
		 UserVO userVO = new UserVO();
		 userVO.setId(id);
		 userVO.setPwd(pwd);
		 
		 // DB 접근 Data 검색 비교  UserVO.active true/false 변경
		 UserInitParamDao dao = new UserInitParamDao();
		 // DB 접속정보 driver, url, user, password 설정
		 dao.setJdbcDriver(jdbcDriver);
		 dao.setJdbcURL(jdbcURL);
		 dao.setJdbcUser(jdbcUser);
		 dao.setJdbcPassword(jdbcPassword);
		 
		 dao.getUser(userVO);
		 
		 out.println("<html>");
		 out.println("<head></head>");
		 out.println("<body>");
		 
		 out.println("<h2>Login 화면<h2>");
		 
		 if(userVO.isActive()) {
			 out.println(id+"님 환영합니다.");
		 }else {
			 out.println("Login 실패 ! id, pwd를 확인하세요");
		 }
		 
		 out.println("<p><p><a href = '/edu/jw04/loginBeanInitParam.html'>뒤로</a>");
		 out.println("</body>");
		 out.println("</html>");
		 
	}//end of doPost

}//end of class
