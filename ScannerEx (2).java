import java.util.Scanner;
public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String course[] = {"Java","C++","HTML5","Python","Android",""};
		int score[] = {95,88,76,62,55};
		String ans = "" ;
		int k=0;
		while (true) {
			System.out.print("���� �̸���>>");
			ans = scanner.next();
			if((k==0)&&(ans.equals("�׸�"))) {
				break;
			}
			for (int i =0; i<6;i++) {
				k=i;
				if(ans.equals(course[i])) 
					break;
				}
			
			if(k<5) {
				System.out.println(ans+"�� ������"+score[k]+"�Դϴ�.");
			}
			else {
				System.out.println("���� �����Դϴ�.");
			}}
		scanner.close();
	}

}
