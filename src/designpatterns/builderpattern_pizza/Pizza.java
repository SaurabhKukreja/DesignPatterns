package designpatterns.builderpattern_pizza;

public class Pizza {

  private String dough;
  private String sauce;
  private String toppings;

  public Pizza(PizzaBuilder pizzaBuilder) {
    this.dough = pizzaBuilder.dough;
    this.sauce = pizzaBuilder.sauce;
    this.toppings = pizzaBuilder.toppings;
  }

  public void setDough(String dough) {
    this.dough = dough;
  }

  public void setSauce(String sauce) {
    this.sauce = sauce;
  }

  public void setToppings(String toppings) {
    this.toppings = toppings;
  }

  abstract static class PizzaBuilder {
    private String dough;
    private String sauce;
    private String toppings;
    protected Pizza pizza;

    abstract void addDough();
    abstract void addSauce();
    abstract void addToppings();

    public PizzaBuilder addDough(String dough) {
      this.dough = dough;
      return this;
    }

    public PizzaBuilder addSauce(String sauce) {
      this.sauce = sauce;
      return this;
    }

    public PizzaBuilder addToppings(String toppings) {
      this.toppings = toppings;
      return this;
    }

    public Pizza bakeAPizza() {
      return pizza;
    }

    public PizzaBuilder makeAPizza() {
      getPizza();
      this.addDough();
      this.addSauce();
      this.addToppings();
      return this;
    }

    public PizzaBuilder getPizza() {
      pizza = new Pizza(this);
      return this;
    }
  }

  @Override
  public String toString() {
    return "Pizza{" + "dough='" + dough + '\'' + ", sauce='" + sauce + '\'' + ", toppings='" + toppings + '\'' + '}';
  }
}

