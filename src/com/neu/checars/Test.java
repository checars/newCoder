package com.neu.checars;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Fibonacci(0));
	}
	public static int Fibonacci(int n) {
		if(n == 0) return 0;
		if(n == 1 || n == 2) return 1;
        else return Fibonacci(n-1) + Fibonacci(n-2);
    }
	 public int RectCover(int target) {
			return (int)Math.pow(2,target/2);
	    }
}
