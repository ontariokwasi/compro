package inclass.lesson9;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	// Use Comparator.comparing and thenComparing to sort
	// the list by balance and then by ownerName
	// Collect your stream into a list and print the sorted
	// result to the console
	public static void main(String[] args) {
		List<Account> accounts = new ArrayList<Account>() {
			{
				add(new Account("Bob", 5000, 1001));
				add(new Account("Jim", 10000, 1002));
				add(new Account("Bruce", 5300, 1003));
				add(new Account("Li", 12000, 1004));
				add(new Account("Sam", 9000, 1005));
				add(new Account("Rick", 11000, 1006));
			}
		};

		// sorting code here
		List<Account> acc = accounts.stream()
				.sorted(Comparator.comparing(Account::getBalance).thenComparing(Account::getOwnerName))
				.collect(Collectors.toList());
		System.out.println(acc);
		
		//try optional
		Optional<Account> opt = accounts.stream()
				.sorted(Comparator.comparing(Account::getBalance).thenComparing(Account::getOwnerName))
				.findAny();
		System.out.println(opt.orElse(null));
		
		//
		String red = Stream.of("A","good","day","to","write","some","java")
				.reduce((x,y) -> x+" "+y).get();
		System.out.println(red);
		
		System.out.println(Stream.of("A","good","day","to","write","some","java").collect(Collectors.joining(" ")));

	}

}
