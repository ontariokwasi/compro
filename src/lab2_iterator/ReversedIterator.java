package lab2_iterator;

public class ReversedIterator implements MyIterator{
	
	private SwimmersList slist;
	int count;
	public ReversedIterator(SwimmersList slist) {
		this.slist = slist;
		count = slist.getVector().size();
	}
	@Override
	public boolean hasNext() {
		if(count > 0)
			return true;
		return false;
	}

	@Override
	public Object next() {
		count--;
		return slist.getVector().get(count);
	}

}
