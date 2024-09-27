package operator;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("수 입력 : ");
		int num;
		num = input.nextInt();
		
		String result = (num % 2 == 0)? num+ " = 짝수" : num + " = 홀수";
		System.out.println(result);
		result = (num % 3 == 0)? num+ " = 3의 배수이다" : num+ "= 3의 배수가 아니다";
		System.out.println(result);
		
		System.out.print("두 수 입력 : ");
		int num1 = input.nextInt(), num2 = input.nextInt();
		result = (num1<num2)?"num2가 num1보다 크다":"num1가 num2보다 크다";
		System.out.println(result);
		
		
	}

}
