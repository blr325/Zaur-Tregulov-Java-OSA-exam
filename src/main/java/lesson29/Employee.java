package lesson29;

public class Employee {
    private String name;
    private String departament;
    private int salary;

    public String getName() {
        return name;
    }

    public String getDepartament() {
        return departament;
    }

    public int getSalary() {
        return salary;
    }

    public Employee(String name, String departament, int salary) {
        this.name = name;
        this.departament = departament;
        this.salary = salary;
    }
}
