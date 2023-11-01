import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        ArrayList<String> toDoList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nTo-Do List Menu:");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. View To-Do List");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter the item to add: ");
                    String newItem = scanner.nextLine();
                    toDoList.add(newItem);
                    System.out.println("Item added to the to-do list.");
                    break;
                case 2:
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter the item to remove: ");
                    String itemToRemove = scanner.nextLine();
                    if (toDoList.remove(itemToRemove)) {
                        System.out.println("Item removed from the to-do list.");
                    } else {
                        System.out.println("Item not found in the to-do list.");
                    }
                    break;
                case 3:
                    if (toDoList.isEmpty()) {
                        System.out.println("To-Do list is empty.");
                    } else {
                        System.out.println("To-Do List:");
                        for (int i = 0; i < toDoList.size(); i++) {
                            System.out.println((i + 1) + ". " + toDoList.get(i));
                        }
                    }
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
