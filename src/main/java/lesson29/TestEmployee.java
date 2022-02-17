package lesson29;

import java.util.ArrayList;
import java.util.function.Predicate;

public class TestEmployee {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("Андрей", "IT", 500));
        list.add(new Employee("Михаил", "IT", 300));
        list.add(new Employee("Елена", "Accounting", 250));
        list.add(new Employee("Manager", "Manager", 400));

        TestEmployee emp = new TestEmployee();
        emp.filtraciyaRabotnikov(list, (Employee employee) -> employee.getSalary() > 200 && employee.getDepartament().equals("IT"));
        System.out.println("------------------------------------------------");
        emp.filtraciyaRabotnikov(list, (Employee employee) -> employee.getName().startsWith("Е") && employee.getSalary() != 450);
        System.out.println("------------------------------------------------");
        emp.filtraciyaRabotnikov(list, (Employee employee) -> employee.getName().equals(employee.getDepartament()));

    }

    void printEmployee(Employee emp) {
        System.out.printf("Имя работника: %s\nОтдел: %s\nЗаработная плата: %d\n", emp.getName(), emp.getDepartament(), emp.getSalary());
    }

    void filtraciyaRabotnikov(ArrayList<Employee> list, Predicate<Employee> predicate) {
        for (Employee employee : list) {
            if (predicate.test(employee)) {
                printEmployee(employee);
            }
        }
    }
}
