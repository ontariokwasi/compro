package lab5_state;
public class Car{
	private Transmission currentGear;
	Car(Mediator mediator){
		this.currentGear = new ParkedGear(mediator);
	}
    public void changeSpeed(int speed){
    	currentGear = currentGear.changeSpeed(speed);
    }
	    
}
    
