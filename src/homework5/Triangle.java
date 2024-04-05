package homework5;

//三角形类
class Triangle extends Shape {
    Point point1, point2, point3;
    Line side1, side2, side3;
    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        side1 = new Line(point1, point2);
        side2 = new Line(point2, point3);
        side3 = new Line(point3, point1);
    }
    @Override
    public double C() {
        return side1.length() + side2.length() + side3.length();
    }
    @Override
    public double S() {
        double s = C() / 2;
        double S=Math.sqrt(s * (s - side1.length()) * (s - side2.length()) * (s - side3.length()));
        S=Math.round(S*100)/100.0;
        return S;
    }
    //内切圆
    public double inCircleRadius() {
        double r=S() / (C() / 2);
        r=Math.round(r*100)/100.0;
        return r;
    }
    //重心
    public Point centroid() {
        double cx = (point1.x + point2.x + point3.x) / 3;
        double cy = (point1.y + point2.y + point3.y) / 3;
        return new Point(cx, cy);
    }
}