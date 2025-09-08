// Demonstrates a Fan class with constants, fields, constructors, getters, setters, and toString.

class Fan {
    // Constants
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private fields
    private int speed;       // STOPPED by default
    private boolean on;      // fan off by default
    private double radius;   // default radius 6
    private String color;    // default color "white"

    // No-argument constructor
    public Fan() {
        speed = STOPPED;
        on = false;
        radius = 6;
        color = "white";
    }

    // Constructor with arguments
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getter and setter for speed
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed >= STOPPED && speed <= FAST) {
            this.speed = speed;
        }
    }

    // Getter and setter for on
    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    // Getter and setter for radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }

    // Getter and setter for color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString method
    public String toString() {
        if (on) {
            String speedString = "";
            if (speed == SLOW) speedString = "SLOW";
            else if (speed == MEDIUM) speedString = "MEDIUM";
            else if (speed == FAST) speedString = "FAST";
            else speedString = "STOPPED";
            return "Fan is on. Speed: " + speedString + ", Color: " + color + ", Radius: " + radius;
        } else {
            return "Fan is off. Color: " + color + ", Radius: " + radius;
        }
    }
}

// Test class
public class FanTest {
    public static void main(String[] args) {
        // Fan with default constructor
        Fan fan1 = new Fan();
        System.out.println("Default fan:");
        System.out.println(fan1.toString());

        // Fan with argument constructor
        Fan fan2 = new Fan(Fan.FAST, true, 10, "blue");
        System.out.println("\nCustom fan:");
        System.out.println(fan2.toString());

        // Demonstrate setter methods
        fan1.setOn(true);
        fan1.setSpeed(Fan.MEDIUM);
        fan1.setColor("yellow");
        fan1.setRadius(8);
        System.out.println("\nUpdated default fan:");
        System.out.println(fan1.toString());
    }
}
