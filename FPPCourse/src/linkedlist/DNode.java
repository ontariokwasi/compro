package linkedlist;

public class DNode {
	 DNode prev;
	 DNode next;
	 int data;
	public DNode() {
		prev = null;
		next = null;
		data = 0;
	}
	public DNode(DNode prev, DNode next, int data) {
		super();
		this.prev = prev;
		this.next = next;
		this.data = data;
	}
	@Override
	public String toString() {
		return data+"";
	}
	
	
}
