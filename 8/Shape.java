public abstract class Shape {
    protected double length;

    public abstract void setLength(double length);

    public abstract double getArea();

    public abstract double getPerimeter();

    public String getInfo() {
        return "Area = " + formatNumber(getArea()) + ", Perimeter = " + formatNumber(getPerimeter());
    }

    private String formatNumber(double number) {
        double rounded = Math.round(number * 100.0) / 100.0;
        return String.valueOf(rounded);
    }
}
