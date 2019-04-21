package de.unistuttgart.vis.dsass2019.ex01.p2;


public class SpeedList<T> implements ISpeedList<T> {

	private Node<T> head;

	public Node<T> getHead(){

		return head;
	}
	
	@Override
	public int size() {
		 if (head == null) {
		 	return 0;
		 }
		 Node<T> currentNode = head;
		 int result = 1;

		 while (currentNode.hasEighth()){
		 	result += 8;
		 	currentNode = currentNode.getEighth();
		 }

		 while (currentNode.hasNext()) {
		 	result++;
		 	currentNode = currentNode.getNext();
		 }
		 return result;
	}

	@Override
	public void prepend(T t) {
		head = new Node<>(t, head);

		try {
			Node<T> nodeEight = head.getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext();
			head.setEighth(nodeEight);
		} catch (NullPointerException ignored) {

		}

	}

	@Override
	public T getElementAt(int pos) throws IndexOutOfBoundsException {
		return getNodeAt(pos).getValue();
	}

	@Override
	public T getNext8thElementOf(int pos) {
		return getNodeAt(pos).getEighth().getValue();
	}

	public Node<T> getNodeAt(int pos) throws IndexOutOfBoundsException {

		if (pos < 0 || pos >= size()) {
			throw new IndexOutOfBoundsException();
		}

		int index = 0;
		Node<T> currentNode = head;

		while (currentNode.hasEighth() && index + 8 < pos){
			index += 8;
			currentNode = currentNode.getEighth();
		}

		while (index != pos) {
			index++;
			currentNode = currentNode.getNext();
		}

		return currentNode;
	}

	public void removeFirst() {
		head = head.getNext();
	}

	public void append(T element) {
		if (head == null){
			head = new Node<>(element);
		} else {
			Node<T> lastNode = getNodeAt(size() - 1);
			lastNode.setNext(new Node<>(element));
		}
	}
}
