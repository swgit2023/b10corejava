package Demo.Exception;

public class Trydemo {
	public static void main(String[] args) {

		try {
			String[]  ast = {"s1","s2"}; 
			System.out.println(ast[0]);
			
		} catch (ArithmeticException e) {
			System.out.println("error find in the Arithmetic ");

		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("error find in the Arraysize ");
		}
		catch(Exception e) {
			System.out.println()
		}
	

	}
}
