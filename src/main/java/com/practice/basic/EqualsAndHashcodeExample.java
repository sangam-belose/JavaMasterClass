package com.practice.basic;

import java.util.Objects;

public class EqualsAndHashcodeExample {
	private int count;
	private String name;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null || this.getClass() != obj.getClass()) return false;
		EqualsAndHashcodeExample e = (EqualsAndHashcodeExample) obj;
		return count == e.count && Objects.equals(name, e.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(count, name);
	}
}
