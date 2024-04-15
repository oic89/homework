package homework6;

import java.util.ArrayList;

public class Operate {
    ArrayList<Student> students = new ArrayList<>();
    int GradesSize = 0;

    public void getData() {
        students.add(new Student("名字1", getGrades(90, 90, 90)));
        students.add(new Student("名字2", getGrades(70, 70, 70)));
        students.add(new Student("名字3", getGrades(92, 92, 92)));
        //...
    }

    private ArrayList<Grade> getGrades(double score1, double score2, double score3) {
        ArrayList<Grade> grades = new ArrayList<>();
        grades.add(new Grade("学科1", score1));
        grades.add(new Grade("学科2", score2));
        grades.add(new Grade("学科2", score3));
        //...
        GradesSize = grades.size();
        return grades;
    }

    //最高分学生
    public Student getMaxStudent() {
        students.sort((o1, o2) -> (int) (o2.getAverageGrade() - o1.getAverageGrade()));
        return students.get(0);
    }

    //计算平均分
    public double getAllAverageGrade() {
        double averageGrade = 0;
        for (Student student : students) {
            averageGrade += student.getAverageGrade();
        }
        return averageGrade / students.size();
    }

    //计算标准差
    private double getVariance() {
        double averageGrade = getAllAverageGrade();
        double sum = 0;
        for (Student student : students) {
            sum += Math.pow(student.getAverageGrade() - averageGrade, 2);
        }
        sum /= students.size();
        sum = Math.sqrt(sum);
        return Math.round(sum * 100) / 100.0;
    }

    //奖学金
    public void scholarship() {
        students.sort((o1, o2) -> (int) (o2.getAverageGrade() - o1.getAverageGrade()));
        double averageGrade = getAllAverageGrade();
        double variance = getVariance() * 0.5;
        double one = averageGrade + 1.28 * variance;
        double two = averageGrade + 0.842 * variance;
        double three = averageGrade + 0.7 * variance;
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        boolean a = true;
        for (Student student : students) {
            if (student.getAverageGrade() >= one) {
                System.out.println("一等奖学金-->" + student.getName());
                a = false;
            } else if (student.getAverageGrade() >= two) {
                System.out.println("二等奖学金-->" + student.getName());
                a = false;
            } else if (student.getAverageGrade() >= three) {
                System.out.println("三等奖学金-->" + student.getName());
                a = false;
            }
        }
        if (a) {
            System.out.println("无人获奖");
        }
    }

}
