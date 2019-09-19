package homework9.problem1;

public class ArrayQueueImpl {
	private int[] arr = new int[10];
	private int front = -1;
	private int rear = 0;

	public int peek() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		return arr[front];
	}

	public void enqueue(int obj) {
		//check for limit
		if(arr.length <= size()) resize();
		arr[rear] = obj;
		rear++;
		if(front == -1) front++;
	}

	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		int num = arr[front];
		for(int i = 0; i <size()-1; i++)
			arr[i] = arr[i+1]; //shifting forward
		if(rear-1 == front) front = -1;
		else
		rear--;
		return num;
	}

	public boolean isEmpty() {
		return (front == -1);
	}

	public int size() {
		return rear;
	}

	private void resize() {
		int [] temp = new int[size()+4]; //add four extra spaces
		System.arraycopy(arr, front, temp, front, size());
		arr = temp;
	}
}