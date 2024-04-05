package homework5;

//圆类
public class Circle extends Shape{
    //中心点
    Point center;
    //半径
    double radius;
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public double getRadius() {
        return Math.round(radius*100)/100.0;
    }

    @Override
    public double S() {
        return Math.round(Math.PI * radius * radius*100)/100.0;
    }
    @Override
    public double C() {
        return Math.round(2 * Math.PI * radius*100)/100.0;
    }
}
