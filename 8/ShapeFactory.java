public class ShapeFactory {

    public enum Type {
        Triangle,
        Square,
        Circle
    }

    public Shape createShape(ShapeFactory.Type shapeType, double length) {
        Shape shape = null;

        if (shapeType == ShapeFactory.Type.Triangle) {
            shape = new Triangle();
        } else if (shapeType == ShapeFactory.Type.Square) {
            shape = new Square();
        } else if (shapeType == ShapeFactory.Type.Circle) {
            shape = new Circle();
        }

        if (shape != null) {
            shape.setLength(length);
        }

        return shape;
    }
}