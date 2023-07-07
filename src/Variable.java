
public class Variable {

	public static void main(String[] args) {

		/* Type은 무한대로 존재하는데, 8개의 Primitive를 
		 * 제외하면 모두 Reference 타입이다. 
		 * 
		 * Type # Primitive(8EA)
		 *        1. 수치
		 *         정수
		 *           Byte     - 1 byte , 정수(실수X) -128 ~ 127(256개)
		 *           Short      2 byte
		 *           Char       2 byte
		 *           Int      - 4 byte
		 *           Long       8 byte
		 *         실수
		 *           Float    - 4 byte
		 *           Double   - 8 byte 
		 *           
		 *        2. 논리
		 *           boolean    1 byte
		 *      # Reference  
		 * 
		 * 
		 * 
		 * 
		 */

		/*int num=300; // 변수는 메모리공간의 이름
		System.out.println(num);
		num += 100;
		System.out.println(num);*/
		
		// 변수선언문 
/*정수*/	byte b;
		short s;
		char c;
		int i;
		long l;
		
/*실수*/ float f;
		double d;
		
/*논리*/	boolean tf;

		b= 127;
		System.out.println(b);
	
		
	}

}
