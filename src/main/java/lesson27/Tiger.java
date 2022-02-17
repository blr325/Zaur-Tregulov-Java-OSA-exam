package lesson27;

public class Tiger {
    void eat(String food) {
        if (!food.equals("myaso")) {
            throw new NeMyasoException("Tigr ne est " + food);


        } else System.out.println("Tigr est myaso");
    }

    void drink(String water) throws NeVodaException {
        if ((!water.equals("voda"))) {
            throw new NeVodaException("Tigr ne pyet " + water);
        } else System.out.println("Tigr pyet vodu");
    }
}
