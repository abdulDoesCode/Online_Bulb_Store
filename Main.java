package online_light_store;
import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
        // Instantiate the data structure class (LinkedList or BinarySearchTree)
        LinkedList bulbList = new LinkedList(0, null, 0, 0);
        BinarySearchTree bulbtree = new BinarySearchTree(null,null);
        
        //creating bulbs 
    	Random random = new Random();
		String[] name = {"New LED USA","Z-light Led","SunLED","Yesco","LEDtron",
		                "Net Zero USA",
		                " Axo Light USA",
		                " Stouch Lighting",
		                 "Titan LED",
		                " Ligman Lighting USA",
		                " Mean the Well USA LED",
		                 "Vanguard LED Displays",
		                 "Edison Opto USA Corporation",
		                 "Patriot Led Tubes",
		                 "Cree LED"};
		
	for(int i = 0;i<10;i++) {
		bulbList.addBulb(new Bulb(random.nextInt(1000), name[i], random.nextInt(20), random.nextInt(10)));
		
	}
        // Display menu and handle user input
        Scanner scanner = new Scanner(System.in);
        int choice;
        do{
            System.out.println("===== Online Bulb Store =====");
            System.out.println("1. Delete a bulb");
            System.out.println("2. Search for a bulb");
            System.out.println("3. Display all bulbs");
            System.out.println("4. Select a bulb");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

         switch (choice) {
            case 1:
                // Prompt the user for the bulb ID to delete
                System.out.print("Enter bulb ID to delete: ");
                int deleteId = scanner.nextInt();

                // Delete the bulb from the data structure
                //bulbList.delete(deleteId);
                bulbList.delete(deleteId);
                break;

            case 2:
                // Prompt the user for the bulb ID to search
                System.out.print("Enter bulb ID to search: ");
                int searchId = scanner.nextInt();

                // Search for the bulb in the data structure
               // or  bulbList.search(searchId);
                bulbList.searchBulb(searchId);
                
                break;

            case 3:
                // Display all bulbs in the data structure
                //bulbList.display();
                bulbList.displayBulbs();
                break;

            case 4:
                
                System.out.println("enter Customer name: ");
                String CustomerName = scanner.nextLine();
                System.out.println("enter Customer Address: ");
                String CustomerAddress = scanner.nextLine();
            	bulbtree.insert(new Customer(CustomerName,CustomerAddress));
                System.out.println("enter ID a bulb to purchase: ");
                int bulbID = scanner.nextInt();
                	bulbtree.traverse();
                	bulbList.searchBulb(bulbID);
                System.out.println("On the way to: " + CustomerName + ", with Address: " +CustomerAddress);
                System.out.println("Thank you for shopping with us");
                	
                break;
            
            case 5:
                System.out.println("Have a great day");
                break;

            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }

        System.out.println(); // Print a blank line for readability
    } while (choice != 5);

    scanner.close();
}
}
