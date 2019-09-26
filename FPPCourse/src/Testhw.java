import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

class Sale {
String item;
double price;
public Sale(String item, double price) {
this.item = item;
this.price = price;
}
}
public class Testhw {
		public static void main(String[] args) {
		ArrayList<Sale> sales = new ArrayList<Sale>();
		sales.add(new Sale("DVD",40));
				NumberFormat currency =
		NumberFormat.getCurrencyInstance();
		fillTheList(sales);
		Sale ob = sales.get(1);
		System.out.println(ob.item + " " + ob.price);
		double total = 0;
		for (Sale sale : sales) {
		if (sale.item.equals("DVD")) {
		total += sale.price;
		}
		}
		System.out.println("Total selleing price of DVD :" + currency.format(total));
		sales.forEach(sale ->{System.out.println(sale.item);});
		
		//
		Hashtable<String, String> hm = new Hashtable<String, String>();
        //add key-value pair to Hashtable
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");
        // hm.put(null,null); Throw run time error - NullPointer Exception
        Iterator it = (Iterator) hm.keys();
        System.out.println("My Hashtable content:");
        System.out.println(hm); // Display the contents by key wise reverse order
        //Checking Keys
        if(hm.containsKey("first")){
            System.out.println("The Hashtable contains key first");
        } else {
            System.out.println("The Hashtable does not contains key first");
        }
        // Checking Value 
        if(hm.containsValue("SECOND INSERTED")){
            System.out.println("The Hashtable contains value SECOND INSERTED");
        } else {
            System.out.println("The Hashtable does not contains value SECOND INSERTED");
        }
        //Clearing Items
        
        System.out.println("Clearing Hashtable:");
        hm.clear();
        System.out.println("Content After clear:");
        System.out.println(hm);
		}
		static void fillTheList(ArrayList<Sale> sales) {
		sales.add(new Sale("DVD", 15.00));
		sales.add(new Sale("Book", 12.00));
		sales.add(new Sale("DVD", 21.00));
		sales.add(new Sale("CD", 5.25));
		}
		}
	