package lab3_iterator.inclass;

import java.util.Iterator;
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
		Iterator<Integer> it = this.iterator();
		while (it.hasNext()) {
			int item = it.next();
			if(pred.test(item))
				func.compute(item);
		}
		return func.getValue();
	}

	int extSelSum() {
		int total = 0;
		Iterator<Integer> it = this.iterator();
		while (it.hasNext()) {
			int item = it.next();
			if (item > 2)
				total += item;
		}
		return total;
	}

	int extSelAverage() {
		int total = 0;
		int count = 0;
		Iterator<Integer> it = this.iterator();
		while (it.hasNext()) {
			int item = it.next();
			if (item > 2) {
				total += item;
				count++;
			}
		}
		return total / count;
	}

}
