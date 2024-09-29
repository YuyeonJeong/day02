package otherquiz;

import java.util.Scanner;

public class Quiz03_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("0~100까지의 점수를 입력해주세요.");
		int grade = input.nextInt();
		System.out.println("입력하신 수는 "+grade+"입니다.");
		if(grade % 2 != 0) {
			System.out.println("입력하신 수는 홀수입니다.\n");
		}else
			System.out.println("입력하신 수는 짝수입니다.\n");
		
		if(grade >= 50) {
			System.out.println("입력하신 수는 50점 이상입니다.");
		}else
			System.out.println("입력하신 수는 50점 미만입니다.");
		
		int first = grade/10;
		int second = grade%10;
		int result = first+second;
				
		if (result == 7) {
			System.out.println("입력하신 점수의 자리 수들을 모두 합치면 "+result+"입니다. 행운의 숫자네요.");
		}else
			System.out.println("입력하신 점수의 자리 수들을 모두 합치면 "+result+"입니다.");
				
	}

}
