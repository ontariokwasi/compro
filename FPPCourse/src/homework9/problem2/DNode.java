package homework9.problem2;

public class DNode {
	DNode previous;
	DNode next;
	Object data;
	public DNode(Object data) {
		this(null,  null,  data);
	}
	public DNode(DNode previous, DNode next, Object data) {
		this.previous = previous;
		this.next = next;
		this.data = data;
	}
	
}
