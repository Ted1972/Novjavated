
public class Swap_variables {

	/*
	 * Swap (computer programming) ... In computer programming, the act of swapping two variables 
	 * refers to mutually exchanging the values of the variables. Usually, 
	 * this is done with the data in memory.
	 *  
	 * For example, in a program, two variables may be defined thus (in pseudocode):
	 *               data_item x := 1
                     data_item y := 0

                       swap (x, y);
        After swap() is performed, x will contain the value 0 and y will contain 1; 
        their values have been exchanged.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 5;
		int y = 6;
		
		int temp;
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("x is " + x + " and y is " + y);
		
		// The second way to do the swap
		x=5;
		y=6;
		x=x+y;// x=11
		y=x-y;// y=5
		x=x-y;// x=6
		System.out.println("x is " + x + " and y is " + y);
		
		
		// swaping two strings without temporary variables
		
		String a = "java";
		String b = "programming";
		
		a = a.concat(b);
		b = a.substring(0, (a.length()-b.length()));
		a= a.substring(b.length());
		
		System.out.println("value of a:" + a);
		System.out.println("value of b:" + b);
		
		String boxone = "apple";
		String boxtwo = "Orange";
		
		boxone =boxone.concat(boxtwo);
		boxtwo =boxone.substring(0,(boxone.length()-boxtwo.length()));
		boxone =boxone.substring(boxtwo.length());
		
		
		System.out.println("the new boxone is:" + boxone);
		System.out.println("the new boxtwo is:" + boxtwo);
		
		
		
		

	}
        
}
