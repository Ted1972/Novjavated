import javax.swing.JOptionPane; // for input dialog box step1
import java.util.Random;

public class input_dialoge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// select statements for name and for string video 10/29  on 4:17 time 
		String number; // for name
		number = JOptionPane.showInputDialog("Type your name: ");//choose a numbe// for name use it
		
		//number = JOptionPane.showInputDialog("choose a number: "); // for number
		JOptionPane.showMessageDialog(null, number, "This is my input box", 0);//for name use it
		System.out.println(number);// for name
		
		/*
		int convernum  = Integer.parseInt(number); // to convert to an integer
		
		Random rand = new Random();//step 2 
		int n=rand.nextInt(5);// step 3
		System.out.println("your random number is " +n);//step 4 printing
		System.out.println("yout random guesses is :"+ convernum);

		if (convernum==n){
			System.out.println("you guessed it correct");
		}else{
			System.out.println("your guess is incorrect");
			
		}
		
	
		*/	
		}
		
		
}
