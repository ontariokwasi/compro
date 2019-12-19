package lab3_iterator.example;

class Leaf extends Composite {
	String data;

	Leaf(String text) {
		data = text;
	}

	public void print() {
		print("");
	}

	public void print(String indent) {
		System.out.println(indent + data);
	}

	public String toString() {
		return data;
	}
}
