package otherquiz;

import java.util.Scanner;

public class Quiz03_02_Un {
	public static void main(String[] args) {
		System.out.println("<학생 성적 평가>");
		Scanner input = new Scanner (System.in);
		System.out.println("점수 입력 : ");
		int score = input.nextInt();
		
		if (score < 60) {
			System.out.println("F");
		}else if (score >= 90)
			System.out.println("A");
		else if (score >=80)
			System.out.println("B");
		else if (score >= 70)
			System.out.println("C");
		//else if (score >= 60)
			//System.out.println("D");
		
		//System.out.println("이름 입력 : ");
		//String name = input.next();

