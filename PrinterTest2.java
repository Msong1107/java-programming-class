
class Printer1{
	int cnt;
	public Printer1(int cnt1){
		cnt=cnt1;
	}
	
	void print(int print){
		if (cnt-print >0) {
			System.out.printf("%d�� ����߽��ϴ�. ���� %d�� ���� �ֽ��ϴ�.",print,cnt-print);
			cnt -= print;
		}
		else if (cnt <=0) {
			System.out.printf("������ �����ϴ�.");
		}
		else if (cnt-print < 0) {
			System.out.printf("��� ����Ϸ��� ������ %d�� �����մϴ�. %d�常 ����մϴ�.",print-cnt,cnt);
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
