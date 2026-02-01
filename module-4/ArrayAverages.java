/* Isaac St Hubert 02/01/2026 Module 4.2
   This program displays the original array elements and calculates and displays the averages */

public class ArrayAverages {

    // Calculate averages

    public static short average(short[] array) {
        short sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return (short) (sum / array.length);
    }


    public static int average(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return (int) (sum / array.length);
    }


    public static long average(long[] array) {
        long sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum / array.length;
    }


    public static double average(double[] array) {
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum / array.length;
    }

    public static void main(String[] args) {

        // Arrays elements

        short[] shortArray = {1, 2, 3, 4};
        int[] intArray = {5, 10, 15, 20};
        long[] longArray = {100, 200, 300, 400, 500};
        double[] doubleArray = {2.2, 4.2, 6.2, 8.2, 10.2, 12.2};

        // Display arrays and averages

        System.out.print("Short Array: ");
        for (int i = 0; i < shortArray.length; i++) {
            System.out.print(shortArray[i] + " ");
        }
        System.out.println("\nAverage: " + average(shortArray) + "\n");


        System.out.print("Int Array: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println("\nAverage: " + average(intArray) + "\n");


        System.out.print("Long Array: ");
        for (int i = 0; i < longArray.length; i++) {
            System.out.print(longArray[i] + " ");
        }
        System.out.println("\nAverage: " + average(longArray) + "\n");


        System.out.print("Double Array: ");
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.print(doubleArray[i] + " ");
        }
        System.out.println("\nAverage: " + average(doubleArray));
    }
}
