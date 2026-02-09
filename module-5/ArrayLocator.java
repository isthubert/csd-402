/* Isaac St Hubert 02/08/2026 Module 5.2
   This program returns a one-dimensional array containing the row and column of the largest and smallest element */

public class ArrayLocator {

    // Locate largest element in double array
    public static int[] locateLargest(double[][] arrayParam) {
        int row = 0;
        int col = 0;
        double largest = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        return new int[]{row, col};
    }

    // Locate largest element in int array
    public static int[] locateLargest(int[][] arrayParam) {
        int row = 0;
        int col = 0;
        int largest = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        return new int[]{row, col};
    }

    // Locate smallest element in double array
    public static int[] locateSmallest(double[][] arrayParam) {
        int row = 0;
        int col = 0;
        double smallest = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        return new int[]{row, col};
    }

    // Locate smallest element in int array
    public static int[] locateSmallest(int[][] arrayParam) {
        int row = 0;
        int col = 0;
        int smallest = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        return new int[]{row, col};
    }

    // Main method to test
    public static void main(String[] args) {

        double[][] doubleArray = { {3.2, 7.4, 2.1}, {5.8, 1.3, 9.6} };

        int[][] intArray = { {3, 7, 2}, {5, 1, 9} };

        int[] largestDouble = locateLargest(doubleArray);
        int[] smallestDouble = locateSmallest(doubleArray);

        int[] largestInt = locateLargest(intArray);
        int[] smallestInt = locateSmallest(intArray);

        System.out.println("Largest double: [" + largestDouble[0] + "][" + largestDouble[1] + "]");
        System.out.println("Smallest double: [" + smallestDouble[0] + "][" + smallestDouble[1] + "]");

        System.out.println("Largest int: [" + largestInt[0] + "][" + largestInt[1] + "]");
        System.out.println("Smallest int: [" + smallestInt[0] + "][" + smallestInt[1] + "]");
    }
}
