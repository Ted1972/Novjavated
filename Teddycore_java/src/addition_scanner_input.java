import java.util.Scanner;

public class addition_scanner_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Provide me your first Integer");
		int n = reader.nextInt();
		System.out.println("Provide your second Inreger");
		int p = reader.nextInt();
		
		
		int sum = n+p;
		
		//System.out.println(sum);
		System.out.println("Your additional value is " + sum);
		
		

	}

}
