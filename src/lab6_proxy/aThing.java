package lab6_proxy;

public class aThing<T> implements Thing<T> {
	private T name;

	aThing(T name){
		this.name = name;
	}
	@Override
	public void compute(T string) {
		System.out.println(string + ": "+ name);

	}

}
