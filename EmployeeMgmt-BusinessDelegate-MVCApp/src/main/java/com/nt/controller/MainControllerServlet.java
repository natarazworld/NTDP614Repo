package com.nt.controller;

import java.io.IOException;

import com.nt.delegate.EmployeeMgmtBusinessDelegateImpl;
import com.nt.delegate.IEmployeeMgmtBusinessDelegate;
import com.nt.exception.EmployeeRegistrationProblemException;
import com.nt.vo.EmployeeVO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/controller")
public class MainControllerServlet extends HttpServlet {
	private IEmployeeMgmtBusinessDelegate  delegate;
	@Override
	public void init() throws ServletException {
		delegate=new EmployeeMgmtBusinessDelegateImpl();
	}

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	    // read form data  and store  into VO class obj
		EmployeeVO   empVO=new EmployeeVO();
		empVO.setEmpName(req.getParameter("ename"));
		empVO.setEmpDesg(req.getParameter("edesg"));
		empVO.setEmpAddrs(req.getParameter("eaddrs"));
		empVO.setSalary(req.getParameter("esalary"));

		try {
			//invoke the b.method
			String resultMsg=delegate.registerEmployee(empVO);
			//keep the result in the request scope
			req.setAttribute("result", resultMsg);
			//forward the request to  show_result.jsp
			RequestDispatcher rd=req.getRequestDispatcher("show_result.jsp");
			rd.forward(req, res);
		}
		catch(EmployeeRegistrationProblemException erpe ) {
			  erpe.printStackTrace();
			  req.setAttribute("errMsg", erpe.getMessage());
			  RequestDispatcher rd=req.getRequestDispatcher("/error.jsp");
			  rd.forward(req, res);
			  
		}
		catch(Exception e) {
			e.printStackTrace();
		   req.setAttribute("errMsg", e.getMessage());
			RequestDispatcher rd=req.getRequestDispatcher("/error.jsp");
			  rd.forward(req, res);
		}
		
		
		
	}

	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}

}
