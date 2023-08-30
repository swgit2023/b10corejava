package DemoSuper;

public class Democ1 extends Demop1 {
	String color = "black";
	 
	void printcolor() {
		System.out.println(color);
		System.out.println(super.color);
	}
	
	public static void main(String args[]) {
		Democ1 dc = new Democ1();
		dc.printcolor();
		
	}
	

}
