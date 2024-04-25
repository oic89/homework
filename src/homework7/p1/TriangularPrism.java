package homework7.p1;

//三棱柱类
class TriangularPrism extends Prism {
    double a, b, c;

    public TriangularPrism(Triangle triangle, double height) {
        super(height);
        this.a = triangle.getA();
        this.b = triangle.getB();
        this.c = triangle.getC2();
    }

    @Override
    double getBaseS() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    double getBaseC() {
        return a + b + c;
    }
}
