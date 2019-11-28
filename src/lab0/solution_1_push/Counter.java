package lab0.solution_1_push;

import java.util.ArrayList;
import java.util.List;

public class Counter
{
    private List<ObserverView> observers;
    private int count;

    public Counter (){
        count = 0;
        observers = new ArrayList<ObserverView>();
    }
    
    public void increment(){
        count++;
        updateObserver();
    }
    
    public void decrement(){
        if (count >0){
            count--;
            updateObserver();
        }
    }
    
    public void updateObserver() {
    	observers.forEach(observer -> observer.update());
    }
    
    public void addObserver(ObserverView observer) {
    	this.observers.add(observer);
    }
    
    public int getcount() {
    	return count;
    }
}