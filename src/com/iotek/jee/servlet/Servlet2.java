package com.iotek.jee.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		//super.init(config);
		print("init");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	super.service(arg0, arg1);
		print("service");
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		//super.destroy();
		print("destroy");
	}
	void print(String content){
		System.out.println(getClass().getSimpleName()+" method name:"+content+"thread name:"+Thread.currentThread().getName() );
	}

}
