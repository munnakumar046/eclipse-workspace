package com.annum.www;
public class Block {

	private String title;
	private String author;
	private double price;
	
	public Block()
	{
		this.title="Strugle";
		this.author= "Annum";
		this.price=10.50;
	}
	
	public Block(String title, String author)
	{
		this.title=title;
		this.author= author;
		this.price=0.0;
	}
	public Block(String title, String author, float price)
	{
		this.title=title;
		this.author= author;
		this.price=price;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Block Block1=new Block();
		System.out.println(Block1.title);
		System.out.println(Block1.author);
		System.out.println(Block1.price);
		System.out.println("=================================");
		
		Block Block2=new Block("Energy","jesm",101);
		System.out.println(Block2.title);
		System.out.println(Block2.author);
		System.out.println(Block2.price);
		
		System.out.println("=================================");
		
		Block Block3=new Block("Heat","Rom");
		System.out.println(Block3.title);
		System.out.println(Block3.author);
		System.out.println(Block3.price);

	}

}
