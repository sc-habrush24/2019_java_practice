import java.util.Scanner;
import java.util.Random;
public class homework3_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);
	Random random = new Random();
	while (true) {
	int k = random.nextInt(100);
	System.out.println("���� �����Ͽ����ϴ�. ���߾� ������");
	int try_numb = 1;
	int min = 0;
	int max = 99;
	while(true) {
	System.out.println(min+"-"+max);
	System.out.print(try_numb+">>");
	int my_numb = scanner.nextInt();
	if (my_numb!=k) {
		if(my_numb<k) {
			System.out.println("�� ����");
			min = my_numb;}
		else if(my_numb>k) {
			System.out.println("�� ����");
			max = my_numb;}
	  		}
	else
	{System.out.println("�¾ҽ��ϴ�.");
	break;}
	try_numb+=1;
	}
	System.out.print("�ٽ��ϰڽ��ϱ�?(y/n)>>");
	String ans = scanner.next();
	if(ans.equals("n"))
		{break;}
	}
	scanner.close();

}}
