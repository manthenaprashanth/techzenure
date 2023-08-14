package com.techzenure.java.oops;

public class Circle_Hw {

	double radius;
	String colors;
	Circle_Hw()
	{
		radius =1.0;
		colors ="red";
		
	}
	Circle_Hw(double x , String y){
		radius =x;
		colors = y;
		System.out.println(" Colors of the circle =" + x);
		
	}
	 Void  getArea()
	{
		System.out.println(" Area of  the circle: "+( 3.14+"radius"+radius));
		return null;
		
	}
	public static void main(String[] args) {
		Circle_Hw obj=new  Circle_Hw();
		obj.getArea();
		Circle_Hw obj1=new Circle_Hw(7.0,"pink");
		obj1.getArea();

	}

}
