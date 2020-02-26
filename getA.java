interface Shape{
	final double PI = 3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.print("---�ٽ� �׸��ϴ�.");
		draw();
	}
}
class Circle implements Shape{
	public int radius;
	public Circle(int radius) {this.radius=radius;}
	public double getArea() {return radius*radius*PI;}
	public void draw() {System.out.println("�������� "+radius+"�� ���Դϴ�.");}
}
class Oval implements Shape{
	public int radius1;
	public int radius2;
	public Oval (int radius1, int radius2) {this.radius1=radius1;this.radius2=radius2;}
	public double getArea() {return radius1*radius2*PI;}
	public void draw() {System.out.println(radius1+"x"+radius2+"�� �����ϴ� Ÿ���Դϴ�.");}
}
class Rect implements Shape{
	public int length1;
	public int length2;
	public Rect(int length1, int length2) {this.length1=length1; this.length2=length2;}
	public double getArea() {return length1*length2;}
	public void draw() {System.out.println(length1+"x"+length2+"ũ���� �簢���Դϴ�.");}
}
public class getA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape [] list = new Shape[3];
		list[0] = new Circle(10);
		list[1] = new Oval(20,30);
		list[2] = new Rect(10,40);
		for(int i=0;i<list.length;i++) {
			list[i].redraw();
		}
		for(int i=0;i<list.length;i++) {
			System.out.println("������ "+list[i].getArea());
		}
	}

}
