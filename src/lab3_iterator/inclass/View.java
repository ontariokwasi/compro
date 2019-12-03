package lab3_iterator.inclass;

import java.util.Iterator;
import java.util.function.Predicate;

public class View implements Iterable<Integer>{
	private MyVector myVector;
	private Predicate<Integer> pred;
	public View(MyVector mv, Predicate<Integer> pred) {
		this.myVector = mv ;
		this.pred = pred;
	}

	@Override
	public Iterator<Integer> iterator() {
		return myVector.iterator(pred);
	}
}
