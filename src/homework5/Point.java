package homework5;

//点类
public class Point {
    double x;
    double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    //打印坐标
    @Override
    public String toString() {
        return " (" + x + ", " + y + ")";
    }
}
