import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner choiceScanner = new Scanner(System.in);
        UserInput ui = new UserInput();
        int[] numbers = ui.userInput();

        calculators calculator = new calculators(numbers);

        while (true) {
            System.out.println("\nMenu");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Fibonacci Series");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = choiceScanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Sum = " + calculator.calcSum());
                    break;
                case 2:
                    System.out.println("Difference = " + calculator.calcDif());
                    break;
                case 3:
                    System.out.println("Product = " + calculator.calcProd());
                    break;
                case 4:
                    System.out.println("Quotient = " + calculator.calcDiv());
                    break;
                case 5:
                    int num = ui.getFibonacciNumber();
                    System.out.println("Fibonacci(" + num + ") = " + calculator.calcFib(num));
                    break;
                case 6:
                    System.out.println("Exiting program. Goodbye!");
                    choiceScanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
