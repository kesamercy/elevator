//
// Building class
// The purpose of this method is to hold information for the building 
//
// Author: Nekesa Mercy
// Date: 11/19/16
//

package elevator;

public class Building
{
	//declare attributes
	private Floor[] bldngFloors;						// the number of floors in the building 
	
	//declare constants 
	final private int NUMFLOORS = 4;			// the total number of floors in the building 
	
	
	// Building 
	// the purpose of this method is to initialize all attributes 
	//
	// input: none 
	// return: none 
	//
	public Building(){
		//declare variables 
		int cntr;						// the counter 
		
		bldngFloors = new Floor[NUMFLOORS];
		
		for(cntr = 0; cntr < bldngFloors.length; ++cntr){
			
			bldngFloors[cntr]= new Floor();
			
		}// end for 	
		
	}// end constructor 
	
	// Building 
	// the purpose of this method is to initialize all attributes to new values 
	//
	// input: none 
	// return: none 
	//
	public Building(Floor[] pf ){
		int cntr;
		
		for(cntr = 0; cntr < bldngFloors.length; ++cntr){
			
			bldngFloors[cntr]= pf[cntr];
			
		}// end for 
		
	}// end overloaded constructor 
	
	//
	// getBldngFloor 
	// the purpose of this method is to return the number of floors in the building 
	//
	// input: none 
	// return: none 
	//
	public int getBldngFloors(){
		
		return(bldngFloors.length);
	}// end getBuildingFloor
	
	//
	// printData 
	// the purpose of this method is to print all the data 
	//
	// Input: none 
	// return: none 
	//
	public void printData( ){
		//declare variables 
		int cntr;
		
		for(cntr = 0; cntr < bldngFloors.length; ++cntr){
			
			System.out.print("For floor " + cntr);
			
			bldngFloors[cntr].printData();
			
		}// end for 

		
	}// end printData
	
	//
	// genNumPeopleOnFloors 
	// the purpose of this method is to generate the number of people on the floors 
	//
	// input: none 
	// return: none 
	//
	public void genNumPeopleOnFloors( ){
		//declare variables 
		int cntr;						// the counter 
		
		for(cntr = 1; cntr < bldngFloors.length; ++cntr ){
	
			bldngFloors[cntr].genNumOnFloor();
			
		}// end for 
		
		
	}// end genNumPeopleOnFloors 
	
	//
	// runBuilding
	// the purpose of this method is to run the building class 
	//
	// input: none 
	// return: none 
	//
	public void runBuilding(){
		//declare variables 
		int cntr;							// the counter 
		
		//generate the number of people of the floors 
		genNumPeopleOnFloors();
		
		//print the data 
		printData();
		
	}// end run building 
	
	
}// end Building class 
