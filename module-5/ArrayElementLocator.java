// The program demonstrates methods to find the largest and smallest elements in 2D arrays.

public class ArrayElementLocator {

    // Locate the largest element in a double 2D array
    public static int[] locateLargest(double[][] arrayParam) {
        int rowIndex = 0;
        int colIndex = 0;
        double largest = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    rowIndex = i;
                    colIndex = j;
                }
            }
        }
        return new int[] {rowIndex, colIndex};
    }

    // Locate the largest element in an int 2D array
    public static int[] locateLargest(int[][] arrayParam) {
        int rowIndex = 0;
        int colIndex = 0;
        int largest = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    rowIndex = i;
                    colIndex = j;
                }
            }
        }
        return new int[] {rowIndex, colIndex};
    }

    // Locate the smallest element in a double 2D array
    public static int[] locateSmallest(double[][] arrayParam) {
        int rowIndex = 0;
        int colIndex = 0;
        double smallest = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    rowIndex = i;
                    colIndex = j;
                }
            }
        }
        return new int[] {rowIndex, colIndex};
    }

    // Locate the smallest element in an int 2D array
    public static int[] locateSmallest(int[][] arrayParam) {
        int rowIndex = 0;
        int colIndex = 0;
        int smallest = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    rowIndex = i;
                    colIndex = j;
                }
            }
        }
        return new int[] {rowIndex, colIndex};
    }

    // Test program
    public static void main(String[] args) {
        double[][] doubleArray = {
            {1.2, 3.5, 2.1},
            {4.0, 0.5, 2.2},
            {1.1, 5.5, 3.3}
        };

        int[][] intArray = {
            {10, 20, 30},
            {5, 15, 25},
            {35, 0, 40}
        };

        int[] largestDouble = locateLargest(doubleArray);
        int[] smallestDouble = locateSmallest(doubleArray);

        int[] largestInt = locateLargest(intArray);
        int[] smallestInt = locateSmallest(intArray);

        // Display results
        System.out.println("Double array largest element location: [" + largestDouble[0] + ", " + largestDouble[1] + "]");
        System.out.println("Double array smallest element location: [" + smallestDouble[0] + ", " + smallestDouble[1] + "]");

        System.out.println("Int array largest element location: [" + largestInt[0] + ", " + largestInt[1] + "]");
        System.out.println("Int array smallest element location: [" + smallestInt[0] + ", " + smallestInt[1] + "]");
    }
}
