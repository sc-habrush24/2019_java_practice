import java.io.*;
import java.util.Scanner;
public class quiz1111 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		try {
			System.out.print("ù��° ���� ���� �Է��ϼ���>>");
			String name1= scanner.next();
			System.out.print("�ι�° ���� ���� �Է��ϼ���>>");
			String name2 = scanner.next();
			BufferedReader in1 = new BufferedReader (new FileReader(name1));
			BufferedReader in2 = new BufferedReader (new FileReader(name2));
			BufferedWriter app = new BufferedWriter (new FileWriter("append.txt"));
			int c;
			while((c=in1.read())!=-1) {
				app.write(c);
			}
			while((c=in2.read())!=-1) {
				app.write(c);
			}
			app.close();
			System.out.println("������Ʈ ���� �ؿ� append.txt ���Ͽ� �����Ͽ����ϴ�.");
		}
		catch (IOException e) {
			System.out.println("����� ����");
		}
		scanner.close();
	}
}