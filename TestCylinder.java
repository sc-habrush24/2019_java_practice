class Circle{
	private double radius = 1.0;
	private String color ="red";
	public Circle(){}
	public Circle(double radius) {
		this.radius = radius;
	}
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double m) {
		radius = m;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String c) {
		color =c;
	}
	public String toString() {
		return "This is a Circle.";
	}
	public double getArea() {
		return radius * radius *Math.PI;
	}
}
class Cylinder extends Circle{
	private double height =1.0;
	public Cylinder() {}
	public Cylinder(double height) {
		this.height=height;
	}
	public Cylinder(double height, double r) {
		setRadius(r);
		this.height=height;
	}
	public Cylinder(double height, double r, String c) {
		setRadius(r);
		setColor(c);
		this.height=height;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double h) {
		height = h;
	}
	public String toString() {
		return "This is a Cylinder.";
	}
	public double getVolume() {
		return getArea()*height;
	}
}
public class TestCylinder {

	public static void main (String[] args) {
		// TODO Auto-generated method stub
	Cylinder cy1 = new Cylinder();
	System.out.println("Radius is "+cy1.getRadius()
	+ " Height is "+ cy1.getHeight()
	+ " Color is "+ cy1.getColor()
	+ " Base area is "+cy1.getArea()
	+ " Volume is " + cy1.getVolume());
	
	Cylinder cy2 = new Cylinder(2.0,5.0);
	System.out.println("Radius is "+cy2.getRadius()
	+ " Height is "+ cy2.getHeight()
	+ " Color is "+ cy2.getColor()
	+ " Base area is "+cy2.getArea()
	+ " Volume is " + cy2.getVolume());

	}

}
