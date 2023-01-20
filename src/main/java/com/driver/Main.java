package com.driver;

public class Main {
  public static void main(String[] args) {

    Pizza dp = new Pizza(true);
    dp.addTakeaway();
    dp.addExtraCheese();
    dp.addTakeaway();
    dp.addExtraToppings();
    System.out.println(dp.getBill());

    Pizza p = new Pizza(false);
    p.addExtraCheese();
    p.addExtraToppings();
    System.out.println(p.getBill());
  }
}