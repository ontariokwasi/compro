package linkedlist;

public class Main {

	public static void main(String[] args) {
		DNode n1 = new DNode();
		n1.data = 10;
		DNode n2 = new DNode(n1,null,20);
		n1.next = n2;
		DNode n3 = new DNode(n2,null,30);
		n2.next = n3;
		//insert into node
		DNode nn = new DNode(n2,n3,25); //create the new node
		n2.next = nn; //connect the node to n2
		n3.prev = nn; // connect the node to n3;
		
		//System.out.println(nn.prev);
		int sum = 0;
		for(DNode curnode = n1; curnode != null; curnode = curnode.next) {
			System.out.println(curnode);
			sum += curnode.data;
		}
		System.out.println(sum);

	}

}
