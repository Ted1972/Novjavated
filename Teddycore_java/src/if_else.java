
public class if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int i=500;
		int j=500;
		int a=200;
		
		//System.out.println(i);
		//System.out.println(j);
		//System.out.println(a);
		
		if (i==j)   // condition, no semicolen , equal condition
			System.out.println("i and j are equal");
		else
			System.out.println("value of i and j are not equal");
				
		if (i<j) // condition
			System.out.println("i is less than j");
		else
			System.out.println("i is not less than j");
		
		
		if (j>i)
			System.out.println("i is greter than j");
		else
			System.out.println("They are not the same, value of i is " +i);
		
		//System.out.println(i);
		
		if (!(i==j))    // not equal condition
			System.out.println("i and j are not the same");
		else
			System.out.println("They are the same");
		
		
		if (a>i)
			System.out.println("i is less than a");
		else
			System.out.println("The value of a is " + a);
		
		
		// Solve this problem
				//Bar
				//if a person is under 21 no drinks, over 21 serve drinks, 
				//if you are 21 then you can only have max 2 drinks.
			
		int age=21;
		
		if(age<21)
			System.out.println("you can't drink");
		
		else if(age>21);
			System.out.println("you can drink");
		
		 if(age==21);
			System.out.println("you can drink 2 max");
			 
		 /*
		  * compare two string and if they are the same print "good" if not print "not good"
		  */
		 String h = "I am sam";
		 String b = "I am ted";
		 
		 if (h==b)
			 System.out.println ("good");
		 	
		 else
			 System.out.println("not good");
		 
		 /*
		  * Every day i make one dollar for doing my chore for mom. There is 30 days in this month
		  * and i want to keep track of how much i have end of each day total   
		  */
		 int Day= 1;
		     
		  for(int f=1; //Declaration
				  f<=30; //Condition
				  f++){ // Increment
		   System.out.println("Today I made" + f + "Today is day:" + Day); // Statement
		    Day++;
		    
		    // The pattern is Statement - Increment - condition- Execute the statement- Incremet- condition
		  }
	
		
	}
		}


