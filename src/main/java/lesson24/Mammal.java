package lesson24;

public abstract class Mammal extends Animal implements Speakable {
    String name;

    public Mammal(String name) {
        super(name);
        this.name = name;
    }

    public abstract void run();
}
