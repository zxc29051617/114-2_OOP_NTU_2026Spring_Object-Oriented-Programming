/**
 * Represents a square.
 */
public class Square extends Shape {

    /**
     * Creates a square with the specified side length.
     *
     * @param length the side length
     */
    public Square(double length) {
        setLength(length);
    }

    /**
     * Sets the side length of the square.
     *
     * @param length the side length
     */
    @Override
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Calculates the area of the square.
     *
     * @return the area
     */
    @Override
    public double getArea() {
        return length * length;
    }

    /**
     * Calculates the perimeter of the square.
     *
     * @return the perimeter
     */
    @Override
    public double getPerimeter() {
        return 4.0 * length;
    }
}
