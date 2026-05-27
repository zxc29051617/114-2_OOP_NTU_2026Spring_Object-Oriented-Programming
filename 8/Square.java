public class Square extends Shape {
    public Square(double length) {
        setLength(length);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public double getPerimeter() {
        return 4.0 * length;
    }
}
