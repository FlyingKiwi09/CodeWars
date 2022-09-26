
public class PrintFuncitonsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		widthPractice();
	}
	
	public static void precisionPractice() {
		int number = 12;
		double dub = 3.405;
		String hello = "hello";
		
		System.out.println("\nTrial");
		System.out.printf("%f %d%n", dub, number); // %f prints the float/double to a default of 6dp
		
		System.out.println("\nTrial");
		System.out.printf("%.2f %d%n", dub, number); // %.2f prints the float/double to 2dp (with appropriate rounding) NOTE: doesn't work on ints or characters
		
		System.out.println("\nTrial");
		System.out.printf("%.9f %d%n", dub, number); // %.9f prints the float/double to 9dp (i.e. it can go beyond the default 6)
	
	
		// precision with strings
		System.out.println("\nTrial");
		System.out.printf("%.2s%n", hello); // %.2s  prints he (the first two characters of the string)
		System.out.printf("%.6s%d%n", hello, number); // prints hello12 (i.e. doesn't add spaces if the precision is greater than the number of characters
		System.out.printf("%.5s%d%n", hello, number); // prints hello12
		
		
	}
	
	public static void  widthPractice(){
		int first = 123;
		int second = 45678;
		String hello = "hello";
		Boolean b = true;
		double dub = 345.6780;
		
		System.out.println("\nTrial");
		System.out.printf("%4d%8d%n", first, second); // gives 4 spaces to the first int, gives 8 spaces to second and right justifies both
	
		// double
		System.out.println("\nTrial");
		System.out.printf("%8f%n", dub);
		
		//boolean
		System.out.println("\nTrial");
		System.out.printf("%8b%n", b);
		
		// strings
		System.out.println("\nTrial");
		System.out.printf("%8s%n", hello);
		
		
		// not enough space? - prints the whole variable i.e width is a minimum
		System.out.println("\nTrial");
		System.out.printf("%3s%n", hello);
		System.out.printf("%3d%n", second);
		System.out.printf("%5f%n", dub); // prints to 6dp as per standard function
		
		// precision and width together
		System.out.println("\nTrial");
		System.out.printf("%7.2f%n", dub); // note the  .  takes up a space in the width
		
		// width with line separator (%n) = error
		System.out.println("\nTrial");
//		System.out.printf("%7.2f%3n", dub);
		System.out.printf("%3s%n", hello);
		
	}
	
	public static void flagPractice() {
		int first = 123;
		int second = 45678;
		String hello = "hello";
		Boolean b = true;
		double dub = 345.6780;
		
		// the -  flag makes things left justified Note:must be combined with a width
		System.out.printf("%-4d%8d%n", first, second);
		System.out.printf("%-6d%-8s%n", first, hello);
	}

}
