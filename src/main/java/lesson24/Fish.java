package lesson24;

public abstract class Fish extends Animal {
    public Fish(String name) {
        super(name);
    }

    public abstract void swim();

    @Override
    public void sleep() {
        System.out.println("Vsegda interesno nablydat za tem kak spyat ribi");
    }
}
