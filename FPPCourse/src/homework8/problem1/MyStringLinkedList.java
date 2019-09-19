package homework8.problem1;

public class MyStringLinkedList {
	Node header;

	MyStringLinkedList() {
		header = null;
	}
           	
	public void addSort(String item){ 
         // Implement
         }  // insert in a Sorted Order
	
	public int size(){
		return 0; 
        // Implement
	 }

	public boolean isEmpty(){
		return false;
	// Implement
	}  

	public Node getFirst(){
		return header;
	// Implement
	}

	public Node getLast(){
		return header;
	// Implement
	}

        public boolean contains(String item){
			return false;
	// Implement
	}  

	public void removeFirst(){
	// Implement
	}

        void removeLast(){
	// Implement
	}
        public void print(){
           print(header);
        } 
	
	//Write a recursive print method to display the elements in the list. 
	void  print(Node n) {
	}

	public String toString() {
		String str =""; 
		Node temp = header;
		while (temp != null) {
			str = str + "-->[" + temp.value.toString() + "]";
			temp = temp.next;
		}
		str = str + "-->[" + "NULL" + "]";
		return str;
	}
}