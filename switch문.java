import java.util.Scanner;
public class switch¹® {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		switch (a) {
			
		case "even":
			System.out.println("Â¦¼öÀÔ´Ï´Ù.");
			break;
		case "odd":
			System.out.println("È¦¼öÀÔ´Ï´Ù.");
			break;
		default:
			System.out.println("Â¦¼öµµ È¦¼öµµ ¾Æ´Õ´Ï´Ù.");
		}
		
	}
}
