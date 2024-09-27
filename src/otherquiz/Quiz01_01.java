package otherquiz;

import java.util.Scanner;

public class Quiz01_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		num = input.nextInt();
		String result = (num %2 ==0)? "num은 짝수이다": "num은 홀수이다";
		System.out.println(result);
	}
}
