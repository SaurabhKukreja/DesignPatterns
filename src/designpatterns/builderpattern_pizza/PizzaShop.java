package designpatterns.builderpattern_pizza;

import designpatterns.builderpattern_pizza.Pizza.PizzaBuilder;

public class PizzaShop {
    public static void main(String[] args) {

      Pizza hawaiinPizza = new HawaainPizza().makeAPizza().bakeAPizza();
      Pizza meatPizza = new MeatPizza().makeAPizza().bakeAPizza();
      Pizza veggiePizza = new VeggiePizza().makeAPizza().bakeAPizza();
      Pizza genericPizza = new GenericPizza()
          .addDough("Test")
          .addSauce("Test Sauce")
          .addToppings("All Veggeis minus Brocolli")
          .getPizza()
          .bakeAPizza();

      System.out.println("Here is your Hawaiin Pizza: "+ hawaiinPizza.toString());
      System.out.println("Here is your Meat Pizza: "+ meatPizza.toString());
      System.out.println("Here is your Veggie Pizza: "+ veggiePizza.toString());
      System.out.println("Here is your Generic Pizza: "+ genericPizza.toString());
    }
}
