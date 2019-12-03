package lab3_iterator.inclass;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Vector;
import java.util.function.Predicate;

public class MyVector extends Vector<Integer> {
	long doAll(Functor<Integer, Long> func) {
		Iterator<Integer> it = this.iterator();
		while (it.hasNext()) {
			func.compute(it.next());
		}
		return func.getValue();
	}

	long doAll(Functor<Integer, Long> func, Predicate<Integer> pred) {
		Iterator<Integer> it = this.iterator(pred);
		while (it.hasNext()) {
			func.compute(it.next());
		}
		return func.getValue();
	}

	int extSelSum(Predicate<Integer> pred) {
		int total = 0;
		Iterator<Integer> it = this.iterator(pred);
		while (it.hasNext()) {
			total += it.next();
		}
		return total;
	}

	int extSelAverage(Predicate<Integer> pred) {
		int total = 0;
		int count = 0;
		Iterator<Integer> it = this.iterator(pred);
		while (it.hasNext()) {
			total += it.next();
			count++;
		}
		return total / count;
	}

	public Iterator<Integer> iterator(Predicate<Integer> pred) {
		class MyIterator implements Iterator<Integer> {
			private Integer nextItem = null;
			Iterator<Integer> pIterator = iterator();

			@Override
			public boolean hasNext() {
				if(nextItem != null)
					return true;
				while(pIterator.hasNext()) {
					int item = pIterator.next();
					if(pred.test(item)) {
						nextItem = item;
						return true;
					}
				}
				return false;
			}

			@Override
			public Integer next() {
				if (nextItem != null) {
					Integer returnitem = nextItem;
					nextItem = null;
					return returnitem;
				}
				throw new NoSuchElementException();
			}

		}

		return new MyIterator();
	}
	public Iterable<Integer> filter(Predicate<Integer> pred){
		
		return new View(this, pred);
	}

}
