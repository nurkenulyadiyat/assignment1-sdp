package cafebuilder;

/** Client: exercises both builders and the validation guard. */
public class Main {

    public static void main(String[] args) {
        Drink hotLatte = new HotDrinkBuilder()
                .setSize("Medium")
                .setSyrup("Vanilla")
                .build();
        System.out.println("Hot drink order: " + hotLatte);

        Drink icedMocha = new IcedDrinkBuilder()
                .setSize("Large")
                .setSyrup("Chocolate")
                .build();
        System.out.println("Iced drink order: " + icedMocha);

        try {
            new HotDrinkBuilder().setSyrup("Caramel").build(); // no size set
        } catch (IllegalStateException e) {
            System.out.println("Build failed as expected: " + e.getMessage());
        }
    }
}
