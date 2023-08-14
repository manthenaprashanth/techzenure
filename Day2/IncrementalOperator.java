/**
 * a program for incremental operator
 * @author prashanth
 * @since 27/07/2023
 */
public class IncrementalOperator {

	public static void main(String[] args) {
		int x = 2;
		System.out.println(x++); //post_increment   2
		System.out.println(++x); //pre_increment	4
		
		x = 4;
		x= x++ + ++x;
		System.out.println(x);


	}

}
