package otherquiz;

import java.util.Scanner;

public class Quiz03_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("이름\t나이");
		System.out.println("---------------");
		
		String name1 = input.next();
		int age1 = input.nextInt();
		System.out.println(name1 + " : "+age1);
		String name2 = input.next();
		int age2 = input.nextInt();
		System.out.println(name2 + " : "+age2);
		String name3 = input.next();
		int age3 = input.nextInt();		
		System.out.println(name3 + " : "+age3);
		
		System.out.println("---------------")
		;
	}

}
