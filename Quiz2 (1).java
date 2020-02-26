import java.util.Scanner;
public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("3자리 정수 입력(100~999)>>");
		int a = scanner.nextInt();
		if ((a%100)%11==0)
		{
			int b = (a%100)/11;
			System.out.println("Yes! 10의 자리와 1의 자리가 "+b+"로 같습니다");
		}
		else 
			System.out.println("No");
	}
}
