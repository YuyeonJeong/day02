package otherquiz;

import java.util.Scanner;

public class Quiz04_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("갤럭시와 아이폰 중 어떤 것을 선택하겠습니까?");
		
		String choice = input.next();
		if (choice.equals("갤럭시")) {
			System.out.println("갤럭시! 기능을 선택하셨군요.");
		
		}else if (choice.equals("아이폰")) {		
			System.out.println("아이폰! 갬성을 선택하셨군요."); 
		}
		
		
		System.out.println("정말 구매하겠습니까? 예/아니오");
		String ans = input.next();
		if (ans.equals("아니오")) {
			System.out.println("둘 다 안팔아요.");
		}else
			System.out.println("만족하시나요? 예/아니오");
		
		String ans2 = input.next();
		if (ans2.equals("예")) {
				System.out.println("만족하셔야죠. 되돌리기에는 늦었습니다.");
		} else if (ans2.equals("아니오")) {
				System.out.println("아니오는 안돼요");
		}
		
			
		
		
	}

}
