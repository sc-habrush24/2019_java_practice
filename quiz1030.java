import java.util.Vector;
import java.util.Scanner;
public class quiz1030 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var v = new Vector<Integer>();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("\n������ �Է� (0 �Է½� ����)>> ");
			int n = scanner.nextInt();
			if(n==0) {break;}
			v.add(n);
			int sum =0;
			for(int i=0;i<v.size();i++) {
				System.out.print(v.get(i)+" ");
				sum+=v.get(i);
			}
			System.out.print("\n���� ��� "+sum/v.size());
		}
	}

}
