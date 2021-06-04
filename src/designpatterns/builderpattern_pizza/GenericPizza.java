package designpatterns.builderpattern_pizza;

import designpatterns.builderpattern_pizza.Pizza.PizzaBuilder;

public class GenericPizza extends Pizza {

  public GenericPizza(PizzaBuilder pizzaBuilder) {
    super(pizzaBuilder);
  }

}
