package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AddEmployeeDataBaseOperation;
import bean.AddEmployeeBean;

/**
 * Servlet implementation class AddEmployeeServlet
 */
@WebServlet("/AddEmployeeServlet")
public class AddEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		 out.print("I enter");
		String EmployeeId=request.getParameter("employeeid");
		String EmployeeName=request.getParameter("employeename");
		String Designation=request.getParameter("Designatio");
		long MoblieNo=Long.parseLong(request.getParameter("mobileno"));
		String EmailId=request.getParameter("emailid");
		String JoiningDate=request.getParameter("joiningdate");
		String  PreviousExperience=request.getParameter("prevoiusexperience");
		
		AddEmployeeBean aeb=new AddEmployeeBean();
		 aeb.setEmployeeId(EmployeeId);
		 aeb.setEmployeeName(EmployeeName);
		 aeb.setDesignation(Designation);
		 aeb.setMoblieNo(MoblieNo);
		 aeb.setEmailId(EmailId);
		 aeb.setJoiningDate(JoiningDate);
		 aeb.setPreviousExperience(PreviousExperience);
		 AddEmployeeDataBaseOperation aedb=new AddEmployeeDataBaseOperation();
		 aedb.insertEmployeeDetails(aeb);
		
		
	}

}
