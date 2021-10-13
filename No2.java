package a;

public class No2 {
	public static void main (String []args) {
		int[] arr = {5,10,13,22,25};
		
		int sum = 0;
		
		for (int i = 0; i < 5; i++) {
			if(arr[i] % 5 ==0) {

				sum= sum+ arr[i];
			}
		}
		System.out.printf("%d", sum);
	}
}

