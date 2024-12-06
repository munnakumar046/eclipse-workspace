package com.annum.www;

public class Student {

	private int studentId;
	private String studentName;
	private String grade;
	
	public Student()
	{
		 this(101, "annum", "annum");
//		this.studentId=101;
//		this.studentName="munna";
//		this.grade='A';
	}
	public Student(int studentId, String studentName, String grade)
	{
		this.studentId=studentId;
		this.studentName=studentName;
		this.grade=grade;
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create a new Student object using the default constructor
		Student std1=new Student();
		System.out.println("studentId = "+std1.studentId);
		System.out.println("studentName = "+std1.studentName);
		System.out.println("grade = "+std1.grade);

		System.out.println("======================================================");
		Student std2=new Student(201,"Sager","B");
		System.out.println("studentId = "+std2.studentId);
		System.out.println("studentName = "+std2.studentName);
		System.out.println("grade = "+std2.grade);
	}

}
