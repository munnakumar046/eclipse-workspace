package com.munna.www;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertApp2 {

	public static void main(String[] args)throws Exception  {
		// TODO Auto-generated method stub				
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter no");
		int num=sc.nextInt();
		
		System.out.println("enter the name");
		String name=sc.next();
		
		name="'"+name+"'";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","admin");
		Statement st=con.createStatement();
		
		
		String qry="update student set sname="+name+" where sno="+num;
		
		int result=st.executeUpdate(qry);
		if(result==0)
			System.out.println("No Record Updated");
		else
			System.out.println(result+" Record Updated");
		
		st.close();
		con.close();
		
	}

}
