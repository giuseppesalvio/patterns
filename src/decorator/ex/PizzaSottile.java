package decorator.ex;

public class PizzaSottile extends Pizza {
    public PizzaSottile() {
        description = "Pizza Sottile";
    }

    public double cost() {
        return 4;
    }
}
