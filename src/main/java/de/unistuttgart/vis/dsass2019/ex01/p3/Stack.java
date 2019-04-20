package de.unistuttgart.vis.dsass2019.ex01.p3;


public class Stack<T> implements IStack<T> {

private final static int MAX_HIGHT = 10;
	private Node topNode = null;
	private int currentHight = 0;
	
	public class OverflowException extends Exception {
		public OverflowException(){
			System.out.println("Der Stack ist voll");
		}
	}
	
	/** Adds new element to the top */
	public void push(String data) throws OverflowException {
		if (currentHight == MAX_HIGHT) {
			throw new OverflowException;
		}
	
		Node node = new Node(data, topNode);
		topNode = node;
		currentHight++;
	}

	 public class UnderflowException extends Exception {
			
			public UnderflowException(){
				System.out.println("Der Stapel ist leer!");
			}
	}
	 
	/** Removes and returns the top element */
	public T pop() throws UnderflowException{
		if (currentHight == 0){
			throw new UnderflowException();
		}
					
		String data = topNode.getData();		
		topNode = topNode.getNext();
		currentHight--;
		return data;
	}
	
	/** Returns the top element without removing */
	public T top() throws UnderflowException {
		if (currentHight == 0) {
				throw new UnderflowException();
		}
			return topNode.getData();
		}
	}
	
	/** Checks if the stack is empty */
	public boolean isEmpty() {
		
	}
}
