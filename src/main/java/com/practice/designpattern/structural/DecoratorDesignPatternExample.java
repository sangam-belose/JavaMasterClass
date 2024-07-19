package com.practice.designpattern.structural;

public class DecoratorDesignPatternExample {
	public static void main(String[] args) {
		Coffee myCoffee = new SimpleCoffee();
		System.out.println(myCoffee.getDescription() + " $"+myCoffee.getCost());

		myCoffee = new MilkDecorator(myCoffee);
		System.out.println(myCoffee.getDescription() + " $" + myCoffee.getCost());

		myCoffee = new SugarDecorator(myCoffee);
		System.out.println(myCoffee.getDescription() + " $"+myCoffee.getCost());
	}
}

interface Coffee {
	String getDescription();

	double getCost();
}

class SimpleCoffee implements Coffee {
	@Override
	public String getDescription() {
		return "Simple Coffie";
	}

	@Override
	public double getCost() {
		return 2.00d;
	}
}

abstract class CoffeeDecorator implements Coffee {
	protected Coffee decoratedCoffee;

	public CoffeeDecorator(Coffee coffee) {
		this.decoratedCoffee = coffee;
	}

	@Override
	public String getDescription() {
		return decoratedCoffee.getDescription();
	}

	@Override
	public double getCost() {
		return decoratedCoffee.getCost();
	}
}

// concrete Decorators

class MilkDecorator extends CoffeeDecorator {

	public MilkDecorator(Coffee coffee) {
		super(coffee);
	}

	@Override
	public String getDescription() {
		return decoratedCoffee.getDescription() + ", Milk";
	}

	@Override
	public double getCost() {
		return decoratedCoffee.getCost() + 0.50;
	}
}

class SugarDecorator extends CoffeeDecorator {

	public SugarDecorator(Coffee coffee) {
		super(coffee);
	}

	@Override
	public String getDescription() {
		return decoratedCoffee.getDescription() + ", Sugar";
	}

	@Override
	public double getCost() {
		return decoratedCoffee.getCost() + 0.20d;
	}
}
