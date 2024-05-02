package homework8.p2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入三角形的三条边长（a b c）:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        try {
            Triangle triangle = new Triangle(new double[]{a, b, c});
            TriangleType type = triangle.getType();
            System.out.println("类型: " + type);
            System.out.println("周长: " + triangle.getC());
            System.out.println("面积: " + triangle.getS());
        } catch (IllegalArgumentException e) {
            System.out.println("错误: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
