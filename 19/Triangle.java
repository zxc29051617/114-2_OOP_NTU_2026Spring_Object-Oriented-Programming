/**
 * Represents a regular triangle.
 */
public class Triangle extends Shape {

    /**
     * Creates a regular triangle with a side length of zero.
     */
    public Triangle() {
        super(0);
    }

    /**
     * Creates a regular triangle with the specified side length.
     *
     * @param length the side length
     */
    public Triangle(double length) {
        super(length);
    }

    /**
     * Sets the side length of the triangle.
     *
     * @param length the side length
     */
    @Override
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Calculates the rounded area of the regular triangle.
     *
     * @return the area rounded to two decimal places
     */
    @Override
    public double getArea() {
        return round(Math.sqrt(3) * length * length / 4.0);
    }

    /**
     * Calculates the rounded perimeter of the regular triangle.
     *
     * @return the perimeter rounded to two decimal places
     */
    @Override
    public double getPerimeter() {
        return round(3.0 * length);
    }

    /**
     * Rounds a number to two decimal places.
     *
     * @param number the number to round
     * @return the rounded number
     */
    private double round(double number) {
        return Math.round(number * 100.0) / 100.0;
    }
}
