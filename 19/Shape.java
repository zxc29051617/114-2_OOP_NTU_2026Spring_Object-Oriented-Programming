/**
 * Defines the common properties and operations of a geometric shape.
 */
public abstract class Shape {

	/**
	 * Stores a side length, or the diameter when the shape is a circle.
	 */
	protected double length;	

	/**
	 * Creates a shape with the specified length.
	 *
	 * @param length the side length or diameter
	 */
	public Shape(double length){
		this.length=length;
	}
	
	/**
	 * Sets the length used by the shape.
	 *
	 * @param length the side length or diameter
	 */
	public abstract void setLength(double length);
	
	/**
	 * Calculates the area of the shape.
	 *
	 * @return the area
	 */
	public abstract double getArea();
	
	/**
	 * Calculates the perimeter of the shape.
	 *
	 * @return the perimeter
	 */
	public abstract double getPerimeter();
	
	/**
	 * Returns the area and perimeter of the shape.
	 *
	 * @return the shape information
	 */
	public String getInfo(){
		return "Area = "+getArea()+
			   ", Perimeter = "+getPerimeter();
	}
}
