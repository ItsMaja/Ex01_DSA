package de.unistuttgart.vis.dsass2019.ex01.p2;

public class Main {
	
	
	public static void main(String[]args) {
		
		Node<Integer> testNode = new Node<>(1);
		Node<Integer> testNode2 = new Node<>(6, testNode);
		Node<Integer> testNode3 = new Node<>(3);

		testNode.setNext(testNode3);

		SpeedList<Integer> testList = new SpeedList<>();
		testList.prepend(4);
		testList.prepend(7);


        System.out.println();
		
	}

}
