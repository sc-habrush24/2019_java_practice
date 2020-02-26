class Point{
	private int x, y;
	
	public Point(int x, int y) {this.x=x; this.y=y;}
	public int getX() {return x;}
	public int getY() {return y;}
	protected void move(int x, int y) {this.x=x; this.y=y;}
}
class PositivePoint extends Point{
	int [] array1= {0,0};
	
	public PositivePoint(){
		super(0, 0);
	}
	public PositivePoint(int x, int y) {
		super(x,y);
	}
	public String toString() {
		
		if (getX()<0||getY()<0) {
			
			return ("("+Integer.toString(array1[0])+","+Integer.toString(array1[1])+")");
		}
		else {
			array1[0]=getX();
			array1[1]=getY();
			return ("("+Integer.toString(getX())+","+Integer.toString(getY())+")");
			}
	}
}
public class PositivePointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PositivePoint p = new PositivePoint();
		p.move(25, 30);
		System.out.println(p.toString()+"입니다");
		p.move(-5, 5);
		System.out.println(p.toString()+"입니다");
		
		PositivePoint p2 = new PositivePoint(-10,-5);
		System.out.println(p2.toString()+"입니다");
	}

}
