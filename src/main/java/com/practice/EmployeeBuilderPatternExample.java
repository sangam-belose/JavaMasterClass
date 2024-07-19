package com.practice;

public class EmployeeBuilderPatternExample {

	public static void main(String[] args) {
		Employee employee = Employee.builder()
			.id(1)
			.name("San")
			.build();

		System.out.println(employee);
	}
}

class Employee {
	private int id;
	private String name;

	private Employee(EmployeeBuilder builder) {
		this.id = builder.id;
		this.name = builder.name;
	}

	private int getId() {
		return this.id;
	}

	private String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return "[ id = " + this.id + ", name = "+ this.name + " ]";
	}

	public static EmployeeBuilder builder() {
		return new EmployeeBuilder();
	}

	static class  EmployeeBuilder {
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
