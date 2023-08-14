
import java.util.Scanner;

public class ReverseNumbers {


	public static void main(String[] args) {

			/*Scanner Sc = new Scanner(System.in);
			System.out.println("Enter the Number : ");
			int num = Sc.nextInt();
			Sc.close();
			 int reversedNumber =  reverseNumber(number);
			 System.out.println("reversedNumber: " + ReverseNumbers);*/
		
		   
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a number: ");
		        int number = scanner.nextInt();
		        scanner.close();

		        int reversedNumber = revrseNumber(number);

		        System.out.println("Reversed number: " + reversedNumber);
		    }

		    public static int revrseNumber(int num) {
		        int reversedNum = 0;
		        while (num != 0) {
		            int digit = num % 10; // Extract the last digit of the number
		            reversedNum = reversedNum * 10 + digit; // Build the reversed number
		            num /= 10; // Remove the last digit from the original number
		        }
		        return reversedNum;
		    }
		}


