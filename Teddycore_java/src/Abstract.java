
public abstract class Abstract {
//when you have an abstract method in any class, it become an abstract class.
//abstract method means you know your function, but don't know the action of that function
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		}
	
	public static void food(){
		System.out.println("I like Orange");
	}
	
	public static void house(){
		System.out.println("My house is Green");// the action of the function is known
	}
	
	public abstract void dinner();// make your class abstract , we don't know the action here.

}
