package decorator.ex;

public class PizzaAlta extends Pizza {
    public PizzaAlta() {
        description = "Pizza Alta";
    }

    public double cost() {
        return 5;
    }
}
