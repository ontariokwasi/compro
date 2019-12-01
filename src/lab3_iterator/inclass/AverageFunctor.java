package lab3_iterator.inclass;

public class AverageFunctor implements Functor<Integer,Long>{

	private long total;
	private int count;
	AverageFunctor(){
		total = 0;
		count = 0;
	}
	@Override
	public void compute(Integer element) {
		total += element;
		count ++;
	}

	@Override
	public Long getValue() {
		
		return total/count;
	}


}
