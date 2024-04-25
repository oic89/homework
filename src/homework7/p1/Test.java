package homework7.p1;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        System.out.println("圆");
        System.out.println("周长: " + circle.getC());
        System.out.println("面积: " + circle.getS());

        Cylinder cylinder = new Cylinder(circle, 2);
        System.out.println("圆柱");
        System.out.println("表面积: " + cylinder.getS());
        System.out.println("体积: " + cylinder.getV());

        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("三角形");
        System.out.println("周长: " + triangle.getC());
        System.out.println("面积: " + triangle.getS());

        TriangularPrism triangularPrism = new TriangularPrism(triangle, 4);
        System.out.println("三棱柱");
        System.out.println("表面积: " + triangularPrism.getS());
        System.out.println("面积: " + triangularPrism.getV());

        Tetrahedron tetrahedron = new Tetrahedron(3);
        System.out.println("四面体");
        System.out.println("表面积: " + tetrahedron.getS());
        System.out.println("体积: " + tetrahedron.getV());

        Rectangle rectangle = new Rectangle(3, 4);
        System.out.println("矩形");
        System.out.println("周长: " + rectangle.getC());
        System.out.println("面积: " + rectangle.getS());

        Trapezoid trapezoid = new Trapezoid(2, 3, 2, 2, 2);
        System.out.println("梯形");
        System.out.println("周长: " + trapezoid.getC());
        System.out.println("面积: " + trapezoid.getS());
    }
}
