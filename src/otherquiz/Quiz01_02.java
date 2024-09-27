package otherquiz;

import java.util.Scanner;

public class Quiz01_02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("메뉴입니다");
		System.out.println("[1]맥도날드 [2]라면 [3]닭갈비 [4]돈까스");
		System.out.println("점심 뭐먹을까요?");
		
		int menu = input.nextInt();
		if ( menu==4 )
			System.out.println("먹으러 갑시다!");
		else
			System.out.println("흠 그건 좀...");
	
		
	}

}
