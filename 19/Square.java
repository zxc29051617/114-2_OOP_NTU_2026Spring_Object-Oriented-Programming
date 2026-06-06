public class Square extends Shape {
    public Square() {
        this.length = 0;
    }

    public Square(double length) {
        this.length = length;
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
