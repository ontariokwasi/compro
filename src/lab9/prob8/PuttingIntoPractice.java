package lab9.prob8;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import sun.security.pkcs11.wrapper.Functions;

public class PuttingIntoPractice{
    public static void main(String ...args){    
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
		
		List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300), 
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),	
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
        );	
        
        
        // Query 1: Find all transactions from year 2011 and sort them by value (small to high).
		List<Transaction> transactionsfrom = transactions.stream()
				.filter(t -> t.getYear() >= 2011)
				.sorted((t1, t2) -> ((Integer)t1.getValue()).compareTo(t2.getValue()))
				.collect(Collectors.toList());
		System.out.println(transactionsfrom);
			

        
        // Query 2: What are all the unique cities where the traders work?
        String uniqueCity = Stream.of(raoul,mario,alan, brian)
        		.map(t -> t.getCity())
        		.distinct()
        		.collect(Collectors.joining(", "));
        System.out.println(uniqueCity);
        
		
        
        // Query 3: Find all traders from Cambridge and sort them by name.
        List<Trader>fromCambridge = Stream.of(raoul,mario,alan, brian)
        		.filter(t -> t.getCity().equals("Cambridge"))
        		//.sorted((t1, t2) -> t1.getName().compareTo(t2.getName()))
        		.sorted(Comparator.comparing(Trader::getName))
        		.collect(Collectors.toList());
        System.out.println(fromCambridge);
        
   
        
        // Query 4: Return a string of all traders names sorted alphabetically.
        String allTraders = Stream.of(raoul,mario,alan, brian)
        		.map(t -> t.getName())
        		.sorted((t1, t2) -> t1.compareTo(t2))
        		.collect(Collectors.joining(", "));
        System.out.println(allTraders);
        

        // Query 5: Are there any trader based in Milan?
        Optional<String> milan = Stream.of(raoul,mario,alan, brian)
        		.map(t -> t.getCity())
        		.filter(c -> c.equalsIgnoreCase("Milan"))
        		.findAny();
        System.out.println("Milan based: "+milan.isPresent());
        
        
   
     // Query 6: Update all transactions so that the traders from Milan are set to Cambridge.
        transactions.stream()
        .filter(t -> t.getTrader().getCity().equalsIgnoreCase("Milan"))
        .forEach(t -> t.getTrader().setCity("Cambridge"));
        System.out.println(transactions);
        
        
        // Query 7: What's the highest value in all the transactions?
        int maxvalue = transactions.stream()
        		.map(t -> t.getValue())
        		.max((v1, v2) -> v1.compareTo(v2)).get();
        System.out.println(maxvalue);
        
        //System.out.println(transactions.stream().collect(Collectors.summarizingInt(Transaction::getValue)).getMax());
    }
}
