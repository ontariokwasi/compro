package lab3_iterator.example;

interface Functor<R, T> {
	void compute(T c);

	R value();
}
//Hmm, not much interesting to do with our data!
//If we had a Functor with an additional indent level argument, // we could print it nicer...
//But that is unusual...