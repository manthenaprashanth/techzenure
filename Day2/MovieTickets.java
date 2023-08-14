import java.util.Scanner;

public class MovieTickets {

	public static void main(String[] args) {
		
		int movie_price_unit = 75;
		int Queen_class_unit = 150;
		int Refreshments = 50;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("sample input1 :");
		
		System.out.println("Enter the number of tickets : ");
				int movie_ticket_qnty= sc.nextInt();
				int Ticket_Total_cost= movie_price_unit*movie_ticket_qnty+Refreshments;
				System.out.println(Ticket_Total_cost);
				System.out.println("Do you want to refreshment: Y ");
				System.out.println("Do you have coupon code : Y");
				System.out.println("Enter the circle : K");
				
				
				while(movie_price_unit>=20%10) {
					movie_price_unit=movie_price_unit%10;
				
					
				}
				

	}

}
