package if_;

public class Ex03 {
	public static void main(String[] args) {
		int num = 9;
		if(num>10) {
			System.out.println("if 실행");
		}else {
			System.out.println("else 실행");
		}
		System.out.println("다음 문장들 실행!!!");
		
		int n1, ret;
		int n2 = 10;
		if (n2>=10)
			n1=100;
		//else (n2>=10)
			n1=10;
		System.out.println(n1);
		
		
		int i = 0;
		double d = 0;
		char ch = 0;
		String s = null;
		System.out.println(i);
		System.out.println(d);
		System.out.println(ch);
		System.out.println(s);
		
		if(d==0)
			System.out.println("d에 입력하세요");
		if(s==null)
			System.out.println("s에 입력하세요");
}

}
