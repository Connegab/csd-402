// Gabe Conner
// 8/31/25
// Assignment 4.2 

public class AverageCalculator {

    // The overloaded methods for the assignment
    public static short average(short[] array) {
        int sum = 0;
        for (short value : array) {   // for-each loop to sum the array elements
            sum += value;
        }
        return (short)(sum / array.length);
    }

    public static int average(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    public static long average(long[] array) {
        long sum = 0;
        for (long value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;
        for (double value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    // Test program to demonstrate the overloaded methods
    public static void main(String[] args) {
        short[] shortArray = {5, 10, 15};
        int[] intArray = {100, 200, 300, 400};
        long[] longArray = {1000L, 2000L, 3000L, 4000L, 5000L};
        double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5, 6.5};

        // Display short array and its average
        System.out.print("short array: ");
        for (short value : shortArray) {
            System.out.print(value + " ");
        }
        System.out.println("\nAverage: " + average(shortArray));

        // Display int array and its average
        System.out.print("\nint array: ");
        for (int value : intArray) {
            System.out.print(value + " ");
        }
        System.out.println("\nAverage: " + average(intArray));

        // Display long array an its average
        System.out.print("\nlong array: ");
        for (long value : longArray) {
            System.out.print(value + " ");
        }
        System.out.println("\nAverage: " + average(longArray));

        // Display double array and its average
        System.out.print("\ndouble array: ");
        for (double value : doubleArray) {
            System.out.print(value + " ");
        }
        System.out.println("\nAverage: " + average(doubleArray));
    }
}
