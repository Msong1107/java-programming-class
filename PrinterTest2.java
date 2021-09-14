
class Printer1{
	int cnt;
	public Printer1(int cnt1){
		cnt=cnt1;
	}
	
	void print(int print){
		if (cnt-print >0) {
			System.out.printf("%d장 출력했습니다. 현재 %d장 남아 있습니다.",print,cnt-print);
			cnt -= print;
		}
		else if (cnt <=0) {
			System.out.printf("용지가 없습니다.");
		}
		else if (cnt-print < 0) {
			System.out.printf("모두 출력하려면 용지가 %d매 부족합니다. %d장만 출력합니다.",print-cnt,cnt);
			cnt=0;
		}
	}
}

public class PrinterTest2 {
	public static void main(String[] args) {
		Printer1 p = new Printer1(10);
		p.print(2);
		p.print(20);
		p.print(10);
		
	}
}
