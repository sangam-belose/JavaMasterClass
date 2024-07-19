package com.practice.designpattern.structural;

public class BridgePatternExample {
	public static void main(String[] args) {
		Vehicle bikeManufacturer = new Bike(new Produce(), new Assemble());
		bikeManufacturer.manufacture();

		System.out.println();

		Vehicle carManufacturer = new Car(new Produce(), new Assemble());
		carManufacturer.manufacture();
	}
}

abstract class Vehicle {
	protected Workshop workshop1;
	protected Workshop workshop2;

	public Vehicle(Workshop workshop1, Workshop workshop2) {
		this.workshop1 = workshop1;
		this.workshop2 = workshop2;
	}

	abstract void manufacture();
}

class Bike extends Vehicle {

	public Bike(Workshop workshop1, Workshop workshop2) {
		super(workshop1, workshop2);
	}

	@Override
	void manufacture() {
		System.out.print("Bike ");
		workshop1.work();
		workshop2.work();
	}
}

class Car extends Vehicle {

	public Car(Workshop workshop1, Workshop workshop2) {
		super(workshop1, workshop2);
	}
	@Override
	void manufacture() {
		System.out.print("car ");
		workshop1.work();
		workshop2.work();
	}
}

interface Workshop {
	void work();
}

// implementor
class Produce implements Workshop {

	@Override
	public void work() {
		System.out.print("produced ");
	}
}

class Assemble implements Workshop {

	@Override
	public void work() {
		System.out.print("assembled ");
	}
}