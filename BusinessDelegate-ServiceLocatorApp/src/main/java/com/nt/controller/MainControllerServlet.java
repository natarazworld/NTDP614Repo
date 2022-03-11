package com.nt.controller;

import java.io.IOException;

import com.nt.delegate.IStockMgmtBusinessDelegate;
import com.nt.delegate.StockMgmtBusinessDelegateImpl;
import com.nt.vo.StockAllDetailsVO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/controller")
public class MainControllerServlet extends HttpServlet {
	
	private IStockMgmtBusinessDelegate delegate;
	@Override
	public void init() throws ServletException {
	   delegate=new StockMgmtBusinessDelegateImpl();
	}
	

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("MainControllerServlet.doGet()");
		  //read form data
		 String stockName=req.getParameter("stockName");
		 //invoke  method on BusinessDelegate
		 try {
			 StockAllDetailsVO  vo=delegate.findStockAllDetailsByStockName(stockName);
			 //keep the results in request scope
			 req.setAttribute("stockDetails", vo);
			 //forward the request to show_stock_details.jsp
			 RequestDispatcher rd=req.getRequestDispatcher("/show_stock_details.jsp");
			 rd.forward(req, res);
		 }
		 catch(Exception e) {
			 //forward the request to error.jsp
			 RequestDispatcher rd=req.getRequestDispatcher("/error.jsp");
			 rd.forward(req, res);
		 }
		
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}
	
	@Override
	public void destroy() {
		delegate=null;
	}

}
