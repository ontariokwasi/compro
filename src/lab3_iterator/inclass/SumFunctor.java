package lab3_iterator.inclass;

public class SumFunctor implements Functor<Integer,Long>{

	private long total;
	SumFunctor(){
		total = 0;
	}
	@Override
	public void compute(Integer element) {
		total += element;
	}

	@Override
	public Long getValue() {
		
		return total;
	}

}
