/* Isaac St Hubert 03/01/2026 Module 9.2
   This program creates and appends randomly generated integers to a data file and displays its contents */

import java.io.*;
import java.util.*;

public class DataFileWriter {

    public static void main(String[] args) {

        File file = new File("data.file");

        try {
            // Open file in append mode (true = append)
            PrintWriter output = new PrintWriter(new FileWriter(file, true));

            // Generate and write 10 random integers
            for (int i = 0; i < 10; i++) {
                int number = (int)(Math.random() * 100);
                output.print(number + " ");
            }

            output.close();

            // Reopen file to read contents
            Scanner input = new Scanner(file);

            System.out.println("Contents of data.file:");
            while (input.hasNext()) {
                System.out.print(input.next() + " ");
            }

            input.close();

        } catch (IOException ex) {
            System.out.println("An error occurred: " + ex.getMessage());
        }
    }
}