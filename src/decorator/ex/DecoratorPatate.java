package decorator.ex;

public class DecoratorPatate extends CondimentDecorator{
    Pizza pizza;

    public DecoratorPatate(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", Patate";
    }

    public double cost() {
        return 1 + pizza.cost();
    }

}
