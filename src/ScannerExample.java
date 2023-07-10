import java.util.Scanner;


public class ScannerExample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("당신의 나이는?");
		int age = scan.nextInt();
	
		System.out.printf("당신의 10년 후 나이는 %d살입니다.",age+10);

	}

}
