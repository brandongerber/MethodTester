	
public class Assignment4 {
    // number 1
    // Write and test the following method that calculates and returns the area of a rectangle.
    // public static float rectangleArea(float, float);
    public static float rectangleArea(double length, double width) {
        double area = 0;
        area = (length * width);
        float result = (float) area;
        return (float) result;
    }

    // number 2
    // Write and test the following method that determines whether a given number is even.
    // If it is even, return true, if it is odd, return false.
    // public static boolean isEven(int);
    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // number 3
    // Write and test the following method that accepts two integer parameters, i and j,
    // and then returns the sum of the numbers from i to j.
    // For example, sum(3,6) = 3 + 4 + 5 + 6 = 18
    // public static int sum(int, int);
    public static int sum(int i, int j) {
        int total = 0;
        for (int n = i; n <= j; n++) {
            total += n;
        }
        return total;
    }

    // number 4
    // Write and test the following method that determines accepts an integer value n
    // and returns the sum of the first n natural numbers.
    // public static int sumN(int);
    public static int sumN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // number 5
    // Write and test the following method that accepts an integer value n
    // and displays n lines of 5 stars each.
    // public static void printNLines(int);
    public static void printNLines(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // 1.1
        double length1 = 8.3;
        double width1 = 4.0;
        float area1 = rectangleArea(length1, width1);
        System.out.println("Rectangle Area 1: " + area1);
        // 1.2
        double length2 = 7.5;
        double width2 = 2.0;
        float area2 = rectangleArea(length2, width2);
        System.out.println("Rectangle Area 2: " + area2);

       // 2.1
        int numberToCheck1 = 9;
        System.out.println("Is " + numberToCheck1 + " even? " + isEven(numberToCheck1));
        // 2.2
        int numberToCheck2 = 62;
        System.out.println("Is " + numberToCheck2 + " even? " + isEven(numberToCheck2));

        // 3.1
        int start1 = 5;
        int end1 = 9;
        int sum1 = sum(start1, end1);
        System.out.println("Sum from " + start1 + " to " + end1 + ": " + sum1);
        // 3.2
        int start2 = 1;
        int end2 = 7;
        int sum2 = sum(start2, end2);
        System.out.println("Sum from " + start2 + " to " + end2 + ": " + sum2);

        // 4.1
        int n1 = 3;
        int sumN1 = sumN(n1);
        System.out.println("Sum of first " + n1 + " natural numbers: " + sumN1);
        // 4.2 
        int n2 = 7;
        int sumN2 = sumN(n2);
        System.out.println("Sum of first " + n2 + " natural numbers: " + sumN2);

        // 5.1
        int linesToPrint1 = 3;
        System.out.println("Printing " + linesToPrint1 + " lines of 5 stars each:");
        printNLines(linesToPrint1);
        // 5.2
        int linesToPrint2 = 5;
        System.out.println("Printing " + linesToPrint2 + " lines of 5 stars each:");
        printNLines(linesToPrint2);
    }
}
