
public class CircleDemo1 {
	public static void main (String[] args) {
		Circle myCircle = new Circle();
		
		myCircle.radius = 10.0;
		myCircle.show(myCircle.radius,myCircle.findArea());
	}
}

class circle{
	double radius;
	
	double findArea() {
		return 3.14 * radius * radius;
	}
	void show(double x, double y) {
		System.out.printf("?????? = %.1f, ???? = %.1f\n",x,y)
	}
}
