package baiTH4;


public class Cylinder extends Circle {
	private double height = 1.0d;
	public Cylinder() {
		
	}
	public Cylinder(double rd) {
		setRadius(rd);
	}
	public Cylinder(double rd, String cl) {
		 setRadius(rd);
		 setColor(cl);
	}
	public Cylinder(double rd, String cl , double height) {
		  setRadius(rd);
		  setColor(cl);
		  setHeight(height);
	}
	
	public void setHeight(double h) {
		   this.height = h; 
	}
	public double getHeight() {
		   return height;
	}	
	public void getVolume() {
	       	
	}
	@Override
	public String toString() {
		 String s0 =  super.toString();
		 String s1 = "Cylinder[" + s0 + ",height=" + height + "]";
		 return s1;
	}
	@Override
	public double getArea() {
		   return super.getArea();
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cylinder cl1 = new Cylinder(3.11d);
		System.out.println(cl1.getRadius());
        
	}

}
