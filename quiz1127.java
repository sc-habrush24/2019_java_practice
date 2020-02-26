import javax.swing.*;
		import java.awt.event.*;
		import java.awt.*;
public class quiz1127 extends JFrame {
private JLabel la = new JLabel("»ç¶ûÇØ");
	public quiz1127() {
		setTitle("MouseListener¿Í MouseMotionListener ¿¹Á¦");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		MyMouseListener listener =
		new MyMouseListener();
		la.addMouseListener(listener);
		c.add(la);
		setSize(300,200);
		setVisible(true);
		
	}
		class MyMouseListener implements MouseListener{
		public void mousePressed(MouseEvent e) {}
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {
			la = (JLabel)e.getSource();
			la.setText("Love Java");
		}
		public void mouseExited(MouseEvent e) {
			la = (JLabel)e.getSource();
			la.setText("»ç¶ûÇØ");
		}
		public void mouseDragged(MouseEvent e) {
		}
		public void mouseMoved(MouseEvent e) {
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new quiz1127();
	}	

}
