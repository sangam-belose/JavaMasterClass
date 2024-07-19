package com.practice.basic;

import java.util.TreeSet;

import static java.util.Comparator.comparing;

public class TreeSetSample {

	public static void main(String[] args) {
		TreeSet<Employee> treeSet = new TreeSet<>(comparing(Employee::getCity).thenComparing(Employee::getName));
		treeSet.add(new Employee("john", "newyork"));
		treeSet.add(new Employee("Michael", "miami"));
		treeSet.add(new Employee("Sandor", "Amsterdam"));
		treeSet.add(new Employee("Bada", "Mumbai"));
		treeSet.add(new Employee("Bandya", "Mumbai"));

		treeSet.stream()
			.forEach(System.out::println);
	}


}
class Employee {
	private String name;
	private String city;

	public Employee(String name, String city) {
		this.name = name;
		this.city = city;
	}

	public String getCity(){
		return city;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Employee{" +
			"name='" + name + '\'' +
			", city='" + city + '\'' +
			'}';
	}
}
