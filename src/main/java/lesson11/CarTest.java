package lesson11;

public class CarTest {

    public static void changeNumDoors(Car car, int newNumDoor) {
        car.numDoors = newNumDoor;
    }

    public static void changeColor(Car car1, Car car2) {
        String temp = car1.color;
        car1.color = car2.color;
        car2.color = temp;
    }

    public static void main(String[] args) {
        Car bmw = new Car("Черный", 8, 3);
        Car mercedes = new Car("Белый", 6, 5);

        System.out.println("Машины в первоночальном виде \n" + bmw + "\n" + mercedes);
        changeNumDoors(mercedes, 3);
        changeColor(bmw, mercedes);
        System.out.println("Измененные машины \n" + bmw + "\n" + mercedes);

    }
}
