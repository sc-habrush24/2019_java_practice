import java.util.Scanner;
import java.util.Vector;
class EngHistogram{
	String readString() {
		StringBuffer sb = new StringBuffer();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			String line = scanner.nextLine();
			if(line.length()==1 && line.charAt(0)==';') {
				break;
			}
			sb.append(line);
		}
		return sb.toString();	
	}
	void histogram(String sb) {
		Vector <Integer> v1 = new Vector();
		String al = "ABCDEFGHIJKLMNOPQRSTUVWYZ";
		sb=sb.toUpperCase();
		for(int i=0;i<al.length();i++) {
			int m=0;
			for(int k=0;k<sb.length();k++) {
				if(sb.charAt(k)==(al.charAt(i))){
					m+=1;
				}
			}
			v1.add(m);
		}
		for(int i =0; i<v1.size();i++) {
			String num ="";
			for(int k=0;k<v1.get(i);k++) {
				num+="-";
			}
			System.out.println(al.charAt(i)+": "+num);
		}
	}
		
}
public class quiz1023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EngHistogram e = new EngHistogram();
		String sb=e.readString();
		e.histogram(sb);
	}

}
