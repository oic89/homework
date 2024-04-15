package homework5;

public class Test {
    public static void main(String[] args) {
        // 创建三角形
        Triangle triangle = new Triangle(new Point(0, 0), new Point(3, 0), new Point(0, 3));
        System.out.println("三角形:");
        System.out.println("坐标: " + triangle.point1 + ", " + triangle.point2 + ", " + triangle.point3);
        System.out.println("边长: " + triangle.side1.length() + ", " + triangle.side2.length() + ", " + triangle.side3.length());
        System.out.println("周长: " + triangle.C());
        System.out.println("面积: " + triangle.S());
        System.out.println("内切圆半径: " + triangle.inCircleRadius());
        System.out.println("重心坐标: " + triangle.centroid());
        // 创建矩形
        System.out.println("\n矩形:");
        Rectangle rectangle = new Rectangle(new Point(0, 0), 2, 3);
        while (true) {
            System.out.println("两边长为: "+rectangle.width+" , "+ rectangle.height);
            System.out.println("周长: " + rectangle.C());
            System.out.println("面积: " + rectangle.S());
            if (rectangle.isSquare()) {
                Circle incircle = rectangle.incircle();
                Circle circumcircle = rectangle.circumcircle();
                System.out.println("该矩形为正方形");
                System.out.println("内切圆: " + "圆心"+incircle.center+ " 半径 "+incircle.getRadius()+ "  周长 "+incircle.C()+ " 面积 "+incircle.S());
                System.out.println("外接圆: " + "圆心"+circumcircle.center+ " 半径 "+circumcircle.getRadius()+ " 周长 "+circumcircle.C()+ " 面积 "+circumcircle.S());
                return;
            } else {
                System.out.println("这不是正方形\n");
                rectangle = new Rectangle(new Point(0, 0), 2, 2);
            }
        }
    }
}
