import java.util.Scanner;
public class Arithmetic{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);	 

		System.out.println("Enter first integer");
		int firstNumber = input.nextInt();

		System.out.println("Enter second integer");
		int secondNumber = input.nextInt();

		System.out.println("Enter third integer");
		int thirdNumber = input.nextInt();
		
		int sum = firstNumber + secondNumber + thirdNumber;
		int average = (firstNumber + secondNumber + thirdNumber)/3;
		int product = firstNumber * secondNumber * thirdNumber;


			System.out.printf("the value of the sum is %d%nthe value of the average is %d%nthe value of the product is %d%n", sum, average, product);

		int biggestNumber = 0;
			if(firstNumber > secondNumber){
				
				biggestNumber = firstNumber;
			}
		
			if(firstNumber < secondNumber){
			
				biggestNumber = secondNumber;
			}

			if(thirdNumber > biggestNumber){
				
				biggestNumber = thirdNumber;			

			}

			if(biggestNumber > thirdNumber){
			
				biggestNumber = biggestNumber;
			}

			System.out.printf("the biggest number is %d%n", biggestNumber);


		
		int smallestNumber = 0;

		if(thirdNumber < secondNumber){
			
			smallestNumber = thirdNumber;

		}

		if(thirdNumber > secondNumber){

			 smallestNumber = secondNumber;

		}

		if(firstNumber < smallestNumber){

			smallestNumber = firstNumber;
		}

		if(smallestNumber < firstNumber){

			smallestNumber = smallestNumber;
		}

		System.out.printf("the smallest number is %d%n",smallestNumber);
}


}