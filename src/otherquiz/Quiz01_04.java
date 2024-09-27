package otherquiz;

import java.util.Scanner;

public class Quiz01_04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("숫자 두 개를 입력하세요");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int sum = num1+num2;
		System.out.println("숫자 두 개의 합은 : "+sum);
		
		int multi = num1 * num2;
		if (sum %2 == 0 )
			System.out.println("숫자 두 개를 곱한 값은 : "+ multi );
	}

}
