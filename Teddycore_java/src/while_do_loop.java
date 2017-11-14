
public class while_do_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		  int x=0;  // starting value
		 
		while (x<19) // condition
						
		{
			System.out.println(x);
			// i++;  // increase by one
			x+=1;  // increase by two
			
			
		}
		
		 * I need to save $3 each day until I have $150 for chrismars. How many days do 
		 * i have to save for till i reach $150?
		 */
		int dollar =3;
		int Day=1;
		// do while
		do{
			
			System.out.println("I save $"+ dollar + " , today is day " + Day);
			dollar+=3;  // dollar= dollar+3 or dollar+=3
			Day++; //days by 1
			
			} while (dollar<150);
		   System.out.println("I finally made $"+ dollar + " and today is day " +Day);
			// 2:20 time 10/29
		}
	

	}


