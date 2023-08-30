package Demo.test.encapsulation;

public class Testm {

	public static void checknum(int num) {
		if (num < 1) {
			throw new ArithmeticException("\n number is nagitive ,cannot calucate square");

		} else {
			System.out.println("square of " + num + "is" + (num * num));
		}
		}


	// main method
	public static void main(String args[]) {
		Testm obj = new Testm();

         obj.checknum(3);
			System.out.println("rest of the code...");
		}
	}

