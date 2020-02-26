package 과제;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Multiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
			while(true){	
		try {
			System.out.print("곱하고자 하는 두 수 입력>>");
			int a=scanner.nextInt();
			int b=scanner.nextInt();
			System.out.println(a*b);
			break;
		}
		
		catch(InputMismatchException e) {
			System.out.println("실수는 입력하면 안됩니다.");
			scanner.nextLine();
		}
		
	
	}
	}


}
	 


