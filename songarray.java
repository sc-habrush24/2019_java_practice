import java.util.Scanner;
class song {
	String title;
	String artist;
	public song(String title, String artist){
		this.title=title;
		this.artist=artist;}
	public boolean search(String m) {
		return (m.equals(artist));
	}}
public class songarray {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.print("�뷡��>>");
		int length = scanner.nextInt();
		song [] s = new song [length];
		for(int i=0;i<length;i++) {
			System.out.print("����,����>>");
			String t =scanner.next();
			String a =scanner.next();
			s[i] = new song(t,a);
		}
		System.out.println("����Ǿ����ϴ�...");
		String ans ="";
		while(true) {
			System.out.print("�˻����̸�>>");
			ans = scanner.next();
			if(ans.equals("�׸�")) {
				break;
			}
			String m ="";
			for(int k=0;k<length;k++) {
			if(s[k].search(ans)==true) {
				m=s[k].title;
				break;
			}}
			if(m!="") {
				System.out.println(ans+"�� ��ǥ���� "+m+" �Դϴ�");
			}
			else {System.out.println(ans+"�� �뷡�� �����ϴ�");}
			
		}
	}
}
