package com.shibhuu.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head><style>ul{list-style-type:none;margin:0;padding:0;overflow:hidden;background-color:#333}li{float:right;}li a {display:block;color:white;text-align:right;padding:14px 16px;text-decoration:none;}li a:hover{background-color:#111;}");
		out.println("body {background-color:#f2f2f2;}#1{layout:auto} </style></head>" );
		out.println("<table cellpadding='1'  cellspacing='1' bgcolor='white' width=100% align=right><th><img src=tender.jpg width=100% height='122'></th></tr></table>");
		out.println("<marquee behavior='scroll'bgcolor='white'><font color='brown'>All Tender Inviting Authorities may kindly note that from 1st April 2019 onwards, Price Bids in .PDF format / Scanned will be disabled from Tender Creation Menu in eProcurement portal.<q>Additional Help Desk Number 0120-4001005.</q></marquee>");
		out.println("<ul><li><a href='About'>About</a><li><a href='Contacts'>Contact</a><li><a href=' Tenders'>Active Tenders</a><li><a href='Search'>Search</a><li><li><a href='Registration'>Registration</a><li><a href='Home'>Home</a></li></ul>");
		out.println("<table align=''color='white'width='50%'border='1'cellspacing='0'cellpadding='0'><caption><h2 align='left'><font color='brown'>Tenders -<font color=black>Bidder Registration<br><font color='blue'>Business Opportunities Just a Click away !</h2><h4 align='left'><font color='black'>Fill out the Form and Get Registered with us.</h4></caption>");
		out.println("<table align=''bgcolor='white'width='40%'height='80%'border='0'cellspacing='0'cellpadding='2'><tr><td>Login Id:</td><td><input type='text' name='login'><td></tr><tr><td>Email Id:</td><td><input type='email' name='email'></td></tr><tr><td>Mobile no:</td><td><input type='number' name='mob'></td></tr><tr><td>Company Name:</td><td><input type='text' name='cn'></td></tr><tr><td>Registration no.:</td><td><input type='text' name='rn'></td></tr><tr><td>Registered Address:</td><td><textarea type='text' name='ra'width='4'height='5' ></textarea></td></tr><tr><td>Name of Partners/Directors:</td><td><textarea type='text' name='partners' width='5'height='6'></textarea></td></tr><tr><td>Bidder Type<input type='radio' name='biddertype'>Indian<input type='radio' name='biddertype'>Foreign</td></tr><tr><td>City:</td><td><input ></td></tr>");
		out.println("<tr><td>State</td><td><input type='text'><option>-select-</option>");
		out.println("</table></table></html>");
	}

}
