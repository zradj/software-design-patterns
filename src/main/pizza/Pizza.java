package main.pizza;

public class Pizza {

  private boolean cheese;
  private boolean pepperoni;

  public void eat() {
    System.out.println("Eating pizza");
  }

  public void thank() {
    System.out.println("Thanks");
  }

  public void addCheese() {
    this.cheese = true;
  }

  public void addPepperoni() {
    this.pepperoni = true;
  }

  public boolean hasCheese() {
    return this.cheese;
  }

  public boolean hasPepperoni() {
    return this.pepperoni;
  }
}
