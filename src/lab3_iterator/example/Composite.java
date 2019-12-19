package lab3_iterator.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public abstract class Composite implements Iterable<Composite> {
	String name;

	void print() { System.out.println(this); } 
	abstract void print(String indent);
	// default iterator (for leaf nodes), is single element; this!
	// thisi s the base-case for the object iteration over a composite structure 
	public Iterator<Composite> iterator() {
	List<Composite> lc = new ArrayList<Composite>();
	lc.add(this); // Also include the composite (Leaf) itself as a component! 
		return lc.iterator();
	}
	// internal iterator;
	// broadcast & delegate
	void doAll(Functor<?,Composite> f) {
	// This assumes an "external" iterator that does all the work 
		for (Composite c : this) // Iteration...
			f.compute(c);
	}
	public Stream<Composite> parallelStream() {
		return StreamSupport.stream(this.spliterator(), true);
		}
	
	public Stream<Composite> stream() {
		return StreamSupport.stream(this.spliterator(), false); }
}
