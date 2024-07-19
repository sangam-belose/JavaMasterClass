package com.practice;

public class CoffieDecoratorPatternExample {
	public static void main(String[] args) {

		Coffie coffie = new SimpleCoffie();
		System.out.println(coffie.getDescription());
		System.out.println(coffie.getCost());
		coffie = new MilkDecorator(coffie);

		System.out.println(coffie.getDescription());
		System.out.println(coffie.getCost());

	}

}

interface Coffie {
	String getDescription();
	double getCost();
}

class SimpleCoffie implements Coffie{

	@Override
	public String getDescription() {
		return "simple coffie";
	}

	@Override
	public double getCost() {
		return 2.00d;
	}
}

abstract class CoffieDecorator implements Coffie {
	protected Coffie coffie;

	public CoffieDecorator(Coffie coffie) {
		this.coffie = coffie;
	}

	@Override
	public String getDescription() {
		return coffie.getDescription();
	}

	@Override
	public double getCost() {
		return coffie.getCost();
	}
}

class MilkDecorator extends CoffieDecorator {

	public MilkDecorator(Coffie coffie) {
		super(coffie);
	}

	@Override
	public String getDescription() {
		return coffie.getDescription() + ", Milk";
	}

	@Override
	public double getCost() {
		return coffie.getCost() + 0.30d;
	}
}
