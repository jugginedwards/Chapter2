import java.util.Scanner;
public class LargerNumber1{
	
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter firstNumber");
	int firstNumber = input.nextInt();
	
	System.out.println(" Enter secondNumber ");
	int secondNumber = input.nextInt();

	int largerNumber = 0;
	
	
	if(firstNumber > secondNumber ){

		largerNumber = firstNumber;
		}

	if(firstNumber == secondNumber){

		largerNumber = firstNumber;

	System.out.println("These numbers are equal");

		}
	

	if (secondNumber > firstNumber){
		largerNumber = secondNumber;
		}
	System.out.printf("largerNumber is %d%n",largerNumber);

	}

}
