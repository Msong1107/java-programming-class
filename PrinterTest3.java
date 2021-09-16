class Printer2{
	private int numOfPapers;
	private boolean duplex;
	
	public Printer2(int numOfPapers, boolean duplex) {
		
	}
	
	void print(int amount) {
		
	}
	public boolean getDuplex(){
		
	}
	public void setDuplex(boolean duplex) {
		
	}
}


public class PrinterTest3 {
	public static void main(String[] args) {
		Printer2 p = new Printer2(20,true);
		p.print(25);
		p.setDuplex(false);
		p.print(10);
	}
}
