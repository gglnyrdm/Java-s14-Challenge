package com.workintech.hamburger.model;

public class DeluxeBurger extends Hamburger {

    private String drink;
    private String cips;

    public DeluxeBurger() {
        super("DeluxeBurger", 19.1, BreadRollType.DOUBLE_BURGER);
        super.setMeat("Double");
    }

    @Override
    public void addAddition(String additionName, double price) {
        System.out.println("Deluxe Burger için malzeme eklenemez");
    }

}
