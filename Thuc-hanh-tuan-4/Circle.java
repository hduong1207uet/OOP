package baiTH4;

public class Circle {
	private double radius = 1.0d;
	private  String color ;
	protected double PI = 3.14;
	
	public Circle() {
		
	}
	public Circle(double radius) {
		  this.radius = radius;
	}
    public Circle(double radius ,String color) {
		  this.radius = radius;
		  this.color = color;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double rd) {
		this.radius = rd;
	}
	public String getColor() {
		   return color;
	}
	public void setColor(String color) {
		   this.color = color;
	}
	public String toString() {
		   String s = "Circle[radius=" + radius +",color="+ color + "]";
		   return s;
	}
	public double getArea() {
		   return 2*PI*radius*radius;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
