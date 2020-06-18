package com.test.junit;

public class MyMath {
	
	public int cal(int[] num) {
		
		int sum = 0;
		for(int i:num) {
			sum += i;
		}
		
		return sum;
	}

}
