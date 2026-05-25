public class Square extends Shape {

    public Square() {
        this.length = 0;
    }

    public Square(double length) {
        setLength(length);
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return length * length;
    }

    public double getPerimeter() {
        return 4 * length;
    }
}