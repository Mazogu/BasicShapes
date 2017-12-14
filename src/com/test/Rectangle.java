package com.test;

/**
 * @author micha
 * A rectangle
 */
public class Rectangle implements Shape {
	double width;
	double height;
	/**
	 * Creates a square with a given side length.
	 * @param sides
	 */
	public Rectangle(double sides){
		this.width = this.height = sides;
	}
	/**
	 * Creates a rectangle with the side lengths that are given.
	 * @param width
	 * @param height
	 */
	public Rectangle(double width,double height){
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double area(){
		return width * height;
	}
	
	public static void main(String args[]){
		Rectangle rectangle = new Rectangle(3.5,9.7);
		System.out.println(rectangle.area());
		rectangle.height = 5;
		rectangle.width = 10;
	}
}
