// Fig. 2.7: Multiplication.java
// Multiplication program that inputs two numbers then displays their sum.
	import java.util.Scanner; // program uses class scanner

	public class Multiplication {
	// main method begins execution of Java application
	public static void main(String[] args){
		// create a Scanner to obtain inout from the command window
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first integer: "); // prompt
		int number1 = input.nextInt(); // read first number from user

		System.out.print("Enter second integer: "); // prompt
		int number2 = input.nextInt(); // read second number from user

		int product = number1 * number2; // add numbers, then store total in the sum

		System.out.printf("Product is %d%n", product); // display product
		}// end method main
	 }// end class Addition
