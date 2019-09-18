package Lesson8;

import java.util.*;

public class ArrayListAPIDemo {
	
	public static void main(String [] args) {
		//ADT - Abstract Data Type
		//Parameterized Type for String
		List <Shopping> list = new ArrayList<>();
		list.add(new Shopping("Samsung Tab",455.99));
		list.add(new Shopping("Apple ipad",1455.99));
		list.add(new Shopping("Mac Book",520.99));
		list.add(new Shopping("Chrome book",455.99));
		list.add(new Shopping("Samsung S9+",455.99));
		System.out.println(list.size());
		
		/*for(Shopping s : list)
			if(s.getPrice() > 500)
				System.out.println(s);
		
		//sorting
		List <String> plist = new ArrayList<>(Arrays.asList("Kotlin","Java","C","Python"));
		//print List
		System.out.println("Before Sorting "+ plist);
		Collections.sort(plist);
		System.out.println("After Sorting "+plist);
		
		//reversed sorting
		Collections.sort(plist, Collections.reverseOrder());
		System.out.println("After Sorting "+plist);*/
		
		Collections.sort(list, new NameComparator());//using anonymous;
		System.out.println(list);
		
		//using lambda sorting by price
		
		Collections.sort(list, (o1, o2)->{return (int) (o1.getPrice() - o2.getPrice());});
		System.out.println(list);
	}
}
