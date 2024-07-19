package com.practice.designpattern.creational;

public class FactoryPatternExample {

	public static void main(String[] args) {
		//lets say we want circle;
		Shape circleShape = ShapeFactory.getShape("circle");
		circleShape.draw();

		//lets say we want triangle;
		Shape triangleShape = ShapeFactory.getShape("triangle");
		triangleShape.draw();
	}
}

interface Shape { void draw(); }

class Circle implements Shape {
	@Override
	public void draw() {
		System.out.println("circle is drawn");
	}
}

class Triangle implements Shape {
	@Override
	public void draw() {
		System.out.println("triangle is drawn");
	}
}

class ShapeFactory {
	public static Shape getShape(String shapeType) {
		if(shapeType == null ){
			return null;
		}
		if("circle".equals(shapeType)) {
			return new Circle();
		} else if ("triangle".equals(shapeType)) {
			return new Triangle();
		}
		return null;
	}
}