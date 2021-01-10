package com.shibhuu.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Tenders
 */
@WebServlet("/Tenders")
public class Tenders extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Tenders() {
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
		out.println("<ul><li><a href='About'>About</a><li><a href='Contacts'>Contact</a><li><a href='Tenders'>Active Tenders</a><li><a href='Search'>Search</a><li><li><a href='Registration'>Registration</a><li><a href='Home'>Home</a></li></ul>");
		out.println("<div><table align='center'bgcolor='white'border='0' cellspacing='30'cellpadding='9'height='80%'width=80%><caption><font color='brown'><h2 align='left'>Latest Tenders</h2></caption>");
		out.println("<tr><th><font color= 'red'><h2>Tender Title</h2></th>");
		out.println("<th><font color= 'red'><h2>Reference No</h2></th>");
		out.println("<th> 	<font color= 'red'><h2>Closing Date</h2></th>");
		out.println("<th> 	<font color= 'red'><h2>Bid Opening Date</h2></th></tr>");
		
		out.println("<tr><td><h6><a href='i'>sdfjkbgfjbvbnmcmvnc n bc ,nb hv hb c<h5></td><td><h5>4-IMP-48-P-1<h6></td><td><h6>sdfjkb<h6></td><td><h6>sdfjkb<h6>	 ");
		out.println("<tr><td><h6><a href='i'>sdfjkb<h5></td><td><h6>4-IMP-48-P-1<h5></td><td><h5>sdfjkb<h6></td><td><h6>sdfjkb<h6>");
		out.println("<tr><td><h6><a href='i'>sdfjkb<h5></td><td><h6>4-IMP-48-P-1<h5></td><td><h5>sdfjkb<h6></td><td><h6>sdfjkb<h6>");
		out.println("<tr><td><h6><a href='i'>sdfjkb<h5></td><td><h6>4-IMP-48-P-1<h5></td><td><h5>sdfjkb<h6></td><td><h6>sdfjkb<h6>");
		out.println("<tr><td><h6><a href='i'>sdfjkb<h5></td><td><h6>4-IMP-48-P-1<h5></td><td><h5>sdfjkb<h6></td><td><h6>sdfjkb<h6>");
	    out.println("</table></div>");
	}

}
