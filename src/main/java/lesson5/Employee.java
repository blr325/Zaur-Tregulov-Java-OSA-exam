package lesson5;

public class Employee {
    private int id;
    private String surName;
    private int age;
    private int salary;
    private String department;

    public Employee(int id, String surName, int age, int salary, String department) {
        this.id = id;
        this.surName = surName;
        this.age = age;
        this.salary = salary;
        this.department = department;
        System.out.println("Создали сотрудника " + id);
    }

    public void doubleYourSalary(){
        salary *=2;
        System.out.printf("Теперь зароботная плата соткудика %s составляет %d\n",surName,salary);
    }
}
