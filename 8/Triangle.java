public class Triangle extends Shape {

    public Triangle() {
        this.length = 0;
    }

    public Triangle(double length) {
        setLength(length);
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return Math.sqrt(3) * length * length / 4;
    }

    public double getPerimeter() {
        return 3 * length;
    }
}