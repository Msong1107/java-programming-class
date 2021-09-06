import java.util.Scanner;
public class Hello2030 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("점수를 입력하세요 :");
	  	int scoer= in.nextInt();

		if(scoer >=90 ) {
			System.out.println("A");
		}
		else if(scoer >=80) {
			System.out.println("B");
		}
		else if(scoer >=70) {
			System.out.println("C");
		}
		else if(scoer >=60) {
			System.out.println("D");
		}
		else if(scoer >= 0){
			System.out.println("F");
		}
		else {
			System.out.println("값이 이상함");
		}
		
		
	}
	
																																		
}
