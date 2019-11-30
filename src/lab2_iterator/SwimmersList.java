package lab2_iterator;
import java.util.*;

public class SwimmersList
{
    private Vector slist= new Vector();
    
    public void addSwimmer( Swimmer swimmer){
        slist.addElement(swimmer);
    }
    
    public Vector getVector(){
        return slist;
    }
    public MyIterator getIterator(){
    	return new ForwardIterator(this);
    }
    public MyIterator getIterator(Order order){
    	if(order.equals(Order.REVERSED))
    		return new ReversedIterator(this);
    	return new Above12Iterator(this);
    	
    }
    public enum Order {
    	REVERSED,
    	ABOVE12
    }
}
