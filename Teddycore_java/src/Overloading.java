
public class Overloading {
   // overloading functions happens when both functions has the same but have different arguments
	public static void main(String[] args) {
		// TODO Auto-generated method stub // lesson on "GeeksforGeeks"
   number(6);
   number(6.7);
   name ("Tedla");
   
  // what is polymorphizem and encapsulation
	
	}	
	public static void number(int c){
	
	System.out.println(c);
	}
	public static void number(double c) {
		
	System.out.println(c);
	}
	
	public static void name(String x){ // name is the function name
	System.out.println(x);
	}

}
