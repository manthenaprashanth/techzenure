/**
 * a program for Divison operator
 * @author prashanth
 * @since 27/07/2023
 */
import java.util.Scanner;

public class DifferenceEvenNumbers {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the first number");
		int First = sc.nextInt();
		System.out.println("Enter the Second number");
		int Second = sc.nextInt();
		System.err.println("Even numbers between" +  First +  "and" + Second +  "are:");
		
		if(First % 2 !=0) {
			 
			First++;
			 
			
		 }
		 for (int i= First; i<=Second; i+=2) {
			 System.out.println(i + "  ");
			 /*if(First<Second)
			 {
				 System.err.println("Invalid Input:: second number should be greater than first number");
			 }*/
		 
		 
		 }	
		 
		
	}

}
