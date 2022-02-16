package lesson25;

public class Lev extends Mammal {
    String name;

    public Lev(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Lev, kak luboy xishnik, lyubit myaso!");
    }

    @Override
    public void sleep() {
        System.out.println("Bolshyu chast dnya lev spit!");
    }

    @Override
    public void run() {
        System.out.println("Lev-eto ne samaya bystraya koshka!");
    }

}
