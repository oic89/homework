package homework7.p1;

//四面体类
class Tetrahedron extends Shape {
    private Double a;

    public Tetrahedron(double a) {
        this.a = a;
    }

    @Override
    double getV() {
        double V = Math.round(((a * a * a) / (6 * Math.sqrt(2))) * 100) / 100.0;
        return V;
    }

    @Override
    double getS() {
        double S = Math.round((Math.sqrt(3) * a * a) * 100) / 100.0;
        return S;
    }
}
