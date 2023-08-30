package Demo.Regex;

public class Ex1 {
	String s1 = "welcomw rani";
	String s2 = "welcomw bujji";
	String s3 = "welcomw chinnu";
	String s4 = "welcomw swe";
	String s5 = "welcomw sravs";
	
	static String result = "About 3,790 results (0.47 seconds)";
	 
	//fetch from about 8,46,00,000 results(0.51 seconds);
//	result count = 3790;

//	time taken = 0.47;
	
	public static void main(String args[]) {
		Ex1 e = new Ex1();
		e.testLogin("rani");
		e.testLogin("bujji");
		e.testLogin("chinnu");
		e.testLogin("swe");
		
		
		String str = result.replace("About","");
       System.out.println(str);
		
	}
	public void testLogin(String x) {
		String username = x;
		System.out.println("welcome" +username);
	}
	
	

}
