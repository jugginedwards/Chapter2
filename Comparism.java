import java.util.Scanner;
public class Comparism{

	public static void main(String... args){

	System.out.println("Enter first number");

	Scanner input = new Scanner(System.in);
	int firstNumber = input.nextInt();

	System.out.println("Enter second number");
	int secondNumber = input.nextInt();

		if( firstNumber == secondNumber ){

			System.out.println(" numbers are equal ");
		}
	
		if( firstNumber != secondNumber ){
		
			System.out.println(" numbers are not equal ");
		}	
	}
}