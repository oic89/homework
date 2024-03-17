package homework4;

public class Lesson {
    //课程名
    private String lessonName;
    //得分
    private Integer score;
    //状态（上/下学期）(0/1)
    private Integer state;

    public Lesson() {
    }

    public Lesson(String lessonName, Integer score, Integer state) {
        this.lessonName = lessonName;
        this.score = score;
        this.state = state;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
