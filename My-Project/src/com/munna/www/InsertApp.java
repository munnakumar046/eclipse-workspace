package com.munna.www;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertApp {

	public static void main(String[] args)throws Exception
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your no");
		int no=sc.nextInt();
		
		System.out.println("enter your name");
		String name=sc.next();
		
		System.out.println("enter your add");
		String add=sc.next();
		//System.out.println(no+" "+name+" "+add);
		
		//converting input values according to SQL query
		name="'"+name+"'";
		add="'"+add+"'";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","admin");
		Statement st=con.createStatement();
		
		String qry="insert into student values("+no+","+name+","+add+")";
		int result=st.executeUpdate(qry);
		if (result==0)
			System.out.println("no row update");
		else
				System.out.println("row updated");
		st.close();
		con.close();
		sc.close();
		
	}

}
