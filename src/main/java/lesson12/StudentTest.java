package lesson12;

public class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student("Андрей", 4, 7.5);
        Student st2 = new Student("Андрей", 3, 7.4);
        compareStudents(st1, st2);
        compareStudentsDetail(st1, st2);
        compareTest(st1, st2);
    }

    public static void compareStudents(Student student1, Student student2) {
        if (student1.getName().equals(student2.getName()) && student1.getCourse() == student2.getCourse() && student1.getGrade() == student2.getGrade()) {
            System.out.println("Студенты одинаковые");
        } else System.out.println("Студенты разные");
    }

    public static void compareStudentsDetail(Student student1, Student student2) {
        if (student1.getName().equals(student2.getName())) {
            if (student1.getCourse() == student2.getCourse()) {
                if (student1.getGrade() == student2.getGrade()) {
                    System.out.println("Студенты одинаковые");
                } else System.out.println("У студентов разный средний балл");
            } else System.out.println("Студенты находятся на разных курсах");
        } else System.out.println("У студентов разные имена");
    }

    public static void compareTest(Student student1, Student student2) {
        if (student1.getName().equals(student2.getName()) && student1.getCourse() == student2.getCourse() && student1.getGrade() == student2.getGrade()) {
            System.out.println("Студенты одинаковые");
        } else {
            if (!student1.getName().equals(student2.getName())) {
                System.out.println("У студентов разные имена");
            }
            if (!(student1.getCourse() == student2.getCourse())) {
                System.out.println("Студенты на разных курсах");
            }
            if (!(student1.getGrade() == student2.getGrade())) {
                System.out.println("У студентов разный средний балл");

            }
        }
    }
}
