package designpatterns.builderpattern_pizza;

import designpatterns.builderpattern_pizza.Pizza.PizzaBuilder;

public class MeatPizza extends PizzaBuilder {

  @Override
  void addDough() {
    pizza.setDough("Italian Wheat");
  }

  @Override
  void addSauce() {
    pizza.setSauce("mustard");
  }

  @Override
  void addToppings() {
    pizza.setToppings("Meat");
  }
}
