/**
 * Represents a regular triangle.
 */
public class Triangle extends Shape {

    /**
     * Creates a regular triangle with the specified side length.
     *
     * @param length the side length
     */
    public Triangle(double length) {
        setLength(length);
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
     * Calculates the area of the regular triangle.
     *
     * @return the area
     */
    @Override
    public double getArea() {
        return Math.sqrt(3) * length * length / 4.0;
    }

    /**
     * Calculates the perimeter of the regular triangle.
     *
     * @return the perimeter
     */
    @Override
    public double getPerimeter() {
        return 3.0 * length;
    }
}
