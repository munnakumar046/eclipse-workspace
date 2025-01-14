package com.annum.www;

public class Rectangle {

	private double length;
	private double width;
	
	public Rectangle(double length, double width)
	{
		this.length=length;
		this.width=width;
	}
	// copy constructor
	public Rectangle(Rectangle rectangle)
	{
		this.length=rectangle.length;
		this.width=rectangle.width;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create an object for rectangle
		Rectangle rect1=new Rectangle(12.5, 4.5);
		System.out.println("Rectangle 1 length ="+ rect1.length);
		System.out.println("Rectangle 1 width = "+ rect1.width);
		
		System.out.println("============");
		
		Rectangle rect2=new Rectangle(rect1);
		System.out.println("Rectangle 1 length ="+ rect2.length);
		System.out.println("Rectangle 1 width = "+ rect2.width);
	}

}
