package partThree;
public class MyDoubleDynamicQueue<T> implements MyQueue<T> {

	
	//--------------------------------------------------
	// Attributes
	//--------------------------------------------------
	private int numItems;
	private MyDoubleLinkedNode<T> head;
	private MyDoubleLinkedNode<T> tail;
	
	//-------------------------------------------------------------------
	// Basic Operation --> Check if myQueue is empty: myCreateEmpty
	//-------------------------------------------------------------------	
	public MyDoubleDynamicQueue(){
		
		//Initialize items
		numItems = 0;
		this.head = null;
		this.tail = null;

	}

	//-------------------------------------------------------------------
	// Basic Operation --> Check if myQueue is empty: isEmpty
	//-------------------------------------------------------------------	
	public boolean isEmpty(){

		//If empty, true
		if(numItems == 0) {
			return true;
		}
		
		return false;
	
	}
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Get first element from front of MyQueue: first
	//-------------------------------------------------------------------
	public T first(){
		
		//If not empty, return the first element
		if(numItems > 0) {
			return this.head.getInfo();
		}
		//If its empty, print
		else {
			System.out.println("Sorry - queue is empty");
		}
		
		return null;
	}

	//-------------------------------------------------------------------
	// Basic Operation --> Add element to back of MyQueue: addByFirst 
	//-------------------------------------------------------------------
	public void addByFirst(T element){
		
		//Initialize node
		MyDoubleLinkedNode<T> currentHead = head;

		if(numItems > 0) {
			MyDoubleLinkedNode<T> newNode = new MyDoubleLinkedNode<T>(null, element, currentHead);
			head = newNode;
			currentHead.setLeft(newNode);
		} 
		else {
			head = new MyDoubleLinkedNode<T>(null, element, null);
			tail = head;
		}

		//Increment number of items by 1
		this.numItems++;

	}
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Remove element from front of MyQueue: removeByFirst 
	//-------------------------------------------------------------------	
	public void removeByFirst(){
		
		//Not empty - remove the item
		if(!this.isEmpty()) {
			head = head.getRight();
			this.numItems--;
			System.out.println("First item has been removed.");
		} 
		//Empty - can't remove the item
		else {
			System.out.println("Sorry - List is already empty");
		}

	}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Get first element from front of MyQueue: last
	//-------------------------------------------------------------------
	public T last(){
		
		if(numItems > 0) {
			return this.tail.getInfo();
		}else {
			System.out.println("Error - List is empty");
		}

		return null;

	}

	//-------------------------------------------------------------------
	// Basic Operation --> Add element to back of MyQueue: addByLast 
	//-------------------------------------------------------------------
	public void addByLast(T element){
		
		
		//Initialize node
		MyDoubleLinkedNode<T> currentHead = tail;
		
		if(numItems > 0) {
			MyDoubleLinkedNode<T> newNode = new MyDoubleLinkedNode<T>(currentHead, element, null );
			tail = newNode;
			currentHead.setRight(newNode);
					
		} 
		else {
			tail = new MyDoubleLinkedNode<T>(null, element, null);
			head = tail;
		}

		//Increment number of items by 1
		this.numItems++;

	}
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Remove element from front of MyQueue: removeByFirst 
	//-------------------------------------------------------------------	
	public void removeByLast(){
		
		if(numItems > 0) {
			tail = tail.getLeft();
			this.numItems--;
			System.out.println("Last item has been removed.");
		} 
		else {
			System.out.println("Sorry - List is already empty");
		}

	}
	
}
