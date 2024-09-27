package otherquiz;

import java.util.Scanner;

public class Quiz02_02 {
	public static void main(String[] args) {
		Scanner input = new input(System.in);
		System.out.println("===================");
		System.out.println("1. 쉬움 >>> 1~10");
		System.out.println("2. 보통 >>> 1~100");
		System.out.println("3. 어려움 >>> 1~1000");
		System.out.println("===================");
		int num = input.nextInt();
		System.out.println(">>>"+num);
		
		
		
	}

}
