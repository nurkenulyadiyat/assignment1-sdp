package cafebuilder;
/**
 * Product. A finished drink order. Only a DrinkBuilder can create one.
 */
public class Drink {

    private final String size;
    private final String milk;
    private final int shots;
    private final String syrup;
    private final String temperature;
    private final boolean whippedCream;


    // Package-private: only classes in the cafebuilder package (the
    // builders) can create a Drink. This makes it impossible to build
    // a Drink while skipping the validation done in DrinkBuilder.
    Drink(String size, String milk, int shots, String syrup, String temperature, boolean whippedCream) {
        this.size = size;
        this.milk = milk;
        this.shots = shots;
        this.syrup = syrup;
        this.temperature = temperature;
        this.whippedCream = whippedCream;
    }

    @Override
    public String toString() {
        return String.format(
                "Drink[size=%s, milk=%s, shots=%d, syrup=%s, temperature=%s, whippedCream=%b]",
                size, milk, shots, syrup, temperature, whippedCream);
    }
}
