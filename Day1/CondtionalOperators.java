/**
 * a program for Divison operator
 * @author prashanth
 * @since 27/07/2023
 */
public class CondtionalOperators {

	public static void main(String[] args) {
		int x = 10;
		int y = 15;
		int lar;
		
		/*
		if(x > y) {
			lar = x;
		}else {
			lar = y;
		}
		*/
		
		lar = (x > y) ? x : y;
		
		//largest of (10, 15) = 15
		System.out.println("largest of (" + x + ", " + y + ") = " + lar);

	}

}
