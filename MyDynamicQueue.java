package partTwo;
public class MyDynamicQueue implements MyQueue {

	//--------------------------------------------------
	// Attributes
	//--------------------------------------------------
	private MyNode head;
	private int numItems;


	//-------------------------------------------------------------------
	// Basic Operation --> Check if MyQueue is empty: myCreateEmpty
	//-------------------------------------------------------------------		
	public MyDynamicQueue(){
		this.head = null;
		this.numItems = 0;



	}

	//-------------------------------------------------------------------
	// Basic Operation --> Check if MyQueue is empty: isEmpty
	//-------------------------------------------------------------------	
	public boolean isEmpty(){
		boolean isEmpty = false;

		if(numItems == 0) {
			isEmpty = true;
		}

		return isEmpty;
	}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Get first element from front of MyQueue: first
	//-------------------------------------------------------------------
	//Returns -1`if very bad
	public int first(){
		int info = -1;
		if(!isEmpty()) {
			info = head.getInfo();
		}
		return info;
	}

	//-------------------------------------------------------------------
	// Basic Operation --> Add element to back of MyQueue: add 
	//-------------------------------------------------------------------
	public void add(int element){
		MyNode newNode = new MyNode(element, null);
		MyNode current;

		if(numItems == 0) {
			head = newNode;

		}
		else {
			//Extra node (current) = head
			current = head;

			for(int i = 1; i < numItems; i++) {

				current = current.getNext();
			}

			current.setNext(newNode);
			

			//			//Go through until space is found
			//			while(node.getNext() != null)
			//
			//				node = node.getNext();
			//
			//			//Extra node's next to current
			//			node.setNext(newNode);
			//			this.numItems++;
		}
		numItems++;


	}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Remove element from front of MyQueue: remove 
	//-------------------------------------------------------------------	
	public void remove(){
		if(!isEmpty()) {
			head = head.getNext();
			this.numItems--;
		}
	}

}
