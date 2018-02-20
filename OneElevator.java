//
// OneElevator
//
//	The purpose of this method is to create one information for one Elevator 
//
// Author: Nekesa Mercy
// Date: 11/19/16
//
package elevator;

public class OneElevator
{
	//declare attributes 
	//private Building b;						// the object for the building class
	private Floor f;							// the object for the floor class 
	private int[][] elevator;					// the number of floors and the number of people on the elevator 
	private int numTrips;						// the number of trips the elevator makes up and down 
	
	
	// OneElevator  
	// the purpose of this method is to initialize all attributes 
	//
	// input: none 
	// return: none 
	//
	public OneElevator(){
		//int numFloors;
		int row;									// the number of rows
		int col;									// the number of columns 
		
		
	//	b = new Building();
		//allocate space for the object f 
		f = new Floor();
		
		//allocate space for the elevator 
		elevator = new int[4][1];
		
		//initialize the elevator array 
		for(row = 0; row < elevator.length; ++row){
			
			for(col = 0; col < elevator[row].length; ++col){
				
				elevator[row][col] = 0;
				
			}// end col
			
		}// end row
		
		
		numTrips = 0;
		
	}// end constructor 
	
	
	// getElevator  
	// the purpose of this method is to return the address for the array for the elevator 
	//
	// input: none 
	// return: none 
	//
	public int[][]getElevator(){
		
		return(elevator);
		
	}// end getElevator 
	
	// getNumTrips  
	// the purpose of this method is to return the number of trips  
	//
	// input: none 
	// return: none 
	//
	public int getNumTrips(){
			
		return(numTrips);
			
	}// end getElevator 

	//
	// printData 
	// the purpose of this method is to print the data 
	//
	// input: none 
	// return: none
	//
	public void printData( ){
		
		System.out.println();
		
		System.out.println("The number of trips taken by th elevator is " + numTrips);
		
	}// end print data 
	
	//runEleavtor
	//the purpose of this method is to run the elevator 
	//
	// input: none 
	// return: none 
	//
	public void runElevator( ){
		//declare  variables 
		int numpple;		// the number of people on the floor 
		int row;			// the row 
		int col;			// the column
		
		//initialize variables 
		numpple = 0;
		
		
		//assign random number for the remaining floors in the building 
		for(row= 1; row < elevator.length; ++row){
			
			for(col = 0; col < elevator[row].length; ++col){
				
				//generate the number of people on the floor
				f.genNumOnFloor();
				
				//assign the number of people on the floor to a variable 
				numpple = f.getNumPppleOnFloor();
				
				if((numpple <= 20)&&(numpple > 5)){
					
					
					//print the number of people on the floor 
					f.printData();
					
					do{
						//allow 5 people on the elevator 
						elevator[row][col] += 5;
						
						//take the people to the ground floor 
						System.out.println("For floor " + row + " Five people of the " + numpple + " will  Exit at ground floor");
						
						//add one to the number of trips 
						numTrips = numTrips + 1 ;
						
						//calculate the number of people remaining on the floor 
						numpple = numpple - 5;
						
						//display the remaining number of people 
						System.out.println("The remaining number of people on the floor " + row + " is " + numpple);
						
					
						System.out.println();
						
						
					}while(numpple > 5);
					
				}// end if 
					
				else if(numpple == 5){
					//allow all of them on the elevator 
					elevator[row][col] += 5;
						
					//take the people to the ground floor 
					System.out.println("Exit the elevator on the ground floor");
					
					//add one to the number of trips 
					numTrips = numTrips + 1;
					
					}// end else if 
					
				else if((numpple < 5)&&(numpple > 0)){
					
					//add the people to the elevator and then go to the second floor 
					elevator[row][col] = numpple;
					
					}// end else if 
					
				else{	
					System.out.println("Error, invalid number of people");
						
				}// end else
	
			}// end col
			
		}// end row 
		
	}// end run elevator 

}// end OneElevator class 
