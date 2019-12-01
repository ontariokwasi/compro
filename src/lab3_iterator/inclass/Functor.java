package lab3_iterator.inclass;

public interface Functor <T,R> {
	void compute(T element);
	R getValue();
}
