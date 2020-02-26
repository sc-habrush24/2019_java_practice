import java.util.Scanner;
public class MethodSample extends sample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);
	System.out.print("배열의 길이를 얼마로 할지 입력하시오>>");
	int integer = scanner.nextInt();
	double [] yourArray = new double [integer];
	for(int i=0;i<integer;i++) {
		System.out.println("배열에 넣을 double형의 수를 입력하시오");
		double c = scanner.nextDouble();
		yourArray[i] = c;
	}
	MethodSample a = new MethodSample();
	double m = a.getSum(yourArray);
	
	System.out.println(m);
	}
}
