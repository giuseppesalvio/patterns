package decorator.ex;

import decorator.pizza.Olives;

public class PizzaStore {
 
	public static void main(String args[]) {
		Pizza pizza = new PizzaSottile();
		Pizza pizzaFormaggio = new DecoratorFormaggio(pizza);
		Pizza pizzaOliveFormaggio = new DecoratorOlive(pizzaFormaggio);

		System.out.println(pizzaOliveFormaggio.getDescription()
				+ " $" + pizzaOliveFormaggio.cost());

	}
}
