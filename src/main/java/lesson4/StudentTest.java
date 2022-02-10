package lesson4;

public class StudentTest {
    public static void main(String[] args) {
        getStudents();
        printAverageScoreStudents();
    }

    private static void printAverageScoreStudents() {
        for (int i = 0; i < getStudents().length; i++) {
            System.out.printf("Cредний балл студента %s %s - %.2f\n",
                    getStudents()[i].getName(), getStudents()[i].getSurName(), getStudents()[i].countAverageScore());
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
