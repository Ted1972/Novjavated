
public class Double_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String flights [] [] = new String [4][4];
		
		// first columns and rows
		
		flights [0] [0] = "Dallas";
		flights [0] [1] = "New York";
		flights [0] [2] = "Miami";
		flights [0] [3] = "Chicago";
		
		// Second columns and rows
		
		flights [1] [0] = "los angles";
		flights [1] [1] = "Seatle";
		flights [1] [2] = "washington DC";
		flights [1] [3] = "ohio";
		
		// third columns and rows
		
		flights [2] [0] = "New oreans";
		flights [2] [1] = "Baltimore";
		flights [2] [2] = "Meryland";
		flights [2] [3] = "Kansas";
		
		// fourth columns and rows
		
		flights [3] [0] = " San digo";
		flights [3] [1] = "Austin";
		flights [3] [2] = "Houston";
		flights [3] [3] = "San Francisco";
		
		
		//System.out.println(flights [2] [3]);
		//System.out.println(flights [1] [3]);
		
		int cols = flights[0].length;// u can write without [0]
		int rows = flights.length;// for rows it is just "flight.length"
		
		// argument for columns		
		
		for(int colnum = 0; colnum<cols; colnum++)
		{
			//argument for rows
	    for (int rownum = 0; rownum<rows;rownum++)
	    {
	    	//argument for printing columns and rows
	    System.out.println(flights[colnum][rownum]);
	    	
	    }
		}
			

	}

}
