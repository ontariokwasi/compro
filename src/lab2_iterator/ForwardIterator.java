package lab2_iterator;

public class ForwardIterator implements MyIterator{
	
	private SwimmersList slist;
	int count;
	public ForwardIterator(SwimmersList slist) {
		this.slist = slist;
		count = 0;
	}
	@Override
	public boolean hasNext() {
		if(count < slist.getVector().size())
			return true;
		return false;
	}

	@Override
	public Object next() {
		count++;
		return slist.getVector().get(count-1);
	}

}
