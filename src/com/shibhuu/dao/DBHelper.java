package com.shibhuu.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBHelper {
	static String provider="jdbc:mysql://localhost:3306/e-tender";
	static String uid="root";
	static String password="123";
	public static Connection openConnection()
	{
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection cn=DriverManager.getConnection(provider,uid,password);
			return(cn);
		}catch(Exception e){System.out.println("OpenConnection eroor:"+e);return(null);}
	}
	public static ResultSet executeQuery(String query)
	{
		try{
			Connection cn=openConnection();
			Statement smt=cn.createStatement();
			ResultSet rs=smt.executeQuery(query);
			return(rs);
			
		}catch(Exception e){System.out.println("Executequery Errror:"+e);return(null);}	
	}
	public static boolean executeUpdate(String query)
	{try{
		 Connection cn=openConnection();
		   Statement smt=cn.createStatement();
		   smt.executeUpdate(query);
		   return(true);
	}catch(Exception e){System.out.println("ExecuteUpdate Error:"+e);return(false);}}
	
}
