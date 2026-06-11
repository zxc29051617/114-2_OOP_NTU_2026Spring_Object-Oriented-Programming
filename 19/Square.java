/**
 * Represents a square.
 */
public class Square extends Shape {

    /**
     * Creates a square with a side length of zero.
     */
    public Square() {
        super(0);
    }

    /**
     * Creates a square with the specified side length.
     *
     * @param length the side length
     */
    public Square(double length) {
        super(length);
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
     * Calculates the rounded area of the square.
     *
     * @return the area rounded to two decimal places
     */
    @Override
    public double getArea() {
        return round(length * length);
    }

    /**
     * Calculates the rounded perimeter of the square.
     *
     * @return the perimeter rounded to two decimal places
     */
    @Override
    public double getPerimeter() {
        return round(4.0 * length);
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
