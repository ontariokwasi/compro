package homework8.problem1;

public class Node {

	String value;
	Node next;
	Node previous;

	Node(Node previous, String value, Node next) {
		this.previous = previous;
		this.value = value;
		this.next = next;
	}

	public String toString() {
		return value;
	}
}
