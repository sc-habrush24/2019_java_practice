import java.util.*;
import java.util.InputMismatchException;
class Word {
	String eng; String kor;
	public Word(String eng, String kor) {
		this.eng=eng;this.kor=kor;
		}
	}
class WordTest {
	Scanner scanner = new Scanner(System.in);
	Random random = new Random();
	public WordTest() {}
	public void play1(Vector <Word> v1) {
		Vector <Integer> answersheet = new Vector();
		while(true) {
			while(answersheet.size()!=5) {
				int choose = random.nextInt(v1.size());
				if(!answersheet.contains(choose))
					answersheet.add(choose);
			}
			Collections.shuffle(answersheet);
			int rand_answer = random.nextInt(4);
			int answer = answersheet.get(rand_answer);
			System.out.println((v1.get(answer)).eng+"?");
			for(int i =1;i<5;i++) {
				System.out.print("("+i+")"+(v1.get(answersheet.get(i-1))).kor+" ");
			}
			System.out.print(">>");
			try {
				int k=scanner.nextInt();
				if(k==-1) 
					break;
				if(k==rand_answer+1) 
					System.out.println("Excellent !!");
				else
					System.out.println("No !!");
			}
			catch(InputMismatchException e) {
				scanner = new Scanner(System.in);
				System.out.println("숫자를 입력하세요 !!");
			}
		}
			}
	}
public class ReverseStr {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector <Word> wordlist = new Vector();
		Scanner scanner = new Scanner(System.in);
		Word w = new Word("apple", "사과");wordlist.add(w);
		w=new Word("bear", "곰");wordlist.add(w);
		w=new Word("cat", "고양이");wordlist.add(w);
		w=new Word("dog", "개");wordlist.add(w);
		w=new Word("egg", "달걀");wordlist.add(w);
		w=new Word("fish", "물고기");wordlist.add(w);
		w=new Word("grape", "포도");wordlist.add(w);
		w=new Word("hat", "모자");wordlist.add(w);
		w=new Word("ice cream", "아이스크림");wordlist.add(w);
		w=new Word("jacket", "재킷");wordlist.add(w);
		w=new Word("king", "왕");wordlist.add(w);
		w=new Word("lion", "사자");wordlist.add(w);
		w=new Word("moon", "달");wordlist.add(w);
		w=new Word("nut", "견과류");wordlist.add(w);
		w=new Word("onion", "양파");wordlist.add(w);
		w=new Word("pig", "돼지");wordlist.add(w);
		w=new Word("queen", "여왕");wordlist.add(w);
		System.out.println("**** 영어 단어 테스트 프로그램 \"명품자바\"입니다 ****");
		while(true) {
			System.out.print("단어 테스트:1, 단어 입력:2, 종료:3 >>");
			int number = scanner.nextInt();
			if(number==1) {
				System.out.println("현재 "+wordlist.size()+"개의 단어가 들어있습니다.-1을 입력하면 테스트를 종료합니다.");
				WordTest wordtest = new WordTest();
				wordtest.play1(wordlist);
				}
			else if(number==2) {
				System.out.println("영어 단어에 그만을 입력하면 입력을 종료합니다.");
				String english ="";
				while(true) {
					System.out.print("영어 한글 입력 >>");
					english = scanner.next();
					if(english.equals("그만"))
						break;
					else{
						String korean = scanner.next();
						w=new Word(english,korean);wordlist.add(w);}}}
			else if(number==3){System.out.println("\"명품영어\"를 종료합니다.");break;}
		}
	}
}

