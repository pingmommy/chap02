
public class NanExample {

	public static void main(String[] args) {

		/*
		 * 정수와 다른 실수만의 특징
		 * 1. +/- 0
		 * 2. infinity
		 * 3. NaN
		 * 
		 * */

		double d1 = Double.NaN;
		double d2 = 0.0/0.0;
		
		System.out.println(d1);
		System.out.println(d2);
		
	}

}
