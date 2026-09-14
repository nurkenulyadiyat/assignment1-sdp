package cafebuilder;

/** ConcreteBuilder #2: an iced, oat-milk drink with extra shots and whipped cream by default. */
public class IcedDrinkBuilder extends DrinkBuilder {

    public IcedDrinkBuilder() {
        temperature = ICED;
        milk = "Oat";
        shots = 2;
        whippedCream = true;
    }

    @Override
    public Drink build() {
        requireSize();
        return new Drink(size, milk, shots, syrup, temperature, whippedCream);
    }
}
