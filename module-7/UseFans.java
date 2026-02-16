/* Isaac St Hubert 02/15/2026 Module 7.2
   This program displays fan instances */

public class UseFans {

    // Method to display a single Fan (without using toString)
    public static void displayFan(Fan fan) {

        if (fan.isOn()) {
            System.out.println("Status: ON");
            System.out.println("Speed: " + fan.getSpeedString());
        } else {
            System.out.println("Status: OFF");
        }

        System.out.println("Radius: " + fan.getRadius());
        System.out.println("Color: " + fan.getColor());
        System.out.println("");
    }

    // Method to display a collection of Fans using an array
    public static void displayFans(Fan[] fans) {

        for (int i = 0; i < fans.length; i++) {

            System.out.println("Fan #" + (i + 1));
            displayFan(fans[i]);
        }
    }

    // Test code
    public static void main(String[] args) {

        // An array to hold Fan objects
        Fan[] fanCollection = new Fan[4];

        // Fan instances
        fanCollection[0] = new Fan();

        fanCollection[1] = new Fan(Fan.FAST, true, 10, "blue");

        fanCollection[2] = new Fan(Fan.MEDIUM, true, 8, "red");

        fanCollection[3] = new Fan(Fan.SLOW, false, 7, "green");

        // Display a single fan
        System.out.println("Displaying one fan:");
        displayFan(fanCollection[1]);

        // Display all fans in the array
        System.out.println("\nDisplaying all fans in the array:");
        displayFans(fanCollection);
    }
}
