package lesson4;

public class StudentTest {
    public static void main(String[] args) {
        getStudents();
        printAverageScoreStudents();
        lesson6();
    }

    private static void lesson6() {
        Student student1 = new Student(111, "Dmitry", "Alekseev",
                4, 8.6, 6.5, 8.5);
        Student student2 = new Student(12345, "Andrei", "Ivanon",5);
        Student student3 = new Student();
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
    }

    private static void printAverageScoreStudents() {
        for (Student student : getStudents()) {
            System.out.printf("Cредний балл студента %s %s - %.2f\n",
                    student.getName(), student.getSurName(), student.countAverageScore());
        }
    }

    public static Student[] getStudents() {
        return new Student[]{new Student(12345, "Andrei", "Ivanon",
                3, 8.6, 6.5, 8.5),
                new Student(54321, "Anton", "Dmitriev",
                        3, 7.6, 5.5, 6.5),
                new Student(67890, "Artem", "Petrov",
                        3, 6.6, 9.5, 8.5)
        };
    }
}
