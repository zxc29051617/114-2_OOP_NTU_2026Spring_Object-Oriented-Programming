public class Square extends Shape {
    public Square() {
        super(0);
    }

    public Square(double length) {
        super(length);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return round(length * length);
    }

    @Override
    public double getPerimeter() {
        return round(4.0 * length);
    }

    private double round(double number) {
        return Math.round(number * 100.0) / 100.0;
    }
}
