package com.practice.basic;

import java.util.ArrayList;
import java.util.List;

/**
 * Example how to make Object Immutable for a class.
 * 1. make all fields private final.
 * 2. Only provide getter and not setter
 * 3. for mutable fields defensively copy
 */
public final class ImmutableObject {
	private final int intValue;
	private final String stringValue;
	private final List<String> stringList;

	public ImmutableObject(final int intValue, final String stringValue, final  List<String> stringList) {
		this.intValue = intValue;
		this.stringValue = stringValue;
		this.stringList = new ArrayList<>(stringList);
	}

	public int getIntValue(){
		return intValue;
	}

	public String getStringValue() {
		return stringValue;
	}

	public List<String> getStringList() {
		return stringList;
	}

}
