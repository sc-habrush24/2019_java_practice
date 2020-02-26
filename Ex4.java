class Circle{
	int x, y, radius;
	public Circle(int x, int y, int radius) {
		this.x=x;this.y=y;this.radius=radius;
		this.toString();
	}
	public boolean equals(Object obj) {
		Circle  c = (Circle) obj;
		if(x ==c.x &&y==c.y) {return true;}
		else {return false;}
	}
	public String toString() {
		return "Circle ("+Integer.toString(x)+","+Integer.toString(y)+") 반지름 "+Integer.toString(radius);
	}

}
public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle a = new Circle(2,3,5);
		Circle b = new Circle(2,3,30);
		System.out.println("원 a: "+a);
		System.out.println("원 b: "+b);
		if(a.equals(b)) {
			System.out.println("같은 원");
		}
		else {
			System.out.println("서로 다른 원");
		}
	}

}
