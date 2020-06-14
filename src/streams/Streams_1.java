package streams;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams_1 {

	public static void main(String[] args) {
		//1. generate a stream of odd numbers greater than 10 and less 20
//		//2. Generate a stream for 5 random numbers using the Math.random()
//		//3. use streams to complete the following;
		List<String> fruits = new ArrayList<String>(
				Arrays.asList("Mango", "Pear","Apple", "Avocado"));
//		List<Integer> nums = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
//		//a) give all fruits that begins with 'A' and ends with 'e'
//		//b) give the length of the fruit with minimum character count
//		//c) how many fruits have length of 4;
//		//d) write a stream to merge the fruits list and the nums list.
//		Stream.generate(Math::random);
//		Stream fruitsStream = fruits.stream();
//		Stream numsStream = nums.stream();
//		((List<String>) Stream.concat(fruitsStream, numsStream).
//		collect(Collectors.toCollection(ArrayList::new ))).toArray();
		
//---todo:		//????Use the toArray from streams to convert the above to String Array???
		
		List<Integer>intList = new ArrayList<Integer>(Arrays.asList(3,5,2,3,8));
		Integer[] out = intList.stream().toArray(Integer[]::new);
		System.out.println(Arrays.toString(out));
//		List<int[]> intsArray = intList.stream()
//				.map(int[]::new)
//				.collect(Collectors.toList());
//		List<String> strList = intsArray.stream()
//				.map(Arrays::toString).collect(Collectors.toList());
//		System.out.println(fruits);
////		Collections.sort(fruits, (a,b)->b.compareTo(a));
////		System.out.println(fruits);
//		List<String>fruits1 = fruits.stream().sorted(Comparator.comparing(String::length).thenComparing(x->x)).collect(Collectors.toList());
//		System.out.println(fruits1);
		
//		+++++++++++++++++++++++++++++++++
//		Optional<String> opt = Optional.of(null); // throws nullpointerException
//		Optional<String> opt = Optional.empty(); //this creates an empty optional
		Optional<String> opt = Optional.of("Some value"); //creates an optional for a value
		
		//you can do map, filter, and the likes on optional too
		Optional.of("Reggie").map(r -> r.substring(0,3)).filter(s->s.equals("Reg")).isPresent();
		String value = null;
//		//ispresent
//		if(opt.isPresent())
//			System.out.println(opt.get()); //call get if and only your optional is not empty or you get NoSuchElementException
		
		if(opt.isPresent()) {
			value = opt.get();
			System.out.println(value);
		}
		
		
		//orElse
		value = opt.orElse(getName(2));
		System.out.println(value);
		//orElseGet
		value = opt.orElseGet(()->LocalDate.now().getMonth().
			toString()== "JUNE" ? "Yod":"Reggie");
		System.out.println(value);
		
		//ifPresent with consumer
		opt.ifPresent(s -> {System.out.println(s.length());});
		
		//test optional method
		System.out.println(optionalMethod(0));
		
		System.out.println(LocalDate.now().getMonth().
			toString());
	}
	static String getName(int id) {
		if(id > 0)
			return "Regina";
		else
			return null;
	}
	static Optional<String> optionalMethod(int id){
		String name = getName(id);
//		if(name == null)
//			return Optional.empty();
//		else
//			return Optional.of(name);
		return Optional.ofNullable(name); // incase the value of name might be null::
		//Always use .ofNullable when there is a possibility of null value
	}
}
