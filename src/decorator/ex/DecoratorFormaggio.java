package decorator.ex;

import decorator.starbuzz.Beverage;

public class DecoratorFormaggio extends CondimentDecorator{
    Pizza pizza;

    public DecoratorFormaggio(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", Formaggio";
    }

    public double cost() {
        return 1 + pizza.cost();
    }

}
