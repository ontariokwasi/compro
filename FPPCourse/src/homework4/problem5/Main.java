package homework4.problem5;

public class Main {

	public static void main(String[] args) {
		Computer c1 = new Computer("HP","IntelCore i7", 1024, 2.5);
		Computer c2 = new Computer("HP","IntelCore i7", 1024, 2.5);
		Computer c3 = new Computer("Dell","IntelCore i7", 1024, 2.5);
		/*Computer [] computers = {c1, c2, c3};
		for(Computer comp : computers) {
			System.out.println(comp); // test toString
		}*/
		
		//Test computer power
		System.out.println("Computer Power: "+c1.computePower());
		
		//Test toString
		System.out.println(c1);
		
		//Test equals
		System.out.println("c1==c2? "+c1.equals(c2));
		System.out.println("c1==c3? "+c1.equals(c3));
		
		//Test hashes
		System.out.println("Hash of c1: "+c1.hashCode());
		System.out.println("Hash of c2: "+c2.hashCode());
		System.out.println("Hash of c3: "+c3.hashCode());

	}

}
