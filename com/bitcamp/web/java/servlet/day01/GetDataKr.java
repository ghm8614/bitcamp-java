package com.bitcamp.web.java.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


// Get 방식으로 전송된 Client Form data 처리
public class GetDataKr extends HttpServlet{

	// 1. Client Get 방식으로 Request : doGet() method 오버라이딩
	// 2. service() 오버라이딩 가능
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{

/*
		tomcat 8.0 이상 get 방식 한글깨짐 해결 방법
		-> server.xml 설정 변경
		<Connector port="8080" protocol="HTTP/1.1"
			connectionTimeout = "20000"
			redirectPort="8443"
			useBodyEncodingForURI="true"/>
 */
		req.setCharacterEncoding("EUC-KR");

		// 아래의 두 실행문은 servlet 에서 client 로 html 전송시 필수
		res.setContentType("text/html;charset=EUC-KR"); //한글 처리
		PrintWriter out = res.getWriter();

		// client form data (Query String name=value) 처리 (API 확인)
		String clientName = req.getParameter("name");
		String clientAddr = req.getParameter("addr");

		// client form data 출력
		System.out.println(clientName + " : " + clientAddr);

		out.println("<html>");
		out.println("<head><title> GetDataKr.java </title></head>");
		out.println("<body>");

		out.println("<h2> Get Test Kr </h2>");
		out.println("<li> 이름 :"+clientName);
		out.println("<li> 주소 :"+clientAddr);

		out.println("<p><p><a href='/edu/getDataKr.html'>뒤로</a>");

		out.println("</body>");
		out.println("</html>");

	}
	
}//end of class
