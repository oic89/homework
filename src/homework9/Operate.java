package homework9;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class Operate {
    private final String studentDataFile = "src\\homework9\\StudentData.txt";
    private final String logFile = "src\\homework9\\log.txt";

    public void addStudent(Student student) throws IOException {
        List<Student> students = readStudents();
        students.add(student);
        writeStudents(students);
        logAction("新增:" + student);
    }

    public List<Student> searchByName(String name) throws IOException {
        List<Student> students = readStudents();
        List<Student> results = new ArrayList<>();
        for (Student student : students) {
            if (student.getName().equals(name)) {
                results.add(student);
            }
        }
        return results;
    }

    public List<Student> sortStudents() throws IOException {
        List<Student> students = readStudents();
        Collections.sort(students, Comparator.comparing(Student::getStudentId));
        return students;
    }

    public void updateStudent(String studentId, String newName) throws IOException {
        List<Student> students = readStudents();
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                student.setName(newName);
                break;
            }
        }
        writeStudents(students);
        logAction("更新:" + "姓名:" + newName + "学号:" + studentId);
    }

    private List<Student> readStudents() throws IOException {
        List<Student> students = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(studentDataFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String name = parts[0].trim();
                    String studentId = parts[1].trim();
                    String updateTime = parts[2].trim();
                    students.add(new Student(name, studentId));
                }
            }
        } catch (FileNotFoundException e) {
            // 文件可能尚未存在
        }
        return students;
    }

    private void writeStudents(List<Student> students) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(studentDataFile))) {
            for (Student student : students) {
                bw.write(student.getName() + "," + student.getStudentId() + "," + student.getUpdateTime());
                bw.newLine();
            }
        }
    }

    private void logAction(String action) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(logFile, true))) {
            bw.write(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + " - " + action);
            bw.newLine();
        }
    }
}
