package com.practice.basic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class TreeMapSample {
	public static void main(String[] args) {

		List<Pair> list = new ArrayList<>();
		list.sort(Comparator.comparing(Pair::getName));

		TreeMap<Pair, Integer> employeeMap = new TreeMap<>(comparing(Pair::getName).thenComparing(Pair::getCity));
		employeeMap.put(new Pair("pak","abcd"), 10);
		employeeMap.put(new Pair("ada","bal"), 100);
		employeeMap.put(new Pair("ada","paul"), 10);
		employeeMap.put(new Pair("zebr","met"), 90);
		employeeMap.put(new Pair("kara","john"), 18);

		employeeMap.entrySet()
			.forEach(System.out::println);
		System.out.println("--------------------------");
		List<Pair> pairList = employeeMap.entrySet()
			.stream()
			.map(entry -> entry.getKey())
			.collect(Collectors.toList());
		//pairList.sort(comparing(Pair::getCity).thenComparing(Pair::getName));
		//Collections.sort(pairList, comparing(Pair::getCity).thenComparing(Pair::getName));
		pairList.forEach(System.out::println);
	}
}

class Pair {
	private String name;
	private String city;

	public Pair(String name, String city) {
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
		return "Pair{" +
			"name='" + name + '\'' +
			", city='" + city + '\'' +
			'}';
	}
}
