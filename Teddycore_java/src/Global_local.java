
public class Global_local {

static int c= 400;  // Global variable can be called in any function
int b=777; // non static global variable
 

	public static void main(String[] args) {   // This is the main function
		// TODO Auto-generated method stub
		age();
		salary();
		apple();// System.out.println(c);
		// To print b
		Global_local y = new Global_local();
		System.out.println(y.b); // printing a non_static global variable
		
	}
	
	public static void age(){// static - creat space in a memory
		
		int x = 3; // x is local variable for age specific for this function
		System.out.println(x);
		apple();//System.out.println(c);
	}
	
	public static void salary(){
		
		int y = 500; // y is local variable for salary
		System.out.println(y);
		 System.out.println(c);// u can call c in any function b/c it is globl function
	}
	
	public static void apple()
	{
      System.out.println(c);
	}
	public static void value(){
		Global_local z =  new Global_local();
		System.out.println(z.b);
	}
	
	     

}
