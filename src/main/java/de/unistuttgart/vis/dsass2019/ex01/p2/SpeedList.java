package de.unistuttgart.vis.dsass2019.ex01.p2;


public class SpeedList<T> implements ISpeedList<T> {

	private Node<T> head;
	
	@Override
	public int size() {
		 if (head == null) {
		 	return 0;
		 }
		 Node<T> currentNode = head;
		 int result = 1;

		 while (currentNode.hasNext()) {
		 	result++;
		 	currentNode = currentNode.getNext();
		 }
		 return result;

	}

	@Override
	public void prepend(T t) {
		head = new Node<>(t, head);
	}

	@Override
	public T getElementAt(int pos) {
		
		return null;
	}

	@Override
	public T getNext8thElementOf(int pos) {
		
		return null;
	}


}
