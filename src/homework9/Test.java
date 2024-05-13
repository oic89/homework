package homework9;

import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        Operate operate = new Operate();
        try {
            operate.addStudent(new Student("张三", "202311671304"));
            operate.addStudent(new Student("李四", "202311671303"));
            operate.addStudent(new Student("王五", "202311671302"));

            System.out.println("按姓名查询结果:");
            for (Student student : operate.searchByName("张三")) {
                System.out.println(student);
            }

            System.out.println("按学号排序结果:");
            for (Student student : operate.sortStudents()) {
                System.out.println(student);
            }

            operate.updateStudent("202311671304", "周六");

            System.out.println("修改:");
            System.out.println("张三->周六");

            System.out.println("按学号排序结果:");
            for (Student student : operate.sortStudents()) {
                System.out.println(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
