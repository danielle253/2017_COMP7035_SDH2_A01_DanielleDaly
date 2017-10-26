package partOne;
public class MyStaticQueue implements MyQueue {

	//--------------------------------------------------
	// Attributes
	//--------------------------------------------------
	private int items[];
	private int numItems;
	private int maxItems;


	//-------------------------------------------------------------------
	// Basic Operation --> Check if myQueue is empty: myCreateEmpty
	//The constructor creates 1 instance (1 object) of the class MyStaticQueue
	//-------------------------------------------------------------------	
	public MyStaticQueue(int m){
		this.maxItems = m;
		this.items = new int[this.maxItems];
		this.numItems = 0;

	}

	//-------------------------------------------------------------------
	// Basic Operation --> Check if MyQueue is empty: isEmpty
	//-------------------------------------------------------------------	
	public boolean isEmpty(){

		boolean isEmpty = true;

		if(numItems > 0) {
			isEmpty = false;
		}

		return isEmpty;

	}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Get first element from front of MyQueue: first
	//-------------------------------------------------------------------
	public int first(){
		int res = 0;
		if(numItems > 0) {

			res = this.items[0];
		}
		else {
			System.out.println("Sorry - queue empty");
		}
		return res;

	}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Add element to back of MyQueue: add 
	//-------------------------------------------------------------------
	public void add(int element){

		//Queue is not full
		if(numItems < maxItems) {

			//We add the item at the desired index	
			this.items[numItems] = element;
			this.numItems++;
		}

		//Queue is full
		else if(numItems == maxItems){
			System.out.println("Sorry - queue full");
		}


	}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Remove element from front of MyQueue: remove 
	//-------------------------------------------------------------------	
	public void remove(){

		int index = 0;


		//Validate empty
		if(numItems <= 0) {
			System.out.println("Sorry - queue empty");
		}
		else {
			//Decrement
			numItems--;
			//We traverse all existing items from index to 0, shifting them one position to the left
			for (int i = index; i < (this.numItems); i++)
				this.items[i] = this.items[i+1];

		}

	}

}
