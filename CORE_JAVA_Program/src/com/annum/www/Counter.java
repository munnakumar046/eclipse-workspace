package com.annum.www;

public class Counter {

	private static int count=0;
	
	public Counter()
	{
		count++;
	}
	
	public static int getcount()
	{
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter c1=new Counter();
		Counter c2=new Counter();
		Counter c3=new Counter();

		System.out.println("count"+ Counter.getcount());
		

	}

}
