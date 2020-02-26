import java.io.*;
import java.util.Scanner;
public class quiz1111 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		try {
			System.out.print("첫번째 파일 명을 입력하세요>>");
			String name1= scanner.next();
			System.out.print("두번째 파일 명을 입력하세요>>");
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
			System.out.println("프로젝트 폴더 밑에 append.txt 파일에 저장하였습니다.");
		}
		catch (IOException e) {
			System.out.println("입출력 오류");
		}
		scanner.close();
	}
}