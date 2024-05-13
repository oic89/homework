package homework9;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String name;
    private String studentId;
    private String updateTime;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
        this.updateTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        this.updateTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }

    public String getStudentId() {
        return studentId;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    @Override
    public String toString() {
        return "姓名:" + name + ", 学号:" + studentId + ", 更新时间:" + updateTime;
    }
}
