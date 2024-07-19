package com.practice;

public class ShapeFactoryPatternExample {
	public static void main(String[] args) {
		Shape circle = ShapeFactory.getShape("Circle");
		circle.draw();
		Shape triangle = ShapeFactory.getShape("Triangle");
		triangle.draw();
	}
}

interface Shape {
	void draw();
}

class Circle implements Shape {
	@Override
	public void draw() {
		System.out.println("circle is drawn");
	}
}

class Triangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Triangle is drawn");
	}
}

class ShapeFactory {

	public static Shape getShape(String type) {
		if (type == null) {
			return null;
		}
		if(type.equals("Circle")) {
			return new Circle();
		} else if (type.equals("Triangle")) {
			return new Triangle();
		}
		return null;
	}
}