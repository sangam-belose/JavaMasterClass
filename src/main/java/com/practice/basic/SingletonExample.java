package com.practice.basic;

import java.util.ArrayList;
import java.util.List;

/**
 * Double checked locking singletone example
 */
public final class SingletonExample {
	private final int intValue;
	private final String stringValue;
	private final List<String> stringList;

	private static SingletonExample instance;

	private SingletonExample(final int intValue, final String stringValue, final List<String> stringList) {
		this.intValue = intValue;
		this.stringValue = stringValue;
		this.stringList = new ArrayList<>(stringList);
	}

	public SingletonExample getInstance(final int intValue, final String stringValue, final List<String> stringList) {
		if(instance == null) {
			synchronized (SingletonExample.class) {
				if(instance == null) {
					instance = new SingletonExample(intValue, stringValue, stringList);
				}
			}
		}
		return instance;
	}

	public int getIntValue() {
		return intValue;
	}

	public String getStringValue() {
		return stringValue;
	}

	public List<String> getStringList() {
		return stringList;
	}
}
