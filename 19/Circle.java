/**
 * Represents a circle whose length value is its diameter.
 */
public class Circle extends Shape {

    /**
     * Creates a circle with a diameter of zero.
     */
    public Circle() {
        super(0);
    }

    /**
     * Creates a circle with the specified diameter.
     *
     * @param length the diameter
     */
    public Circle(double length) {
        super(length);
    }

    /**
     * Sets the diameter of the circle.
     *
     * @param length the diameter
     */
    @Override
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Calculates the rounded area of the circle.
     *
     * @return the area rounded to two decimal places
     */
    @Override
    public double getArea() {
        double radius = length / 2.0;
        return round(Math.PI * radius * radius);
    }

    /**
     * Calculates the rounded circumference of the circle.
     *
     * @return the circumference rounded to two decimal places
     */
    @Override
    public double getPerimeter() {
        return round(Math.PI * length);
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
