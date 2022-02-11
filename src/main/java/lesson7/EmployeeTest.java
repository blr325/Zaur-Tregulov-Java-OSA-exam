package lesson7;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee(123, "Иванов", 23, 500, "IT");
        Employee employee1 = new Employee(123, "Иванов", 23, 500);
        employee.getId();
        employee.getSalary();
        employee.getSurName();
        System.out.println(employee.id);
        System.out.println(employee.surName);
        System.out.println(employee.department);
        System.out.println(employee.age);

    }
}
