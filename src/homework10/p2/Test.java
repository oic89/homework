package homework10.p2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Test {
    private JFrame frame;
    private JTextField idField;
    private JTextField nameField;
    private JTextField genderField;
    private JTextArea textArea;
    private List<Student> students;
    private StudentManager studentManager;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    Test window = new Test();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Test() {
        studentManager = new StudentManager();
        students = studentManager.loadStudents();
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel idLabel = new JLabel("ID:");
        idLabel.setBounds(10, 11, 46, 14);
        frame.getContentPane().add(idLabel);

        idField = new JTextField();
        idField.setBounds(66, 8, 150, 20);
        frame.getContentPane().add(idField);
        idField.setColumns(10);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(10, 36, 46, 14);
        frame.getContentPane().add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(66, 33, 150, 20);
        frame.getContentPane().add(nameField);
        nameField.setColumns(10);

        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(10, 61, 46, 14);
        frame.getContentPane().add(genderLabel);

        genderField = new JTextField();
        genderField.setBounds(66, 58, 150, 20);
        frame.getContentPane().add(genderField);
        genderField.setColumns(10);

        JButton addButton = new JButton("Add");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String id = idField.getText();
                String name = nameField.getText();
                String gender = genderField.getText();
                Student student = new Student(id, name, gender);
                studentManager.addStudent(student, students);
                updateTextArea();
            }
        });
        addButton.setBounds(10, 85, 89, 23);
        frame.getContentPane().add(addButton);

        JButton removeButton = new JButton("Remove");
        removeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String id = idField.getText();
                studentManager.removeStudent(id, students);
                updateTextArea();
            }
        });
        removeButton.setBounds(109, 85, 89, 23);
        frame.getContentPane().add(removeButton);

        JButton updateButton = new JButton("Update");
        updateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String id = idField.getText();
                String name = nameField.getText();
                String gender = genderField.getText();
                Student updatedStudent = new Student(id, name, gender);
                studentManager.updateStudent(updatedStudent, students);
                updateTextArea();
            }
        });
        updateButton.setBounds(208, 85, 89, 23);
        frame.getContentPane().add(updateButton);

        JButton findButton = new JButton("Find");
        findButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String id = idField.getText();
                Student student = studentManager.findStudent(id, students);
                if (student != null) {
                    nameField.setText(student.getName());
                    genderField.setText(student.getGender());
                } else {
                    JOptionPane.showMessageDialog(frame, "Student not found.");
                }
            }
        });
        findButton.setBounds(307, 85, 89, 23);
        frame.getContentPane().add(findButton);

        textArea = new JTextArea();
        textArea.setBounds(10, 119, 564, 241);
        frame.getContentPane().add(textArea);
    }

    private void updateTextArea() {
        StringBuilder sb = new StringBuilder();
        for (Student student : students) {
            sb.append(student).append("\n");
        }
        textArea.setText(sb.toString());
    }
}
