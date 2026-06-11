/**
 * Represents a circle whose length value is its diameter.
 */
public class Circle extends Shape {

    /**
     * Creates a circle with the specified diameter.
     *
     * @param length the diameter
     */
    public Circle(double length) {
        setLength(length);
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
     * Calculates the area of the circle.
     *
     * @return the area
     */
    @Override
    public double getArea() {
        double radius = length / 2.0;
        return Math.PI * radius * radius;
    }

    /**
     * Calculates the circumference of the circle.
     *
     * @return the circumference
     */
    @Override
    public double getPerimeter() {
        return Math.PI * length;
    }
}
