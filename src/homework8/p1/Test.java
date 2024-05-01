package homework8.p1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入学生人数：");
        int numberOfStudents = scanner.nextInt();

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("请输入第 " + (i + 1) + " 位学生的成绩（0-100）：");
            try {
                int score = scanner.nextInt();
                if (score < 0 || score > 100) {
                    System.out.println("输入成绩不合法，请输入0-100之间的成绩。");
                    continue;
                }
                Grade grade = Grade.valueOf(score);
                System.out.println("学生 " + (i + 1) + " 的成绩等级是：" + grade + "(" + grade.getMeaning()+")");
            } catch (Exception e) {
                System.out.println("输入错误，请输入一个有效的成绩。");
                scanner.next();  // 清除错误的输入
            }
        }
        scanner.close();
    }
}
