package com.practice.designpattern.creational;

/**
 * We don't provide the setter method or public constructor in original class, that way we ensure immutability.
 *
 * we build a class with private constructor and
 */
public class BuilderPatternExample {
	public static void main(String[] args) {
		Employee e = Employee.builder()
			.id(100)
			.name("Optimus")
			.build();

		System.out.println(e);
	}
}

class Employee {
	private int id;
	private String name;

	private Employee(EmployeeBuilder builder) {
		this.id = builder.id;
		this.name = builder.name;
	}

	private int getId() {return this.id;}
	private String getName() {return this.name;}

	public String toString() {
		return " [ " + "id = " + this.id + ", name = " + this.name + " ]";
	}

	public static EmployeeBuilder builder() {
		return new EmployeeBuilder();
	}

	static class EmployeeBuilder {
		private int id;
		private String name;

		public EmployeeBuilder id(int id) {
			this.id = id;
			return this;
		}

		public EmployeeBuilder name(String name) {
			this.name = name;
			return this;
		}

		public Employee build() {
			return new Employee(this);
		}
	}
}