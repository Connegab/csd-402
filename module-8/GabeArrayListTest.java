// Gabe Conner. Assignment 8_2

import java.util.ArrayList;
import java.util.Scanner;

public class GabeArrayListTest {

    // The method that returns the largest value in the ArrayList
    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.isEmpty()) {
            return 0; // The program will return 0 if list is empty
        }

        Integer largest = list.get(0);
        for (Integer number : list) {
            if (number > largest) {
                largest = number;
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (enter 0 to stop):");

        while (true) {
            int value = scanner.nextInt();
            numbers.add(value);
            if (value == 0) {
                break; // this stops when the user enters 0
            }
        }

        // Call max() method
        Integer largestValue = max(numbers);

        // It will display the results
        System.out.println("\nNumbers entered: " + numbers);
        System.out.println("The largest value in the list is: " + largestValue);

        scanner.close();
    }
}
