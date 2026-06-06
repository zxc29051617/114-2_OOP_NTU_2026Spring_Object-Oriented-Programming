public class Triangle extends Shape {
    public Triangle() {
        super(0);
    }

    public Triangle(double length) {
        super(length);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return round(Math.sqrt(3) * length * length / 4.0);
    }

    @Override
    public double getPerimeter() {
        return round(3.0 * length);
    }

    private double round(double number) {
        return Math.round(number * 100.0) / 100.0;
    }
}
