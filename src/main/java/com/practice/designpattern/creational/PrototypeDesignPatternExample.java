package com.practice.designpattern.creational;

public class PrototypeDesignPatternExample {
	public static void main(String[] args) throws CloneNotSupportedException {
		GUIComponent radio1 = new RadioButton("Gender");
		GUIComponent radio2 = radio1.clone();

		radio1.render();
		radio2.render();;

		GUIComponent textbox1 = new Textbox("firstName");
		GUIComponent textbox2 = textbox1.clone();

		textbox1.render();
		textbox2.render();
	}
}

interface GUIComponent extends Cloneable {
	GUIComponent clone() throws CloneNotSupportedException;
	void render();
}

class RadioButton implements GUIComponent {
	private String label;

	public RadioButton(String label) {
		this.label = label;
	}

	@Override
	public RadioButton clone() throws CloneNotSupportedException {
		return new RadioButton(this.label);
	}

	@Override
	public void render() {
		System.out.println("RadioButton rendered");
	}
}

class Textbox implements GUIComponent {

	private String placeholder;

	public Textbox(String placeholder) {
		this.placeholder = placeholder;
	}

	@Override
	public GUIComponent clone() throws CloneNotSupportedException {
		return new Textbox(this.placeholder);
	}

	@Override
	public void render() {
		System.out.println("Textbox rendered");
	}
}