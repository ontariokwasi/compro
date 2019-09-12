package homework4.problem6;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		/*
		 * Test Shallow clone
		 */		
		Computer c1 = new Computer("Lenovo", "corei7", 8, 2.5);
		Person p1 = new Person("Gideon", c1);
		Person p2 = (Person) p1.clone();
		System.out.println(p1);
		System.out.println();
		System.out.println(p2);
		//Change person2's name and computer manufacturer//
		p2.setName("Philip");
		p2.computer.setManufacturer("Apple");
		System.out.println("____________________After modifying P2____________\n");
		System.out.println(p1);
		System.out.println();
		System.out.println(p2);
		
		/*
		 *Test Deep clone 
		 */
		Computer2 c2 = new Computer2("Lenovo", "corei7", 8, 2.5);
		Person2 p3 = new Person2("Gideon", c2);
		Person2 p4 = (Person2) p3.clone();
		System.out.println(p3);
		System.out.println();
		System.out.println(p4);
		//Change person4's name and computer manufacturer//
		p4.setName("Philip");
		p4.computer.setManufacturer("Apple");
		System.out.println("____________________After modifying P4____________\n");
		System.out.println(p3);
		System.out.println();
		System.out.println(p4);

	}

}
