package cafebuilder;

/** ConcreteBuilder #1: a hot, whole-milk, single-shot drink by default. */
public class HotDrinkBuilder extends DrinkBuilder {

    public HotDrinkBuilder() {
        temperature = HOT;
        milk = "Whole";
        shots = 1;
    }

    @Override
    public Drink build() {
        requireSize();
        return new Drink(size, milk, shots, syrup, temperature, whippedCream);
    }
}
