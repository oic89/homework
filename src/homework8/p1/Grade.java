package homework8.p1;

// 枚举类定义成绩等级
enum Grade {
    A("优秀", 90, 100),
    B("良好", 80, 89),
    C("中等", 70, 79),
    D("及格", 60, 69),
    E("不及格", 0, 59);

    private final String meaning;
    private final int minScore;
    private final int maxScore;

    Grade(String meaning, int minScore, int maxScore) {
        this.meaning = meaning;
        this.minScore = minScore;
        this.maxScore = maxScore;
    }

    public String getMeaning() {
        return meaning;
    }

    public static Grade valueOf(int score) {
        for (Grade grade : values()) {
            if (score >= grade.minScore && score < grade.maxScore) {
                return grade;
            }
        }
        return null;
    }
}
