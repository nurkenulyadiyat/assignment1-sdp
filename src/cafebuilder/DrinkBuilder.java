package cafebuilder;

/**
 * Builder. One abstract class declares the fields, the fluent
 * setters (each returns "this" for chaining) and the validation
 * rule. Concrete builders below only set their own defaults and
 * implement build() - nothing is duplicated between them.
 */
public abstract class DrinkBuilder {

    public static final String HOT = "Hot";
    public static final String ICED = "Iced";
    protected String size;
    protected String milk = "Whole";
    protected int shots = 1;
    protected String syrup = "None";
    protected String temperature = HOT;
    protected boolean whippedCream = false;

    public DrinkBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    public DrinkBuilder setMilk(String milk) {
        this.milk = milk;
        return this;
    }

    public DrinkBuilder setShots(int shots) {
        this.shots = shots;
        return this;
    }

    public DrinkBuilder setSyrup(String syrup) {
        this.syrup = syrup;
        return this;
    }

    public DrinkBuilder setWhippedCream(boolean whippedCream) {
        this.whippedCream = whippedCream;
        return this;
    }

    public abstract Drink build();

    protected void requireSize() {
        if (size == null || size.isBlank()) {
            throw new IllegalStateException("Cannot build a Drink: size has not been set.");
        }
    }
}
