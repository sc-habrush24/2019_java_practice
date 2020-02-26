import java.util.Scanner;
public class SmallCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		float float1;
		float float2;
		String operator;
		String progressStatus;
		while (true) {
		System.out.print(">>연산식: ");
		float1=scanner.nextFloat();
		operator=scanner.next();
		float2=scanner.nextFloat();
		switch (operator) {
			case "+":
				System.out.println(float1+operator+float2+"의 계산 결과는 "+(float)(float1+float2));
				break;
			case "-":
				System.out.println(float1+operator+float2+"의 계산 결과는 "+(float)(float1-float2));
				break;
			case "/":
				if (float2==0)
					{System.out.println("0으로 나눌 수 없습니다.");}
				else 
					{System.out.println(float1+operator+float2+"의 계산 결과는 "+(float)(float1/float2));}
				break;
			case "*":
				System.out.println(float1+operator+float2+"의 계산 결과는 "+(float)(float1*float2));
				break;
			case "?":
				if (float2==0)
				{System.out.println("0으로 나눌 수 없습니다.");}
				else
				{System.out.println(float1+operator+float2+"의 계산 결과는 "+(int) (float1/float2));}
				break;
			case "%":
				if (float2==0)
				{System.out.println("0으로 나눌 수 없습니다.");}
				else
				{System.out.println(float1+operator+float2+"의 계산 결과는 "+(float1%float2));}
				break;
		}
		System.out.print("계속하시겠습니까?(y/n):");
		progressStatus=scanner.next();
		if(progressStatus.equals("n"))
			{break;}
		}
		scanner.close();
	}

}
