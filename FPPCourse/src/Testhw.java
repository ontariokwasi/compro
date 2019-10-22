import java.util.HashMap;

public class Testhw {
	private int[] arr = new int[2];
	private int front = -1;
	private int rear = 0;

	public int peek() {
		if (isEmpty() == true) {
			return -1;
		}
		int tmp = arr[front];
		return tmp;
	}

//implement}
	public void enqueue(int obj) { // implement
		if (rear == arr.length - 1) {
			resize();
		}
		arr[rear] = obj;
		rear++;
		if (front == -1) {
			front = 0;
		}
	}

	public int dequeue() {
		if (front == -1) {
			return -1;
		}
		int tmp = arr[front];
		front++;
		return tmp;
	}

	public boolean isEmpty() {
		if (rear == 0) {
			return true;
		}
		return false;
	}

	public int size() {
		if (front == -1) {
			return 0;
		} else {
			int k = 0;
			int n = front;
			while (n != rear) {
				k++;
				n++;
			}
			return k;
		}
	}

	private void resize() {
		if (rear == arr.length - 1) {
			int[] newarr = new int[arr.length * 2];
			System.arraycopy(arr, 0, newarr, 0, arr.length);
			arr = newarr;
		}
	}

	public void print() {
		if (front == -1) {
			return;
		}
		int g = front;
		while (g != rear) {
			System.out.println(arr[g]);
			g++;
		}
	}

	public static void main(String[] args) {
		Testhw x = new Testhw();
		x.enqueue(5);
		
		System.out.println(x.dequeue());
		System.out.println(x.isEmpty());
		System.out.println(x.size());
		x.print();
		HashMap<String, String> map = new HashMap<String, String>();
	}
}