package lab3_iterator.example;

import java.util.stream.Stream;

public class CompositeIter2a {

	public static void main(String argv[]) {
		// Build a sample system ...
		Composite tree = new Node("Top").
				add(new Leaf("Data.1")).
				add(new Leaf("Data.2"))
				.add(new Node("Node.A").
						add(new Leaf("Data.A1")).
						add(new Leaf("Data.A2")));

		// ---------- Now print via external iterator..
		System.out.println(">> External:");
		for (Composite c : tree) // Iteration...
			System.out.println(c);

		System.out.println(">> Method:");
		tree.print();

		// ---------- Now do via internal iterator
		System.out.println(">> Internal:");
		Printer printer = new Printer(); // create printing functor
		tree.doAll(printer);
		System.out.println("Tree: " + printer.value());

		// ---------- Again, using accumulator...
		System.out.println(">> Internal + accumulator:");
		Functor<String, Composite> getTree = new Functor<String, Composite>() {
			String tree = "";

			public void compute(Composite c) {
				tree += ":: " + c + "\n";
			}

			public String value() {
				return tree;
			}
		};

		tree.doAll(getTree);
		System.out.println(">> Tree:: \n" + getTree.value());

		// ---------- Now use J8 Streams
		Long c = tree.stream().count();
		System.out.println(">> Tree.stream.count = " + c);

		Stream<Composite> tStream = tree.stream();
		System.out.println(">> tStream -print ::");
		tStream.forEach(e -> e.print());
		// Or;
		System.out.println(">> tStream -print ::");
		tree.stream().forEach(Composite::print);

		// Another Example;
		System.out.println(">> tStream -print short names::");
		tree.stream().filter(e -> e.toString().length() <= 6).forEach(Composite::print); // Or; All "A*" Nodes (only)
		System.out.println(">> tStream -print \"A\" names::");
		tree.stream().filter(s -> (s.toString()).matches(".*A.*")).forEach(Composite::print);

	}
}
