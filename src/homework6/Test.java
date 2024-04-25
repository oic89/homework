package homework6;

public class Test {
    public static void main(String[] args) {
        Operate operate = new Operate();
        operate.getData();
        //平均综合成绩
        System.out.println("平均成绩:");
        System.out.println(operate.getAllAverageGrade());
        System.out.println("------------------------------");
        System.out.println("综合成绩最高:");
        Student maxStudent = operate.getMaxStudent();
        System.out.println(maxStudent.getName()+" : "+maxStudent.getAverageGrade());
        System.out.println("------------------------------");
        //排名
        System.out.println("排名:");
        operate.sort();
        System.out.println();
        //奖学金名单
        System.out.println("------------------------------");
        System.out.println("奖学金:");
        operate.scholarship();
    }
}
