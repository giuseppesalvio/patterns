package decorator.ex;

public class DecoratorSalamino extends CondimentDecorator{
    Pizza pizza;

    public DecoratorSalamino(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", Salamino";
    }

    public double cost() {
        return 1 + pizza.cost();
    }

}
