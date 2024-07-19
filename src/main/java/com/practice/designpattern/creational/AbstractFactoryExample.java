package com.practice.designpattern.creational;

public class AbstractFactoryExample {

	private Button button;
	private CheckBox checkBox;

	public AbstractFactoryExample(GuiFactory factory) {
		button = factory.createButton();
		checkBox = factory.createCheckBox();
	}

	public void paint() {
		button.paint();
		checkBox.paint();
	}

	public static void main(String[] args) {
		GuiFactory factory = null;
		String osName = System.getProperty("os.name").toLowerCase();

		if(osName.contains("win")) {
			factory = new WindowsFactory();
		} else if (osName.contains("mac")) {
			factory = new MacosFactory();
		} else {
			System.err.println("Unsupported os");
		}

		AbstractFactoryExample e = new AbstractFactoryExample(factory);
		e.paint();
	}
}

 interface Button { void paint(); }
 interface CheckBox { void paint(); }

 class WindowsButton implements Button {
	 @Override
	 public void paint() {
		 System.out.println("WindowsButton created");
	 }
 }

class MacosButton implements Button {
	@Override
	public void paint() {
		System.out.println("MacosButton created");
	}
}

class WindowsCheckBox implements CheckBox {

	@Override
	public void paint() {
		System.out.println("WindowsCheckBox created");
	}
}

class MacosCheckBox implements CheckBox {

	@Override
	public void paint() {
		System.out.println("MacOsCheckBox created");
	}
}

interface GuiFactory {
	Button createButton();
	CheckBox createCheckBox();
}

class WindowsFactory implements GuiFactory {

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

	@Override
	public CheckBox createCheckBox() {
		return new WindowsCheckBox();
	}
}

class MacosFactory implements GuiFactory {

	@Override
	public Button createButton() {
		return new MacosButton();
	}

	@Override
	public CheckBox createCheckBox() {
		return new MacosCheckBox();
	}
}