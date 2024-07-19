package com.practice.basic;

public class SumOf3And5Challenge {
	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		/*for (int i = 1; count<5 && i <1000; i ++) {
			if(i%3 == 0 && i% 5 == 0) {
				System.out.println(i + " is divisible by 3 & 5");
				count++;
				sum += i;
			}
		}
		System.out.println("sum = "+sum);*/

		int j = 0;
		while(j < 50) {
			j+=5;
			if(j % 25 == 0){
				continue;
			}
			System.out.print(j + "_");

		}
	}
}
