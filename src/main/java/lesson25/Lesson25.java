package lesson25;

public class Lesson25 {
    public static void main(String[] args) {
        Mechenosec mechenosec = new Mechenosec("Немо");
        Pingvin pingvin = new Pingvin("Филл");
        Lev lev = new Lev("Рик");
        Animal animal1 = new Mechenosec("Немо энимал");
        Animal animal2 = new Pingvin("Филл энимал");
        Animal animal3 = new Lev("Рик энимал");
        Bird bird = new Pingvin("Филл берд");
        Mammal mammal = new Lev("Рик меммел");
        Fish fish = new Mechenosec("Немо фиш");
        Speakable s1 = new Pingvin("Филл спикэбл");
        Speakable s2 = new Lev("Рик спикэбл");
        Animal[] arrayAnimal = {mechenosec, pingvin, lev, animal1, animal2, animal3, bird, fish, mammal};
        Speakable[] arraySpeakable = {mammal, lev, bird, pingvin, s1, s2};
        checkAnimal(arrayAnimal);
        checkSpeakable(arraySpeakable);
    }

    private static void checkAnimal(Animal[] arrayAnimal) {
        for (Animal a : arrayAnimal){
            if (a instanceof Pingvin){
                System.out.println(a.name);
                a.eat();
                a.sleep();
                ((Pingvin) a).fly();
                ((Pingvin) a).speak();
            }
            else if (a instanceof Lev){
                System.out.println(a.name);
                a.eat();
                a.sleep();
                ((Lev) a).run();
            }
            else if (a instanceof Mechenosec){
                System.out.println(a.name);
                a.sleep();
                a.eat();
                ((Mechenosec) a).swim();
            }
            System.out.println("------------------------------------");
        }
    }

    private static void checkSpeakable(Speakable[] arraySpeakable) {
        for (Speakable s : arraySpeakable){
            if (s instanceof Pingvin){
                System.out.println(((Pingvin) s).name);
                ((Pingvin) s).eat();
                ((Pingvin) s).sleep();
                ((Pingvin) s).fly();
                s.speak();
            }
            else if (s instanceof Lev l){
                System.out.println(l.name);
                l.run();
                l.eat();
                l.speak();
            }
            System.out.println("------------------------------------");
        }
    }
}
