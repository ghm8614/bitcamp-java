package com.bitcamp.web.java.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;


// Servlet Life Cycle 이해 및 적용 구현
// Servlet Hierarchy 와 Servlet API 이해
public class HelloServletService extends HttpServlet{

	// service() Overriding
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{

		System.out.println("servlet service() 시작!");
		System.out.println("Request Client IP: "+req.getRemoteAddr());

		//한글 처리
		res.setContentType("text/html;charset=EUC-KR");

		//1. client 에게  html text 전송을 위한 stream 생성
//		PrintWriter out = new PrintWriter(new OutputStreamWriter(res.getOutputStream()));

		//2. PrintWriter 인스턴스 생성을 캡슐화 한 API 사용해서 stream 생성 (getter 메서드로 생성)
		PrintWriter out = res.getWriter();
		
		out.println("<html>");
		out.println("<head><title> hello servlet </title></head>");
		out.println("<body>");
		out.println("English : Hello Servlet");
		out.println("<p>");
		out.println("<Korea : 헬로 서블릿>");
		out.println("</body>");
		out.println("</html>");
		out.flush();
		out.close();

		System.out.println("servlet service() 종료 ");
	}//end of service
	
}//end of class
