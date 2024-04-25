package homework7.p1;

//梯形
public class Trapezoid extends Shape {
    private Double a;
    private Double b;
    private Double c;
    private Double d;
    private Double h;

    public Trapezoid(double a, double b, double c, double d, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = h;
    }

    public double getC() {
        double C = Math.round((a + b + c + d) * 100) / 100.0;
        return C;
    }

    @Override
    double getV() {
        return 0;
    }

    @Override
    double getS() {
        double S = Math.round((((a + b) * h) / 2) * 100) / 100.0;
        return S;
    }
}
