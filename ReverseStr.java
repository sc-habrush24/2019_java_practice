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
				System.out.println("���ڸ� �Է��ϼ��� !!");
			}
		}
			}
	}
public class ReverseStr {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector <Word> wordlist = new Vector();
		Scanner scanner = new Scanner(System.in);
		Word w = new Word("apple", "���");wordlist.add(w);
		w=new Word("bear", "��");wordlist.add(w);
		w=new Word("cat", "�����");wordlist.add(w);
		w=new Word("dog", "��");wordlist.add(w);
		w=new Word("egg", "�ް�");wordlist.add(w);
		w=new Word("fish", "�����");wordlist.add(w);
		w=new Word("grape", "����");wordlist.add(w);
		w=new Word("hat", "����");wordlist.add(w);
		w=new Word("ice cream", "���̽�ũ��");wordlist.add(w);
		w=new Word("jacket", "��Ŷ");wordlist.add(w);
		w=new Word("king", "��");wordlist.add(w);
		w=new Word("lion", "����");wordlist.add(w);
		w=new Word("moon", "��");wordlist.add(w);
		w=new Word("nut", "�߰���");wordlist.add(w);
		w=new Word("onion", "����");wordlist.add(w);
		w=new Word("pig", "����");wordlist.add(w);
		w=new Word("queen", "����");wordlist.add(w);
		System.out.println("**** ���� �ܾ� �׽�Ʈ ���α׷� \"��ǰ�ڹ�\"�Դϴ� ****");
		while(true) {
			System.out.print("�ܾ� �׽�Ʈ:1, �ܾ� �Է�:2, ����:3 >>");
			int number = scanner.nextInt();
			if(number==1) {
				System.out.println("���� "+wordlist.size()+"���� �ܾ ����ֽ��ϴ�.-1�� �Է��ϸ� �׽�Ʈ�� �����մϴ�.");
				WordTest wordtest = new WordTest();
				wordtest.play1(wordlist);
				}
			else if(number==2) {
				System.out.println("���� �ܾ �׸��� �Է��ϸ� �Է��� �����մϴ�.");
				String english ="";
				while(true) {
					System.out.print("���� �ѱ� �Է� >>");
					english = scanner.next();
					if(english.equals("�׸�"))
						break;
					else{
						String korean = scanner.next();
						w=new Word(english,korean);wordlist.add(w);}}}
			else if(number==3){System.out.println("\"��ǰ����\"�� �����մϴ�.");break;}
		}
	}
}

