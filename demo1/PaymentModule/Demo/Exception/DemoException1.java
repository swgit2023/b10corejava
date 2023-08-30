package Demo.Exception;

public class DemoException1 {

	public static void main(String[] args) {
		System.out.println("hello java");
		
	  DemoException1 de1 = new DemoException1();
		  de1.test(50,61);
	  }
	  public void test(int x,int y) {
		  
	  
	  
	  for(int i=x;i<y;i++) {
		  System.out.println("i value : "+i);
	}
}
}