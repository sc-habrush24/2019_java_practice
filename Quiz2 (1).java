import java.util.Scanner;
public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("3�ڸ� ���� �Է�(100~999)>>");
		int a = scanner.nextInt();
		if ((a%100)%11==0)
		{
			int b = (a%100)/11;
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� "+b+"�� �����ϴ�");
		}
		else 
			System.out.println("No");
	}
}
