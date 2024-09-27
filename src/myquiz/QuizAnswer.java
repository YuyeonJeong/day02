package myquiz;

import java.util.Scanner;

public class QuizAnswer {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("예약하셨습니까? yes 또는 no 입력해주세요.");
		String str = input.next();
		if( str.equals("yes") ) { //문자열 조건 확인
			System.out.println("예약 확인 되었습니다.");
		}else
			System.out.println("대기 시간이 발생할 수 있습니다.");

		System.out.println("주문하실 메뉴를 선택해주세요.");
		System.out.println("1. 페퍼로니 피자 2. 고구마 피자 3. 하와이안 피자");
		int menu = input.nextInt(); //메뉴 입력 받기
		if( menu == 1 )
			System.out.println("페퍼로니 피자의 가격은 17000원입니다.");
		if( menu == 2 )
			System.out.println("고구마 피자의 가격은 16000원입니다.");
		if( menu == 3 )
			System.out.println("하와이안 피자의 가격은 15000원입니다.");
		
		System.out.println("매장을 이용할 인원수를 입력하세요.");
		int people = input.nextInt(); //인원수 입력 받아서 3배수 이벤트 자동 참여
		String result = ( people % 3 == 0 )
				? "축하합니다! 3월 맞이 3배수 이벤트에 당첨되어 음료 무료쿠폰이 발급되었습니다.": people+"명 입력 되었습니다.";
		System.out.println(result);
}
}
