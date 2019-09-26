package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Misc {

	public static void main(String[] args) {
		// method calls test
		List<String> Alist = new ArrayList<String>();
		List<String> Llist = new LinkedList<String>();
		Stack<String> stack = new Stack<String>();
		Queue<String> queue = new LinkedList<String>();
		Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>();
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		
		//add object method
		Alist.add("Hello");
		Llist.add("hello");
		stack.push("Hello");
		queue.offer("Hello");
		hashtable.put(1, "Hello");
		hashmap.put(1, "Hello");
		
		//see next
		System.out.println(Alist.get(0));
		System.out.println(Llist.get(0));
		System.out.println(stack.peek());
		System.out.println(queue.peek());
		System.out.println(queue.element());
		System.out.println(hashtable.get(1));
		System.out.println(hashmap.get(1));
		
		//remove 
		System.out.println(Alist.remove("Hello"));
		System.out.println(Llist.remove("Hello"));
		System.out.println(stack.pop());
		System.out.println(queue.poll());
		System.out.println(hashmap.remove(1));
		System.out.println(hashtable.remove(1));
	}
}
