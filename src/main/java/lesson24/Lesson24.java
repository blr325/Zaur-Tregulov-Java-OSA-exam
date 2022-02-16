package lesson24;

public class Lesson24 {
    public static void main(String[] args) {
        Mechenosec mechenosec = new Mechenosec("Немо");
        System.out.println(mechenosec.name);
        mechenosec.eat();
        mechenosec.swim();
        mechenosec.sleep();
        System.out.println("-------------------------------------");
        Speakable pingvin = new Pingvin("Филл");
        pingvin.speak();
        System.out.println("-------------------------------------");
        Animal lev = new Lev("Рик");
        System.out.println(lev.name);
        lev.eat();
        lev.sleep();
        System.out.println("-------------------------------------");
        Lev lev2 = new Lev("Морти");
        System.out.println(lev2.name);
        lev2.eat();
        lev2.sleep();
        lev2.run();
        lev2.speak();
    }
}
