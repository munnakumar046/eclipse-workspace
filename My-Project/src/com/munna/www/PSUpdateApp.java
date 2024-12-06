package com.munna.www;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PSUpdateApp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number");
		int no=sc.nextInt();
		System.out.println("enter your name");
		String name=sc.next();
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","admin");
		
		String qry="update student set sname=? where sno=?";
//		String qry="update student set sno=? where sname=?";

		PreparedStatement ps=con.prepareStatement(qry);
		// set value
//		ps.setInt(1, no);
//		ps.setString(2, name);
		ps.setString(1, name);
		ps.setInt(2, no);
		// execute
		int result=ps.executeUpdate();
		if (result==0)
		{
			System.out.println("no row update");
		} else {
			System.out.println("row updated");
		}
		ps.close();
		con.close();
	}

}
