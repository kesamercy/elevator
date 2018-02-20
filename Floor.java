//
// Floor class 
//
// The purpose of this class is to create information for one floor 
//
// Author: Nekesa Mercy
// Date: 11/ 19/16
//
package elevator;

public class Floor
{
	//declare the attributes 
	private int numPpleOnFloor;					// the number of people on the floor 
	
	
	//declare the constants 
	final private int MAXNUM = 20;				// the maximum number of people allowed on a floor 
	final private int PPLELEVATOR = 5;			// the number of people allowed in the elevator 
	final private int GROUNDFLOORPPLE = 0;		// the number of people on the ground floor
	
	
	//
	// Floor 
	// The purpose of this method is to initialize the attributes 
	//
	// Input: none 
	// return: none 
	//
	public Floor(){
		
		numPpleOnFloor = 0;
		
	}// end Floor constructor
	
	//
	// Floor 
	// The purpose of this method is to initialize the attributes to a new value 
	//
	// Input: none 
	// return: none 
	//
	public Floor(int f){
		if((f< MAXNUM)&&(f>= 0)){
			
			numPpleOnFloor = f;
			
		}//end if 
		
	}// end Floor overloaded constructor
	
	
	//
	// setNumPppleOnFloor
	// The purpose of this method is to modify the number of people on the floor 
	//
	// Input: f 
	// Return: none 
	//
	public void setNumPppleOnFloor(int f){
		if(( f < MAXNUM )&&(f >= 0)){
			
			numPpleOnFloor = f;
		}//end if 
		else {
			
			System.out.println("Error, invalid input for the number of people on floor ");
			
		}// end else
		
	}//end setNumPppleOnFloor
	
	
	//
	// getNumPppleOnFloor
	// The purpose of this method is to return the number of people on the floor 
	//
	// Input: none 
	// Return: none 
	//
	public int getNumPppleOnFloor( ){
		
		
		return(numPpleOnFloor);
		
	}// end getNumPppleOnFloor
	
	//
	// printData
	// The purpose of this method is to print the data
	//
	// Input: none 
	// Return: none 
	//
	public void printData( ){
		
		System.out.println(" The number of people on the floor is " + numPpleOnFloor);
		
	}// end printData 
	
	//
	// genNumOnFloor
	// The purpose of this method is to generate a random number for the people on the floor 
	//
	// Input: none
	// Return: none
	//
	public void genNumOnFloor( ){
		
		//generate a random number for the people on the floor 
		numPpleOnFloor = MyUtilityClass.genRandom(0, MAXNUM);
		
	}// end genNumOnFloor
	
}// end Floor class 
