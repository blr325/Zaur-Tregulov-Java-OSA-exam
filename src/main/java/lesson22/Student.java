package lesson22;

public class Student {
    private StringBuilder name;
    private int course;
    private double grade;

    public void showInfo() {
        System.out.printf("Имя - %s \nКурс - %d\nОценка - %f\n", getName(), getCourse(), getGrade());
    }

    public StringBuilder getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public double getGrade() {
        return grade;
    }

    public void setName(StringBuilder name) {
        if (name.length() >= 3) this.name = name;
    }

    public void setCourse(int course) {
        if (course >= 1 && course <= 4) this.course = course;
    }

    public void setGrade(double grade) {
        if (grade >= 1 && grade <= 10) this.grade = grade;
    }
}
