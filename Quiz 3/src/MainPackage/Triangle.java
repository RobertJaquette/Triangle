package MainPackage;

public class Triangle extends GeometricObject {
	private double Side1;
	private double Side2;
	private double Side3;
	
	public Triangle(){
		Side1 = 1.0;
		Side2 = 1.0;
		Side3 = 1.0;
		}
	
	public Triangle(double Side1, double Side2, double Side3){
		this.Side1 = Side1;
		this.Side2 = Side2;
		this.Side3 = Side3;
	}
	
	public double getSide1() {
		return Side1;
	}
	public double getSide2() {
		return Side2;
	}
	public double getSide3() {
		return Side3;
	}
	double getArea(){
		double P = ((Side1+Side2+Side3)/2);
		return(Math.sqrt(P*(P-Side1)*(P-Side2)*(P-Side3)));}
	
	double getPerimeter(){
		return(Side1+Side2 +Side3);
	}
	
	public String toString() {
		return ("The area of the triangle is" + getArea() + "And the perimeter of the triangle is" + getPerimeter());
	}

}
