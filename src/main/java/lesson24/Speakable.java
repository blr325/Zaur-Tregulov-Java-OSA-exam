package lesson24;

public interface Speakable {
    default void speak(){
        System.out.println("Somebody speaks");
    }
}
