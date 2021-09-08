class Ball{
	double radius = 2.0;
	double getVolume() {
		return 4/3 *3.14 * radius * radius * radius;
	}
}

public class class_01 {
	public static void main(String[] args) {
		Ball myBall = new Ball();
		System.out.println(myBall.getVolume());
	}
}
