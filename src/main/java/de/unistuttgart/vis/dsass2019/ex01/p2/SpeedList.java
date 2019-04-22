package de.unistuttgart.vis.dsass2019.ex01.p2;


public class SpeedList<T> implements ISpeedList<T> {

	private Node<T> head;

	/**
	 * Returns the current number of elements in the list
	 *
	 * @return Current number of elements in the list
	 */
	@Override
	public int size() {
		 if (head == null) {
		 	return 0;
		 }

		 Node<T> currentNode = head;
		 int result = 1;

		// Use eighth node whenever possible
		 while (currentNode.hasEighth()){
		 	result += 8;
		 	currentNode = currentNode.getEighth();
		 }

		// Otherwise, traverse list as usual
		 while (currentNode.hasNext()) {
		 	result++;
		 	currentNode = currentNode.getNext();
		 }

		 return result;
	}

	@Override
	public void prepend(T t) {
		head = new Node<>(t, head);

		// Attempt to set the eighth node
		try {
			Node<T> nodeEight = head.getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext();
			head.setEighth(nodeEight);
		} catch (NullPointerException ignored) {

		}

	}

	/**
	 * Returns the element at the specified position in the list
	 *
	 * @param pos
	 *            The position of the element in the list starting from 0
	 *
	 * @return The specified element in the list
	 *
	 * @throws IndexOutOfBoundsException
	 *             If the requested element is out of range
	 */
	@Override
	public T getElementAt(int pos) throws IndexOutOfBoundsException {
		return getNodeAt(pos).getValue();
	}

	/**
	 * Returns the next 8th element of the specified element in the list
	 *
	 * @param pos
	 *            The position of the specified element in the list starting
	 *            from 0
	 *
	 * @return The next 8th element of the specified element
	 *
	 * @throws IndexOutOfBoundsException
	 *             If the requested element is out of range
	 */
	@Override
	public T getNext8thElementOf(int pos) throws IndexOutOfBoundsException {
		return getNodeAt(pos).getEighth().getValue();
	}

	private Node<T> getNodeAt(int pos) throws IndexOutOfBoundsException {

		if (pos < 0 || pos >= size()) {
			throw new IndexOutOfBoundsException();
		}

		int index = 0;
		Node<T> currentNode = head;

		// Use eighth node whenever possible
		while (currentNode.hasEighth() && index + 8 < pos){
			index += 8;
			currentNode = currentNode.getEighth();
		}

		// Otherwise, traverse list as usual
		while (index != pos) {
			index++;
			currentNode = currentNode.getNext();
		}

		return currentNode;
	}

	/**
	 * Removes the head of the list by reassigning head to the next node after head
	 */
	public void removeFirst() {
		head = head.getNext();
	}

	/**
	 * Appends a new element at the end of the list
	 * @param element The element to be appended
	 */
	public void append(final T element) {
		if (head == null){
			head = new Node<>(element);
		} else {
			Node<T> lastNode = getNodeAt(size() - 1);
			lastNode.setNext(new Node<>(element));
		}
	}

	/**
	 * SpeedList is using Nodes to implement a linked list internally
	 * @param <F>	The class of elements to be used
	 */
	private class Node <F> {

		private Node<F> next;
		private Node<F> eighth;
		private F value;

		private Node(final F value){
			this.value = value;
		}

		private Node(final F value, final Node<F> next){
			this.next = next;
			this.value = value;
		}

		private Node<F> getNext() {
			return next;
		}

		private void setNext(final Node<F> next) {
			this.next = next;
		}

		private F getValue() {
			return value;
		}

		private Node<F> getEighth() {
			return eighth;
		}

		private void setEighth(final Node<F> eighth) {
			this.eighth = eighth;
		}

		private boolean hasNext() {
			return next != null;
		}

		private boolean hasEighth() {
			return eighth != null;
		}
	}

}
