import java.util.Scanner;

public class OddNumbers {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the number of odd numbers to display: ");
		        int n = scanner.nextInt();
		        scanner.close();

		        System.out.println("First " + n + " odd numbers are:");
		        int count = 1;
		        int num = 1;
		        while (count <= n) {
		            System.out.print(num + " ");
		            num += 2;
		            count++;
		        }
		    }
		

	}


