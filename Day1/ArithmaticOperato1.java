/**
 * a program for Divison operator
 * @author prashanth
 * @since 27/07/2023
 */
public class ArithmaticOperato1 {

	public static void main(String[] args) {
		byte b1 = 12;
		byte b2 = 13;
		//byte b3 = 25;
		//byte b3 = b1 + b2; //Type mismatch: cannot convert from int to byte
		//int b3 = b1 + b2;
		byte b3 = (byte)(b1 + b2); 
		System.out.println(b3);
	}

}
