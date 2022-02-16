package lesson22;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName(new StringBuilder("Андрей"));
        student.setGrade(7.4);
        student.setCourse(5);

        student.showInfo();
    }
}
