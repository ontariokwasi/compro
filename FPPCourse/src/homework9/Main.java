package homework9;

public class Main {

	public static void main(String[] args) {
		ArrayQueueImpl arq = new ArrayQueueImpl();
		//enqueue 20
		for(int i = 0; i < 20; i++) {
			arq.enqueue(i);
		}
		System.out.println("Size: "+arq.size());
		System.out.println("Peek: "+arq.peek());
		System.out.println("Size: "+arq.size());
		System.out.println("Dequeue: "+arq.dequeue());
		System.out.println("Size: "+arq.size());
		System.out.println("Peek: "+arq.peek());
		//arq.enqueue(100);
		
		//remove 20 items from the queue
		int n =  arq.size();
		for(int i = 0; i < n; i++)
			System.out.println(i+"=>Dequeue: "+arq.dequeue());
		System.out.println("Peek: "+arq.peek());
		System.out.println("Size: "+arq.size());
		System.out.println("Dequeue: "+arq.dequeue());
	}

}
