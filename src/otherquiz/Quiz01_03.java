package otherquiz;

import java.util.Scanner;

public class Quiz01_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("온도를 입력하세요 : ");
		int temp = input.nextInt();
		String result = (temp >= 30)? "날씨가 더워요" : "날씨가 쾌적해요";
		System.out.println(result);
	}

}
