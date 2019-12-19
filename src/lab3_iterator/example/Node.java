package lab3_iterator.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Node extends Composite {
	String data;
	List<Composite> parts = new ArrayList<Composite>();

// Some convenience constructors... 
	Node(String name) {
		data = name; // perhaps encapsulate this in a node, and add it?
	}

	Node(Composite c) {
		parts.add(c);
	}

	Node add(Composite c) {
		parts.add(c);
		return (this); // chaining...
	}

// user methods
	public void print() {
		print("");
	}

	public void print(String indent) {
		System.out.println(indent + data);
		for (Composite c : parts)
			c.print(indent + " "); // Increase indent at elach level
	}

	public String toString() {
		return data;
	}

//
	public Iterator<Composite> iterator() {
		return new myIterator(parts);
	}

	class myIterator implements Iterator<Composite> {

		Iterator<Composite> main, sub;
		Composite Cp;

		myIterator(List<Composite> Cs) {
			main = Cs.iterator();
			if(main.hasNext())
				sub = main.next().iterator();
			else 
				sub = (new ArrayList<Composite>()).iterator();
		}

		@Override
		public boolean hasNext() {
			if (sub.hasNext())
				return true;
			else if (main.hasNext()) {
				sub = main.next().iterator();
				return hasNext();
			} else
				return false;
		}

		@Override
		public Composite next() {
			return sub.next();
		}

		public void remove() {
			main.remove();
		}


	}
}
