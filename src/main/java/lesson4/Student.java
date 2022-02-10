package lesson4;

public class Student {
    private int studentIdNumber;
    private String name;
    private String surName;
    private int yearStudy;
    private double averageScoreMath;
    private double averageScoreEcon;
    private double averageScoreForeignLanguage;
    private double averageScore;

    public Student(int studentIdNumber, String name, String surName, int yearStudy, double averageScoreMath,
                   double averageScoreEcon, double averageScoreForeignLanguage) {
        this.studentIdNumber = studentIdNumber;
        this.name = name;
        this.surName = surName;
        this.yearStudy = yearStudy;
        this.averageScoreMath = averageScoreMath;
        this.averageScoreEcon = averageScoreEcon;
        this.averageScoreForeignLanguage = averageScoreForeignLanguage;
    }

    public double countAverageScore() {
        return (averageScoreMath + averageScoreEcon + averageScoreForeignLanguage) / 3;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }
}
