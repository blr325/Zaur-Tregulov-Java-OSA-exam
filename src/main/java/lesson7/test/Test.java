package lesson7.test;

import lesson7.Employee;

public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee(123, "Иванов", 23, 500, "IT");
        employee.getId();
        employee.getSalary();
        employee.getSurName();
        System.out.println(employee.surName);

    }
}
