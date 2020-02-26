import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class FlyingTextEx extends JFrame {
private JLabel la = new JLabel("Love Java");
public FlyingTextEx() {
setTitle("좌 키를 이용하여 텍스트 움직이기");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
Container c = getContentPane();
c.addKeyListener(new MyKeyListener());
la.setSize(100,20);
c.setLayout(new FlowLayout());
c.add(la);
setSize(300,300);
setVisible(true);
c.setFocusable(true);
c.requestFocus();
c.addMouseListener(new MouseAdapter() {
public void mouseClicked(MouseEvent e) {
Component com = (Component)e.getSource();
com.setFocusable(true);
com.requestFocus();
}
}
);
}
class MyKeyListener extends KeyAdapter {
public void keyPressed(KeyEvent e) {
int keyCode = e.getKeyCode();
switch(keyCode) {
case KeyEvent.VK_UP:
break;
case KeyEvent.VK_DOWN:
break;
case KeyEvent.VK_LEFT:
	if(la.getText().equals("Love Java")){
		la.setText("avaJ evoL");
		break;
	}
	else{
		la.setText("Love Java");break;
	}
case KeyEvent.VK_RIGHT:
break;
}
}
}
public static void main(String [] args) {
new FlyingTextEx();
}
}