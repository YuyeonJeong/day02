package otherquiz;

import java.util.Scanner;

public class Quiz02_03_Un {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("========================================");
		System.out.println("1. 아메리카노\n2. 카페라떼");
		System.out.println("========================================");
		int num = input.nextInt();
		System.out.println("메뉴선택 : " +num);
		System.out.println("========================================");
		System.out.println("1. ICE\n2. HOT");
		System.out.println("========================================");
		int temp = input.nextInt();
		System.out.println("온도 선택 : "+temp);
		System.out.println("추가 사항 입력 >>샷추가, 시럽추가, 얼음제거, 얼음추가/샷이랑 시럽의 경우 횟수도 입력 : 샷추가 5");
		System.out.println("선택하신 메뉴는 아이스 아메리카노입니다.\n음료나왔습니다.\n맛있게 드세요.");
		
		
	}

}
