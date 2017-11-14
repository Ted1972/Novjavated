import java.util.Random;

public class random_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * want to generat a number from 1 to 20 and then 
		 * i want to make a loop to guess that Random number
		 *  and I want to see how many guesses it takes to find the random number
		 
	    */
		

	    int count=1; // one time guess	
		Random rand = new Random(); // declar random
	    int i=0;
	    do 
	    {
	    i = rand.nextInt(5); //  1 to 20 
		System.out.println( "this is my random number:" +i); // display our guess to the random number java gives us
		System.out.println("This is my guess: 3 ");
		System.out.println("This is my count:" + count);
		count++;
	    } while(i==3);
	    System.out.println("This is my random number:" + i);
	    
				

	} //end main function

} // end class
