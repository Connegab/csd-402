public class UseFans {

    // Method to display a single Fan without using toString()
    public static void displayFan(Fan fan) {
        System.out.println("Fan Details:");
        System.out.println("On: " + fan.isOn());
        System.out.println("Speed: " + fan.getSpeed());
        System.out.println("Radius: " + fan.getRadius());
        System.out.println("Color: " + fan.getColor());
        System.out.println("-------------------------");
    }

    // Method to display a collection of Fans
    public static void displayFans(Fan[] fans) {
        for (int i = 0; i < fans.length; i++) {
            System.out.println("Fan #" + (i + 1) + ":");
            System.out.println("On: " + fans[i].isOn());
            System.out.println("Speed: " + fans[i].getSpeed());
            System.out.println("Radius: " + fans[i].getRadius());
            System.out.println("Color: " + fans[i].getColor());
            System.out.println("-------------------------");
        }
    }

    // Test code
    public static void main(String[] args) {
        // We will create the collection of Fan instances
        Fan[] fanCollection = new Fan[3];
        fanCollection[0] = new Fan(Fan.SLOW, true, 6, "blue");
        fanCollection[1] = new Fan(Fan.MEDIUM, false, 8, "red");
        fanCollection[2] = new Fan(Fan.FAST, true, 10, "green");

        // It will display a single fan
        System.out.println("Displaying a single fan:");
        displayFan(fanCollection[0]);

        // Then it will display all the fans
        System.out.println("Displaying all fans in the collection:");
        displayFans(fanCollection);
    }
}
