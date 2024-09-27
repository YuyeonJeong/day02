package operator;

public class Ex01 {
	public static void main(String[] args) {
		int n1 = 9, n2 = 2;
		System.out.println( n1/n2 );
		System.out.println( n1/(double)n2 );
		System.out.println( n1%n2 );
		
		System.out.println(" ---복합대입 연산자--- ");
		n1 = n2 = 5;
		n1 += 1;
		System.out.println(n1);//결과6
		n1 -= 1;
		System.out.println(n1);//결과4
		n1 *= n2;
		System.out.println(n1);//결과25
		n1 %= n2;
		System.out.println(n1);//결과0
	}

}
