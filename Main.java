package online_light_store;
import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
        // Instantiate the data structure class (LinkedList or BinarySearchTree)
        // LinkedList bulbList = new LinkedList(0, null, 0, 0);
        BinarySearchTree bulbtree = new BinarySearchTree(0,null,0,0);
        
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
		bulbtree.insert(new Bulb(random.nextInt(1000), name[i], random.nextInt(20), random.nextInt(10)));
		
	}
        // Display menu and handle user input
        Scanner scanner = new Scanner(System.in);
        int choice;
        do{
            System.out.println("===== Online Bulb Store =====");
            System.out.println("1. Delete a bulb");
            System.out.println("2. Search for a bulb");
            System.out.println("3. Display all bulbs");
            System.out.println("4. Exit");
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
                bulbtree.delete(deleteId);
                break;

            case 2:
                // Prompt the user for the bulb ID to search
                System.out.print("Enter bulb ID to search: ");
                int searchId = scanner.nextInt();

                // Search for the bulb in the data structure
               // or  bulbList.search(searchId);
                bulbtree.search(searchId);
                break;

            case 3:
                // Display all bulbs in the data structure
                //bulbList.display();
                bulbtree.traverse();
                break;

            case 4:
                System.out.println("Exiting the program.");
                break;

            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }

        System.out.println(); // Print a blank line for readability
    } while (choice != 4);

    scanner.close();
}
}
