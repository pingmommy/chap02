
public class VariableScope {

	String a = ""; 
	
	// 변수의 유효범위 Scope (block Scope)
	
	public static void main(String[] args) {
			int num = 100;
			{
			
				
				int num2 = 200;
				
				//System.out.println(num);
				//System.out.println(num2);

			}
			
			char c = 'A';
			char b = 'B';
			System.out.println(c + b);
		//	System.out.println(num2);

			
	}

}
