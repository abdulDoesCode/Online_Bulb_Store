package online_light_store;

public class BinarySearchTree extends Bulb{

	BinarySearchTree(int Bulb_ID, String Bulb_name, double Bulb_price, int Quantity) {
		super(Bulb_ID, Bulb_name, Bulb_price, Quantity);
		// TODO Auto-generated constructor stub
	}
	
	Node root;

	   class Node{
	    Bulb bulb;
	    Node left;
	    Node right;

	    Node(Bulb bulb) {
	        this.bulb = bulb;
	        this.left = null;
	        this.right = null;
	    }
	   }

	   public void insert(Bulb bulb) {
	    root = insertRec(root , bulb);
	   }

	   private Node insertRec(Node node, Bulb bulb){
	    if(node == null){
	        return new Node(bulb);
	    }

	    if(bulb.getid() < node.bulb.getid()){
	        node.left = insertRec(node.left , bulb);
	    } else if (bulb.getid() > node.bulb.getid()){
	        node.right = insertRec(node.right, bulb);
	    }
	    return node;
	   }

	   public void delete(int bublid) {
	        root = deleteRec(root, bublid);
	   }

	   private Node deleteRec(Node root, int bulbid){
	    if (root == null){
	        System.out.println("Bulb not found");
	        return null;
	    }

	    if(bulbid < root.bulb.getid()){
	        root.left = deleteRec(root.left, bulbid);
	    } else if (bulbid > root.bulb.getid()){
	        root.right = deleteRec(root.right, bulbid);
	    } else {
	        if(root.left == null){
	            return root.right;
	        } else if (root.right == null){
	            return root.left;
	        }

	        Node minNode = findMinNode(root.right);
	        root.bulb = minNode.bulb;
	        root.right = deleteRec(root.right, minNode.bulb.getid());
	    }

	    return root;
	   }


	   public void search(int bulbid){
	    Node result = searchRec(root,bulbid);
	    if(result == null) { 
	        System.out.println("Bulb not found.");
	    } else {
	        System.out.println("Bulb found: " + result.bulb.getName());
	    }
	   }

	   private Node searchRec(Node root, int bulbid) {
	    if( root == null || bulbid == root.bulb.getid()){
	        return root;
	    } 

	    if (bulbid < root.bulb.getid()){
	        return searchRec(root.left , bulbid);
	    } else {
	        return searchRec(root.right, bulbid);
	    }
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
	            System.out.println("Bulb ID: " + root.bulb.getid());
	            System.out.println("Name: " + root.bulb.getName());
	            System.out.println("Price: " + root.bulb.getPrice());
	            System.out.println("Quantity: " + root.bulb.getQuantity());
	            System.out.println("-------------------------");
	            inorderTraversal(root.right);
	        }
	    }
	    private Node findMinNode(Node node) {
	    while (node.left != null) {
	        node = node.left;
	        }
	    return node;
	    }


}
