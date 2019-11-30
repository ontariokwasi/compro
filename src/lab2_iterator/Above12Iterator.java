package lab2_iterator;

public class Above12Iterator implements MyIterator{
	
	private SwimmersList slist;
	int count;
	public Above12Iterator(SwimmersList slist) {
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
		if(((Swimmer)slist.getVector().get(count-1)).getAge() >= 12)
			return slist.getVector().get(count-1);
		return next();
	}

}
