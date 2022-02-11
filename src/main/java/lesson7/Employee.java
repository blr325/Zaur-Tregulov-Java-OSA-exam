package lesson7;

public class Employee {
    int id;
    public String surName;
    int age;
    private int salary;
    String department;

    public static void main(String[] args) {
        Employee employee = new Employee(123,"Петров" ,400);
        employee.getId();
        employee.getSalary();
        employee.getSurName();
        System.out.println(employee.id);
        System.out.println(employee.surName);
        System.out.println(employee.department);
        System.out.println(employee.age);
        System.out.println(employee.salary);
    }

    public Employee(int id, String surName, int age, int salary, String department) {
        this.id = id;
        this.surName = surName;
        this.age = age;
        this.salary = salary;
        this.department = department;
        System.out.println("Создали сотрудника " + id);
    }

    Employee(int id, String surName, int age, int salary) {
        this.id = id;
        this.surName = surName;
        this.age = age;
        this.salary = salary;
        System.out.println("Создали сотрудника " + id);
    }
    private Employee(int id, String surName,int salary) {
        this.id = id;
        this.surName = surName;
        this.salary = salary;
        System.out.println("Создали сотрудника " + id);
    }

    public void doubleYourSalary() {
        salary *= 2;
        System.out.printf("Теперь зароботная плата соткудика %s составляет %d\n", surName, salary);
    }

    public void getId() {
        System.out.println("ID = " + id);
    }

    public void getSurName() {
        System.out.println("Фамилия = " + surName);
    }

    public void getSalary() {
        System.out.println("ЗП = " + salary);
    }
}
