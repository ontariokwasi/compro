package homework9.problem2;

public class ArrayStackDemo {

	public static void main(String[] args) {
		ArrayStack stk = new ArrayStack(); // create stack of size 4
		Object item;
		stk.push('A'); // push 3 items onto stack
		stk.push('B');
		stk.push('C');
		stk.push('D');
		
		System.out.println("size(): "+ stk.size());
		item = stk.pop(); // delete item
		System.out.println(item + " is deleted");
		stk.push('D'); // add three more items to the stack
		stk.push('E');
		System.out.println(stk.pop() + " is deleted");
		stk.push('G'); // push one item
		item = stk.peek(); // get top item from the stack
		System.out.println(item + " is on top of stack");
		System.out.println("Size of the Stack : " + stk.size());

	}

}
