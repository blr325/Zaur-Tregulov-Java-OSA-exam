package lesson11;

public class Car {
    String color;
    int engine;
    int numDoors;

    public Car(String color, int engine, int numDoors) {
        this.color = color;
        this.engine = engine;
        this.numDoors = numDoors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", engine=" + engine +
                ", numDoors=" + numDoors +
                '}';
    }
}
