package homework4;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    static Scanner sc = new Scanner(System.in);
    private static final ArrayList<Lesson> lessons = new ArrayList<>();

    //main方法
    public static void main(String[] args) {
        showLastLesson();
        inputNextLesson();
        countAll();
    }

    //计算本学期成绩
    private static void countAll() {
        ArrayList<String> unqualifiedLesson = new ArrayList<>();
        int sumScore = 0;
        double sumGPA = 0.0;
        for (Lesson lesson : lessons) {
            int score = lesson.getScore();
            if (score < 60) {
                unqualifiedLesson.add(lesson.getLessonName());
            }
            sumGPA += countGPA(score);
            sumScore += score;
        }
        sumGPA = Math.round(sumGPA * 10.0) / 10.0;
        double averageScore = sumScore / 10.0;
        double averageGPA = sumGPA / 10.0;
        averageGPA = Math.round(averageGPA * 100.0) / 100.0;
        averageScore = Math.round(averageScore * 100.0) / 100.0;
        System.out.println("本学年情况:");
        System.out.println("总分:   " + sumScore + "    平均分: " + averageScore);
        System.out.println("总绩点: " + sumGPA + "   平均绩点: " + averageGPA);
        if (unqualifiedLesson.isEmpty()) {
            return;
        }
        System.out.print("本学年不合格课程: ");
        for (String name : unqualifiedLesson) {
            System.out.print(name + " ");
        }

    }

    //输入下学期目标
    private static void inputNextLesson() {
        System.out.println("请输入下学期目标");
        System.out.print("高等数学Ⅱ:");
        lessons.add(new Lesson("高等数学Ⅱ", sc.nextInt(), 1));
        System.out.print("大学英语Ⅱ:");
        lessons.add(new Lesson("大学英语Ⅱ", sc.nextInt(), 1));
        System.out.print("经济学原理:");
        lessons.add(new Lesson("经济学原理", sc.nextInt(), 1));
        System.out.print("面对对象:");
        lessons.add(new Lesson("面对对象", sc.nextInt(), 1));
        System.out.print("体育:");
        lessons.add(new Lesson("体育", sc.nextInt(), 1));
        System.out.println("==============================");
        showLesson(1);
    }

    //初始课程
    private static void showLastLesson() {
        lessons.add(new Lesson("高等数学Ⅰ", 87, 0));
        lessons.add(new Lesson("大学英语Ⅰ", 56, 0));
        lessons.add(new Lesson("管理学原理", 78, 0));
        lessons.add(new Lesson("程序设计", 97, 0));
        lessons.add(new Lesson("体育", 93, 0));
        showLesson(0);
    }

    private static void showLesson(int state) {
        if (state == 0) {
            System.out.println("上学期课程:");
        } else {
            System.out.println("下学期课程:");
        }
        int sumScore = 0;
        double sumGPA = 0.0;
        for (Lesson lesson : lessons) {
            if (lesson.getState() != state) {
                continue;
            }
            double GPA = countGPA(lesson.getScore());
            sumScore += lesson.getScore();
            sumGPA += GPA;
            System.out.println(lesson.getLessonName() + "  得分: " + lesson.getScore() + "  绩点: " + GPA);
        }
        sumGPA = Math.round(sumGPA * 10.0) / 10.0;
        double averageScore = sumScore / 5.0;
        double averageGPA = sumGPA / 5.0;
        averageGPA = Math.round(averageGPA * 100.0) / 100.0;
        averageScore = Math.round(averageScore * 100.0) / 100.0;
        System.out.println("------------------------------");
        System.out.println("总分:   " + sumScore + "    平均分: " + averageScore);
        System.out.println("总绩点: " + sumGPA + "   平均绩点: " + averageGPA);
        System.out.println("==============================");
    }

    //计算绩点
    private static double countGPA(int score) {
        double GPA = 0;
        if (score >= 60) {
            GPA = 1.0 + (score - 60) / 10.0;
        }
        return GPA;
    }
}
