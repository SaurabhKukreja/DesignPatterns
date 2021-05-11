package designpatterns.builderpattern_pizza;

import designpatterns.builderpattern_pizza.Pizza.PizzaBuilder;

public class VeggiePizza extends PizzaBuilder {

  @Override
  void addDough() {
    pizza.setDough("Italian Wheat");
  }

  @Override
  void addSauce() {
    pizza.setSauce("tomato");
  }

  @Override
  void addToppings() {
    pizza.setToppings("Garden Vegetable");
  }
}
