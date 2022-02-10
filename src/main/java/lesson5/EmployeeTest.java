package lesson5;

public class EmployeeTest {
    public static void main(String[] args) {
        for (Employee employee : getEmployees()) {
            employee.doubleYourSalary();
        }
    }

    private static Employee[] getEmployees() {
        return new Employee[]{new Employee(1, "Иванов", 23, 10000, "Маркетинг"),
                new Employee(2, "Петров", 25, 15000, "Продажи")
        };
    }
}
