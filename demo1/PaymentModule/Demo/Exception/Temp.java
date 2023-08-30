package Demo.Exception;

public class Temp {

	private static Temp initT() {
		return null;
		
	}

	public void foo(String s) {
		System.out.println(s.toLowerCase());

	}

	public static void main(String args[]) {
		Temp t = new Temp();
		t.foo("fasd");

	// String[] ast = {"s1","s2"};
	//   System.out.println(ast[0]);
		
		try {
			
			String[] ast = {"s1","s2"};
			  System.out.println(ast[2]);
			  
			  System.out.println(1/0);
			  


		}catch (ArithmeticException e)
	{
	System.out.println("error find in the Arithmetic " +e);

    }catch(
	ArrayIndexOutOfBoundsException e)
	{
		System.out.println("error find in the Arraysize " +e);
	}
		catch (NullPointerException e)
		{
		System.out.println("Null values " +e);

		}	
	     catch(Exception e) {
	
	System.out.println("something went wrong....");
    }
	}
}
