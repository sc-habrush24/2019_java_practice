import java.awt.*;
import javax.swing.*;
import java.util.Calendar;
class TimerThread extends Thread {
private JLabel timerLabel;
public TimerThread(JLabel timerLabel) {
this.timerLabel = timerLabel;
}
@Override
public void run() {

while(true) {
	Calendar time = Calendar.getInstance();
	int hour = time.get(Calendar.HOUR_OF_DAY);
	int minute = time.get(Calendar.MINUTE);
	int sec = time.get(Calendar.SECOND);
timerLabel.setText((Integer.toString(hour))+":"+(Integer.toString(minute))+":"
		+(Integer.toString(sec)));
sec++;
try {
Thread.sleep(1000);
}
catch(InterruptedException e) {
return;
}
}
}
}
public class ThreadTimerEx extends JFrame {
public ThreadTimerEx() {
setTitle("dfda");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
Container c = getContentPane();
c.setLayout(new FlowLayout());
JLabel timerLabel = new JLabel();
timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
c.add(timerLabel);
TimerThread th = new TimerThread(timerLabel);
setSize(330,200);
setVisible(true);
th.start();
}
public static void main(String[] args) {
new ThreadTimerEx();
}
}