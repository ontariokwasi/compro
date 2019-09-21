package bst;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;
// Demo code for the user implemenation of Binary search tree
public class MyBST {
	/** The tree root. */
	private BinaryNode root;
	private int size = 0;

	public MyBST() {
		root = null;
	}
	
	/**
	* Prints the values in the nodes of the tree
	* in sorted order. Inorder Traversal
	*/
	public void printTree() {
		if( root == null )
			System.out.println( "Empty tree" );
		else
			printTree(root);
	}
	// Inorder Traversal to print the nodes in Ascending order
	private void printTree( BinaryNode t ){
		if( t != null ){
			
			printTree( t.left );
			System.out.print(t.element+",");
		    printTree( t.right );
		} 
	}
	
	public void preOrder() {
		if( root == null )
			System.out.println( "Empty tree" );
		else
			preOrder(root);
	}
	// Preorder Traversal to print the nodes
	private void preOrder( BinaryNode t ){
		if( t != null ){
			
			System.out.print(t.element+",");
			preOrder( t.left );		    
			preOrder( t.right );		    
		} 
	}
	
	public void postOrder() {
		if( root == null )
			System.out.println( "Empty tree" );
		else
			postOrder(root);
	}
	// PostOrder Traversal to print the nodes 
	private void postOrder( BinaryNode t ){
		if( t != null ){
			
			postOrder( t.left );
			postOrder( t.right );
		    System.out.print(t.element+",");
		} 
	}
	// contains
	public boolean contains(Integer key){ 
		if( root == null )
			return false;
		else
			return contains(root, key);
	}
	
	private boolean contains(BinaryNode t, Integer key) {
		//boolean found = false;
		if(t == null) 
			return false;
		if(t.element.equals(key)) 
			return true;
		if(t.element < key) 
			return contains(t.right, key);
		else 
			return contains(t.left, key);
	}
	
	//get root element
	public Integer getRoot(){
		return root.element;
	}
	
	//count all leafNodes
	int count = 0;
	public Integer leafNodes(){
		return leafNodes(root);
		}
	private int leafNodes(BinaryNode t){
		
		if(t == null) return count;
		if( t.left == null && t.right == null ){
			++count;	    
		}
		else {
			leafNodes( t.left );		    
			leafNodes( t.right);	
		}
		return count;
		
	}
	
	
	//
	public int size(){
		return size;
	}
	public boolean isEmpty(){
		return (root == null);
	} 
	//
	public Integer findMin() {
		return findMin(root);
	}

	private Integer findMin(BinaryNode t){
		if(t.left != null)
			return findMin(t.left);
		else 
			return t.element;
	}
	public Integer findMax() {
		return findMax(root);
	}

	private Integer findMax(BinaryNode t){
		if(t.right != null)
			return findMax(t.right);
		else 
			return t.element;
	}
	
	//Assume the data in the Node is an Integer.	
	
	public void insert(Integer x) {
		if (root == null) {
			root = new BinaryNode(x);
			size++;
			return;
		}
		else { 
			BinaryNode n = root;
			boolean inserted = false;

			while(!inserted)//true
				{
				if(x.compareTo(n.element)<0) {
					//space found on the left
					if(n.left == null){
						n.left = new BinaryNode(x,null,null);
						inserted = true;
						size++;
					}
					//keep looking for a place to insert (a null)
					else {
						n = n.left;
					}
				}				
				else if(x.compareTo(n.element)>0){ 
					//space found on the right					
					if(n.right==null){
					n.right = new BinaryNode(x,null,null);
					inserted = true;
					size++;
					}
						//keep looking for a place to insert (a null)
					else {
							n = n.right;
					}
										
				}
				// if a node already exists
				else {
					inserted = true;
				}

			}

		}
	}
	private class BinaryNode {

		private Integer element;// The data in the node
		private BinaryNode left;      // Left child
		private BinaryNode right;     // Right child	  
		// Constructors 
		
		BinaryNode( Integer theElement ){
			this( theElement, null, null );
		}	

		BinaryNode( Integer element, BinaryNode left, BinaryNode right ){
			this.element = element;
			this.left = left;
			this.right = right;
		}
		
	}
		

	public static void main(String[] args) {
		
		MyBST mybst = new MyBST();
		
		System.out.println("Before Insert,isEmpty? "+mybst.isEmpty());
		int [] a = {15, 12, 9, 56, 1, 16, 19, 22, 3, 100, 2, 25};
		//int [] a = {43,15,60,8,30,50,82,20,35,70};
	
		for (int j = 0; j < a.length; j++ ) {
			mybst.insert(a[j]);
					
		}
		System.out.println("After insertion, isEmpty? "+mybst.isEmpty());
		//mybst.insert(12);
		System.out.print("\nInOrder: ");
		mybst.printTree();
		System.out.print("\nPreOrder: ");
		mybst.preOrder();
		System.out.print("\nPostOrder: ");
		mybst.postOrder();
		System.out.println("\n\nContains 82: "+mybst.contains(82));
		System.out.println("Contains 9: "+mybst.contains(9));
		System.out.println("Leaf Nodes: "+mybst.leafNodes());
		System.out.println("Size: "+mybst.size());
		System.out.println("Min. Value: "+mybst.findMin());
		System.out.println("Max. Value: "+mybst.findMax());
		/*
		 * TreeSet<Integer> ts = new TreeSet<Integer>();
		 * 
		 * for (int j = 0; j < a.length; j++ ) { ts.add(a[j]);
		 * System.out.println("\nAfter inserting " + j + "th item " + a[j]);
		 * Iterator<Integer> it = ts.iterator(); Integer nextItem = null;
		 * while(it.hasNext()) { nextItem = it.next(); System.out.print(nextItem + " ");
		 * } System.out.println(); }
		 * 
		 * TreeMap<Integer, String> map = new TreeMap<Integer, String>(); map.put(8,
		 * "Hello"); map.put(10, "World!"); map.put(11, "Welcome"); map.remove(8);
		 * String str = map.get(11)+", "+ map.get(10); System.out.println(str);
		 */
			
	}
}