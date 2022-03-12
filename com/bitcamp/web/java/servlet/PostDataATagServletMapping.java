package com.bitcamp.web.java.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class PostDataATagServletMapping extends HttpServlet{

	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{

		// Client Form Data 한글 디코딩
		req.setCharacterEncoding("EUC-KR");

		// servlet 에서 client 로 html 전송시 필수
		res.setContentType("text/html;charset=EUC-KR"); //한글 처리
		PrintWriter out = res.getWriter();

		// client form data (Query String name=value) 처리 (API 확인)
		String clientName = req.getParameter("name");
		String clientAddr = req.getParameter("addr");

		// client form data 출력
		System.out.println(clientName + " : " + clientAddr);

		out.println("<html>");
		out.println("<head><title> PostDataATag~.java </title></head>");
		out.println("<body>");

		out.println("<h2> Post Test </h2>");
		out.println("<li> 이름 :"+clientName);
		out.println("<li> 주소 :"+clientAddr);

		out.println("<p><p><a href='/edu/jw02/postDataATagServletMapping.html'>뒤로</a>");

		// <a> 태그를 이용해서 Query 문자열 전달
		out.println("<p><p><a href='/edu/PostDataATagServletMapping?name=홍길동&addr=서울'>"+"자기자신</a>");

		out.println("</body>");
		out.println("</html>");

	}
	
}//end of class
