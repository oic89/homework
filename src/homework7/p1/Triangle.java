package homework7.p1;

//三角形
public class Triangle extends Shape {
    private Double a;
    private Double b;
    private Double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Double getA() {
        return a;
    }

    public Double getB() {
        return b;
    }

    public Double getC2() {
        return c;
    }

    public double getC() {
        double C = Math.round((a + b + c) * 100) / 100.0;
        return C;
    }

    @Override
    double getV() {
        return 0;
    }

    @Override
    double getS() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
