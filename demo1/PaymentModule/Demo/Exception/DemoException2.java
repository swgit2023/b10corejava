package Demo.Exception;

public class DemoException2 {


public static void main(String[] args) {
	System.out.println("hello java");
	
  DemoException2 de2 = new DemoException2();
	  de2.test(1,2);
  }
  public void test(int x,int y) {
	   int c=x/y;
	   System.out.println("c value" +c);
    
  
  
  for(int i=x; i<y; i++) {
	
	System.out.println("i value : "+i);
}
}
}