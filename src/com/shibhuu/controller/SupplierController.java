package com.shibhuu.controller;

import com.shibhuu.dao.DBHelper;
import com.shibhuu.model.supplier;

public class SupplierController {
	public static boolean addNewRecord(supplier S)
	{try{
		  String q="insert into supplier(username,email,mobile,birthdate,gender,password,confirmpassword,address)values('"+S.getUsername()+"','"+S.getEmail()+"','"+S.getMobile()+"','"+S.getBirthdate()+"','"+S.getGender()+"','"+S.getPassword()+"','"+S.getConfirmpassword()+"','"+S.getAddress()+"')";
		   boolean status=DBHelper.executeUpdate(q);
		   return(status);
		}catch(Exception e){
		 System.out.println("SupplierController-addNewRecord "+e);	
		 return(false);}
	}}
