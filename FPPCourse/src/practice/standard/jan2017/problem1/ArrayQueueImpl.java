package practice.standard.jan2017.problem1;


public class ArrayQueueImpl {

	private int[] arr = new int[10];
	private int front = -1;
	private int rear = 0;
	
	
	public int peek() throws QueueException {
		if(front == -1) throw new QueueException("Queue is Empty");
		return arr[front];
	}
	
	public void enqueue(int obj){
		if(arr.length == size()) resize();
		arr[rear] = obj;
		if(front < 0) front = 0;
		rear++;
	}
	
	public int dequeue() throws QueueException {
		if(front == -1) throw new QueueException("Queue is Empty");
		int item = arr[front];
		for(int i = 0; i < size(); i++) 
			arr[i] = arr[i+1];
		rear--;
		if(rear == 0) front = -1;
		return item;
	}
	
	public boolean isEmpty(){	
		return front == -1;
	}
	
	public int size(){	
		return rear;
	}
	public void resize() {
		int [] temp = new int [arr.length*2];
		System.arraycopy(arr, 0, temp, 0, arr.length);
		arr = temp;
	}
	
}
