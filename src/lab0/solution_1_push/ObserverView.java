package lab0.solution_1_push;

public abstract class ObserverView extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Counter counter;
	public ObserverView(Counter counter) {
		this.counter = counter;
	}
	public void update() {
		setCount(counter.getcount());
	}
	public abstract void setCount (int cnt);

}
