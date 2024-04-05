package homework5;

//矩形类
public class Rectangle extends Shape{
    //左顶点
    Point topLeft;
    //宽
    double width;
    //高
    double height;
    public Rectangle(Point topLeft, double width, double height) {
        this.topLeft = topLeft;
        this.width = width;
        this.height = height;
    }
    @Override
    public double S() {
        return width * height;
    }
    @Override
    public double C() {
        return 2 * (width + height);
    }
    //判断是否为正方形
    public boolean isSquare() {
        return width == height;
    }
    //内切圆
    public Circle incircle() {
        if (isSquare()) {
            return new Circle(topLeft, Math.min(width, height) / 2);
        }
        return null;
    }
    //外界圆
    public Circle circumcircle() {
        double radius = Math.sqrt(width * width + height * height) / 2;
        Point center = new Point(topLeft.x + width / 2, topLeft.y + height / 2);
        return new Circle(center, radius);
    }
}
