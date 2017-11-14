// constructor is an instance method that usually has the same name as class.
// and its used for assigning a new default valuel.
// constructor should be alwayes non static
public class constructor {
        
	// variables without values and the default values are 0,0,0,and Null for the String
	int age;
	int salary;
	int house;
	String name;	
	
	constructor(){ // with this constructor method we are giving a new values and printing
	int age = 32;
	int salary = 5000;
	int house = 2;
	String name = "John";	
	
	System.out.println(age);
	System.out.println(salary);
	System.out.println(house);
	System.out.println(name);
	}	
	
	public static void main(String[] args)
	// main method where you executed
	
	{
	
	constructor x= new constructor();// we are executing the constructor method with object.
	}
	}
		

	


