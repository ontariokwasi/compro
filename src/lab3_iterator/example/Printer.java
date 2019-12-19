package lab3_iterator.example;

public class Printer implements Functor<Integer, Composite> {
	protected int count;

// protected String indent;
	public Integer value() {
		return count;
	}

	public void compute(Composite c) {
		System.out.println(c);
		count++;
	}
}