package com.javapractic.operation;

public class Operations {

	public int add(int x,int y){
		
		int sum=x+y;
		
		return sum;
		
	}
	
	public int sub(int x, int y){
		
		int subt;
		
		if(x>y)
			subt = x-y;
		else
			subt = y-x;
		
		return  subt;
	}
	
	public int multi(int x, int y){
		
		int mult=x*y;
		
		return mult;
	}
	
	public void  exit(int x){
		System.exit(0);
	}
	 
      
	
}
