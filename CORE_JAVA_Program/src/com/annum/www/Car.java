package com.annum.www;

//define the cat class
public class Car extends Engine {
	
	public void driver()
     
	{
		int status= super.start();
		
		if (status >=1) {
		System.out.println("engine starting ");
		}
		else
		{
			System.out.println("failed to start the engine..");
		} 
	}
}