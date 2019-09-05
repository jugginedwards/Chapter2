// Fig. 2.7: Multiplication.java
// Multiplication program that inputs two numbers then displays their sum.
	import java.util.Scanner; // program uses class scanner

	public class Multiplication {
	// main method begins execution of Java application
	public static void main(String[] args){
		// create a Scanner to obtain inout from the command window
		Scanner input = new Scanner(System.in);
		
		System.out.println("This program helps you perform the multiplication of two integers and prints out the result on the screen");
		
		 System.out.print("Enter first integer: "); // prompt
		int number1 = input.nextInt(); // read first number from user

		System.out.print("Enter second integer: "); // prompt
		int number2 = input.nextInt(); // read second number from user

		int product = number1 * number2; // add numbers, then store total in the sum

		System.out.printf("Product is %d%n", product); // display product
		System.out.println("Thank you for using Multiplication, you can follow us and like our posts on our facebook and youtube handles.");		
            }// end method main
	 }// end class Addition
