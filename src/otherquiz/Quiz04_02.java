package otherquiz;

import java.util.Scanner;

public class Quiz04_02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("두 수를 입력해주세요.(짝수일 때만 계산)");
		int a = input.nextInt();
		int b = input.nextInt();
		if (a%2==0 && b%2==0) {
			System.out.println(a+b);
		}else
			System.out.println("홀수가 포함 되어있습니다.");
	}
}
