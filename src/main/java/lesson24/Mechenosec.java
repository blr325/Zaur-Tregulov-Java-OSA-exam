package lesson24;

public class Mechenosec extends Fish {
    String name;

    public Mechenosec(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Mechenosec ne xishnaya riba, i ona est obychniy ribiy korm!");
    }

    @Override
    public void swim() {
        System.out.println("Mechenosec krasivaya riba, kotoraya bistro plavyaet!");
    }
}
