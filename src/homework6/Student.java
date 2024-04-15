package homework6;

import java.util.ArrayList;

public class Student extends Person {
    private ArrayList<Grade> grades;
    public Student(String name, ArrayList<Grade> grades) {
        super(name);
        this.grades = grades;
    }
    public ArrayList<Grade> getGrades() {
        return grades;
    }
    public void setGrades(ArrayList<Grade> grades) {
        this.grades = grades;
    }
    //计算平均分
    public double getAverageGrade() {
        double sum = 0;
        for (Grade grade : grades) {
            sum += grade.getScore();
        }
        return Math.round((sum /= grades.size()) * 100) / 100.0;
    }
}

