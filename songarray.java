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
		System.out.print("노래수>>");
		int length = scanner.nextInt();
		song [] s = new song [length];
		for(int i=0;i<length;i++) {
			System.out.print("제목,가수>>");
			String t =scanner.next();
			String a =scanner.next();
			s[i] = new song(t,a);
		}
		System.out.println("저장되었습니다...");
		String ans ="";
		while(true) {
			System.out.print("검색할이름>>");
			ans = scanner.next();
			if(ans.equals("그만")) {
				break;
			}
			String m ="";
			for(int k=0;k<length;k++) {
			if(s[k].search(ans)==true) {
				m=s[k].title;
				break;
			}}
			if(m!="") {
				System.out.println(ans+"의 대표곡은 "+m+" 입니다");
			}
			else {System.out.println(ans+"의 노래는 없습니다");}
			
		}
	}
}
