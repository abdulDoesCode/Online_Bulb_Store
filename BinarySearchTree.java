package online_light_store;

public class BinarySearchTree extends Customer{

	
	
	BinarySearchTree(String Customer_name, String Customer_address) {
		super(Customer_name, Customer_address);
		// TODO Auto-generated constructor stub
	}
	Node root;

	   class Node{
	    Customer customer;
	    Node left;
	    Node right;

	    Node(Customer customer) {
	        this.customer = customer;
	        this.left = null;
	        this.right = null;
	    }
	   }

	   public void insert(Customer customer) {
	    root = insertRec(root , customer);
	   }

	   private Node insertRec(Node node, Customer customer){
	    if(node == null){
	        return new Node(customer);
	    }

	    if(customer.get_ID() < node.customer.get_ID()){
	        node.left = insertRec(node.left , customer);
	    } else if (customer.get_ID() > node.customer.get_ID()){
	        node.right = insertRec(node.right, customer);
	    }
	    return node;
	   }

	   public void traverse() { 
	    if(root == null) {
	        System.out.println("The binary search tree is empty.");
	    } else {
	        System.out.println("Bulbs in the binary search tree:");
	        inorderTraversal(root);
	    }
	   }
	   private void inorderTraversal(Node root) {
	        if (root != null) {
	            inorderTraversal(root.left);
	            System.out.println("-------------------------");
	            System.out.println("Customer Name: " + root.customer.getName());
	            System.out.println("Customer Address: " + root.customer.getaddress());
	            System.out.println("-------------------------");
	            inorderTraversal(root.right);
	        }
	    }


}
