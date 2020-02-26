import java.util.Scanner;

class Add{
	int a;
	int b;
	public void setValue(int a, int b) {
		this.a =a;
		this.b=b;
	}
	int calculate() {
		return a+b;
	}
}
class Div extends Add{
	int calculate() {
		return a/b;
	}
}
class Mult extends Div{
	int calculate() {
		return a*b;
	}
}
class Sub extends Mult{
	int calculate() {
		return a-b;
	}
}
public class Cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오");
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		String e = scanner.next();
		if(e.equals("*")) {
			Mult quest = new Mult();
			quest.setValue(c, d);
			System.out.println(quest.calculate());
		}
		else if(e.equals("-")) {
			Sub quest = new Sub();
			quest.setValue(c, d);
			System.out.println(quest.calculate());
		}
		else if(e.equals("+")) {
			Add quest = new Add();
			quest.setValue(c,d);
			System.out.println(quest.calculate());
		}
		else if(e.equals("/")) {
			Div quest = new Div();
			quest.setValue(c,d);
			System.out.println(quest.calculate());
		}
	}

}

