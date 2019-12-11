package lab6_proxy;

public class pThing<T> implements Thing<T> {
	private Thing<T> thing;
	private IFunctor lgfunctor;
	public pThing(Thing<T> thing, IFunctor lgfunctor) {
		this.thing = thing;
		this.lgfunctor = lgfunctor;
	}

	@Override
	public void compute(T string) {
		lgfunctor.pre();
		thing.compute(string);
		lgfunctor.post();
	}

	private void log(String log) {
		System.out.println(log);
	}
}
