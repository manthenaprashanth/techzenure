/**
 * a program for Divison operator
 * @author prashanth
 * @since 27/07/2023
 */
import java.util.Scanner;

public class Billgeneration {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("number of pizza: ");
	int no_of_pizza= input.nextInt();
	System.out.println("number of pizza:" + no_of_pizza);
	
	System.out.println("number of puff: ");
	int no_of_puff= input.nextInt();
	System.out.println("number of puff:" + no_of_puff);
	
	System.out.println("number of cooldrink: ");
	int no_of_cooldrink= input.nextInt();
	System.out.println("number of pizza:" + no_of_cooldrink);
	
	input.close();
	
System.out.println("total bill amount:");
System.out.println("number of pizza:" + no_of_pizza);
System.out.println("number of pizza:" + no_of_pizza* 80);
System.out.println();
System.out.println();
System.out.println("number of pizza:" + no_of_puff);
System.out.println("number of pizza:" + no_of_puff*50);
System.out.println();
System.out.println();
System.out.println("number of pizza:" + no_of_pizza);
System.out.println("number of pizza:" + no_of_pizza*50);
System.out.println("number of pizza:" + no_of_cooldrink);
System.out.println("number of pizza:" + no_of_cooldrink*20);
System.out.println();
System.out.println();
int total_bill= (no_of_cooldrink*20)+(no_of_pizza*80)+(no_of_puff*50);
System.out.println("Total prices"+ total_bill);



	
		

	}

}
