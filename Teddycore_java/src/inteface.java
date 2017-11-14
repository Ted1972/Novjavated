
//inteface is where non of the functions action is known.
/*
Like a class, an interface can have methods and variables, but the methods declared in 
interface are by default abstract (only method signature, no body).  

    Interfaces specify what a class must do and not how. It is the blueprint of the class.
    An Interface is about capabilities like a Player may be an interface and any class implementing Player must be able to (or must implement) move(). So it specifies a set of methods that the class has to implement.
    If a class implements an interface and does not provide method bodies for all functions specified in the interface, then class must be declared abstract.
    A Java library example is, Comparator Interface. If a class implements this interface, then it can be used to sort a collection.
*/

public interface inteface {
	
	public void morning();
	
	public void afternoon();
	
	public void lunch();

}
