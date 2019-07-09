package de.unistuttgart.vis.dsass2019.ex01.p3;

public class Node {
	
	private String data;
	private Node next;
	
	public String getData() {
		return data;
	}
	
	public Node (String data, Node next) {
		this.data = data;
		this.next = next;
	}

	public void setData(String data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}	

}
