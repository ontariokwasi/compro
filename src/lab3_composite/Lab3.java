package lab3_composite;
public class Lab3 {
    static public void main(String args[]) {
    	
        Cabinet cab = new Cabinet(400, 20);
        Board board = new Board(300, 10);

        Drive d1= new Drive(250, 20);
        Drive d2= new Drive(200, 10);
        Drive d3= new Drive(230, 30);
        Bus bus = new Bus(400, 10);

        Card card1 = new Card(100, 20);
        Card card2 = new Card(300, 50);
        Card card3 = new Card(240, 40);
        
        board.addBoardComponent(card1);
        board.addBoardComponent(card2);
        board.addBoardComponent(card3);
        board.addBoardComponent(bus);

        cab.addComponent(board);
        cab.addComponent(d1);
        cab.addComponent(d2);
        cab.addComponent(d3);

      
        
        System.out.println("Total price of computer is: "+ cab.computePrice());
    }
}
