package designpatterns.builderpattern_pizza;

import designpatterns.builderpattern_pizza.Pizza.PizzaBuilder;

public class HawaainPizza extends PizzaBuilder {

  @Override
  void addDough() {
    pizza.setDough("Wheat");
  }

  @Override
  void addSauce() {
    pizza.setSauce("Pesto");
  }

  @Override
  void addToppings() {
    pizza.setToppings("Ham + pineeapple");
  }
}
