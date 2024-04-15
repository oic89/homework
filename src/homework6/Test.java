package homework6;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Operate operate = new Operate();
        operate.getData();

        //综合成绩最高学生
        Student maxStudent = operate.getMaxStudent();
        //名
        System.out.println(maxStudent.getName());
        //综合成绩
        System.out.println(maxStudent.getAverageGrade());

        //平均综合成绩
        System.out.println(operate.getAllAverageGrade());
        //奖学金名单
        operate.scholarship();
    }
}
