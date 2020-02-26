import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;

public class FlowLayoutEx extends JFrame{
	public FlowLayoutEx() {
		setTitle ("BorderLayout Practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		String [] str = {"Calculate","Add","Sub","Mul","Div"};
		JButton [] button = new JButton [str.length];
		Color [] mycolor = {Color.CYAN,Color.RED,Color.BLUE,Color.YELLOW,Color.GREEN};
		c.setLayout(new BorderLayout(5,7));
		for(int i=0;i<str.length;i++) {
			button[i] = new JButton(str[i]);
			button[i].setBackground(mycolor[i]);
		}
		c.add(button[0],BorderLayout.CENTER);
		c.add(button[1],BorderLayout.NORTH);
		c.add(button[2],BorderLayout.SOUTH);
		c.add(button[3],BorderLayout.EAST);
		c.add(button[4],BorderLayout.WEST);
		setSize(300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlowLayoutEx();
	}

}
