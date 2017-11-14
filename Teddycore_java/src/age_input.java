import java.util.Scanner;

public class age_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);// Scanner object with input argument
		System.out.print("What is your name?");
		String name = reader.next();// provide your input and Reading your input
		
		
		//Scanner reader1 = new Scanner(System.in);// Scanner object with input argument
		System.out.print("What is your age?");		
		int age = reader.nextInt(); // provide your input and Reading your input
		
		//Scanner reader2 = new Scanner(System.in);
		System.out.print("what is your city?");
		String name2 = reader.next();
		
		System.out.println("your name is " + name);// printing what your input
        System.out.println("your age is " + age);// printing what your input
		System.out.println("your city is " +name2);
		


	}

}
