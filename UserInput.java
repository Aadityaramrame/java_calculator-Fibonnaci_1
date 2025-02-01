import java.util.Scanner;

public class UserInput {
    public int[] userInput() {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[2];

        System.out.println("Enter first number: ");
        array[0] = scan.nextInt();
        System.out.println("Enter second number: ");
        array[1] = scan.nextInt();

        return array;
    }

    public int getChoice() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        return scan.nextInt();
    }

    public int getFibonacciNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Fibonacci sequence position: ");
        return scan.nextInt();
    }
}
