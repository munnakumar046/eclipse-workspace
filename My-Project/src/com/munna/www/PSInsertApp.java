package com.munna.www;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PSInsertApp {
	public static void main(String[] args)throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number");
		int no=sc.nextInt();
		System.out.println("enter your name");
		String name=sc.next();
		System.out.println("enter your add");
		String add=sc.next();
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","admin");
		
		String qry="insert into student values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(qry);		
		// set the value;
		ps.setInt(1, no);
		ps.setString(2, name);
		ps.setString(3, add);
		// exection
		int result=ps.executeUpdate();
		if(result==0)
		{
			System.out.println("not updated");
		}
		else {
			System.out.println("row updated");
		}
		
	}
}
