package homework7.p1;

//矩形
public class Rectangle extends Shape {
    private Double length;
    private Double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getC() {
        double C = Math.round((length * 2 + width * 2) * 100) / 100.0;
        return C;
    }

    @Override
    double getV() {
        return 0;
    }

    @Override
    double getS() {
        return 2 * (length * width);
    }
}
