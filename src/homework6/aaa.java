package homework6;

public class aaa {
    public void sort(){
        students.sort((o1, o2) -> (int) (o2.getAverageGrade() - o1.getAverageGrade()));
        for (int i = 1; i <=students.size() ; i++) {
            System.out.print(students.get(i - 1).getName() + "(第" + i + "名)  ");
        }
    }
}
