/* Isaac St Hubert 02/22/2026 Module 8.2
   This program accepts integers and displays the largest value */

import java.util.ArrayList;
import java.util.Scanner;

public class IsaacArrayListTest {

    // Method that returns the largest value in the ArrayList
    public static Integer max(ArrayList list) {

        // If list is empty, return 0
        if (list == null || list.size() == 0) {
            return 0;
        }

        // Assume first element is the largest
        Integer largest = (Integer) list.get(0);

        // Loop through the list
        for (int i = 1; i < list.size(); i++) {
            Integer current = (Integer) list.get(i);

            if (current > largest) {
                largest = current;
            }
        }

        return largest;
    }

    // Main method for testing
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (0 to stop):");

        Integer value;

        do {
            value = input.nextInt();
            numbers.add(value);
        } while (value != 0);

        // Send ArrayList to max method
        Integer LargestValue = max(numbers);

        System.out.println("The largest value in the ArrayList is: " + LargestValue);

        input.close();
    }
}