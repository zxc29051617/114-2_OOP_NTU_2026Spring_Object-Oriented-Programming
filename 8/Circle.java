public class Circle extends Shape {

    public Circle() {
        this.length = 0;
    }

    public Circle(double length) {
        setLength(length);
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        double radius = length / 2;
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return Math.PI * length;
    }
}