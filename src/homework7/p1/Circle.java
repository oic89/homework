package homework7.p1;

//圆
public class Circle extends Shape {
    private Double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public double getC() {
        double C = Math.round((Math.PI * 2 * r) * 100) / 100.0;
        return C;
    }

    @Override
    double getV() {
        return 0;
    }

    @Override
    double getS() {
        double S = Math.round((Math.PI * r * r) * 100) / 100.0;
        return S;
    }
}
