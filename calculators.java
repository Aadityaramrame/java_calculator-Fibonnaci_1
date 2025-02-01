public class calculators {
    private int[] numbers;

    public calculators(int[] inputNumbers) {
        this.numbers = inputNumbers;
    }

    public int calcSum() {
        return numbers[0] + numbers[1];
    }

    public int calcDif() {
        return numbers[0] - numbers[1];
    }

    public int calcProd() {
        return numbers[0] * numbers[1];
    }

    public double calcDiv() {
        if (numbers[1] == 0) {
            System.out.println("Division by zero is not allowed!");
            return -9999;
        }
        return (double) numbers[0] / numbers[1];
    }

    public int calcFib(int num) {
        if (num == 0) return 0;
        if (num == 1) return 1;

        int a = 0, b = 1;
        for (int i = 2; i <= num; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
}
