package ����;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Multiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
			while(true){	
		try {
			System.out.print("���ϰ��� �ϴ� �� �� �Է�>>");
			int a=scanner.nextInt();
			int b=scanner.nextInt();
			System.out.println(a*b);
			break;
		}
		
		catch(InputMismatchException e) {
			System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");
			scanner.nextLine();
		}
		
	
	}
	}


}
	 


