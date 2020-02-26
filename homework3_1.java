import java.util.Scanner;
import java.util.Random;
public class homework3_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);
	Random random = new Random();
	while (true) {
	int k = random.nextInt(100);
	System.out.println("수를 결정하였습니다. 맞추어 보세요");
	int try_numb = 1;
	int min = 0;
	int max = 99;
	while(true) {
	System.out.println(min+"-"+max);
	System.out.print(try_numb+">>");
	int my_numb = scanner.nextInt();
	if (my_numb!=k) {
		if(my_numb<k) {
			System.out.println("더 높게");
			min = my_numb;}
		else if(my_numb>k) {
			System.out.println("더 낮게");
			max = my_numb;}
	  		}
	else
	{System.out.println("맞았습니다.");
	break;}
	try_numb+=1;
	}
	System.out.print("다시하겠습니까?(y/n)>>");
	String ans = scanner.next();
	if(ans.equals("n"))
		{break;}
	}
	scanner.close();

}}
