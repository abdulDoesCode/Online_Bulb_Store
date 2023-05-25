package online_light_store;

public class LinkedList extends Bulb{

	LinkedList(int Bulb_ID, String Bulb_name, double Bulb_price, int Quantity) {
		super(Bulb_ID, Bulb_name, Bulb_price, Quantity);
		// TODO Auto-generated constructor stub
	}
	 
	// defining nodes
    Node head;  
    class Node {
        Bulb bulb;
        Node next;

        Node(Bulb bulb) {
            this.bulb = bulb;
            this.next = null;
        }

            // search bulbs node
        public void searchBulb(int bublb_id){
            // if list is empty
            if( head == null) {
                System.out.println("The linked list is empty.");
                return;
            }

            Node current = head;
            // using the same search node method to search and identify node matching bulb_id
            while( current != null && current.bulb.getid() != Bulb_ID) {
                current = current.next;
            }
            // if not found
            if (current == null) {
                System.out.println("Bulb not found.");
                return;
            }
            // if found
            System.out.println("Bulb found:"  + current.bulb.getName());
        }
    }
        // display bulbs node
        public void displayBulbs() {
            // if bulb node not found
            if(head == null) {
                System.out.println("The linked list is empty.");
                return;
            }

            Node current = head;
            // information displayed 
            while (current != null){
                System.out.println("Bulb ID: " + current.bulb.getid());
                System.out.println("Bulb ID: " + current.bulb.getName());
                System.out.println("Bulb ID: " + current.bulb.getPrice());
                
                System.out.println("-------------------------");
                current = current.next;
            }
        }
		public void addBulb(Bulb bulb) {
			// TODO Auto-generated method stub
			 Node newNode = new Node(bulb);
			    
	            if (head == null) {
	                head = newNode;
	            } else {
	                Node current = head;
	                while (current.next != null) {
	                    current = current.next;
	                }
	                current.next = newNode;
	            }
	            System.out.println("Bulb added successfully.");
			
		}
		
		public void delete(int deleteId) {
			// TODO Auto-generated method stub
			if (head == null){
                System.out.println("The linked list is empty.");
                return;
            }
            //head is the first node in the linked list <root node>
            if(head.bulb.getid() == Bulb_ID){
                head = head.next;
                System.out.println("Bulb removed Successfully.");
                return;
            }

            Node current = head;
            Node previous = null; 

            // it runs through the linked list nodes as long as the current is not empty
            // checking if the id is matching or not 
            while ( current != null && current.bulb.getid() != Bulb_ID){
                previous = current;
                current = current.next;
            }
           
            // if current is null then we reached the end and the bulb was not found
             if (current == null){
                System.out.println("Bulb not found.");
                return;
             }

            // when the the bublb_id is found, it updates the next of the previous to the current to remove it from the linked list 
             previous.next = current.next;
             System.out.println("Bulb removed successfully.");
		}

}
