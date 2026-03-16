/* Isaac St Hubert 03/15/2026 Module 3.2
   This program uses nested for loops to display a pyramid of increasing and decreasing values*/

public class NumberPyramid {
    public static void main(String[] args) {

        int rows = 7;

        for (int i = 1; i <= rows; i++) {

            // Loop to print spaces before the numbers to center the pattern
            for (int s = rows; s > i; s--) {
                System.out.print("  ");
            }

            int num = 1;

            // Loop that prints the left side to double each value
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num *= 2;
            }

            // Adjusts number to begin decreasing after the middle number
            num /= 4;

            // Loop that prints the right side to halve each value
            for (int j = 1; j < i; j++) {
                System.out.print(num + " ");
                num /= 2;
            }

            // Print the @ symbol
            System.out.println("@");
        }
    }
}