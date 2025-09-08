// Gabe Conner
// 8/24/25
// Assignment 3.1
// This program prints a nested loop pattern with numbers and the '@' symbol.

public class NestedPattern {
    public static void main(String[] args) {
        int rows = 7;

        // The outer loop for rows
        for (int i = 1; i <= rows; i++) {

            // It will print leading spaces to shape the pyramid
            for (int s = rows; s > i; s--) {
                System.out.print("   "); // 3 spaces
            }

            // Print increasing numbers (powers of 2)
            int value = 1;
            for (int j = 1; j <= i; j++) {
                // The program will pad the numbers less than 10 with extra space for alignment
                if (value < 10) {
                    System.out.print(value + "  "); // 2 spaces after single-digit number
                } else {
                    System.out.print(value + " ");  // 1 space after double-digit number
                }
                value *= 2;
            }

            // It will print decreasing numbers
            value /= 2; // step back one level
            for (int j = i - 1; j >= 1; j--) {
                value /= 2;
                if (value < 10) {
                    System.out.print(value + "  "); // 2 spaces after single-digit
                } else {
                    System.out.print(value + " ");  // 1 space after double-digit
                }
            }

            // Finally the @ symbol will get added.
            System.out.println("@");
        }
    }
}
