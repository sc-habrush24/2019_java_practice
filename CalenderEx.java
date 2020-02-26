import java.util.Calendar;
public class CalenderEx {
	public static void printCalendar (Calendar cal) {
		int hour = cal.get(Calendar.HOUR);
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
		int minute =cal.get(Calendar.MINUTE);
		System.out.println("현재 시간은 "+hour+"시 "+minute+"분입니다.");
			if(hourOfDay>=18&&hourOfDay<22) {
				System.out.println("Good Evening");
			}
			else if(hourOfDay>=4&&hourOfDay<=11) {
				System.out.println("Good Morning");
			}
			else if(hourOfDay>11&&hourOfDay<18) {
				System.out.println("Good Afternoon");
			}
			else {System.out.println("Good Night");}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar now = Calendar.getInstance();
		printCalendar(now);	
	}
}
