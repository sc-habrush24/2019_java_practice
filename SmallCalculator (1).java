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
		System.out.print(">>�����: ");
		float1=scanner.nextFloat();
		operator=scanner.next();
		float2=scanner.nextFloat();
		switch (operator) {
			case "+":
				System.out.println(float1+operator+float2+"�� ��� ����� "+(float)(float1+float2));
				break;
			case "-":
				System.out.println(float1+operator+float2+"�� ��� ����� "+(float)(float1-float2));
				break;
			case "/":
				if (float2==0)
					{System.out.println("0���� ���� �� �����ϴ�.");}
				else 
					{System.out.println(float1+operator+float2+"�� ��� ����� "+(float)(float1/float2));}
				break;
			case "*":
				System.out.println(float1+operator+float2+"�� ��� ����� "+(float)(float1*float2));
				break;
			case "?":
				if (float2==0)
				{System.out.println("0���� ���� �� �����ϴ�.");}
				else
				{System.out.println(float1+operator+float2+"�� ��� ����� "+(int) (float1/float2));}
				break;
			case "%":
				if (float2==0)
				{System.out.println("0���� ���� �� �����ϴ�.");}
				else
				{System.out.println(float1+operator+float2+"�� ��� ����� "+(float1%float2));}
				break;
		}
		System.out.print("����Ͻðڽ��ϱ�?(y/n):");
		progressStatus=scanner.next();
		if(progressStatus.equals("n"))
			{break;}
		}
		scanner.close();
	}

}
