package homework8.problem1;

public class MyStringLinkedList {

	Node header;
	int size;

	MyStringLinkedList() {
		header = null;
		size = 0;
	}

	public void addSort(String item) {
		// Implement
		if (header == null)
			header = new Node(null, item, null);
		else {
			Node temp = header;
			while (temp.next != null)
				temp = temp.next;
			Node newNode = new Node(temp, item, null);
			temp.next = newNode;
			sort();
		}
		++size;

	} // insert in a Sorted Order

	/**
	 * Method sorts Nodes in Alphabetical order
	 */
	private void sort() {
		Node current = null, index = null;
		String temp = "";
		// Current will point to head
		for (current = header; current.next != null; current = current.next) {
			// Index will point to node next to current
			for (index = current.next; index != null; index = index.next) {
				if (current.value.compareTo(index.value) > 0) {
					temp = current.value;
					current.value = index.value;
					index.value = temp;
				}
			}
		}
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return (header == null);
	}

	public Node getFirst() {
		if (header == null)
			return null;
		Node temp = header;
		while (header.previous != null) {
			temp = temp.previous;
		}
		return temp;
	}

	public Node getLast() {
		if (header == null)
			return null;
		Node temp = header;
		while (header.next != null)
			temp = temp.next;
		return temp;
	}

	public boolean contains(String item) {
		if (header == null)
			return false;
		Node temp = header;
		while (temp != null)
			if (temp.value.equals(item)) {
				return true;
			}
		return false;
	}

	public void removeFirst() {
		if (header == null)
			return;
		Node newNode = new Node(null, header.next.value, header.next.next);
		header = newNode;
		--size;
	}

	void removeLast() {
		if (header == null)
			return;
		Node temp = header;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.previous.next = null;
		temp = null;
		--size;
	}

	public void print() {
		print(header);
	}

	// Write a recursive print method to display the elements in the list.
	void print(Node n) {
		if (n != null) {
			if (n.next == null)
				System.out.println(n.toString());

			System.out.println(n.toString());

			print(n.next);
		}

	}

	public String toString() {
		String str = "";
		Node temp = header;
		while (temp != null) {
			str = str + "-->[" + temp.value.toString() + "]";
			temp = temp.next;
		}
		str = str + "-->[" + "NULL" + "]";
		return str;
	}

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

	public static void main(String[] args) {
		MyStringLinkedList mySL = new MyStringLinkedList();
		// Make use of the implemented methods;
		mySL.addSort("Pear");
		mySL.addSort("Banana");
		mySL.addSort("Apple");
		mySL.addSort("Zull");
		
		
		System.out.println(mySL);
		mySL.print();

	}

}
