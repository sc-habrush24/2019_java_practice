import java.util.Scanner;
public class MethodSample extends sample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);
	System.out.print("�迭�� ���̸� �󸶷� ���� �Է��Ͻÿ�>>");
	int integer = scanner.nextInt();
	double [] yourArray = new double [integer];
	for(int i=0;i<integer;i++) {
		System.out.println("�迭�� ���� double���� ���� �Է��Ͻÿ�");
		double c = scanner.nextDouble();
		yourArray[i] = c;
	}
	MethodSample a = new MethodSample();
	double m = a.getSum(yourArray);
	
	System.out.println(m);
	}
}
