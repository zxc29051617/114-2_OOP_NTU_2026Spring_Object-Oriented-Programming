public class Circle extends Shape {
    public Circle() {
        super(0);
    }

    public Circle(double length) {
        super(length);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        double radius = length / 2.0;
        return round(Math.PI * radius * radius);
    }

    @Override
    public double getPerimeter() {
        return round(Math.PI * length);
    }

    private double round(double number) {
        return Math.round(number * 100.0) / 100.0;
    }
}
