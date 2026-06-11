/**
 * Defines the common properties and operations of a geometric shape.
 */
public abstract class Shape {

    /**
     * Stores a side length, or the diameter when the shape is a circle.
     */
    protected double length;

    /**
     * Creates a shape with an initial length of zero.
     */
    public Shape() {
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
     * Returns the formatted area and perimeter of the shape.
     *
     * @return the shape information
     */
    public String getInfo() {
        return "Area = " + formatNumber(getArea()) + ", Perimeter = " + formatNumber(getPerimeter());
    }

    /**
     * Rounds a number to at most two decimal places for display.
     *
     * @param number the number to format
     * @return the formatted number
     */
    private String formatNumber(double number) {
        double rounded = Math.round(number * 100.0) / 100.0;
        return String.valueOf(rounded);
    }
}
