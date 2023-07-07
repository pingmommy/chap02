
public class StringExample {

	public static void main(String[] args) {


		String str1 = "";// 빈문자열을 표현할 수 있다. emptey String char는 빈 글자를 표현할 수 없다. 
		String str2 = "Hello";
		String str3= "\"Hello\""; // '\' 이스케이프 문자. 표현할 수 없는 문자를 표현.
		String str4= "Hello\n World";
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		// 이스케이프 '/'문자 사용법
		// 특수기호가 사용되는데, 기능을 잃고 순수문자로 기능하게
		// 키보드에 없는 문자를 표현한다거나 제어문자를 표현할 때.
		
	}

}
