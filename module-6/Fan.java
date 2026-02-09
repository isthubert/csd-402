/* Isaac St Hubert 02/08/2026 Module 6.2
   This program displays the values of a fan using the default and argument constructor after using setters and getters */

public class Fan {

    // Constants
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // No argument constructor
    public Fan() {
        speed = STOPPED;
        on = false;
        radius = 6;
        color = "white";
    }

    // Argument constructor
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getters
    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    // Setters
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString method
    public String toString() {
        String speedString;

        switch (speed) {
            case STOPPED:
                speedString = "STOPPED";
                break;
            case SLOW:
                speedString = "SLOW";
                break;
            case MEDIUM:
                speedString = "MEDIUM";
                break;
            case FAST:
                speedString = "FAST";
                break;
            default:
                speedString = "UNKNOWN";
        }

        if (on) {
            return "Fan is ON\n"
                    + "Speed: " + speedString + "\n"
                    + "Radius: " + radius + "\n"
                    + "Color: " + color;
        } else {
            return "Fan is OFF\n"
                    + "Radius: " + radius + "\n"
                    + "Color: " + color;
        }
    }

    public static void main(String[] args) {

        // Fan using default constructor
        Fan fan1 = new Fan();

        // Fan using argument constructor
        Fan fan2 = new Fan(FAST, true, 10, "blue");

        // Display default fan
        System.out.println("Fan 1 (Default Constructor):");
        System.out.println(fan1);
        System.out.println();

        // Display argument fan
        System.out.println("Fan 2 (Argument Constructor):");
        System.out.println(fan2);
        System.out.println();

        // Modify fan1 using setters
        fan1.setOn(true);
        fan1.setSpeed(MEDIUM);
        fan1.setRadius(8);
        fan1.setColor("red");

        // Display modified fan1
        System.out.println("Fan 1 after using setters:");
        System.out.println(fan1);
        System.out.println();

        // Demonstrate getters
        System.out.println("Fan 2 speed (getter): " + fan2.getSpeed());
        System.out.println("Fan 2 color (getter): " + fan2.getColor());
    }
}
