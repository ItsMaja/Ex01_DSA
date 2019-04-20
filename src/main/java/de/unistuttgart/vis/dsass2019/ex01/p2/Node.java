package de.unistuttgart.vis.dsass2019.ex01.p2;

public class Node <T> {
	
	private Node<T> next;
	private Node<T> eighth;
	private T value;

	public Node(T value){

		this.value = value;
	}

	public Node(T value, Node<T> next){

        this.next = next;
        this.value = value;
    }
	
	public Node(T value, Node<T> next, Node<T> eighth) {
		
		this.next = next;
		this.eighth = eighth;
		this.value = value;
	}

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getEighth() {
        return eighth;
    }

    public void setEighth(Node<T> eighth) {
        this.eighth = eighth;
    }

    public boolean hasNext() {

	    return next != null;
    }
}
