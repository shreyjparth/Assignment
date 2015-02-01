package com.first;
public class Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Big b=new Big();
		Big ref1=new Tri();
		Big ref2=new Rec();
		ref1.area(10,20);
		ref2.area(20,30);
		
		

	}

}

class Big{
	void area(int x,int y){
		
	}
}

class Tri extends Big{

	@Override
	void area(int x, int y) {
		// TODO Auto-generated method stub
		super.area(x, y);
		float a=(float)0.5*x*y;
		System.out.println(a);
	}
	
}

class Rec extends Big{

	@Override
	void area(int x, int y) {
		// TODO Auto-generated method stub
		super.area(x, y);
		int b=x*y;
		System.out.println(b);
	}
	
}


