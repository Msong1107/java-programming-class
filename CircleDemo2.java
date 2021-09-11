class Circle1{
	double radius;
	String color;
	
	
	public Circle1(double r, String c) {
		radius=r;
		color =c;
	}
	public Circle1(double r) {
		radius=r;
		color = "ÆÄ¶û";
	}
	public Circle1(String c) {
		radius= 10.0;
		color = c;
	}
	public Circle1() {
		radius =10.0;
		color= "»¡°­";
	}
}
public class CircleDemo2 {
	public static void main(String[] args) {
		Circle1 c1 = new Circle1(10.0, "»¡°­");
		Circle1 c2 = new Circle1(5.0);
		Circle1 c3 = new Circle1("³ë¶û");
		Circle1 c4 = new Circle1();
	}
}
