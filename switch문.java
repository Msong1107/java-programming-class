import java.util.Scanner;
public class switch�� {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		switch (a) {
			
		case "even":
			System.out.println("¦���Դϴ�.");
			break;
		case "odd":
			System.out.println("Ȧ���Դϴ�.");
			break;
		default:
			System.out.println("¦���� Ȧ���� �ƴմϴ�.");
		}
		
	}
}
