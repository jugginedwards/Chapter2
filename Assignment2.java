import java.util.Scanner;
public class Assignment2{
	
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter first integer");
	int firstNumber = input.nextInt();

	System.out.print("Enter second integer");
	int secondNumber = input.nextInt();

	int sum = firstNumber + secondNumber;
	int product = firstNumber * secondNumber;
	int difference = firstNumber - secondNumber;
	int quotient = firstNumber / secondNumber;

	System.out.printf("%d%n%d%n%d%n%d%n", sum , product, difference, quotient);

}
}