
public class CharExample {

	public static void main(String[] args) {

		char c1= 'A'; //2byte - utf-16을 쓰기 때문에(이클립스에서는 8/16 모두 설정할 수 있지만
		              // 컴파일러의 설정(utf-16)을 바꿀 수는 없다. 
		char c2= 65;
		char c3 = 0b0100_0001; // 문자하나를 표현할 때는 ''
		
		
		System.out.println("c1="+ c1);
		System.out.println("c2="+ c2);
		System.out.println("c3="+ c3);

		char c4 = '가';
		int ga = c4;
	   System.out.println("c4="+ c4);
	   System.out.println("ga="+ ga);
	   
	   int hit = '힣';
	   System.out.println("hit="+hit);
	} 

}
