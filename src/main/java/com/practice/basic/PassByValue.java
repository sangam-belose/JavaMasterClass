package com.practice.basic;

public class PassByValue {
	public static void main(String[] args) {
	PassByValue p = new PassByValue();
	int val = 10;
	p.changePrimitive(val);
	System.out.println(val);
	Tuple tuple = new Tuple();
	tuple.setA(20);
	p.changeObject(tuple);
		System.out.println(tuple);
	}

	public void changePrimitive(int a) {
		a = 200;
	}

	public void changeObject(Tuple tuple) {
		tuple.a = 34;
	}

}

class Tuple {
	int a;

	public void setA(int a){
		this.a = a;
	}

	@Override
	public String toString() {
		return "Tuple{" +
			"a=" + a +
			'}';
	}
}