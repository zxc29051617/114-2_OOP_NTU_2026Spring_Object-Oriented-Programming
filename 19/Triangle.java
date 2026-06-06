public class Triangle extends Shape {
    public Triangle() {
        this.length = 0;
    }

    public Triangle(double length) {
        this.length = length;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return Math.sqrt(3) * length * length / 4.0;
    }

    @Override
    public double getPerimeter() {
        return 3.0 * length;
    }
}
