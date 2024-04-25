package homework7.p1;

//柱体
abstract class Prism extends Shape {
    double height;

    public Prism(double height) {
        this.height = height;
    }

    @Override
    double getV() {
        double V = Math.round((getBaseS() * height) * 100) / 100.0;
        return V;
    }

    @Override
    double getS() {
        double S = Math.round((2 * getBaseS() + 2 * height * getBaseC()) * 100) / 100.0;
        return S;
    }

    abstract double getBaseS();

    abstract double getBaseC();
}

