package otherquiz;

import java.util.Scanner;

public class Quiz02_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("점수를 입력하세요");
		int grade = input.nextInt();
		if( 90 <= grade && 100 >= grade ) {
			System.out.println("A등급입니다");
		}else if( 80 <= grade && 89 >= grade ) {
			System.out.println("B등급입니다");
		}else if( 70 <= grade && 79 >= grade ) {
			System.out.println("C등급입니다");
		}else if( 60 <= grade && 69 >= grade ) {
			System.out.println("D등급입니다");
		}else {
			System.out.println("재시험입니다");
	}
	}
}
