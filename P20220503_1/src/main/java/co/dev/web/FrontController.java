package co.dev.web;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontController extends HttpServlet{
	HashMap<String, Control> list = null;
	String charset = null;
	
	 @Override
	public void init(ServletConfig config) throws ServletException {
	   charset = config.getInitParameter("charset"); 
	    
	   list = new HashMap<String, Control>();
	   list.put("/memberInsert.do", new MemberInsertControl());
	   list.put("/memberUpdate.do", new MemberUpdateControl());
	   list.put("/memberList.do", new MemberListControl());
	}
	 @Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   req.setCharacterEncoding(charset);
		 
	   String url = req.getRequestURI(); // /P20220503_1/memberInsert.do
	   String context = req.getContextPath();
	   String path = url.substring(context.length()); // 위 주소중 P2022..이후의 값을 가져오겟습니다
	   
	   Control exeCon = list.get(path);
	   exeCon.execute(req, resp);
	}
}
