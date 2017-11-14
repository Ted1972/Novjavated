
public class non_static {
	
	// to call a non static function we have to make an object, and an object is intance of a class.
	// if static is not mentioned in a function , it becomes a non static.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		non_static x= new non_static(); // creat object that is an instance of a class
		x.car();
		x.flower();
		x.bible();
		
		
	}
	
	public void car(){ // non static function can be called any where
		System.out.println("Toyota");
	}
	public void flower(){
		System.out.println("Rose");
	}
	
		public void bible(){
		System.out.println("Matthew");
	}
		
		
	}


