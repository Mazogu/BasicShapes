package com.test;

/**
 * @author micha
 *A basic triangle with 3 sides
 */
public class Triangle implements Shape{
	private double side1,side2,side3;
	public static final double defaultAngle = 55;
	
	/**
	 * Forms an equilateral Triangle with the given side.
	 * @param side
	 */
	public Triangle(double side){
		this.side1 = this.side2 = this.side3 = side;
	}
	/**
	 * Creates a triangle with the 2 sides given and fabricating a 3 with a predetermined angle. 
	 * @param side1
	 * @param side2
	 */
	public Triangle(double side1,double side2){
		this.side1 = side1;
		this.side2 = side2;
		findSide();
	}
	
	/**
	 * Creates a triangle with 3 given sides after determining that it's possible to do so. 
	 * @param side1
	 * @param side2
	 * @param side3
	 * @throws TriangleSidesFailureException
	 */
	public Triangle(double side1,double side2,double side3) throws TriangleSidesFailureException{
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		checkSides();
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/**
	 * Calculates a third side with the default angle. 
	 */
	private void findSide(){
		
	}
	
	/**
	 * Makes sure that the sides given can actually form a triangle. Throws an exception if they can't.
	 * @throws TriangleSidesFailureException
	 */
	private void checkSides() throws TriangleSidesFailureException{
		if(side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2){
			throw new TriangleSidesFailureException("The given sides cannot make a valid triangle");
		}
	}
}
