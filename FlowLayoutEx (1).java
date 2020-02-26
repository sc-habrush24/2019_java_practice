import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;

public class FlowLayoutEx extends JFrame{
	public FlowLayoutEx() {
		setTitle ("BorderLayout Practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		GridLayout grid = new GridLayout(4,4);
		grid.setVgap(4);
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new FlowLayout());
		panel1.add(new JLabel("계산 결과"));
		panel1.add(new JTextField("",27));
		panel1.setBackground(Color.YELLOW);
		c.add(panel1,BorderLayout.SOUTH);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(grid);
		for(int i=0;i<10;i++) {
			panel2.add(new JButton(Integer.toString(i)));
		}
		panel2.add(new JButton("CE"));
		panel2.add(new JButton("계산"));
		JButton plus = new JButton("+");plus.setBackground(Color.CYAN);
		JButton minus = new JButton("-");minus.setBackground(Color.CYAN);
		JButton multi = new JButton("*");multi.setBackground(Color.CYAN);
		JButton div = new JButton("/");div.setBackground(Color.CYAN);
		panel2.add(plus);
		panel2.add(minus);
		panel2.add(multi);
		panel2.add(div);
		c.add(panel2);
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(new FlowLayout());
		panel3.add(new JLabel("수식 입력"));
		panel3.add(new JTextField(27));
		panel3.setBackground(Color.GRAY);
		c.add(panel3,BorderLayout.NORTH);
		
		setSize(400,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlowLayoutEx();
	}

}
