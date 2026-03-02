/* Isaac St Hubert 03/01/2026 Module 9.2
   This program works with string user input to output a selected item from an ArrayList */

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExceptionDemo {

    public static void main(String[] args) {

        // Create ArrayList with minimum 10 Strings
        ArrayList<String> items = new ArrayList<>();

        items.add("Zero");
        items.add("One");
        items.add("Two");
        items.add("Three");
        items.add("Four");
        items.add("Five");
        items.add("Six");
        items.add("Seven");
        items.add("Eight");
        items.add("Nine");

        // Print ArrayList using for-each loop
        System.out.println("Here are the items in the list:\n");

        for (String item : items) {
            System.out.println(item);
        }

        // Ask user for input
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the index of the element you would like to see again: ");

        // Working with String input
        String userInput = input.nextLine();

        try {
            // Convert String input to Integer
            Integer chosenIndex = Integer.parseInt(userInput); // Autoboxing

            // Attempt to access element
            String selectedItem = items.get(chosenIndex); // Auto-Unboxing

            System.out.println("You selected: " + selectedItem);

        } catch (Exception e) {
            System.out.println("Exception has been thrown: Out of Bounds");
        }

        input.close();
    }
}