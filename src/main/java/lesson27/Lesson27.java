package lesson27;

public class Lesson27 {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        try {
            tiger.eat("myaso");
        } catch (NeMyasoException e) {
            System.out.println(e.getMessage());
        }
        try {
            tiger.drink("voda");
            try {
                tiger.drink("pivo");
            } catch (NeVodaException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Eto inner finally block");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
