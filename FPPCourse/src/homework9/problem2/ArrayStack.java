package homework9.problem2;

public class ArrayStack implements Stack1 {
	DNode top = null;
	@Override
	public void push(Object ob) {
		if(isEmpty()) {
			DNode n = new DNode(ob);
			top = n;
		}
		else {
			DNode n = new DNode(top, null, ob);
			top.next = n;
			top = n;
		}
		
	}

	@Override
	public Object pop() {
		DNode n = top;
		top = n.previous;
		return n.data;
	}

	@Override
	public Object peek() {
		return top.data;
	}

	@Override
	public boolean isEmpty() {
		if(top == null) return true;
		return false;
	}

	@Override
	public int size() {
		int count = 0;
		DNode n = top;
		while(n != null) {
			n = n.previous;
			count++;
		}
		return count;
	}

}
