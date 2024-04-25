package homework6;

import java.util.ArrayList;

public class Operate {
    ArrayList<Student> students = new ArrayList<>();
    int GradesSize = 0;
    public void getData() {
        students.add(new Student("张一", getGrades(90, 87, 69,88,70,90,58,92)));
        students.add(new Student("张二", getGrades(89, 77, 75,89,90,80,99,88)));
        students.add(new Student("张三", getGrades(92, 92, 92,79,79,90,90,90)));
        students.add(new Student("张四", getGrades(92, 82, 98,78,79,95,90,78)));
        students.add(new Student("张五", getGrades(92, 97, 97,49,70,67,87,97)));
        students.add(new Student("张六", getGrades(78, 62, 92,75,88,80,90,90)));
        students.add(new Student("张七", getGrades(82, 42, 62,79,67,90,90,76)));
        students.add(new Student("张八", getGrades(99, 95, 92,99,79,70,90,90)));
        students.add(new Student("张九", getGrades(56, 52, 64,79,88,87,87,90)));
        students.add(new Student("张十", getGrades(88, 96, 52,69,79,90,90,87)));
        //...
    }
    private ArrayList<Grade> getGrades(double score1, double score2, double score3,double score4,
                                       double score5,double score6,double score7,double score8) {
        ArrayList<Grade> grades = new ArrayList<>();
        grades.add(new Grade("高等数学", score1));
        grades.add(new Grade("大学英语读写", score2));
        grades.add(new Grade("大学英语听说", score3));
        grades.add(new Grade("定向越野", score4));
        grades.add(new Grade("思想道德与法制", score5));
        grades.add(new Grade("形势与政策教育", score6));
        grades.add(new Grade("管理学原理", score7));
        grades.add(new Grade("程序设计基础", score8));
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
        return Math.round((averageGrade / students.size())*100)/100.0;
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
        double variance = getVariance();
        double one = averageGrade + 1.28 * variance;
        double two = averageGrade + 0.842 * variance;
        double three = averageGrade + 0.7 * variance;
        boolean a = true;
        boolean b = true;
        boolean c = true;
        for (Student student : students) {
            if (student.getAverageGrade() >= one) {
                if (a){
                    System.out.print("一等奖学金-->" + student.getName());

                }else {
                    System.out.print(" " + student.getName());
                }
                a = false;
            } else if (student.getAverageGrade() >= two) {
                if (!a){
                    System.out.println();
                }
                if (b){
                    System.out.print("二等奖学金-->" + student.getName());

                }else {
                    System.out.print(" " + student.getName());
                }
                b = false;
            } else if (student.getAverageGrade() >= three) {
                if (!b&&c){
                    System.out.println();
                }
                if (c){
                    System.out.print("三等奖学金-->" + student.getName());

                }else {
                    System.out.print(" " + student.getName());
                }
                c = false;
            }
        }
        if (a||b||c) {
            System.out.println("无人获奖");
        }
    }
    public void sort(){
        students.sort((o1, o2) -> (int) (o2.getAverageGrade() - o1.getAverageGrade()));
        for (int i = 1; i <=students.size() ; i++) {
            if (i==6){
                System.out.println();
            }
            System.out.print(students.get(i - 1).getName() + "(第" + i + "名)  ");
        }
    }
}
