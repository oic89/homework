package homework7.p1;

//圆柱类
class Cylinder extends Prism {
    Double r;

    public Cylinder(Circle circle, double height) {
        super(height);
        this.r = circle.getR();
    }

    @Override
    double getBaseS() {
        return Math.PI * r * r;
    }

    @Override
    double getBaseC() {
        return 2 * Math.PI * r;
    }
}
