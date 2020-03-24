package decorator.ex;

public class DecoratorOlive extends CondimentDecorator{
    Pizza pizza;

    public DecoratorOlive(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", Olive";
    }

    public double cost() {
        return 1 + pizza.cost();
    }

}
