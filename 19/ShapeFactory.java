/**
 * Creates shape objects according to a requested shape type.
 */
public class ShapeFactory {

    /**
     * Creates a shape factory.
     */
    public ShapeFactory() {
    }

    /**
     * Lists the shape types supported by the factory.
     */
    public enum Type {
        /**
         * A regular triangle.
         */
        Triangle,

        /**
         * A square.
         */
        Square,

        /**
         * A circle.
         */
        Circle
    }

    /**
     * Creates a shape with the specified type and length.
     *
     * @param shapeType the type of shape to create
     * @param length the side length or diameter
     * @return the created shape, or {@code null} for an unsupported type
     */
    public Shape createShape(ShapeFactory.Type shapeType, double length) {
        switch (shapeType) {
            case Triangle:
                return new Triangle(length);
            case Square:
                return new Square(length);
            case Circle:
                return new Circle(length);
            default:
                return null;
        }
    }
}
