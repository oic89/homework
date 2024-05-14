package homework10.p2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private static final String FILE_NAME = "src\\homework10\\p2\\StudentData.txt";

    public List<Student> loadStudents() {
        List<Student> students = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            students = (List<Student>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return students;
    }

    public void saveStudents(List<Student> students) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(students);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addStudent(Student student, List<Student> students) {
        students.add(student);
        saveStudents(students);
    }

    public void removeStudent(String id, List<Student> students) {
        students.removeIf(student -> student.getId().equals(id));
        saveStudents(students);
    }

    public void updateStudent(Student updatedStudent, List<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(updatedStudent.getId())) {
                students.set(i, updatedStudent);
                break;
            }
        }
        saveStudents(students);
    }

    public Student findStudent(String id, List<Student> students) {
        return students.stream()
                .filter(student -> student.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
