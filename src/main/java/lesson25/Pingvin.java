package lesson25;

public class Pingvin extends Bird {
    String name;

    public Pingvin(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Pingvin lubit est ribu!");
    }

    @Override
    public void sleep() {
        System.out.println("Pingvini spyat prijavshis drug k drugu!");
    }

    @Override
    public void fly() {
        System.out.println("Pingvini ne yneut letat!");
    }

    public void speak() {
        System.out.println("Pingvini ne umeut pet kak solovyi");
    }
}
