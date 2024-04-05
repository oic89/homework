package homework5;

//线段类
class Line extends Shape {
    Point point1;
    Point point2;
    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }
    //线段长度
    public double length() {
        double length=Math.sqrt(Math.pow(point2.x - point1.x, 2) + Math.pow(point2.y - point1.y, 2));
        length=Math.round(length*100)/100.0;
        return length;
    }
    @Override
    public double S() {
        // 直线没有面积
        return 0;
    }
    @Override
    public double C() {
        return  Math.sqrt(Math.pow(point2.x - point1.x, 2) + Math.pow(point2.y - point1.y, 2));
    }
}
