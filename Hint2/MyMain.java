package partTwo;
/**
* The main class of our project.<br>. 
*/
public class MyMain {

	//-------------------------------------
	//	testMyQueue 
	//-------------------------------------	
	/** 
	* This function test the MyQueue interface and its static implementation.<br>
	*/
	public static void testMyQueue() {
		
		//-------------------------------------
		//	1. We create myQueue 
		//-------------------------------------
		MyQueue m;
		//m = my_create_empty(); //--> We cannot create a new myQueue using explicitly my_create_empty()
		m = new MyDynamicQueue(); //--> Instead we choose to follow the implementation class. 

		//-------------------------------------
		//	2. isEmpty 
		//-------------------------------------
		System.out.println("Is it empty: " + m.isEmpty()); //--> The current length is 0 as myQueue is created initially empty
				//If want to break, run this line : 
			m.first();
		//-------------------------------------
		//	3. Add three elements 
		//-------------------------------------
		m.add(3); //--> m : [3]
		m.add(4);	//--> m : [3, 4]	
		m.add(5); //--> m : [3, 4, 5]
		m.add(6); //--> m : [3, 4, 5, 6]
		
		//-------------------------------------
		//	4. Get the first item in myQueue and make myQueue  
		//-------------------------------------	
		System.out.println("First item = " + m.first()); //--> Returns 3
		m.remove();
		System.out.println("First item = " + m.first()); //--> Returns 4
		
		//-------------------------------------
		//	5. Remove two elements and fail to remove another one
		//-------------------------------------			
		m.remove(); //--> m : [5, 6]
		m.remove(); //--> m : [6]
		System.out.println("First item = " + m.first()); //--> Returns 6
		m.remove(); //--> m : []
		m.remove(); //--> Fails, myQueue is already empty

	}
	
	//-------------------------------------
	//	main 
	//-------------------------------------		
	/**
	 * Main Method:<br> 
	 * Calls to the function testMyQueue to test MyQueue and its implementation.<br>
	 * @param args: We will run the program parameter free, so do not worry about it. 
	 */	
	public static void main(String[] args) {
		//1. We call to the function testMyQueue
		testMyQueue();
	}

}
