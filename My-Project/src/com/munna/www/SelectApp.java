package com.munna.www;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectApp 
{
   public static void main(String[] args)throws Exception {
	System.out.println("munna bhai");
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","admin");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("Select*from student");
	while(rs.next())
	{
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
	}
	rs.close();
	st.close();
	con.close();
	
	
}
}
