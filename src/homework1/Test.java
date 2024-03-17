package homework1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> lengths = new ArrayList<>();
        for (int i = 1; i < 4; i++) {
            int x, y;
            System.out.print("请输入线段" + i + "的横坐标:");
            x = sc.nextInt();
            System.out.print("请输入线段" + i + "的纵坐标:");
            y = sc.nextInt();
            Line line = new Line(x, y);
            //计算线段长度
            double length = countLine(line);
            lengths.add(length);
        }
        double max = Collections.max(lengths);
        double sum = lengths.get(0) + lengths.get(1) + lengths.get(2);
        System.out.println("三边长为: " + lengths.get(0) + ", " + lengths.get(1) + ", " + lengths.get(2));
        if (max >= sum - max) {
            //不能构成三角形
            return;
        }
        //计算面积
        double square = countSquare(lengths);
        System.out.println("面积: " + square);
        System.out.println("周长: " + sum);
    }

    //计算线段长度
    private static double countLine(Line line) {
        int x = line.getX();
        int y = line.getY();
        double length = Math.sqrt(x * x + y * y);
        return length;
    }

    //计算面积
    private static double countSquare(ArrayList<Double> lengths) {
        double a = lengths.get(0);
        double b = lengths.get(1);
        double c = lengths.get(2);
        double p = (a + b + c) / 2.0;
        double square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return square;
    }
}
